// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCrowdRequest} extends {@link RequestModel}
 *
 * <p>UpdateCrowdRequest</p>
 */
public class UpdateCrowdRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CrowdId")
    private String crowdId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    private String users;

    private UpdateCrowdRequest(Builder builder) {
        super(builder);
        this.crowdId = builder.crowdId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.label = builder.label;
        this.name = builder.name;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCrowdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crowdId
     */
    public String getCrowdId() {
        return this.crowdId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return users
     */
    public String getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<UpdateCrowdRequest, Builder> {
        private String crowdId; 
        private String regionId; 
        private String description; 
        private String label; 
        private String name; 
        private String users; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCrowdRequest request) {
            super(request);
            this.crowdId = request.crowdId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.label = request.label;
            this.name = request.name;
            this.users = request.users;
        } 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.putPathParameter("CrowdId", crowdId);
            this.crowdId = crowdId;
            return this;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(String users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public UpdateCrowdRequest build() {
            return new UpdateCrowdRequest(this);
        } 

    } 

}
