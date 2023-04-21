// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateOssShipperRequest} extends {@link RequestModel}
 *
 * <p>CreateOssShipperRequest</p>
 */
public class CreateOssShipperRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Body
    @NameInMap("shipperName")
    @Validation(required = true)
    private String shipperName;

    @Body
    @NameInMap("targetConfiguration")
    @Validation(required = true)
    private TargetConfiguration targetConfiguration;

    @Body
    @NameInMap("targetType")
    @Validation(required = true)
    private String targetType;

    private CreateOssShipperRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shipperName = builder.shipperName;
        this.targetConfiguration = builder.targetConfiguration;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssShipperRequest create() {
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
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return shipperName
     */
    public String getShipperName() {
        return this.shipperName;
    }

    /**
     * @return targetConfiguration
     */
    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateOssShipperRequest, Builder> {
        private String project; 
        private String logstore; 
        private String shipperName; 
        private TargetConfiguration targetConfiguration; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssShipperRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shipperName = request.shipperName;
            this.targetConfiguration = request.targetConfiguration;
            this.targetType = request.targetType;
        } 

        /**
         * Project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * Logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 日志投递名称。
         */
        public Builder shipperName(String shipperName) {
            this.putBodyParameter("shipperName", shipperName);
            this.shipperName = shipperName;
            return this;
        }

        /**
         * targetConfiguration.
         */
        public Builder targetConfiguration(TargetConfiguration targetConfiguration) {
            this.putBodyParameter("targetConfiguration", targetConfiguration);
            this.targetConfiguration = targetConfiguration;
            return this;
        }

        /**
         * 投递目标的类型，这里固定为 oss。
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateOssShipperRequest build() {
            return new CreateOssShipperRequest(this);
        } 

    } 

    public static class Storage extends TeaModel {
        @NameInMap("detail")
        @Validation(required = true)
        private java.util.Map < String, ? > detail;

        @NameInMap("format")
        @Validation(required = true)
        private String format;

        private Storage(Builder builder) {
            this.detail = builder.detail;
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.Map < String, ? > getDetail() {
            return this.detail;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private java.util.Map < String, ? > detail; 
            private String format; 

            /**
             * parquet 格式（必填项columns）：
             * <p>
             * { 
             * "columns": [
             *    {"name" : "test-col", "type": "text"}
             *  ]
             * }
             * 
             * csv 格式（必填项columns）：
             * { 
             * "columns": ["test-col"], 
             * "delimiter": ",", 
             * "quote": "",
             * "escape": "",
             * "nullIdentifier": "",
             * "header": false,
             * "lineFeed": "\n"
             *  }
             * 
             * json 格式
             * {
             * "enableTag": false
             * }
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * 支持 json、csv、parquet 三种
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
    public static class TargetConfiguration extends TeaModel {
        @NameInMap("bufferInterval")
        private Integer bufferInterval;

        @NameInMap("bufferSize")
        private Integer bufferSize;

        @NameInMap("compressType")
        private String compressType;

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("ossBucket")
        @Validation(required = true)
        private String ossBucket;

        @NameInMap("ossPrefix")
        @Validation(required = true)
        private String ossPrefix;

        @NameInMap("pathFormat")
        private String pathFormat;

        @NameInMap("roleArn")
        @Validation(required = true)
        private String roleArn;

        @NameInMap("storage")
        @Validation(required = true)
        private Storage storage;

        @NameInMap("timeZone")
        private String timeZone;

        private TargetConfiguration(Builder builder) {
            this.bufferInterval = builder.bufferInterval;
            this.bufferSize = builder.bufferSize;
            this.compressType = builder.compressType;
            this.enable = builder.enable;
            this.ossBucket = builder.ossBucket;
            this.ossPrefix = builder.ossPrefix;
            this.pathFormat = builder.pathFormat;
            this.roleArn = builder.roleArn;
            this.storage = builder.storage;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfiguration create() {
            return builder().build();
        }

        /**
         * @return bufferInterval
         */
        public Integer getBufferInterval() {
            return this.bufferInterval;
        }

        /**
         * @return bufferSize
         */
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        /**
         * @return compressType
         */
        public String getCompressType() {
            return this.compressType;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossPrefix
         */
        public String getOssPrefix() {
            return this.ossPrefix;
        }

        /**
         * @return pathFormat
         */
        public String getPathFormat() {
            return this.pathFormat;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return storage
         */
        public Storage getStorage() {
            return this.storage;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private Integer bufferInterval; 
            private Integer bufferSize; 
            private String compressType; 
            private Boolean enable; 
            private String ossBucket; 
            private String ossPrefix; 
            private String pathFormat; 
            private String roleArn; 
            private Storage storage; 
            private String timeZone; 

            /**
             * 导出间隔，秒，默认值为 300，可取值在 [300,900]之间。
             */
            public Builder bufferInterval(Integer bufferInterval) {
                this.bufferInterval = bufferInterval;
                return this;
            }

            /**
             * 自动控制投递任务创建间隔并设置OSS的一个Object大小（以未压缩计算）上限，单位：MB，默认 128 MB。支持[5,256] 之间的值。
             */
            public Builder bufferSize(Integer bufferSize) {
                this.bufferSize = bufferSize;
                return this;
            }

            /**
             * 压缩类型，支持 snappy 与 none，默认值为 none。
             */
            public Builder compressType(String compressType) {
                this.compressType = compressType;
                return this;
            }

            /**
             * 默认为 true，是否启用该配置。
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * oss 桶名称
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * oss 前缀，与 bucket 、pathFormat 一同组成投递的文件路径。示例值: test-prefix、test/prefix。
             * <p>
             * 格式要求：可使用 / 分隔各部分，每个部分都必须满足以下条件：
             * 1. 由大小写字母、数字、下划线_、连字符- 、点号.组成
             * 2. 长度不超过 253 字符
             * 3. 必须以大小写字母或者数字开头
             */
            public Builder ossPrefix(String ossPrefix) {
                this.ossPrefix = ossPrefix;
                return this;
            }

            /**
             * 路径格式，默认为 %Y/%m/%d/%H/%M ，不能以 / 开头。任务投递文件到 oss 时会被使用日期时间格式化，例如%Y/%m/%d/%H/%M会被格式化为 2022/01/01/00/59 ，与bucket、ossPrefix 共同组成投递的目标文件路径。
             */
            public Builder pathFormat(String pathFormat) {
                this.pathFormat = pathFormat;
                return this;
            }

            /**
             * RAM角色
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * 存储格式配置。
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            /**
             * 时区，默认取值为空字符串。可取值的格式为 +8000 等。
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public TargetConfiguration build() {
                return new TargetConfiguration(this);
            } 

        } 

    }
}
