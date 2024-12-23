// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link UpdatePromptTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdatePromptTemplateRequest</p>
 */
public class UpdatePromptTemplateRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private UpdatePromptTemplateRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.promptTemplateId = builder.promptTemplateId;
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePromptTemplateRequest create() {
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

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdatePromptTemplateRequest, Builder> {
        private String workspaceId; 
        private String promptTemplateId; 
        private String regionId; 
        private String content; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePromptTemplateRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.promptTemplateId = request.promptTemplateId;
            this.regionId = request.regionId;
            this.content = request.content;
            this.name = request.name;
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

        /**
         * content.
         */
        public Builder content(String content) {
            this.putQueryParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdatePromptTemplateRequest build() {
            return new UpdatePromptTemplateRequest(this);
        } 

    } 

}
