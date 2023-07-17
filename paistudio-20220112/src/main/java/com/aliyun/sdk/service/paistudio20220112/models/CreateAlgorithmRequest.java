// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>CreateAlgorithmRequest</p>
 */
public class CreateAlgorithmRequest extends Request {
    @Body
    @NameInMap("AlgorithmDescription")
    private String algorithmDescription;

    @Body
    @NameInMap("AlgorithmName")
    private String algorithmName;

    @Body
    @NameInMap("DisplayName")
    private String displayName;

    @Body
    @NameInMap("WorkspaceId")
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
         * AlgorithmDescription.
         */
        public Builder algorithmDescription(String algorithmDescription) {
            this.putBodyParameter("AlgorithmDescription", algorithmDescription);
            this.algorithmDescription = algorithmDescription;
            return this;
        }

        /**
         * AlgorithmName.
         */
        public Builder algorithmName(String algorithmName) {
            this.putBodyParameter("AlgorithmName", algorithmName);
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * WorkspaceId.
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
