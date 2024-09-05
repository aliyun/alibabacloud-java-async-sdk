// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunScriptContinueRequest} extends {@link RequestModel}
 *
 * <p>RunScriptContinueRequest</p>
 */
public class RunScriptContinueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptSummary")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String scriptSummary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptTypeKeyword")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String scriptTypeKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userProvidedContent")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 5000)
    private String userProvidedContent;

    private RunScriptContinueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.scriptSummary = builder.scriptSummary;
        this.scriptTypeKeyword = builder.scriptTypeKeyword;
        this.userProvidedContent = builder.userProvidedContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunScriptContinueRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return scriptSummary
     */
    public String getScriptSummary() {
        return this.scriptSummary;
    }

    /**
     * @return scriptTypeKeyword
     */
    public String getScriptTypeKeyword() {
        return this.scriptTypeKeyword;
    }

    /**
     * @return userProvidedContent
     */
    public String getUserProvidedContent() {
        return this.userProvidedContent;
    }

    public static final class Builder extends Request.Builder<RunScriptContinueRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String scriptSummary; 
        private String scriptTypeKeyword; 
        private String userProvidedContent; 

        private Builder() {
            super();
        } 

        private Builder(RunScriptContinueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.scriptSummary = request.scriptSummary;
            this.scriptTypeKeyword = request.scriptTypeKeyword;
            this.userProvidedContent = request.userProvidedContent;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * scriptSummary.
         */
        public Builder scriptSummary(String scriptSummary) {
            this.putBodyParameter("scriptSummary", scriptSummary);
            this.scriptSummary = scriptSummary;
            return this;
        }

        /**
         * scriptTypeKeyword.
         */
        public Builder scriptTypeKeyword(String scriptTypeKeyword) {
            this.putBodyParameter("scriptTypeKeyword", scriptTypeKeyword);
            this.scriptTypeKeyword = scriptTypeKeyword;
            return this;
        }

        /**
         * userProvidedContent.
         */
        public Builder userProvidedContent(String userProvidedContent) {
            this.putBodyParameter("userProvidedContent", userProvidedContent);
            this.userProvidedContent = userProvidedContent;
            return this;
        }

        @Override
        public RunScriptContinueRequest build() {
            return new RunScriptContinueRequest(this);
        } 

    } 

}
