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
 * {@link DescribeNodeTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeTypeRequest</p>
 */
public class DescribeNodeTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    private DescribeNodeTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeType = builder.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeTypeRequest create() {
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
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    public static final class Builder extends Request.Builder<DescribeNodeTypeRequest, Builder> {
        private String regionId; 
        private String nodeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeType = request.nodeType;
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
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        @Override
        public DescribeNodeTypeRequest build() {
            return new DescribeNodeTypeRequest(this);
        } 

    } 

}
