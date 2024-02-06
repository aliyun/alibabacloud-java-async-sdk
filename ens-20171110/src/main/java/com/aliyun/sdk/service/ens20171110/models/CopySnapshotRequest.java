// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopySnapshotRequest} extends {@link RequestModel}
 *
 * <p>CopySnapshotRequest</p>
 */
public class CopySnapshotRequest extends Request {
    @Query
    @NameInMap("DestinationRegionIds")
    @Validation(required = true)
    private java.util.List < String > destinationRegionIds;

    @Query
    @NameInMap("DestinationSnapshotDescription")
    private String destinationSnapshotDescription;

    @Query
    @NameInMap("DestinationSnapshotName")
    private String destinationSnapshotName;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    private CopySnapshotRequest(Builder builder) {
        super(builder);
        this.destinationRegionIds = builder.destinationRegionIds;
        this.destinationSnapshotDescription = builder.destinationSnapshotDescription;
        this.destinationSnapshotName = builder.destinationSnapshotName;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopySnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationRegionIds
     */
    public java.util.List < String > getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    /**
     * @return destinationSnapshotDescription
     */
    public String getDestinationSnapshotDescription() {
        return this.destinationSnapshotDescription;
    }

    /**
     * @return destinationSnapshotName
     */
    public String getDestinationSnapshotName() {
        return this.destinationSnapshotName;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<CopySnapshotRequest, Builder> {
        private java.util.List < String > destinationRegionIds; 
        private String destinationSnapshotDescription; 
        private String destinationSnapshotName; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(CopySnapshotRequest request) {
            super(request);
            this.destinationRegionIds = request.destinationRegionIds;
            this.destinationSnapshotDescription = request.destinationSnapshotDescription;
            this.destinationSnapshotName = request.destinationSnapshotName;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * The destination nodes.
         */
        public Builder destinationRegionIds(java.util.List < String > destinationRegionIds) {
            String destinationRegionIdsShrink = shrink(destinationRegionIds, "DestinationRegionIds", "json");
            this.putQueryParameter("DestinationRegionIds", destinationRegionIdsShrink);
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }

        /**
         * The description of the snapshot. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder destinationSnapshotDescription(String destinationSnapshotDescription) {
            this.putQueryParameter("DestinationSnapshotDescription", destinationSnapshotDescription);
            this.destinationSnapshotDescription = destinationSnapshotDescription;
            return this;
        }

        /**
         * The name of the snapshot. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder destinationSnapshotName(String destinationSnapshotName) {
            this.putQueryParameter("DestinationSnapshotName", destinationSnapshotName);
            this.destinationSnapshotName = destinationSnapshotName;
            return this;
        }

        /**
         * The ID of the source snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public CopySnapshotRequest build() {
            return new CopySnapshotRequest(this);
        } 

    } 

}
