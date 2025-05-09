// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVirtualResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeVirtualResourceRequest</p>
 */
public class DescribeVirtualResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VirtualResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualResourceId;

    private DescribeVirtualResourceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.virtualResourceId = builder.virtualResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualResourceRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeVirtualResourceRequest, Builder> {
        private String clusterId; 
        private String virtualResourceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVirtualResourceRequest request) {
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
        public DescribeVirtualResourceRequest build() {
            return new DescribeVirtualResourceRequest(this);
        } 

    } 

}
