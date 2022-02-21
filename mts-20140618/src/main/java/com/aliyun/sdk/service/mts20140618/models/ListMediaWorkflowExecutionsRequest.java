// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaWorkflowExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListMediaWorkflowExecutionsRequest</p>
 */
public class ListMediaWorkflowExecutionsRequest extends Request {
    @Query
    @NameInMap("InputFileURL")
    private String inputFileURL;

    @Query
    @NameInMap("MaximumPageSize")
    @Validation(maximum = 100, minimum = 1)
    private Long maximumPageSize;

    @Query
    @NameInMap("MediaWorkflowId")
    private String mediaWorkflowId;

    @Query
    @NameInMap("MediaWorkflowName")
    private String mediaWorkflowName;

    @Query
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListMediaWorkflowExecutionsRequest(Builder builder) {
        super(builder);
        this.inputFileURL = builder.inputFileURL;
        this.maximumPageSize = builder.maximumPageSize;
        this.mediaWorkflowId = builder.mediaWorkflowId;
        this.mediaWorkflowName = builder.mediaWorkflowName;
        this.nextPageToken = builder.nextPageToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaWorkflowExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputFileURL
     */
    public String getInputFileURL() {
        return this.inputFileURL;
    }

    /**
     * @return maximumPageSize
     */
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    /**
     * @return mediaWorkflowId
     */
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    /**
     * @return mediaWorkflowName
     */
    public String getMediaWorkflowName() {
        return this.mediaWorkflowName;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ListMediaWorkflowExecutionsRequest, Builder> {
        private String inputFileURL; 
        private Long maximumPageSize; 
        private String mediaWorkflowId; 
        private String mediaWorkflowName; 
        private String nextPageToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListMediaWorkflowExecutionsRequest response) {
            super(response);
            this.inputFileURL = response.inputFileURL;
            this.maximumPageSize = response.maximumPageSize;
            this.mediaWorkflowId = response.mediaWorkflowId;
            this.mediaWorkflowName = response.mediaWorkflowName;
            this.nextPageToken = response.nextPageToken;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * InputFileURL.
         */
        public Builder inputFileURL(String inputFileURL) {
            this.putQueryParameter("InputFileURL", inputFileURL);
            this.inputFileURL = inputFileURL;
            return this;
        }

        /**
         * MaximumPageSize.
         */
        public Builder maximumPageSize(Long maximumPageSize) {
            this.putQueryParameter("MaximumPageSize", maximumPageSize);
            this.maximumPageSize = maximumPageSize;
            return this;
        }

        /**
         * MediaWorkflowId.
         */
        public Builder mediaWorkflowId(String mediaWorkflowId) {
            this.putQueryParameter("MediaWorkflowId", mediaWorkflowId);
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }

        /**
         * MediaWorkflowName.
         */
        public Builder mediaWorkflowName(String mediaWorkflowName) {
            this.putQueryParameter("MediaWorkflowName", mediaWorkflowName);
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ListMediaWorkflowExecutionsRequest build() {
            return new ListMediaWorkflowExecutionsRequest(this);
        } 

    } 

}
