// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterAttributesRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterAttributesRequest</p>
 */
public class ModifyClusterAttributesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RamNodeTypes")
    private java.util.List < String > ramNodeTypes;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    private ModifyClusterAttributesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.name = builder.name;
        this.ramNodeTypes = builder.ramNodeTypes;
        this.ramRoleName = builder.ramRoleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ramNodeTypes
     */
    public java.util.List < String > getRamNodeTypes() {
        return this.ramNodeTypes;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public static final class Builder extends Request.Builder<ModifyClusterAttributesRequest, Builder> {
        private String clusterId; 
        private String description; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String name; 
        private java.util.List < String > ramNodeTypes; 
        private String ramRoleName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterAttributesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.name = request.name;
            this.ramNodeTypes = request.ramNodeTypes;
            this.ramRoleName = request.ramRoleName;
        } 

        /**
         * The ID of the cluster that you want to modify.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The new cluster description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The new image type of the cluster. Valid values:
         * <p>
         * 
         * *   system: public image
         * *   self: custom image
         * *   others: shared image
         * *   marketplace: Alibaba Cloud Marketplace image
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * The new cluster name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RamNodeTypes.
         */
        public Builder ramNodeTypes(java.util.List < String > ramNodeTypes) {
            this.putQueryParameter("RamNodeTypes", ramNodeTypes);
            this.ramNodeTypes = ramNodeTypes;
            return this;
        }

        /**
         * RamRoleName.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        @Override
        public ModifyClusterAttributesRequest build() {
            return new ModifyClusterAttributesRequest(this);
        } 

    } 

}
