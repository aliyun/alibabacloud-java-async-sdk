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
 * {@link DescribeLakebaseMountParameterGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeLakebaseMountParameterGroupRequest</p>
 */
public class DescribeLakebaseMountParameterGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeLakebaseMountParameterGroupRequest(Builder builder) {
        super(builder);
        this.parameterGroupId = builder.parameterGroupId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakebaseMountParameterGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
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

    public static final class Builder extends Request.Builder<DescribeLakebaseMountParameterGroupRequest, Builder> {
        private String parameterGroupId; 
        private String polarFsInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLakebaseMountParameterGroupRequest request) {
            super(request);
            this.parameterGroupId = request.parameterGroupId;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The parameter template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxx</p>
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.putQueryParameter("ParameterGroupId", parameterGroupId);
            this.parameterGroupId = parameterGroupId;
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
        public DescribeLakebaseMountParameterGroupRequest build() {
            return new DescribeLakebaseMountParameterGroupRequest(this);
        } 

    } 

}
