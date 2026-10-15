// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link DeleteTemplateCacheRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplateCacheRequest</p>
 */
public class DeleteTemplateCacheRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private DeleteTemplateCacheRequest(Builder builder) {
        super(builder);
        this.templateID = builder.templateID;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplateCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder extends Request.Builder<DeleteTemplateCacheRequest, Builder> {
        private String templateID; 
        private String teamID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTemplateCacheRequest request) {
            super(request);
            this.templateID = request.templateID;
            this.teamID = request.teamID;
        } 

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-9f3a2b7c8d1e4f5a6b0c7d8e9f1a2b3c</p>
         */
        public Builder templateID(String templateID) {
            this.putPathParameter("templateID", templateID);
            this.templateID = templateID;
            return this;
        }

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>team-a1b2c3d4e5f6</p>
         */
        public Builder teamID(String teamID) {
            this.putQueryParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        @Override
        public DeleteTemplateCacheRequest build() {
            return new DeleteTemplateCacheRequest(this);
        } 

    } 

}
