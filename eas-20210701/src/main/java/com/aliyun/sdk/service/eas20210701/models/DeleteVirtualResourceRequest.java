// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVirtualResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteVirtualResourceRequest</p>
 */
public class DeleteVirtualResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VirtualResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualResourceId;

    private DeleteVirtualResourceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.virtualResourceId = builder.virtualResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVirtualResourceRequest create() {
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
     * @return virtualResourceId
     */
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

    public static final class Builder extends Request.Builder<DeleteVirtualResourceRequest, Builder> {
        private String clusterId; 
        private String virtualResourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVirtualResourceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.virtualResourceId = request.virtualResourceId;
        } 

        /**
         * <p>The ID of the region to which the virtual resource group belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the virtual resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-vr-npovr28onap1xxxxxx</p>
         */
        public Builder virtualResourceId(String virtualResourceId) {
            this.putPathParameter("VirtualResourceId", virtualResourceId);
            this.virtualResourceId = virtualResourceId;
            return this;
        }

        @Override
        public DeleteVirtualResourceRequest build() {
            return new DeleteVirtualResourceRequest(this);
        } 

    } 

}
