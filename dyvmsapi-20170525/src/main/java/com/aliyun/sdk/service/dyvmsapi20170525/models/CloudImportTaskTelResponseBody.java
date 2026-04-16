// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudImportTaskTelResponseBody} extends {@link TeaModel}
 *
 * <p>CloudImportTaskTelResponseBody</p>
 */
public class CloudImportTaskTelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudImportTaskTelResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudImportTaskTelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudImportTaskTelResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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

        public CloudImportTaskTelResponseBody build() {
            return new CloudImportTaskTelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudImportTaskTelResponseBody} extends {@link TeaModel}
     *
     * <p>CloudImportTaskTelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("ImportTotal")
        private String importTotal;

        @com.aliyun.core.annotation.NameInMap("InvalidTotal")
        private String invalidTotal;

        @com.aliyun.core.annotation.NameInMap("SuccessTotal")
        private String successTotal;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.fileId = builder.fileId;
            this.importTotal = builder.importTotal;
            this.invalidTotal = builder.invalidTotal;
            this.successTotal = builder.successTotal;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return importTotal
         */
        public String getImportTotal() {
            return this.importTotal;
        }

        /**
         * @return invalidTotal
         */
        public String getInvalidTotal() {
            return this.invalidTotal;
        }

        /**
         * @return successTotal
         */
        public String getSuccessTotal() {
            return this.successTotal;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String fileId; 
            private String importTotal; 
            private String invalidTotal; 
            private String successTotal; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileId = model.fileId;
                this.importTotal = model.importTotal;
                this.invalidTotal = model.invalidTotal;
                this.successTotal = model.successTotal;
                this.taskId = model.taskId;
            } 

            /**
             * <p>批次Id</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>请求号码总数</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder importTotal(String importTotal) {
                this.importTotal = importTotal;
                return this;
            }

            /**
             * <p>非法号码数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder invalidTotal(String invalidTotal) {
                this.invalidTotal = invalidTotal;
                return this;
            }

            /**
             * <p>成功导入号码数</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder successTotal(String successTotal) {
                this.successTotal = successTotal;
                return this;
            }

            /**
             * <p>任务Id</p>
             * 
             * <strong>example:</strong>
             * <p>13322333</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
