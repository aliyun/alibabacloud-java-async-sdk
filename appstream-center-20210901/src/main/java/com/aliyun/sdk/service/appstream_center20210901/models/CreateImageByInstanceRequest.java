// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateImageByInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateImageByInstanceRequest</p>
 */
public class CreateImageByInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoCleanUserdata")
    private Boolean autoCleanUserdata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubInstanceId")
    private String subInstanceId;

    private CreateImageByInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoCleanUserdata = builder.autoCleanUserdata;
        this.bizType = builder.bizType;
        this.description = builder.description;
        this.diskType = builder.diskType;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.productType = builder.productType;
        this.subInstanceId = builder.subInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageByInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoCleanUserdata
     */
    public Boolean getAutoCleanUserdata() {
        return this.autoCleanUserdata;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return subInstanceId
     */
    public String getSubInstanceId() {
        return this.subInstanceId;
    }

    public static final class Builder extends Request.Builder<CreateImageByInstanceRequest, Builder> {
        private String regionId; 
        private Boolean autoCleanUserdata; 
        private Integer bizType; 
        private String description; 
        private String diskType; 
        private String imageName; 
        private String instanceId; 
        private String instanceType; 
        private String productType; 
        private String subInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageByInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoCleanUserdata = request.autoCleanUserdata;
            this.bizType = request.bizType;
            this.description = request.description;
            this.diskType = request.diskType;
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.productType = request.productType;
            this.subInstanceId = request.subInstanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is applicable only to scenarios in which the instance type is Cloud Desktop. Specifies whether to clear private data of users. If this parameter is set to true, the created image clears data in directories other than Administrator and Public in the C:\Users directory.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: cleanup.</li>
         * <li>false: does not clear.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCleanUserdata(Boolean autoCleanUserdata) {
            this.putBodyParameter("AutoCleanUserdata", autoCleanUserdata);
            this.autoCleanUserdata = autoCleanUserdata;
            return this;
        }

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>my test image v1.0</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The type of disk data contained in the image. By default, the system disk and data disk of the instance are included.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SYSTEM: only system disk.</li>
         * <li>ALL: system disk + data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder diskType(String diskType) {
            this.putBodyParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The ID of the RDS instance. The instance can be a CloudDesktop instance, a workstation instance. To ensure data consistency in the image, we recommend that you shut down the instance before you create an image.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0buj1s9gm******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudDesktop: Cloud Desktop.</li>
         * <li>WuyingServer: Workstation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The ID of the child instance. This parameter is not used in cloud computing scenarios. Workstation scenarios, you need to specify a persistent session ID to ensure that a specific instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0cc7s3n1l*****</p>
         */
        public Builder subInstanceId(String subInstanceId) {
            this.putBodyParameter("SubInstanceId", subInstanceId);
            this.subInstanceId = subInstanceId;
            return this;
        }

        @Override
        public CreateImageByInstanceRequest build() {
            return new CreateImageByInstanceRequest(this);
        } 

    } 

}
