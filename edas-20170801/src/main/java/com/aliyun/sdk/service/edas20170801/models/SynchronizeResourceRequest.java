// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SynchronizeResourceRequest} extends {@link RequestModel}
 *
 * <p>SynchronizeResourceRequest</p>
 */
public class SynchronizeResourceRequest extends Request {
    @Query
    @NameInMap("ResourceIds")
    private String resourceIds;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private SynchronizeResourceRequest(Builder builder) {
        super(builder);
        this.resourceIds = builder.resourceIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SynchronizeResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SynchronizeResourceRequest, Builder> {
        private String resourceIds; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SynchronizeResourceRequest request) {
            super(request);
            this.resourceIds = request.resourceIds;
            this.type = request.type;
        } 

        /**
         * The ID of the resource. This parameter is required only when you set the Type parameter to `ecs`. If you specify multiple IDs, separate them with commas (,). You can synchronize up to 50 resources at a time.
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The type of the resource to be synchronized. Valid values: `ecs, slb, vpc, ram, and all`. These values are case-sensitive.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SynchronizeResourceRequest build() {
            return new SynchronizeResourceRequest(this);
        } 

    } 

}
