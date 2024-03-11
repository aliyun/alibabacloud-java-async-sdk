// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndPointMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeEndPointMetricDataRequest</p>
 */
public class DescribeEndPointMetricDataRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("CreatedTs")
    @Validation(required = true)
    private Long createdTs;

    @Query
    @NameInMap("DestroyedTs")
    private Long destroyedTs;

    @Query
    @NameInMap("Metrics")
    @Validation(required = true)
    private String metrics;

    @Query
    @NameInMap("PubCallIdList")
    private String pubCallIdList;

    @Query
    @NameInMap("PubUserId")
    private String pubUserId;

    @Query
    @NameInMap("SubUserId")
    private String subUserId;

    private DescribeEndPointMetricDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.createdTs = builder.createdTs;
        this.destroyedTs = builder.destroyedTs;
        this.metrics = builder.metrics;
        this.pubCallIdList = builder.pubCallIdList;
        this.pubUserId = builder.pubUserId;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEndPointMetricDataRequest create() {
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
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return createdTs
     */
    public Long getCreatedTs() {
        return this.createdTs;
    }

    /**
     * @return destroyedTs
     */
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return pubCallIdList
     */
    public String getPubCallIdList() {
        return this.pubCallIdList;
    }

    /**
     * @return pubUserId
     */
    public String getPubUserId() {
        return this.pubUserId;
    }

    /**
     * @return subUserId
     */
    public String getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<DescribeEndPointMetricDataRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long createdTs; 
        private Long destroyedTs; 
        private String metrics; 
        private String pubCallIdList; 
        private String pubUserId; 
        private String subUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEndPointMetricDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.createdTs = request.createdTs;
            this.destroyedTs = request.destroyedTs;
            this.metrics = request.metrics;
            this.pubCallIdList = request.pubCallIdList;
            this.pubUserId = request.pubUserId;
            this.subUserId = request.subUserId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * CreatedTs.
         */
        public Builder createdTs(Long createdTs) {
            this.putQueryParameter("CreatedTs", createdTs);
            this.createdTs = createdTs;
            return this;
        }

        /**
         * DestroyedTs.
         */
        public Builder destroyedTs(Long destroyedTs) {
            this.putQueryParameter("DestroyedTs", destroyedTs);
            this.destroyedTs = destroyedTs;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * PubCallIdList.
         */
        public Builder pubCallIdList(String pubCallIdList) {
            this.putQueryParameter("PubCallIdList", pubCallIdList);
            this.pubCallIdList = pubCallIdList;
            return this;
        }

        /**
         * PubUserId.
         */
        public Builder pubUserId(String pubUserId) {
            this.putQueryParameter("PubUserId", pubUserId);
            this.pubUserId = pubUserId;
            return this;
        }

        /**
         * SubUserId.
         */
        public Builder subUserId(String subUserId) {
            this.putQueryParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public DescribeEndPointMetricDataRequest build() {
            return new DescribeEndPointMetricDataRequest(this);
        } 

    } 

}
