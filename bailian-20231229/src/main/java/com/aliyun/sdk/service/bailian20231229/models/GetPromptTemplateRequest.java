// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPromptTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetPromptTemplateRequest</p>
 */
public class GetPromptTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("promptTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptTemplateId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetPromptTemplateRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.promptTemplateId = builder.promptTemplateId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return promptTemplateId
     */
    public String getPromptTemplateId() {
        return this.promptTemplateId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetPromptTemplateRequest, Builder> {
        private String workspaceId; 
        private String promptTemplateId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPromptTemplateRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.promptTemplateId = request.promptTemplateId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-us9hjmt32nysdxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6e49109bfeb94a39bb268f4e483ccxxx</p>
         */
        public Builder promptTemplateId(String promptTemplateId) {
            this.putPathParameter("promptTemplateId", promptTemplateId);
            this.promptTemplateId = promptTemplateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetPromptTemplateRequest build() {
            return new GetPromptTemplateRequest(this);
        } 

    } 

}
