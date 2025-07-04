// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CopySnapshotRequest} extends {@link RequestModel}
 *
 * <p>CopySnapshotRequest</p>
 */
public class CopySnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> destinationRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationSnapshotDescription")
    private String destinationSnapshotDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationSnapshotName")
    private String destinationSnapshotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceBillingCycle")
    private String instanceBillingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    private CopySnapshotRequest(Builder builder) {
        super(builder);
        this.destinationRegionIds = builder.destinationRegionIds;
        this.destinationSnapshotDescription = builder.destinationSnapshotDescription;
        this.destinationSnapshotName = builder.destinationSnapshotName;
        this.instanceBillingCycle = builder.instanceBillingCycle;
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
    public java.util.List<String> getDestinationRegionIds() {
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
     * @return instanceBillingCycle
     */
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<CopySnapshotRequest, Builder> {
        private java.util.List<String> destinationRegionIds; 
        private String destinationSnapshotDescription; 
        private String destinationSnapshotName; 
        private String instanceBillingCycle; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(CopySnapshotRequest request) {
            super(request);
            this.destinationRegionIds = request.destinationRegionIds;
            this.destinationSnapshotDescription = request.destinationSnapshotDescription;
            this.destinationSnapshotName = request.destinationSnapshotName;
            this.instanceBillingCycle = request.instanceBillingCycle;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * <p>The IDs of destination nodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder destinationRegionIds(java.util.List<String> destinationRegionIds) {
            String destinationRegionIdsShrink = shrink(destinationRegionIds, "DestinationRegionIds", "json");
            this.putQueryParameter("DestinationRegionIds", destinationRegionIdsShrink);
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }

        /**
         * <p>The description of the snapshot. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder destinationSnapshotDescription(String destinationSnapshotDescription) {
            this.putQueryParameter("DestinationSnapshotDescription", destinationSnapshotDescription);
            this.destinationSnapshotDescription = destinationSnapshotDescription;
            return this;
        }

        /**
         * <p>The name of the snapshot. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testSnapshotName</p>
         */
        public Builder destinationSnapshotName(String destinationSnapshotName) {
            this.putQueryParameter("DestinationSnapshotName", destinationSnapshotName);
            this.destinationSnapshotName = destinationSnapshotName;
            return this;
        }

        /**
         * InstanceBillingCycle.
         */
        public Builder instanceBillingCycle(String instanceBillingCycle) {
            this.putQueryParameter("InstanceBillingCycle", instanceBillingCycle);
            this.instanceBillingCycle = instanceBillingCycle;
            return this;
        }

        /**
         * <p>The ID of the source snapshot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp1c0doj0taqyzzl****</p>
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
