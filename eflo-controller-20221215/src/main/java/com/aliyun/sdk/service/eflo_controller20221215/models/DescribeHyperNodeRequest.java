// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeHyperNodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeHyperNodeRequest</p>
 */
public class DescribeHyperNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HyperNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hyperNodeId;

    private DescribeHyperNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.hyperNodeId = builder.hyperNodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHyperNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return hyperNodeId
     */
    public String getHyperNodeId() {
        return this.hyperNodeId;
    }

    public static final class Builder extends Request.Builder<DescribeHyperNodeRequest, Builder> {
        private String regionId; 
        private String hyperNodeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHyperNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.hyperNodeId = request.hyperNodeId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr08</p>
         */
        public Builder hyperNodeId(String hyperNodeId) {
            this.putBodyParameter("HyperNodeId", hyperNodeId);
            this.hyperNodeId = hyperNodeId;
            return this;
        }

        @Override
        public DescribeHyperNodeRequest build() {
            return new DescribeHyperNodeRequest(this);
        } 

    } 

}
