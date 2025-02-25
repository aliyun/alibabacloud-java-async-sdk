// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDataSourceResponseBody</p>
 */
public class ModifyDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ModifyDataSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal server error occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the data source.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ModifyDataSourceResponseBody build() {
            return new ModifyDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDataSourceResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("partition")
        private String partition;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Meta(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.bucketName = builder.bucketName;
            this.partition = builder.partition;
            this.path = builder.path;
            this.projectName = builder.projectName;
            this.tableName = builder.tableName;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String bucketName; 
            private String partition; 
            private String path; 
            private String projectName; 
            private String tableName; 
            private Long timestamp; 
            private String type; 

            /**
             * <p>The AccessKey ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The name of the Object Storage Service (OSS) bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>airec</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The partition in the MaxCompute table.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20181122</p>
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The path of the OSS data source.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://xxx.xxx</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>openrec_gray</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The name of the MaxCompute table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_maxcompute</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The timestamp. The value must be accurate to the millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1544112000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The type of the data source. Only MaxCompute is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDataSourceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.meta = builder.meta;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Meta meta; 
            private String tableName; 

            /**
             * <p>The time when the data source was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-07T02:24:26.000Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the data source was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-07T02:24:26.000Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The parameters of the data source.</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>behavior</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
