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
 * {@link GenerateExportWordTaskRequest} extends {@link RequestModel}
 *
 * <p>GenerateExportWordTaskRequest</p>
 */
public class GenerateExportWordTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GeneratedContentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long generatedContentId;

    private GenerateExportWordTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.generatedContentId = builder.generatedContentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateExportWordTaskRequest create() {
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

    /**
     * @return generatedContentId
     */
    public Long getGeneratedContentId() {
        return this.generatedContentId;
    }

    public static final class Builder extends Request.Builder<GenerateExportWordTaskRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long generatedContentId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateExportWordTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.generatedContentId = request.generatedContentId;
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
         * <p>xxxxx_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder generatedContentId(Long generatedContentId) {
            this.putBodyParameter("GeneratedContentId", generatedContentId);
            this.generatedContentId = generatedContentId;
            return this;
        }

        @Override
        public GenerateExportWordTaskRequest build() {
            return new GenerateExportWordTaskRequest(this);
        } 

    } 

}
