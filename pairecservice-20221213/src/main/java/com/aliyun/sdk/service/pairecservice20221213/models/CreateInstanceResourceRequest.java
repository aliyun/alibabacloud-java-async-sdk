// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceResourceRequest</p>
 */
public class CreateInstanceResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    private CreateInstanceResourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.group = builder.group;
        this.type = builder.type;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<CreateInstanceResourceRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String category; 
        private String group; 
        private String type; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceResourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.category = request.category;
            this.group = request.group;
            this.type = request.type;
            this.uri = request.uri;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * Category.
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putBodyParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public CreateInstanceResourceRequest build() {
            return new CreateInstanceResourceRequest(this);
        } 

    } 

}
