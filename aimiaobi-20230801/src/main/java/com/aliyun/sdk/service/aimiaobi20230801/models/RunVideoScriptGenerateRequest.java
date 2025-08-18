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
 * {@link RunVideoScriptGenerateRequest} extends {@link RequestModel}
 *
 * <p>RunVideoScriptGenerateRequest</p>
 */
public class RunVideoScriptGenerateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptLength")
    private String scriptLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptNumber")
    private Integer scriptNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseSearch")
    private Boolean useSearch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunVideoScriptGenerateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.language = builder.language;
        this.prompt = builder.prompt;
        this.scriptLength = builder.scriptLength;
        this.scriptNumber = builder.scriptNumber;
        this.useSearch = builder.useSearch;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunVideoScriptGenerateRequest create() {
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
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return scriptLength
     */
    public String getScriptLength() {
        return this.scriptLength;
    }

    /**
     * @return scriptNumber
     */
    public Integer getScriptNumber() {
        return this.scriptNumber;
    }

    /**
     * @return useSearch
     */
    public Boolean getUseSearch() {
        return this.useSearch;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunVideoScriptGenerateRequest, Builder> {
        private String regionId; 
        private String language; 
        private String prompt; 
        private String scriptLength; 
        private Integer scriptNumber; 
        private Boolean useSearch; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunVideoScriptGenerateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.language = request.language;
            this.prompt = request.prompt;
            this.scriptLength = request.scriptLength;
            this.scriptNumber = request.scriptNumber;
            this.useSearch = request.useSearch;
            this.workspaceId = request.workspaceId;
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
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * ScriptLength.
         */
        public Builder scriptLength(String scriptLength) {
            this.putBodyParameter("ScriptLength", scriptLength);
            this.scriptLength = scriptLength;
            return this;
        }

        /**
         * ScriptNumber.
         */
        public Builder scriptNumber(Integer scriptNumber) {
            this.putBodyParameter("ScriptNumber", scriptNumber);
            this.scriptNumber = scriptNumber;
            return this;
        }

        /**
         * UseSearch.
         */
        public Builder useSearch(Boolean useSearch) {
            this.putBodyParameter("UseSearch", useSearch);
            this.useSearch = useSearch;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunVideoScriptGenerateRequest build() {
            return new RunVideoScriptGenerateRequest(this);
        } 

    } 

}
