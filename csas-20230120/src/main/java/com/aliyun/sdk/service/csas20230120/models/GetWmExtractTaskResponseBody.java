// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetWmExtractTaskResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The task result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.filename = model.filename;
                this.status = model.status;
                this.taskId = model.taskId;
                this.wmInfoBytesB64 = model.wmInfoBytesB64;
                this.wmInfoSize = model.wmInfoSize;
                this.wmInfoUint = model.wmInfoUint;
                this.wmType = model.wmType;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 11:22:33</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the file that was provided when the extraction task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>test-****.pdf</p>
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><p><strong>Running</strong>: The task is running.</p>
             * </li>
             * <li><p><strong>Success</strong>: The task is successful.</p>
             * </li>
             * <li><p><strong>Failed</strong>: The task failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>wmt-9648c22d2eb2cb57bb855dcae7898464********</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The extracted watermark information as a Base64-encoded string.</p>
             * 
             * <strong>example:</strong>
             * <p>aGVsbG8gc2Fz****</p>
             */
            public Builder wmInfoBytesB64(String wmInfoBytesB64) {
                this.wmInfoBytesB64 = wmInfoBytesB64;
                return this;
            }

            /**
             * <p>The size of the watermark information, which was provided when the extraction task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder wmInfoSize(Long wmInfoSize) {
                this.wmInfoSize = wmInfoSize;
                return this;
            }

            /**
             * <p>The extracted watermark information in decimal format.</p>
             * 
             * <strong>example:</strong>
             * <p>123**</p>
             */
            public Builder wmInfoUint(Long wmInfoUint) {
                this.wmInfoUint = wmInfoUint;
                return this;
            }

            /**
             * <p>The watermark type that was provided when the extraction task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>PureDocument</p>
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
