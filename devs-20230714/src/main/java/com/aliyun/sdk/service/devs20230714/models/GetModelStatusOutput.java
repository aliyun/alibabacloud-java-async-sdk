// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link GetModelStatusOutput} extends {@link TeaModel}
 *
 * <p>GetModelStatusOutput</p>
 */
public class GetModelStatusOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetModelStatusOutput(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelStatusOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
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
        private Data data; 
        private String errCode; 
        private String errMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetModelStatusOutput model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMsg = model.errMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetModelStatusOutput build() {
            return new GetModelStatusOutput(this);
        } 

    } 

    /**
     * 
     * {@link GetModelStatusOutput} extends {@link TeaModel}
     *
     * <p>GetModelStatusOutput</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentBytes")
        private Long currentBytes;

        @com.aliyun.core.annotation.NameInMap("errMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("finishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("speed")
        private Long speed;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.currentBytes = builder.currentBytes;
            this.errMessage = builder.errMessage;
            this.fileSize = builder.fileSize;
            this.finished = builder.finished;
            this.finishedTime = builder.finishedTime;
            this.speed = builder.speed;
            this.startTime = builder.startTime;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentBytes
         */
        public Long getCurrentBytes() {
            return this.currentBytes;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return speed
         */
        public Long getSpeed() {
            return this.speed;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long currentBytes; 
            private String errMessage; 
            private Long fileSize; 
            private Boolean finished; 
            private Long finishedTime; 
            private Long speed; 
            private Long startTime; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentBytes = model.currentBytes;
                this.errMessage = model.errMessage;
                this.fileSize = model.fileSize;
                this.finished = model.finished;
                this.finishedTime = model.finishedTime;
                this.speed = model.speed;
                this.startTime = model.startTime;
                this.total = model.total;
            } 

            /**
             * currentBytes.
             */
            public Builder currentBytes(Long currentBytes) {
                this.currentBytes = currentBytes;
                return this;
            }

            /**
             * errMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * fileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * finishedTime.
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * speed.
             */
            public Builder speed(Long speed) {
                this.speed = speed;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
