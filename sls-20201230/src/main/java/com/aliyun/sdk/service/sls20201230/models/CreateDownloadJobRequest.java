// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link CreateDownloadJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDownloadJobRequest</p>
 */
public class CreateDownloadJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Configuration configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateDownloadJobRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDownloadJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return configuration
     */
    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateDownloadJobRequest, Builder> {
        private String project; 
        private Configuration configuration; 
        private String description; 
        private String displayName; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateDownloadJobRequest request) {
            super(request);
            this.project = request.project;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>下载配置</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(Configuration configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>任务描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>任务显示名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>download-123456789</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>代表资源名称的资源属性字段</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>download-123</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateDownloadJobRequest build() {
            return new CreateDownloadJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDownloadJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDownloadJobRequest</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("compressionType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String compressionType;

        @com.aliyun.core.annotation.NameInMap("contentType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("roleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Sink(Builder builder) {
            this.bucket = builder.bucket;
            this.compressionType = builder.compressionType;
            this.contentType = builder.contentType;
            this.prefix = builder.prefix;
            this.roleArn = builder.roleArn;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sink create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return compressionType
         */
        public String getCompressionType() {
            return this.compressionType;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bucket; 
            private String compressionType; 
            private String contentType; 
            private String prefix; 
            private String roleArn; 
            private String type; 

            /**
             * <p>对象存储桶</p>
             * 
             * <strong>example:</strong>
             * <p>oss-test-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>压缩格式</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder compressionType(String compressionType) {
                this.compressionType = compressionType;
                return this;
            }

            /**
             * <p>下载文件格式</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>csv</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * <p>下载使用roleArn</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::0123456789:role/aliyunlogdefaultrole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunOSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Sink build() {
                return new Sink(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDownloadJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDownloadJobRequest</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowInComplete")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean allowInComplete;

        @com.aliyun.core.annotation.NameInMap("fromTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long fromTime;

        @com.aliyun.core.annotation.NameInMap("logstore")
        @com.aliyun.core.annotation.Validation(required = true)
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("powerSql")
        private Boolean powerSql;

        @com.aliyun.core.annotation.NameInMap("query")
        @com.aliyun.core.annotation.Validation(required = true)
        private String query;

        @com.aliyun.core.annotation.NameInMap("sink")
        @com.aliyun.core.annotation.Validation(required = true)
        private Sink sink;

        @com.aliyun.core.annotation.NameInMap("toTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long toTime;

        private Configuration(Builder builder) {
            this.allowInComplete = builder.allowInComplete;
            this.fromTime = builder.fromTime;
            this.logstore = builder.logstore;
            this.powerSql = builder.powerSql;
            this.query = builder.query;
            this.sink = builder.sink;
            this.toTime = builder.toTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return allowInComplete
         */
        public Boolean getAllowInComplete() {
            return this.allowInComplete;
        }

        /**
         * @return fromTime
         */
        public Long getFromTime() {
            return this.fromTime;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return powerSql
         */
        public Boolean getPowerSql() {
            return this.powerSql;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return sink
         */
        public Sink getSink() {
            return this.sink;
        }

        /**
         * @return toTime
         */
        public Long getToTime() {
            return this.toTime;
        }

        public static final class Builder {
            private Boolean allowInComplete; 
            private Long fromTime; 
            private String logstore; 
            private Boolean powerSql; 
            private String query; 
            private Sink sink; 
            private Long toTime; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowInComplete(Boolean allowInComplete) {
                this.allowInComplete = allowInComplete;
                return this;
            }

            /**
             * <p>起点时间戳（精确到秒）</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1722406260</p>
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * <p>源logstore</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-logstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>是否启用powerSql</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder powerSql(Boolean powerSql) {
                this.powerSql = powerSql;
                return this;
            }

            /**
             * <p>查询语句</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>| select *</li>
             * </ul>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>导出配置</p>
             * <p>This parameter is required.</p>
             */
            public Builder sink(Sink sink) {
                this.sink = sink;
                return this;
            }

            /**
             * <p>结束时间戳（精确到秒）</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1722409860</p>
             */
            public Builder toTime(Long toTime) {
                this.toTime = toTime;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
}
