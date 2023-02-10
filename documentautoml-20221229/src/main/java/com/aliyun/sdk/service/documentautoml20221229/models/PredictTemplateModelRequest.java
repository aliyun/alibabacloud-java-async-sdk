// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictTemplateModelRequest} extends {@link RequestModel}
 *
 * <p>PredictTemplateModelRequest</p>
 */
public class PredictTemplateModelRequest extends Request {
    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    private PredictTemplateModelRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictTemplateModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<PredictTemplateModelRequest, Builder> {
        private String content; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(PredictTemplateModelRequest request) {
            super(request);
            this.content = request.content;
            this.projectId = request.projectId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public PredictTemplateModelRequest build() {
            return new PredictTemplateModelRequest(this);
        } 

    } 

}
