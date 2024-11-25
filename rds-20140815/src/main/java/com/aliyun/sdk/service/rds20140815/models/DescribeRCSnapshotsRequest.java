// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRCSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCSnapshotsRequest</p>
 */
public class DescribeRCSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotIds")
    private String snapshotIds;

    private DescribeRCSnapshotsRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.snapshotIds = builder.snapshotIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    public static final class Builder extends Request.Builder<DescribeRCSnapshotsRequest, Builder> {
        private String diskId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String snapshotIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCSnapshotsRequest request) {
            super(request);
            this.diskId = request.diskId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.snapshotIds = request.snapshotIds;
        } 

        /**
         * <p>The cloud disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rcd-wz9c8isqly8637zw****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>30</strong> to <strong>100</strong>. Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The snapshot IDs.</p>
         * <p>You can specify a maximum of 100 IDs. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;rcds-bp67acfmxazb4p****&quot;, &quot;rcds-bp67acfmxazb5p****&quot;, … &quot;rcds-bp67acfmxazb6p****&quot;]</p>
         */
        public Builder snapshotIds(String snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        @Override
        public DescribeRCSnapshotsRequest build() {
            return new DescribeRCSnapshotsRequest(this);
        } 

    } 

}
