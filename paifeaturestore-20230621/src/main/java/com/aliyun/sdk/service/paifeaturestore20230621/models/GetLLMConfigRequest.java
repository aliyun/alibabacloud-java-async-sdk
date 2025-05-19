// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link GetLLMConfigRequest} extends {@link RequestModel}
 *
 * <p>GetLLMConfigRequest</p>
 */
public class GetLLMConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LLMConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String LLMConfigId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetLLMConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.LLMConfigId = builder.LLMConfigId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLLMConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return LLMConfigId
     */
    public String getLLMConfigId() {
        return this.LLMConfigId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetLLMConfigRequest, Builder> {
        private String instanceId; 
        private String LLMConfigId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLLMConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.LLMConfigId = request.LLMConfigId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_config1</p>
         */
        public Builder LLMConfigId(String LLMConfigId) {
            this.putPathParameter("LLMConfigId", LLMConfigId);
            this.LLMConfigId = LLMConfigId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putPathParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetLLMConfigRequest build() {
            return new GetLLMConfigRequest(this);
        } 

    } 

}
