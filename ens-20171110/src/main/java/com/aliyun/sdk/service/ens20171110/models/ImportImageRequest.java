// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ImportImageRequest} extends {@link RequestModel}
 *
 * <p>ImportImageRequest</p>
 */
public class ImportImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String computeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskDeviceMapping")
    private java.util.List<DiskDeviceMapping> diskDeviceMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    private String OSSBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSObject")
    private String OSSObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSRegion")
    private String OSSRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetOSSRegionId")
    private String targetOSSRegionId;

    private ImportImageRequest(Builder builder) {
        super(builder);
        this.architecture = builder.architecture;
        this.computeType = builder.computeType;
        this.diskDeviceMapping = builder.diskDeviceMapping;
        this.imageFormat = builder.imageFormat;
        this.imageName = builder.imageName;
        this.OSSBucket = builder.OSSBucket;
        this.OSSObject = builder.OSSObject;
        this.OSSRegion = builder.OSSRegion;
        this.OSType = builder.OSType;
        this.OSVersion = builder.OSVersion;
        this.platform = builder.platform;
        this.targetOSSRegionId = builder.targetOSSRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return computeType
     */
    public String getComputeType() {
        return this.computeType;
    }

    /**
     * @return diskDeviceMapping
     */
    public java.util.List<DiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
    }

    /**
     * @return imageFormat
     */
    public String getImageFormat() {
        return this.imageFormat;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return OSSObject
     */
    public String getOSSObject() {
        return this.OSSObject;
    }

    /**
     * @return OSSRegion
     */
    public String getOSSRegion() {
        return this.OSSRegion;
    }

    /**
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
    }

    /**
     * @return OSVersion
     */
    public String getOSVersion() {
        return this.OSVersion;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return targetOSSRegionId
     */
    public String getTargetOSSRegionId() {
        return this.targetOSSRegionId;
    }

    public static final class Builder extends Request.Builder<ImportImageRequest, Builder> {
        private String architecture; 
        private String computeType; 
        private java.util.List<DiskDeviceMapping> diskDeviceMapping; 
        private String imageFormat; 
        private String imageName; 
        private String OSSBucket; 
        private String OSSObject; 
        private String OSSRegion; 
        private String OSType; 
        private String OSVersion; 
        private String platform; 
        private String targetOSSRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ImportImageRequest request) {
            super(request);
            this.architecture = request.architecture;
            this.computeType = request.computeType;
            this.diskDeviceMapping = request.diskDeviceMapping;
            this.imageFormat = request.imageFormat;
            this.imageName = request.imageName;
            this.OSSBucket = request.OSSBucket;
            this.OSSObject = request.OSSObject;
            this.OSSRegion = request.OSSRegion;
            this.OSType = request.OSType;
            this.OSVersion = request.OSVersion;
            this.platform = request.platform;
            this.targetOSSRegionId = request.targetOSSRegionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ens_vm</p>
         */
        public Builder computeType(String computeType) {
            this.putQueryParameter("ComputeType", computeType);
            this.computeType = computeType;
            return this;
        }

        /**
         * DiskDeviceMapping.
         */
        public Builder diskDeviceMapping(java.util.List<DiskDeviceMapping> diskDeviceMapping) {
            String diskDeviceMappingShrink = shrink(diskDeviceMapping, "DiskDeviceMapping", "json");
            this.putQueryParameter("DiskDeviceMapping", diskDeviceMappingShrink);
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qcow2</p>
         */
        public Builder imageFormat(String imageFormat) {
            this.putQueryParameter("ImageFormat", imageFormat);
            this.imageFormat = imageFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * OSSBucket.
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * OSSObject.
         */
        public Builder OSSObject(String OSSObject) {
            this.putQueryParameter("OSSObject", OSSObject);
            this.OSSObject = OSSObject;
            return this;
        }

        /**
         * OSSRegion.
         */
        public Builder OSSRegion(String OSSRegion) {
            this.putQueryParameter("OSSRegion", OSSRegion);
            this.OSSRegion = OSSRegion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6.8</p>
         */
        public Builder OSVersion(String OSVersion) {
            this.putQueryParameter("OSVersion", OSVersion);
            this.OSVersion = OSVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>centos</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * TargetOSSRegionId.
         */
        public Builder targetOSSRegionId(String targetOSSRegionId) {
            this.putQueryParameter("TargetOSSRegionId", targetOSSRegionId);
            this.targetOSSRegionId = targetOSSRegionId;
            return this;
        }

        @Override
        public ImportImageRequest build() {
            return new ImportImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link ImportImageRequest} extends {@link TeaModel}
     *
     * <p>ImportImageRequest</p>
     */
    public static class DiskDeviceMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OSSBucket")
        private String OSSBucket;

        @com.aliyun.core.annotation.NameInMap("OSSObject")
        private String OSSObject;

        @com.aliyun.core.annotation.NameInMap("OSSRegion")
        private String OSSRegion;

        private DiskDeviceMapping(Builder builder) {
            this.OSSBucket = builder.OSSBucket;
            this.OSSObject = builder.OSSObject;
            this.OSSRegion = builder.OSSRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMapping create() {
            return builder().build();
        }

        /**
         * @return OSSBucket
         */
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        /**
         * @return OSSObject
         */
        public String getOSSObject() {
            return this.OSSObject;
        }

        /**
         * @return OSSRegion
         */
        public String getOSSRegion() {
            return this.OSSRegion;
        }

        public static final class Builder {
            private String OSSBucket; 
            private String OSSObject; 
            private String OSSRegion; 

            private Builder() {
            } 

            private Builder(DiskDeviceMapping model) {
                this.OSSBucket = model.OSSBucket;
                this.OSSObject = model.OSSObject;
                this.OSSRegion = model.OSSRegion;
            } 

            /**
             * OSSBucket.
             */
            public Builder OSSBucket(String OSSBucket) {
                this.OSSBucket = OSSBucket;
                return this;
            }

            /**
             * OSSObject.
             */
            public Builder OSSObject(String OSSObject) {
                this.OSSObject = OSSObject;
                return this;
            }

            /**
             * OSSRegion.
             */
            public Builder OSSRegion(String OSSRegion) {
                this.OSSRegion = OSSRegion;
                return this;
            }

            public DiskDeviceMapping build() {
                return new DiskDeviceMapping(this);
            } 

        } 

    }
}
