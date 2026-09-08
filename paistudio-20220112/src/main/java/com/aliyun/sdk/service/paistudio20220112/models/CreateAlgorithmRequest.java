// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link CreateAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>CreateAlgorithmRequest</p>
 */
public class CreateAlgorithmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlgorithmDescription")
    private String algorithmDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlgorithmName")
    private String algorithmName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateAlgorithmRequest(Builder builder) {
        super(builder);
        this.algorithmDescription = builder.algorithmDescription;
        this.algorithmName = builder.algorithmName;
        this.displayName = builder.displayName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlgorithmRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmDescription
     */
    public String getAlgorithmDescription() {
        return this.algorithmDescription;
    }

    /**
     * @return algorithmName
     */
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateAlgorithmRequest, Builder> {
        private String algorithmDescription; 
        private String algorithmName; 
        private String displayName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlgorithmRequest request) {
            super(request);
            this.algorithmDescription = request.algorithmDescription;
            this.algorithmName = request.algorithmName;
            this.displayName = request.displayName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The description of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>Tongyi Qwen large language model training algorithm.</p>
         */
        public Builder algorithmDescription(String algorithmDescription) {
            this.putBodyParameter("AlgorithmDescription", algorithmDescription);
            this.algorithmDescription = algorithmDescription;
            return this;
        }

        /**
         * <p>The name of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_training</p>
         */
        public Builder algorithmName(String algorithmName) {
            this.putBodyParameter("AlgorithmName", algorithmName);
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * <p>The display name of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>Large language model training</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateAlgorithmRequest build() {
            return new CreateAlgorithmRequest(this);
        } 

    } 

}
