// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link TriggerStackExecutionRequest} extends {@link RequestModel}
 *
 * <p>TriggerStackExecutionRequest</p>
 */
public class TriggerStackExecutionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("changedFolders")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> changedFolders;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("codePackagePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codePackagePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("codeVersionId")
    private String codeVersionId;

    private TriggerStackExecutionRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.changedFolders = builder.changedFolders;
        this.clientToken = builder.clientToken;
        this.codePackagePath = builder.codePackagePath;
        this.codeVersionId = builder.codeVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerStackExecutionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return changedFolders
     */
    public java.util.List<String> getChangedFolders() {
        return this.changedFolders;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return codePackagePath
     */
    public String getCodePackagePath() {
        return this.codePackagePath;
    }

    /**
     * @return codeVersionId
     */
    public String getCodeVersionId() {
        return this.codeVersionId;
    }

    public static final class Builder extends Request.Builder<TriggerStackExecutionRequest, Builder> {
        private String action; 
        private java.util.List<String> changedFolders; 
        private String clientToken; 
        private String codePackagePath; 
        private String codeVersionId; 

        private Builder() {
            super();
        } 

        private Builder(TriggerStackExecutionRequest request) {
            super(request);
            this.action = request.action;
            this.changedFolders = request.changedFolders;
            this.clientToken = request.clientToken;
            this.codePackagePath = request.codePackagePath;
            this.codeVersionId = request.codeVersionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform plan</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder changedFolders(java.util.List<String> changedFolders) {
            this.putBodyParameter("changedFolders", changedFolders);
            this.changedFolders = changedFolders;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iacservice::mod-xxx</p>
         */
        public Builder codePackagePath(String codePackagePath) {
            this.putBodyParameter("codePackagePath", codePackagePath);
            this.codePackagePath = codePackagePath;
            return this;
        }

        /**
         * codeVersionId.
         */
        public Builder codeVersionId(String codeVersionId) {
            this.putBodyParameter("codeVersionId", codeVersionId);
            this.codeVersionId = codeVersionId;
            return this;
        }

        @Override
        public TriggerStackExecutionRequest build() {
            return new TriggerStackExecutionRequest(this);
        } 

    } 

}
