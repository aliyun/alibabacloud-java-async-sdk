// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWmExtractTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetWmExtractTaskResponseBody</p>
 */
public class GetWmExtractTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetWmExtractTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWmExtractTaskResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWmExtractTaskResponseBody build() {
            return new GetWmExtractTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWmExtractTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetWmExtractTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("WmInfoBytesB64")
        private String wmInfoBytesB64;

        @com.aliyun.core.annotation.NameInMap("WmInfoSize")
        private Long wmInfoSize;

        @com.aliyun.core.annotation.NameInMap("WmInfoUint")
        private Long wmInfoUint;

        @com.aliyun.core.annotation.NameInMap("WmType")
        private String wmType;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.filename = builder.filename;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.wmInfoBytesB64 = builder.wmInfoBytesB64;
            this.wmInfoSize = builder.wmInfoSize;
            this.wmInfoUint = builder.wmInfoUint;
            this.wmType = builder.wmType;
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
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return wmInfoBytesB64
         */
        public String getWmInfoBytesB64() {
            return this.wmInfoBytesB64;
        }

        /**
         * @return wmInfoSize
         */
        public Long getWmInfoSize() {
            return this.wmInfoSize;
        }

        /**
         * @return wmInfoUint
         */
        public Long getWmInfoUint() {
            return this.wmInfoUint;
        }

        /**
         * @return wmType
         */
        public String getWmType() {
            return this.wmType;
        }

        public static final class Builder {
            private String createTime; 
            private String filename; 
            private String status; 
            private String taskId; 
            private String wmInfoBytesB64; 
            private Long wmInfoSize; 
            private Long wmInfoUint; 
            private String wmType; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * WmInfoBytesB64.
             */
            public Builder wmInfoBytesB64(String wmInfoBytesB64) {
                this.wmInfoBytesB64 = wmInfoBytesB64;
                return this;
            }

            /**
             * WmInfoSize.
             */
            public Builder wmInfoSize(Long wmInfoSize) {
                this.wmInfoSize = wmInfoSize;
                return this;
            }

            /**
             * WmInfoUint.
             */
            public Builder wmInfoUint(Long wmInfoUint) {
                this.wmInfoUint = wmInfoUint;
                return this;
            }

            /**
             * WmType.
             */
            public Builder wmType(String wmType) {
                this.wmType = wmType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
