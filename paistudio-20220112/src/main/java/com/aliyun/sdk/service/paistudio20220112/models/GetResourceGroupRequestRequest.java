// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetResourceGroupRequestRequest} extends {@link RequestModel}
 *
 * <p>GetResourceGroupRequestRequest</p>
 */
public class GetResourceGroupRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodStatus")
    private String podStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupID;

    private GetResourceGroupRequestRequest(Builder builder) {
        super(builder);
        this.podStatus = builder.podStatus;
        this.resourceGroupID = builder.resourceGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return podStatus
     */
    public String getPodStatus() {
        return this.podStatus;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public static final class Builder extends Request.Builder<GetResourceGroupRequestRequest, Builder> {
        private String podStatus; 
        private String resourceGroupID; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceGroupRequestRequest request) {
            super(request);
            this.podStatus = request.podStatus;
            this.resourceGroupID = request.resourceGroupID;
        } 

        /**
         * PodStatus.
         */
        public Builder podStatus(String podStatus) {
            this.putQueryParameter("PodStatus", podStatus);
            this.podStatus = podStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rgf0zhfqn1d4ity2</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putQueryParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        @Override
        public GetResourceGroupRequestRequest build() {
            return new GetResourceGroupRequestRequest(this);
        } 

    } 

}
