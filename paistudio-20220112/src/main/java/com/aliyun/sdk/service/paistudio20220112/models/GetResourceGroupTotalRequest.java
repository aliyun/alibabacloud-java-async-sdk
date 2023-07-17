// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupTotalRequest} extends {@link RequestModel}
 *
 * <p>GetResourceGroupTotalRequest</p>
 */
public class GetResourceGroupTotalRequest extends Request {
    @Query
    @NameInMap("ResourceGroupID")
    private String resourceGroupID;

    private GetResourceGroupTotalRequest(Builder builder) {
        super(builder);
        this.resourceGroupID = builder.resourceGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupTotalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public static final class Builder extends Request.Builder<GetResourceGroupTotalRequest, Builder> {
        private String resourceGroupID; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceGroupTotalRequest request) {
            super(request);
            this.resourceGroupID = request.resourceGroupID;
        } 

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putQueryParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        @Override
        public GetResourceGroupTotalRequest build() {
            return new GetResourceGroupTotalRequest(this);
        } 

    } 

}
