// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublishedServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedServicesResponseBody</p>
 */
public class ListPublishedServicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

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

    private ListPublishedServicesResponseBody(Builder builder) {
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

    public static ListPublishedServicesResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * Indicates whether the microservice list was obtained. Valid values:
         * <p>
         * 
         * *   **true**: The list was obtained.
         * *   **false**: The list failed to be obtained.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The type of the published service.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the call was successful.
         * *   **3xx**: indicates that the call was redirected.
         * *   **4xx**: indicates that the call failed.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the trace. It is used to query the details of a request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The returned information. Valid values:
         * <p>
         * 
         * *   If the call is successful, **success** is returned.
         * *   If the call fails, an error code is returned.
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
         * The details of the microservices.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListPublishedServicesResponseBody build() {
            return new ListPublishedServicesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("Group2Ip")
        private String group2Ip;

        @NameInMap("Groups")
        private java.util.List < String > groups;

        @NameInMap("Ips")
        private java.util.List < String > ips;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.group2Ip = builder.group2Ip;
            this.groups = builder.groups;
            this.ips = builder.ips;
            this.name = builder.name;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return group2Ip
         */
        public String getGroup2Ip() {
            return this.group2Ip;
        }

        /**
         * @return groups
         */
        public java.util.List < String > getGroups() {
            return this.groups;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private String group2Ip; 
            private java.util.List < String > groups; 
            private java.util.List < String > ips; 
            private String name; 
            private String type; 
            private String version; 

            /**
             * The reserved parameter. This parameter does not take effect.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The subscription address of the service.
             */
            public Builder group2Ip(String group2Ip) {
                this.group2Ip = group2Ip;
                return this;
            }

            /**
             * The version of the published services.
             */
            public Builder groups(java.util.List < String > groups) {
                this.groups = groups;
                return this;
            }

            /**
             * The name of the published service.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * The returned error code. Valid values:
             * <p>
             * 
             * *   If the call is successful, the **ErrorCode** parameter is not returned.
             * *   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The service group that corresponds to the consumed service.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the application.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
