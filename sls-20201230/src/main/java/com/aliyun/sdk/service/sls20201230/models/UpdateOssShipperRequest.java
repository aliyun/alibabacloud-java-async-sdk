// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateOssShipperRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssShipperRequest</p>
 */
public class UpdateOssShipperRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
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

    private UpdateOssShipperRequest(Builder builder) {
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

    public static UpdateOssShipperRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateOssShipperRequest, Builder> {
        private String project; 
        private String logstore; 
        private String shipperName; 
        private TargetConfiguration targetConfiguration; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssShipperRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shipperName = request.shipperName;
            this.targetConfiguration = request.targetConfiguration;
            this.targetType = request.targetType;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * shipperName.
         */
        public Builder shipperName(String shipperName) {
            this.putPathParameter("shipperName", shipperName);
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
         * targetType.
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public UpdateOssShipperRequest build() {
            return new UpdateOssShipperRequest(this);
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
             * detail.
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * format.
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
             * bufferInterval.
             */
            public Builder bufferInterval(Integer bufferInterval) {
                this.bufferInterval = bufferInterval;
                return this;
            }

            /**
             * bufferSize.
             */
            public Builder bufferSize(Integer bufferSize) {
                this.bufferSize = bufferSize;
                return this;
            }

            /**
             * compressType.
             */
            public Builder compressType(String compressType) {
                this.compressType = compressType;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * ossBucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * ossPrefix.
             */
            public Builder ossPrefix(String ossPrefix) {
                this.ossPrefix = ossPrefix;
                return this;
            }

            /**
             * pathFormat.
             */
            public Builder pathFormat(String pathFormat) {
                this.pathFormat = pathFormat;
                return this;
            }

            /**
             * roleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * storage.
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            /**
             * timeZone.
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
