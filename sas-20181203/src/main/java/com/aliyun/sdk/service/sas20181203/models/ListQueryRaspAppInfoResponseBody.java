// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryRaspAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryRaspAppInfoResponseBody</p>
 */
public class ListQueryRaspAppInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ListQueryRaspAppInfoResponseBody build() {
            return new ListQueryRaspAppInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("RaspAppName")
        private String raspAppName;

        @NameInMap("RaspOnlineStatus")
        private Integer raspOnlineStatus;

        @NameInMap("RaspStatus")
        private String raspStatus;

        @NameInMap("Result")
        private String result;

        @NameInMap("Uuid")
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
             * RaspAppName.
             */
            public Builder raspAppName(String raspAppName) {
                this.raspAppName = raspAppName;
                return this;
            }

            /**
             * RaspOnlineStatus.
             */
            public Builder raspOnlineStatus(Integer raspOnlineStatus) {
                this.raspOnlineStatus = raspOnlineStatus;
                return this;
            }

            /**
             * RaspStatus.
             */
            public Builder raspStatus(String raspStatus) {
                this.raspStatus = raspStatus;
                return this;
            }

            /**
             * 推送失败结果
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Uuid.
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
