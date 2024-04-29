// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryRaspAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryRaspAppInfoResponseBody</p>
 */
public class ListQueryRaspAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

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

    private ListQueryRaspAppInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryRaspAppInfoResponseBody create() {
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
         * The installation information of the RASP-enabled application.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The unique ID of the request, which is used to locate and troubleshoot issues.
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

        public ListQueryRaspAppInfoResponseBody build() {
            return new ListQueryRaspAppInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RaspAppName")
        private String raspAppName;

        @com.aliyun.core.annotation.NameInMap("RaspOnlineStatus")
        private Integer raspOnlineStatus;

        @com.aliyun.core.annotation.NameInMap("RaspStatus")
        private String raspStatus;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.raspAppName = builder.raspAppName;
            this.raspOnlineStatus = builder.raspOnlineStatus;
            this.raspStatus = builder.raspStatus;
            this.result = builder.result;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return raspAppName
         */
        public String getRaspAppName() {
            return this.raspAppName;
        }

        /**
         * @return raspOnlineStatus
         */
        public Integer getRaspOnlineStatus() {
            return this.raspOnlineStatus;
        }

        /**
         * @return raspStatus
         */
        public String getRaspStatus() {
            return this.raspStatus;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String raspAppName; 
            private Integer raspOnlineStatus; 
            private String raspStatus; 
            private String result; 
            private String uuid; 

            /**
             * The name of the RASP-enabled application.
             */
            public Builder raspAppName(String raspAppName) {
                this.raspAppName = raspAppName;
                return this;
            }

            /**
             * The online status of the RASP-enabled applications. Valid values:
             * <p>
             * 
             * *   **0**: All RASP-enabled applications are online.
             * *   **1**: Part of the RASP-enabled applications are online.
             * *   **2**: All RASP-enabled applications are offline.
             */
            public Builder raspOnlineStatus(Integer raspOnlineStatus) {
                this.raspOnlineStatus = raspOnlineStatus;
                return this;
            }

            /**
             * The installation status of the RASP-enabled application. Valid values:
             * <p>
             * 
             * *   **SUCCESS**: The RASP-enabled application is installed.
             * *   **FAIL**: The RASP-enabled application fails to be installed.
             * *   **INSTALL**: The RASP-enabled application is being installed.
             */
            public Builder raspStatus(String raspStatus) {
                this.raspStatus = raspStatus;
                return this;
            }

            /**
             * The result returned if the push fails.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
