// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySnapshotJobListRequest} extends {@link RequestModel}
 *
 * <p>QuerySnapshotJobListRequest</p>
 */
public class QuerySnapshotJobListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndOfJobCreatedTimeRange")
    private String endOfJobCreatedTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumPageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long maximumPageSize;

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
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotJobIds")
    private String snapshotJobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartOfJobCreatedTimeRange")
    private String startOfJobCreatedTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private QuerySnapshotJobListRequest(Builder builder) {
        super(builder);
        this.endOfJobCreatedTimeRange = builder.endOfJobCreatedTimeRange;
        this.maximumPageSize = builder.maximumPageSize;
        this.nextPageToken = builder.nextPageToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snapshotJobIds = builder.snapshotJobIds;
        this.startOfJobCreatedTimeRange = builder.startOfJobCreatedTimeRange;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySnapshotJobListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endOfJobCreatedTimeRange
     */
    public String getEndOfJobCreatedTimeRange() {
        return this.endOfJobCreatedTimeRange;
    }

    /**
     * @return maximumPageSize
     */
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
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
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
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

    /**
     * @return snapshotJobIds
     */
    public String getSnapshotJobIds() {
        return this.snapshotJobIds;
    }

    /**
     * @return startOfJobCreatedTimeRange
     */
    public String getStartOfJobCreatedTimeRange() {
        return this.startOfJobCreatedTimeRange;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<QuerySnapshotJobListRequest, Builder> {
        private String endOfJobCreatedTimeRange; 
        private Long maximumPageSize; 
        private String nextPageToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snapshotJobIds; 
        private String startOfJobCreatedTimeRange; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(QuerySnapshotJobListRequest request) {
            super(request);
            this.endOfJobCreatedTimeRange = request.endOfJobCreatedTimeRange;
            this.maximumPageSize = request.maximumPageSize;
            this.nextPageToken = request.nextPageToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snapshotJobIds = request.snapshotJobIds;
            this.startOfJobCreatedTimeRange = request.startOfJobCreatedTimeRange;
            this.state = request.state;
        } 

        /**
         * The snapshot configuration.
         */
        public Builder endOfJobCreatedTimeRange(String endOfJobCreatedTimeRange) {
            this.putQueryParameter("EndOfJobCreatedTimeRange", endOfJobCreatedTimeRange);
            this.endOfJobCreatedTimeRange = endOfJobCreatedTimeRange;
            return this;
        }

        /**
         * The ID of the MPS queue to which the snapshot jobs that you want to query are submitted. To obtain the ID, you can log on to the **MPS console** and choose **Global Settings** > **Pipelines** in the left-side navigation pane.
         */
        public Builder maximumPageSize(Long maximumPageSize) {
            this.putQueryParameter("MaximumPageSize", maximumPageSize);
            this.maximumPageSize = maximumPageSize;
            return this;
        }

        /**
         * The end of the time range within which the creation time of snapshot jobs to be queried is.
         * <p>
         * 
         * *   Specify the time in the ISO 8601 standard in the
         * *   YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
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
         * The start time for taking snapshots. Unit: milliseconds.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
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

        /**
         * The beginning of the time range within which the creation time of snapshot jobs to be queried is.
         * <p>
         * 
         * *   Specify the time in the ISO 8601 standard in the
         * *   YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
         */
        public Builder snapshotJobIds(String snapshotJobIds) {
            this.putQueryParameter("SnapshotJobIds", snapshotJobIds);
            this.snapshotJobIds = snapshotJobIds;
            return this;
        }

        /**
         * The time when the job was created.
         */
        public Builder startOfJobCreatedTimeRange(String startOfJobCreatedTimeRange) {
            this.putQueryParameter("StartOfJobCreatedTimeRange", startOfJobCreatedTimeRange);
            this.startOfJobCreatedTimeRange = startOfJobCreatedTimeRange;
            return this;
        }

        /**
         * The information about the snapshot jobs.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public QuerySnapshotJobListRequest build() {
            return new QuerySnapshotJobListRequest(this);
        } 

    } 

}
