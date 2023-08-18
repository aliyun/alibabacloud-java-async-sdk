// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MergeMergeRequestRequest} extends {@link RequestModel}
 *
 * <p>MergeMergeRequestRequest</p>
 */
public class MergeMergeRequestRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Path
    @NameInMap("localId")
    @Validation(required = true)
    private Long localId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("mergeMessage")
    private String mergeMessage;

    @Body
    @NameInMap("mergeType")
    @Validation(required = true)
    private String mergeType;

    @Body
    @NameInMap("removeSourceBranch")
    private Boolean removeSourceBranch;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private MergeMergeRequestRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.localId = builder.localId;
        this.accessToken = builder.accessToken;
        this.mergeMessage = builder.mergeMessage;
        this.mergeType = builder.mergeType;
        this.removeSourceBranch = builder.removeSourceBranch;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeMergeRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return localId
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return mergeMessage
     */
    public String getMergeMessage() {
        return this.mergeMessage;
    }

    /**
     * @return mergeType
     */
    public String getMergeType() {
        return this.mergeType;
    }

    /**
     * @return removeSourceBranch
     */
    public Boolean getRemoveSourceBranch() {
        return this.removeSourceBranch;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<MergeMergeRequestRequest, Builder> {
        private Long repositoryId; 
        private Long localId; 
        private String accessToken; 
        private String mergeMessage; 
        private String mergeType; 
        private Boolean removeSourceBranch; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(MergeMergeRequestRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.localId = request.localId;
            this.accessToken = request.accessToken;
            this.mergeMessage = request.mergeMessage;
            this.mergeType = request.mergeType;
            this.removeSourceBranch = request.removeSourceBranch;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * localId.
         */
        public Builder localId(Long localId) {
            this.putPathParameter("localId", localId);
            this.localId = localId;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * mergeMessage.
         */
        public Builder mergeMessage(String mergeMessage) {
            this.putBodyParameter("mergeMessage", mergeMessage);
            this.mergeMessage = mergeMessage;
            return this;
        }

        /**
         * mergeType.
         */
        public Builder mergeType(String mergeType) {
            this.putBodyParameter("mergeType", mergeType);
            this.mergeType = mergeType;
            return this;
        }

        /**
         * removeSourceBranch.
         */
        public Builder removeSourceBranch(Boolean removeSourceBranch) {
            this.putBodyParameter("removeSourceBranch", removeSourceBranch);
            this.removeSourceBranch = removeSourceBranch;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public MergeMergeRequestRequest build() {
            return new MergeMergeRequestRequest(this);
        } 

    } 

}
