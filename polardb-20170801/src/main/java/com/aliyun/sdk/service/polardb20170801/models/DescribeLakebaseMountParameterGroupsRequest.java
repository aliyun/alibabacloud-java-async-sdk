// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeLakebaseMountParameterGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLakebaseMountParameterGroupsRequest</p>
 */
public class DescribeLakebaseMountParameterGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamGroupCategory")
    private String paramGroupCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeLakebaseMountParameterGroupsRequest(Builder builder) {
        super(builder);
        this.paramGroupCategory = builder.paramGroupCategory;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakebaseMountParameterGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramGroupCategory
     */
    public String getParamGroupCategory() {
        return this.paramGroupCategory;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeLakebaseMountParameterGroupsRequest, Builder> {
        private String paramGroupCategory; 
        private String polarFsInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLakebaseMountParameterGroupsRequest request) {
            super(request);
            this.paramGroupCategory = request.paramGroupCategory;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance category. Valid values:</p>
         * <ul>
         * <li>basic: Basic Edition.</li>
         * <li>high_performance: High-performance Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder paramGroupCategory(String paramGroupCategory) {
            this.putQueryParameter("ParamGroupCategory", paramGroupCategory);
            this.paramGroupCategory = paramGroupCategory;
            return this;
        }

        /**
         * <p>The PolarFS instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeLakebaseMountParameterGroupsRequest build() {
            return new DescribeLakebaseMountParameterGroupsRequest(this);
        } 

    } 

}
