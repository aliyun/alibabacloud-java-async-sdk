// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeRdsPerformanceSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeRdsPerformanceSummaryRequest</p>
 */
public class DescribeRdsPerformanceSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> rdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeRdsPerformanceSummaryRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.rdsInstanceId = builder.rdsInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsPerformanceSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return rdsInstanceId
     */
    public java.util.List<String> getRdsInstanceId() {
        return this.rdsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeRdsPerformanceSummaryRequest, Builder> {
        private String drdsInstanceId; 
        private java.util.List<String> rdsInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRdsPerformanceSummaryRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.rdsInstanceId = request.rdsInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of a DRDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-*****************</p>
         */
        public Builder rdsInstanceId(java.util.List<String> rdsInstanceId) {
            this.putQueryParameter("RdsInstanceId", rdsInstanceId);
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the region where the streaming domain resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeRdsPerformanceSummaryRequest build() {
            return new DescribeRdsPerformanceSummaryRequest(this);
        } 

    } 

}
