// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetInstanceModuleInfoRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceModuleInfoRequest</p>
 */
public class GetInstanceModuleInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleKey")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String moduleKey;

    private GetInstanceModuleInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.moduleKey = builder.moduleKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceModuleInfoRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return moduleKey
     */
    public String getModuleKey() {
        return this.moduleKey;
    }

    public static final class Builder extends Request.Builder<GetInstanceModuleInfoRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String moduleKey; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceModuleInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.moduleKey = request.moduleKey;
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
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>一级模块标识，必填</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:license:module:ud</p>
         */
        public Builder moduleKey(String moduleKey) {
            this.putQueryParameter("ModuleKey", moduleKey);
            this.moduleKey = moduleKey;
            return this;
        }

        @Override
        public GetInstanceModuleInfoRequest build() {
            return new GetInstanceModuleInfoRequest(this);
        } 

    } 

}
