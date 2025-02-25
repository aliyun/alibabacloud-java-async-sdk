// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsJobDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeApsJobDetailRequest</p>
 */
public class DescribeApsJobDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apsJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeApsJobDetailRequest(Builder builder) {
        super(builder);
        this.apsJobId = builder.apsJobId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsJobDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apsJobId
     */
    public String getApsJobId() {
        return this.apsJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeApsJobDetailRequest, Builder> {
        private String apsJobId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApsJobDetailRequest request) {
            super(request);
            this.apsJobId = request.apsJobId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aps-******</p>
         */
        public Builder apsJobId(String apsJobId) {
            this.putBodyParameter("ApsJobId", apsJobId);
            this.apsJobId = apsJobId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeApsJobDetailRequest build() {
            return new DescribeApsJobDetailRequest(this);
        } 

    } 

}
