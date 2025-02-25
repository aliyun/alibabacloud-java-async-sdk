// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySignInRecordPopResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySignInRecordPopResponseBody</p>
 */
public class QuerySignInRecordPopResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySignInRecordPopResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySignInRecordPopResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String accessDeniedDetail; 
        private java.util.List < Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
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
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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

        public QuerySignInRecordPopResponseBody build() {
            return new QuerySignInRecordPopResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySignInRecordPopResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySignInRecordPopResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("Rfid")
        private String rfid;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private Long sessionId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private Data(Builder builder) {
            this.event = builder.event;
            this.rfid = builder.rfid;
            this.sessionId = builder.sessionId;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return rfid
         */
        public String getRfid() {
            return this.rfid;
        }

        /**
         * @return sessionId
         */
        public Long getSessionId() {
            return this.sessionId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String event; 
            private String rfid; 
            private Long sessionId; 
            private String time; 

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * <p>nfcid</p>
             * 
             * <strong>example:</strong>
             * <p>cshdsaodhoashd</p>
             */
            public Builder rfid(String rfid) {
                this.rfid = rfid;
                return this;
            }

            /**
             * <p>sessionId</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder sessionId(Long sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
