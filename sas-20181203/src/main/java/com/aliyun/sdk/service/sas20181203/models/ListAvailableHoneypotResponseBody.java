// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableHoneypotResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableHoneypotResponseBody</p>
 */
public class ListAvailableHoneypotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAvailableHoneypotResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableHoneypotResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The number of images that are used for the honeypot.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * An array consisting of the information about the images that are used for the honeypot.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAvailableHoneypotResponseBody build() {
            return new ListAvailableHoneypotResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HoneypotImageDisplayName")
        private String honeypotImageDisplayName;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageId")
        private String honeypotImageId;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
        private String honeypotImageName;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageType")
        private String honeypotImageType;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageVersion")
        private String honeypotImageVersion;

        @com.aliyun.core.annotation.NameInMap("Multiports")
        private String multiports;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private String servicePort;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        private Data(Builder builder) {
            this.honeypotImageDisplayName = builder.honeypotImageDisplayName;
            this.honeypotImageId = builder.honeypotImageId;
            this.honeypotImageName = builder.honeypotImageName;
            this.honeypotImageType = builder.honeypotImageType;
            this.honeypotImageVersion = builder.honeypotImageVersion;
            this.multiports = builder.multiports;
            this.proto = builder.proto;
            this.servicePort = builder.servicePort;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return honeypotImageDisplayName
         */
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        /**
         * @return honeypotImageId
         */
        public String getHoneypotImageId() {
            return this.honeypotImageId;
        }

        /**
         * @return honeypotImageName
         */
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        /**
         * @return honeypotImageType
         */
        public String getHoneypotImageType() {
            return this.honeypotImageType;
        }

        /**
         * @return honeypotImageVersion
         */
        public String getHoneypotImageVersion() {
            return this.honeypotImageVersion;
        }

        /**
         * @return multiports
         */
        public String getMultiports() {
            return this.multiports;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        /**
         * @return servicePort
         */
        public String getServicePort() {
            return this.servicePort;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String honeypotImageDisplayName; 
            private String honeypotImageId; 
            private String honeypotImageName; 
            private String honeypotImageType; 
            private String honeypotImageVersion; 
            private String multiports; 
            private String proto; 
            private String servicePort; 
            private String template; 

            /**
             * The display name of the image.
             */
            public Builder honeypotImageDisplayName(String honeypotImageDisplayName) {
                this.honeypotImageDisplayName = honeypotImageDisplayName;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder honeypotImageId(String honeypotImageId) {
                this.honeypotImageId = honeypotImageId;
                return this;
            }

            /**
             * The name of the image that is used for the honeypot.
             */
            public Builder honeypotImageName(String honeypotImageName) {
                this.honeypotImageName = honeypotImageName;
                return this;
            }

            /**
             * The type of the image.
             */
            public Builder honeypotImageType(String honeypotImageType) {
                this.honeypotImageType = honeypotImageType;
                return this;
            }

            /**
             * The version of the image.
             */
            public Builder honeypotImageVersion(String honeypotImageVersion) {
                this.honeypotImageVersion = honeypotImageVersion;
                return this;
            }

            /**
             * The port that is supported by the honeypot. The value is in the JSON format. Valid values:
             * <p>
             * 
             * *   **log_type**: the log type
             * *   **proto**: the supported protocol
             * *   **description**: the description
             * *   **ports**: the supported ports
             * *   **port_str**: the supported port number of the string type
             * *   **type**: the type
             */
            public Builder multiports(String multiports) {
                this.multiports = multiports;
                return this;
            }

            /**
             * The protocol that is supported by the honeypot.
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * The service port of the honeypot.
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * The configuration template of the honeypot.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
