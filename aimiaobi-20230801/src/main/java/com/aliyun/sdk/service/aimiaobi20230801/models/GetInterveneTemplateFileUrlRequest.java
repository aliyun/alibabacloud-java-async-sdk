// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetInterveneTemplateFileUrlRequest} extends {@link RequestModel}
 *
 * <p>GetInterveneTemplateFileUrlRequest</p>
 */
public class GetInterveneTemplateFileUrlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    private GetInterveneTemplateFileUrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterveneTemplateFileUrlRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    public static final class Builder extends Request.Builder<GetInterveneTemplateFileUrlRequest, Builder> {
        private String regionId; 
        private String agentKey; 

        private Builder() {
            super();
        } 

        private Builder(GetInterveneTemplateFileUrlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        @Override
        public GetInterveneTemplateFileUrlRequest build() {
            return new GetInterveneTemplateFileUrlRequest(this);
        } 

    } 

}
