// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DiskDeviceMapping")
    private java.util.List < DiskDeviceMapping> diskDeviceMapping;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("ImageVersion")
    private String imageVersion;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.diskDeviceMapping = builder.diskDeviceMapping;
        this.regionId = builder.regionId;
        this.snapshotId = builder.snapshotId;
        this.instanceId = builder.instanceId;
        this.imageName = builder.imageName;
        this.imageFamily = builder.imageFamily;
        this.imageVersion = builder.imageVersion;
        this.description = builder.description;
        this.platform = builder.platform;
        this.architecture = builder.architecture;
        this.clientToken = builder.clientToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return diskDeviceMapping
     */
    public java.util.List < DiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return imageVersion
     */
    public String getImageVersion() {
        return this.imageVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List < DiskDeviceMapping> diskDeviceMapping; 
        private String regionId; 
        private String snapshotId; 
        private String instanceId; 
        private String imageName; 
        private String imageFamily; 
        private String imageVersion; 
        private String description; 
        private String platform; 
        private String architecture; 
        private String clientToken; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.diskDeviceMapping = request.diskDeviceMapping;
            this.regionId = request.regionId;
            this.snapshotId = request.snapshotId;
            this.instanceId = request.instanceId;
            this.imageName = request.imageName;
            this.imageFamily = request.imageFamily;
            this.imageVersion = request.imageVersion;
            this.description = request.description;
            this.platform = request.platform;
            this.architecture = request.architecture;
            this.clientToken = request.clientToken;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * DiskDeviceMapping.
         */
        public Builder diskDeviceMapping(java.util.List < DiskDeviceMapping> diskDeviceMapping) {
            this.putQueryParameter("DiskDeviceMapping", diskDeviceMapping);
            this.diskDeviceMapping = diskDeviceMapping;
            return this;
        }

        /**
         * The region ID of the image. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Creates a custom image based on the specified snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the image. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The name of the Image family. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with aliyun or acs:. It cannot contain http:// or https://. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * The version of the image.
         */
        public Builder imageVersion(String imageVersion) {
            this.putQueryParameter("ImageVersion", imageVersion);
            this.imageVersion = imageVersion;
            return this;
        }

        /**
         * The description of the image. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * After you specify a data disk snapshot as the system disk of the image, you must use the Platform to determine the operating system release of the system disk. Valid values:
         * <p>
         * 
         * -CentOS.
         * -Ubuntu.
         * -SUSE.
         * -OpenSUSE.
         * -RedHat.
         * -Debian.
         * -CoreOS.
         * -Aliyun.
         * -Windows Server 2012.
         * -Windows 7.
         * -Customized Linux.
         * -Others Linux.
         * 
         * Default value: Others Linux.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * After you specify a data disk snapshot as the system disk of the image, you must use the Architecture to determine the system Architecture of the system disk. Valid values:
         * <p>
         * 
         * -i386.
         * -x86_64.
         * -Arm64.
         * 
         * Default value: x86_64.
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the resource group to which the custom image belongs. If you do not set this parameter, the created image belongs to the default resource group.
         * <p>
         * 
         * > If you are using a RAM User to call this operation and the value of "ResourceGroupId" is empty, note that if the RAM User does not have the default Resource Group permission, an error message "Forbbiden: User not authorized to operate on the specified resource" is returned ". You can call this operation again after setting the ID of the resource group supported by the RAM user or granting the default resource group permission to the RAM user through the corresponding Alibaba cloud account.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateImageRequest build() {
            return new CreateImageRequest(this);
        } 

    } 

    public static class DiskDeviceMapping extends TeaModel {
        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskType")
        private String diskType;

        private DiskDeviceMapping(Builder builder) {
            this.snapshotId = builder.snapshotId;
            this.size = builder.size;
            this.device = builder.device;
            this.diskType = builder.diskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMapping create() {
            return builder().build();
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        public static final class Builder {
            private String snapshotId; 
            private Integer size; 
            private String device; 
            private String diskType; 

            /**
             * 根据指定的快照创建自定义镜像。
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * DiskDeviceMapping.N云盘的大小，单位为GiB。DiskDeviceMapping.N.Size的取值和默认值和DiskDeviceMapping.N.SnapshotId有关：
             * <p>
             * 
             * - 如果没有指定SnapshotId，Size取值以及默认值为：
             *     - 普通云盘：5~2000GiB，默认为5。
             *     - 其他云盘：20~32768GiB，默认为20。
             * - 如果指定了SnapshotId，Size取值必须大于等于SnapshotId的大小，默认为SnapshotId的大小。
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * 指定DiskDeviceMapping.N在自定义镜像中的设备名称。取值范围：
             * <p>
             * 
             * - 其他云盘（例如SSD云盘、高效云盘和ESSD云盘）：/dev/vda~/dev/vdz。
             * - 普通云盘：/dev/xvda~/dev/xvdz。
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * 指定DiskDeviceMapping.N.在新镜像中的云盘类型。您可以通过该参数使用数据盘快照做为镜像的系统盘，如果不指定，默认为快照对应的云盘类型。取值范围：
             * <p>
             * 
             * - system：系统盘。
             * - data：数据盘。
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            public DiskDeviceMapping build() {
                return new DiskDeviceMapping(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 镜像的标签键。
             * <p>
             * 
             * >为提高兼容性，建议您尽量使用Tag.N.Key参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 镜像的标签值。N的取值范围为1~20。一旦传入该值，允许为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或者`https://`。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
