// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>GetResourceGroupRequest</p>
 */
public class GetResourceGroupRequest extends Request {
    @Query
    @NameInMap("IncludeTags")
    private Boolean includeTags;

    @Query
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    private String resourceGroupId;

    private GetResourceGroupRequest(Builder builder) {
        super(builder);
        this.includeTags = builder.includeTags;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeTags
     */
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<GetResourceGroupRequest, Builder> {
        private Boolean includeTags; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceGroupRequest request) {
            super(request);
            this.includeTags = request.includeTags;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the request.
         */
        public Builder includeTags(Boolean includeTags) {
            this.putQueryParameter("IncludeTags", includeTags);
            this.includeTags = includeTags;
            return this;
        }

        /**
         * Specifies whether to return the information of tags. Valid values:
         * <p>
         * 
         * *   false (default value)
         * *   true
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public GetResourceGroupRequest build() {
            return new GetResourceGroupRequest(this);
        } 

    } 

}
