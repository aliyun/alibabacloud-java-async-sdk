// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodTieringStorageRetrievalDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodTieringStorageRetrievalDataRequest</p>
 */
public class DescribeVodTieringStorageRetrievalDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageClass")
    private String storageClass;

    private DescribeVodTieringStorageRetrievalDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.startTime = builder.startTime;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodTieringStorageRetrievalDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<DescribeVodTieringStorageRetrievalDataRequest, Builder> {
        private String appId; 
        private String endTime; 
        private Long ownerId; 
        private String region; 
        private String startTime; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodTieringStorageRetrievalDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.startTime = request.startTime;
            this.storageClass = request.storageClass;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. The maximum time range is 31 days. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-02T11:20:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * <p>The storage region. By default, data of all regions is returned. You can specify multiple regions separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. The minimum data granularity is 5 minutes. If you leave this parameter empty, data of the last 24 hours is returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-02T10:20:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The storage class. Valid values:</p>
         * <ul>
         * <li><strong>IA</strong>: Infrequent Access.</li>
         * <li><strong>Archive</strong>: Archive.</li>
         * <li><strong>ColdArchive</strong>: Cold Archive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IA</p>
         */
        public Builder storageClass(String storageClass) {
            this.putQueryParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public DescribeVodTieringStorageRetrievalDataRequest build() {
            return new DescribeVodTieringStorageRetrievalDataRequest(this);
        } 

    } 

}
