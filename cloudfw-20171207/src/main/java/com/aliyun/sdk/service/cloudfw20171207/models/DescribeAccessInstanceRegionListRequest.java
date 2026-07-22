// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAccessInstanceRegionListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessInstanceRegionListRequest</p>
 */
public class DescribeAccessInstanceRegionListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceStatus")
    private String accessInstanceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceType")
    private String accessInstanceType;

    private DescribeAccessInstanceRegionListRequest(Builder builder) {
        super(builder);
        this.accessInstanceStatus = builder.accessInstanceStatus;
        this.accessInstanceType = builder.accessInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessInstanceRegionListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceStatus
     */
    public String getAccessInstanceStatus() {
        return this.accessInstanceStatus;
    }

    /**
     * @return accessInstanceType
     */
    public String getAccessInstanceType() {
        return this.accessInstanceType;
    }

    public static final class Builder extends Request.Builder<DescribeAccessInstanceRegionListRequest, Builder> {
        private String accessInstanceStatus; 
        private String accessInstanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessInstanceRegionListRequest request) {
            super(request);
            this.accessInstanceStatus = request.accessInstanceStatus;
            this.accessInstanceType = request.accessInstanceType;
        } 

        /**
         * <p>实例状态（可选），用于按状态筛选。本接口的地域列表查询主要依据 AccessInstanceType 分流。</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        public Builder accessInstanceStatus(String accessInstanceStatus) {
            this.putQueryParameter("AccessInstanceStatus", accessInstanceStatus);
            this.accessInstanceStatus = accessInstanceStatus;
            return this;
        }

        /**
         * <p>实例类型。可选值 PrivateDns（默认，不传时等同 PrivateDns）、AckClusterConnector；传入其他值时返回 ErrorParameters。</p>
         * 
         * <strong>example:</strong>
         * <p>AckClusterConnector</p>
         */
        public Builder accessInstanceType(String accessInstanceType) {
            this.putQueryParameter("AccessInstanceType", accessInstanceType);
            this.accessInstanceType = accessInstanceType;
            return this;
        }

        @Override
        public DescribeAccessInstanceRegionListRequest build() {
            return new DescribeAccessInstanceRegionListRequest(this);
        } 

    } 

}
