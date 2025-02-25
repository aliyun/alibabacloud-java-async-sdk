// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStreamPushJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStreamPushJobResponseBody</p>
 */
public class QueryStreamPushJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryStreamPushJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStreamPushJobResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryStreamPushJobResponseBody build() {
            return new QueryStreamPushJobResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private Integer createTime;

        @NameInMap("JobType")
        private Integer jobType;

        @NameInMap("PushStatus")
        private Integer pushStatus;

        @NameInMap("PushUrl")
        private String pushUrl;

        @NameInMap("StreamType")
        private Integer streamType;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.jobType = builder.jobType;
            this.pushStatus = builder.pushStatus;
            this.pushUrl = builder.pushUrl;
            this.streamType = builder.streamType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobType
         */
        public Integer getJobType() {
            return this.jobType;
        }

        /**
         * @return pushStatus
         */
        public Integer getPushStatus() {
            return this.pushStatus;
        }

        /**
         * @return pushUrl
         */
        public String getPushUrl() {
            return this.pushUrl;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        public static final class Builder {
            private Integer createTime; 
            private Integer jobType; 
            private Integer pushStatus; 
            private String pushUrl; 
            private Integer streamType; 

            /**
             * CreateTime.
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(Integer jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * PushStatus.
             */
            public Builder pushStatus(Integer pushStatus) {
                this.pushStatus = pushStatus;
                return this;
            }

            /**
             * PushUrl.
             */
            public Builder pushUrl(String pushUrl) {
                this.pushUrl = pushUrl;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
