// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyImageRequest} extends {@link RequestModel}
 *
 * <p>CopyImageRequest</p>
 */
public class CopyImageRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("EncryptAlgorithm")
    private String encryptAlgorithm;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Encrypted")
    private Boolean encrypted;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @Query
    @NameInMap("DestinationRegionId")
    private String destinationRegionId;

    @Query
    @NameInMap("DestinationDescription")
    private String destinationDescription;

    @Query
    @NameInMap("DestinationImageName")
    private String destinationImageName;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    private CopyImageRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.encryptAlgorithm = builder.encryptAlgorithm;
        this.tag = builder.tag;
        this.encrypted = builder.encrypted;
        this.KMSKeyId = builder.KMSKeyId;
        this.destinationRegionId = builder.destinationRegionId;
        this.destinationDescription = builder.destinationDescription;
        this.destinationImageName = builder.destinationImageName;
        this.resourceGroupId = builder.resourceGroupId;
        this.regionId = builder.regionId;
        this.imageId = builder.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyImageRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return encryptAlgorithm
     */
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return destinationDescription
     */
    public String getDestinationDescription() {
        return this.destinationDescription;
    }

    /**
     * @return destinationImageName
     */
    public String getDestinationImageName() {
        return this.destinationImageName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    public static final class Builder extends Request.Builder<CopyImageRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String encryptAlgorithm; 
        private java.util.List < Tag> tag; 
        private Boolean encrypted; 
        private String KMSKeyId; 
        private String destinationRegionId; 
        private String destinationDescription; 
        private String destinationImageName; 
        private String resourceGroupId; 
        private String regionId; 
        private String imageId; 

        private Builder() {
            super();
        } 

        private Builder(CopyImageRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.encryptAlgorithm = response.encryptAlgorithm;
            this.tag = response.tag;
            this.encrypted = response.encrypted;
            this.KMSKeyId = response.KMSKeyId;
            this.destinationRegionId = response.destinationRegionId;
            this.destinationDescription = response.destinationDescription;
            this.destinationImageName = response.destinationImageName;
            this.resourceGroupId = response.resourceGroupId;
            this.regionId = response.regionId;
            this.imageId = response.imageId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * EncryptAlgorithm.
         */
        public Builder encryptAlgorithm(String encryptAlgorithm) {
            this.putQueryParameter("EncryptAlgorithm", encryptAlgorithm);
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether to encrypt the copied image.
         * <p>
         * 
         * Default value: false.
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * The accesskey ID used to encrypt the image.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * The ID of the destination region.
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.putQueryParameter("DestinationRegionId", destinationRegionId);
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * The description of the copied image. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder destinationDescription(String destinationDescription) {
            this.putQueryParameter("DestinationDescription", destinationDescription);
            this.destinationDescription = destinationDescription;
            return this;
        }

        /**
         * The name of the copied image. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "aliyun" or "acs:". It cannot contain "http://" or "https://". It can contain numbers, periods (.), colons (:), underscores (_), and hyphens (-).
         */
        public Builder destinationImageName(String destinationImageName) {
            this.putQueryParameter("DestinationImageName", destinationImageName);
            this.destinationImageName = destinationImageName;
            return this;
        }

        /**
         * The ID of the Resource Group of the copied image. If this parameter is not set, the copied image belongs to the default resource group.
         * <p>
         * 
         * > If you are using a RAM user to call this operation and the value of "ResourceGroupId" is empty, note that when the RAM user does not have the default Resource Group permission, the error message "Forbbiden: User not authorized to operate on the specified resource" is returned ". You can call this operation again after setting the ID of the resource group supported by the RAM user or granting the default resource group permission to the RAM user through the corresponding Alibaba cloud account.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the region from which the image is defined. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * From define the mirror ID.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public CopyImageRequest build() {
            return new CopyImageRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
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
             * 复制后的镜像的标签键。N的取值范围为1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 复制后的镜像的标签值。N的取值范围为1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或`https://`。
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
