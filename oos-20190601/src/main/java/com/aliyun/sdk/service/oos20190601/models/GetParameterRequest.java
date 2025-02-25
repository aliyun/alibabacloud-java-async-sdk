// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GetParameterRequest} extends {@link RequestModel}
 *
 * <p>GetParameterRequest</p>
 */
public class GetParameterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterVersion")
    private Integer parameterVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private GetParameterRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.parameterVersion = builder.parameterVersion;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParameterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameterVersion
     */
    public Integer getParameterVersion() {
        return this.parameterVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<GetParameterRequest, Builder> {
        private String name; 
        private Integer parameterVersion; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetParameterRequest request) {
            super(request);
            this.name = request.name;
            this.parameterVersion = request.parameterVersion;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The name of the common parameter. The name can be up to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyParameter</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The version number of the common parameter. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder parameterVersion(Integer parameterVersion) {
            this.putQueryParameter("ParameterVersion", parameterVersion);
            this.parameterVersion = parameterVersion;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public GetParameterRequest build() {
            return new GetParameterRequest(this);
        } 

    } 

}
