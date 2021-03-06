// Part of measurement-kit <https://measurement-kit.github.io/>.
// Measurement-kit is free software. See AUTHORS and LICENSE for more
// information on the copying conditions.

package org.openobservatory.ooniprobe.model;

import org.openobservatory.measurement_kit.common.LogSeverity;

public class OONITests {
    public static final String DASH = "dash";
    public static final String DNS_INJECTION = "dns_injection";
    public static final String HTTP_INVALID_REQUEST_LINE = "http_invalid_request_line";
    public static final String HTTP_HEADER_FIELD_MANIPULATION = "http_header_field_manipulation";
    public static final String TCP_CONNECT = "tcp_connect";
    public static final String WEB_CONNECTIVITY = "web_connectivity";
    public static final String NDT = "ndt";
    public static final String NDT_TEST = "ndt_test";
    public static final String WHATSAPP = "whatsapp";
    public static final String TELEGRAM = "telegram";
    public static final String FACEBOOK_MESSENGER = "facebook_messenger";
    public static final String COLLECTOR_ADDRESS = "https://b.collector.ooni.io";
    public static final String MAX_RUNTIME = "90";
    public static final String NOTIFICATION_SERVER_DEV = "https://registry.proteus.test.ooni.io";
    public static final String NOTIFICATION_SERVER_PROD = "https://registry.proteus.ooni.io";
    public static final String NOTIFICATION_SERVER = NOTIFICATION_SERVER_PROD;
    public static final int MK_VERBOSITY = LogSeverity.LOG_INFO;
    public static final int ANOMALY_GREEN = 0;
    public static final int ANOMALY_ORANGE = 1;
    public static final int ANOMALY_RED = 2;
}
