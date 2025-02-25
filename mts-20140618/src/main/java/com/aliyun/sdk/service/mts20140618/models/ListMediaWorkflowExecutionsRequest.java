// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMediaWorkflowExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListMediaWorkflowExecutionsRequest</p>
 */
public class ListMediaWorkflowExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputFileURL")
    private String inputFileURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumPageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long maximumPageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
    private String mediaWorkflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowName")
    private String mediaWorkflowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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

        private Builder(ListMediaWorkflowExecutionsRequest request) {
            super(request);
            this.inputFileURL = request.inputFileURL;
            this.maximumPageSize = request.maximumPageSize;
            this.mediaWorkflowId = request.mediaWorkflowId;
            this.mediaWorkflowName = request.mediaWorkflowName;
            this.nextPageToken = request.nextPageToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The Object Storage Service (OSS) URL of the input file of the media workflow. The URL complies with RFC 3986 and is encoded in UTF-8, with reserved characters being percent-encoded. For more information, see <a href="https://help.aliyun.com/document_detail/423796.html">URL encoding</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-****.cn-hangzhou.aliyuncs.com/test****.flv">http://example-****.cn-hangzhou.aliyuncs.com/test****.flv</a></p>
         */
        public Builder inputFileURL(String inputFileURL) {
            this.putQueryParameter("InputFileURL", inputFileURL);
            this.inputFileURL = inputFileURL;
            return this;
        }

        /**
         * <p>The maximum number of media workflow execution instances to return. Valid values: <code>[1,100]</code>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maximumPageSize(Long maximumPageSize) {
            this.putQueryParameter("MaximumPageSize", maximumPageSize);
            this.maximumPageSize = maximumPageSize;
            return this;
        }

        /**
         * <p>The ID of the media workflow whose execution instances you want to query. To obtain the workflow ID, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Workflow Settings</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>43b7335a4b1d4fe883670036affb****</p>
         */
        public Builder mediaWorkflowId(String mediaWorkflowId) {
            this.putQueryParameter("MediaWorkflowId", mediaWorkflowId);
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }

        /**
         * <p>The name of the media workflow. To obtain the workflow name, you can log on to the <strong>MPS console</strong> and choose <strong>Workflows</strong> &gt; <strong>Workflow Settings</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>example-mediaworkflow-****</p>
         */
        public Builder mediaWorkflowName(String mediaWorkflowName) {
            this.putQueryParameter("MediaWorkflowName", mediaWorkflowName);
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. The value is a UUID that contains 32 characters. When you request the first page of query results, leave the NextPageToken parameter empty. When you request more query results, specify the value of the NextPageToken parameter returned in the query results on the previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
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
