// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceResourcesRequest</p>
 */
public class ListInstanceResourcesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Group")
    private String group;

    @Query
    @NameInMap("Type")
    private String type;

    private ListInstanceResourcesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.category = builder.category;
        this.group = builder.group;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResourcesRequest create() {
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

    public static final class Builder extends Request.Builder<ListInstanceResourcesRequest, Builder> {
        private String instanceId; 
        private String category; 
        private String group; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceResourcesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.category = request.category;
            this.group = request.group;
            this.type = request.type;
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
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListInstanceResourcesRequest build() {
            return new ListInstanceResourcesRequest(this);
        } 

    } 

}
