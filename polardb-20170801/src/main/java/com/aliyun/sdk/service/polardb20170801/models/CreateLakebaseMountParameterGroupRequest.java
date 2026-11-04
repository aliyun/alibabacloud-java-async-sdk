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
 * {@link CreateLakebaseMountParameterGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateLakebaseMountParameterGroupRequest</p>
 */
public class CreateLakebaseMountParameterGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamGroupCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramGroupCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
    private String parameterGroupDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateLakebaseMountParameterGroupRequest(Builder builder) {
        super(builder);
        this.paramGroupCategory = builder.paramGroupCategory;
        this.parameterGroupDesc = builder.parameterGroupDesc;
        this.parameterGroupName = builder.parameterGroupName;
        this.parameters = builder.parameters;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLakebaseMountParameterGroupRequest create() {
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
     * @return parameterGroupDesc
     */
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    /**
     * @return parameterGroupName
     */
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
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

    public static final class Builder extends Request.Builder<CreateLakebaseMountParameterGroupRequest, Builder> {
        private String paramGroupCategory; 
        private String parameterGroupDesc; 
        private String parameterGroupName; 
        private String parameters; 
        private String polarFsInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLakebaseMountParameterGroupRequest request) {
            super(request);
            this.paramGroupCategory = request.paramGroupCategory;
            this.parameterGroupDesc = request.parameterGroupDesc;
            this.parameterGroupName = request.parameterGroupName;
            this.parameters = request.parameters;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance category. Valid values:</p>
         * <ul>
         * <li>basic: Basic Edition.</li>
         * <li>high_performance: High-performance Edition.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The description of the parameter template.</p>
         * 
         * <strong>example:</strong>
         * <p>Test template</p>
         */
        public Builder parameterGroupDesc(String parameterGroupDesc) {
            this.putQueryParameter("ParameterGroupDesc", parameterGroupDesc);
            this.parameterGroupDesc = parameterGroupDesc;
            return this;
        }

        /**
         * <p>The name of the parameter template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-test</p>
         */
        public Builder parameterGroupName(String parameterGroupName) {
            this.putQueryParameter("ParameterGroupName", parameterGroupName);
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * <p>The JSON string of parameters and their values.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
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
        public CreateLakebaseMountParameterGroupRequest build() {
            return new CreateLakebaseMountParameterGroupRequest(this);
        } 

    } 

}
