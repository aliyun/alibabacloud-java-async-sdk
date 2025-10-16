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
         * AccessInstanceStatus.
         */
        public Builder accessInstanceStatus(String accessInstanceStatus) {
            this.putQueryParameter("AccessInstanceStatus", accessInstanceStatus);
            this.accessInstanceStatus = accessInstanceStatus;
            return this;
        }

        /**
         * AccessInstanceType.
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
