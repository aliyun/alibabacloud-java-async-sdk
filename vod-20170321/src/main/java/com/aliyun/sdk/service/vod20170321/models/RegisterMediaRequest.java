// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMediaRequest} extends {@link RequestModel}
 *
 * <p>RegisterMediaRequest</p>
 */
public class RegisterMediaRequest extends Request {
    @Query
    @NameInMap("RegisterMetadatas")
    @Validation(required = true)
    private String registerMetadatas;

    @Query
    @NameInMap("TemplateGroupId")
    private String templateGroupId;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("WorkflowId")
    private String workflowId;

    private RegisterMediaRequest(Builder builder) {
        super(builder);
        this.registerMetadatas = builder.registerMetadatas;
        this.templateGroupId = builder.templateGroupId;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registerMetadatas
     */
    public String getRegisterMetadatas() {
        return this.registerMetadatas;
    }

    /**
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<RegisterMediaRequest, Builder> {
        private String registerMetadatas; 
        private String templateGroupId; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterMediaRequest request) {
            super(request);
            this.registerMetadatas = request.registerMetadatas;
            this.templateGroupId = request.templateGroupId;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
        } 

        /**
         * RegisterMetadatas.
         */
        public Builder registerMetadatas(String registerMetadatas) {
            this.putQueryParameter("RegisterMetadatas", registerMetadatas);
            this.registerMetadatas = registerMetadatas;
            return this;
        }

        /**
         * TemplateGroupId.
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public RegisterMediaRequest build() {
            return new RegisterMediaRequest(this);
        } 

    } 

}
