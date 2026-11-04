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
 * {@link ModifyLakebaseMountParameterGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyLakebaseMountParameterGroupRequest</p>
 */
public class ModifyLakebaseMountParameterGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteParameters")
    private String deleteParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
    private String parameterGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyLakebaseMountParameterGroupRequest(Builder builder) {
        super(builder);
        this.deleteParameters = builder.deleteParameters;
        this.parameterGroupId = builder.parameterGroupId;
        this.parameterGroupName = builder.parameterGroupName;
        this.parameters = builder.parameters;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLakebaseMountParameterGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteParameters
     */
    public String getDeleteParameters() {
        return this.deleteParameters;
    }

    /**
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
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

    public static final class Builder extends Request.Builder<ModifyLakebaseMountParameterGroupRequest, Builder> {
        private String deleteParameters; 
        private String parameterGroupId; 
        private String parameterGroupName; 
        private String parameters; 
        private String polarFsInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLakebaseMountParameterGroupRequest request) {
            super(request);
            this.deleteParameters = request.deleteParameters;
            this.parameterGroupId = request.parameterGroupId;
            this.parameterGroupName = request.parameterGroupName;
            this.parameters = request.parameters;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The names of the parameters to delete, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>param1,param2</p>
         */
        public Builder deleteParameters(String deleteParameters) {
            this.putQueryParameter("DeleteParameters", deleteParameters);
            this.deleteParameters = deleteParameters;
            return this;
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
         * <p>The new parameter template name.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-new</p>
         */
        public Builder parameterGroupName(String parameterGroupName) {
            this.putQueryParameter("ParameterGroupName", parameterGroupName);
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * <p>The JSON string of added or modified parameter key-value pairs.</p>
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
        public ModifyLakebaseMountParameterGroupRequest build() {
            return new ModifyLakebaseMountParameterGroupRequest(this);
        } 

    } 

}
