// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceResourceRequest</p>
 */
public class CreateInstanceResourceRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Category")
    private String category;

    @Body
    @NameInMap("Group")
    private String group;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("Uri")
    private String uri;

    private CreateInstanceResourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
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
