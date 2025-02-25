// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMmsAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetMmsAsyncTaskResponseBody</p>
 */
public class GetMmsAsyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMmsAsyncTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsAsyncTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMmsAsyncTaskResponseBody build() {
            return new GetMmsAsyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMmsAsyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsAsyncTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private Long objectId;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("running")
        private Boolean running;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.id = builder.id;
            this.objectId = builder.objectId;
            this.progress = builder.progress;
            this.result = builder.result;
            this.running = builder.running;
            this.sourceId = builder.sourceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
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
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return objectId
         */
        public Long getObjectId() {
            return this.objectId;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return running
         */
        public Boolean getRunning() {
            return this.running;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String endTime; 
            private String errorMsg; 
            private Long id; 
            private Long objectId; 
            private Integer progress; 
            private String result; 
            private Boolean running; 
            private Long sourceId; 
            private String startTime; 
            private String status; 
            private String type; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * errorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * objectId.
             */
            public Builder objectId(Long objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * running.
             */
            public Builder running(Boolean running) {
                this.running = running;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
