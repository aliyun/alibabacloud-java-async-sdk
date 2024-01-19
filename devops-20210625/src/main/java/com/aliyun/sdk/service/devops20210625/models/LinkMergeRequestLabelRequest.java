// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LinkMergeRequestLabelRequest} extends {@link RequestModel}
 *
 * <p>LinkMergeRequestLabelRequest</p>
 */
public class LinkMergeRequestLabelRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("labelIds")
    @Validation(required = true)
    private java.util.List < String > labelIds;

    @Query
    @NameInMap("localId")
    @Validation(required = true)
    private Long localId;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("repositoryIdentity")
    @Validation(required = true)
    private String repositoryIdentity;

    private LinkMergeRequestLabelRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.labelIds = builder.labelIds;
        this.localId = builder.localId;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LinkMergeRequestLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return labelIds
     */
    public java.util.List < String > getLabelIds() {
        return this.labelIds;
    }

    /**
     * @return localId
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return repositoryIdentity
     */
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public static final class Builder extends Request.Builder<LinkMergeRequestLabelRequest, Builder> {
        private String accessToken; 
        private java.util.List < String > labelIds; 
        private Long localId; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(LinkMergeRequestLabelRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.labelIds = request.labelIds;
            this.localId = request.localId;
            this.organizationId = request.organizationId;
            this.repositoryIdentity = request.repositoryIdentity;
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
         * labelIds.
         */
        public Builder labelIds(java.util.List < String > labelIds) {
            this.putBodyParameter("labelIds", labelIds);
            this.labelIds = labelIds;
            return this;
        }

        /**
         * localId.
         */
        public Builder localId(Long localId) {
            this.putQueryParameter("localId", localId);
            this.localId = localId;
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

        /**
         * repositoryIdentity.
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        @Override
        public LinkMergeRequestLabelRequest build() {
            return new LinkMergeRequestLabelRequest(this);
        } 

    } 

}
