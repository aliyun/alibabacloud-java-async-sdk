// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCustomImageRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomImageRequest</p>
 */
public class CreateCustomImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSnapshotId")
    private String dataSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemSnapshotId")
    private String systemSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateCustomImageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dataSnapshotId = builder.dataSnapshotId;
        this.description = builder.description;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.systemSnapshotId = builder.systemSnapshotId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataSnapshotId
     */
    public String getDataSnapshotId() {
        return this.dataSnapshotId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return systemSnapshotId
     */
    public String getSystemSnapshotId() {
        return this.systemSnapshotId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateCustomImageRequest, Builder> {
        private String clientToken; 
        private String dataSnapshotId; 
        private String description; 
        private String imageName; 
        private String instanceId; 
        private String regionId; 
        private String resourceGroupId; 
        private String systemSnapshotId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomImageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dataSnapshotId = request.dataSnapshotId;
            this.description = request.description;
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.systemSnapshotId = request.systemSnapshotId;
            this.tag = request.tag;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the data disk snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-acscasca****</p>
         */
        public Builder dataSnapshotId(String dataSnapshotId) {
            this.putQueryParameter("DataSnapshotId", dataSnapshotId);
            this.dataSnapshotId = dataSnapshotId;
            return this;
        }

        /**
         * <p>The description of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the custom image. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter or a digit. This parameter is empty by default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customImage-test</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The ID of the simple application server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ace0706b2ac4454d984295a94213****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2bti7cf7****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the system disk snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-acscasca****</p>
         */
        public Builder systemSnapshotId(String systemSnapshotId) {
            this.putQueryParameter("SystemSnapshotId", systemSnapshotId);
            this.systemSnapshotId = systemSnapshotId;
            return this;
        }

        /**
         * <p>The tags that you want to add to the custom image. You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateCustomImageRequest build() {
            return new CreateCustomImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomImageRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomImageRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of tag N that you want to add to the custom image. Valid values of N: 1 to 20.</p>
             * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N that you want to add to the custom image. Valid values of N: 1 to 20.</p>
             * <p>The tag value can be an empty string. The tag value can be up to 64 characters in length and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
