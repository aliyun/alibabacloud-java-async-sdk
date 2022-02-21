// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationSlbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationSlbsResponseBody</p>
 */
public class DescribeApplicationSlbsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationSlbsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationSlbsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationSlbsResponseBody build() {
            return new DescribeApplicationSlbsResponseBody(this);
        } 

    } 

    public static class Internet extends TeaModel {
        @NameInMap("HttpsCertId")
        private String httpsCertId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("TargetPort")
        private Integer targetPort;

        private Internet(Builder builder) {
            this.httpsCertId = builder.httpsCertId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Internet create() {
            return builder().build();
        }

        /**
         * @return httpsCertId
         */
        public String getHttpsCertId() {
            return this.httpsCertId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private String httpsCertId; 
            private Integer port; 
            private String protocol; 
            private Integer targetPort; 

            /**
             * HttpsCertId.
             */
            public Builder httpsCertId(String httpsCertId) {
                this.httpsCertId = httpsCertId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * TargetPort.
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public Internet build() {
                return new Internet(this);
            } 

        } 

    }
    public static class Intranet extends TeaModel {
        @NameInMap("HttpsCertId")
        private String httpsCertId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("TargetPort")
        private Integer targetPort;

        private Intranet(Builder builder) {
            this.httpsCertId = builder.httpsCertId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intranet create() {
            return builder().build();
        }

        /**
         * @return httpsCertId
         */
        public String getHttpsCertId() {
            return this.httpsCertId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private String httpsCertId; 
            private Integer port; 
            private String protocol; 
            private Integer targetPort; 

            /**
             * HttpsCertId.
             */
            public Builder httpsCertId(String httpsCertId) {
                this.httpsCertId = httpsCertId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * TargetPort.
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public Intranet build() {
                return new Intranet(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Internet")
        private java.util.List < Internet> internet;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("InternetSlbId")
        private String internetSlbId;

        @NameInMap("Intranet")
        private java.util.List < Intranet> intranet;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("IntranetSlbId")
        private String intranetSlbId;

        private Data(Builder builder) {
            this.internet = builder.internet;
            this.internetIp = builder.internetIp;
            this.internetSlbId = builder.internetSlbId;
            this.intranet = builder.intranet;
            this.intranetIp = builder.intranetIp;
            this.intranetSlbId = builder.intranetSlbId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return internet
         */
        public java.util.List < Internet> getInternet() {
            return this.internet;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return internetSlbId
         */
        public String getInternetSlbId() {
            return this.internetSlbId;
        }

        /**
         * @return intranet
         */
        public java.util.List < Intranet> getIntranet() {
            return this.intranet;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return intranetSlbId
         */
        public String getIntranetSlbId() {
            return this.intranetSlbId;
        }

        public static final class Builder {
            private java.util.List < Internet> internet; 
            private String internetIp; 
            private String internetSlbId; 
            private java.util.List < Intranet> intranet; 
            private String intranetIp; 
            private String intranetSlbId; 

            /**
             * Internet.
             */
            public Builder internet(java.util.List < Internet> internet) {
                this.internet = internet;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * InternetSlbId.
             */
            public Builder internetSlbId(String internetSlbId) {
                this.internetSlbId = internetSlbId;
                return this;
            }

            /**
             * Intranet.
             */
            public Builder intranet(java.util.List < Intranet> intranet) {
                this.intranet = intranet;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * IntranetSlbId.
             */
            public Builder intranetSlbId(String intranetSlbId) {
                this.intranetSlbId = intranetSlbId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
