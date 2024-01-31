// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelAreaDistributionStatDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeChannelAreaDistributionStatDataRequest</p>
 */
public class DescribeChannelAreaDistributionStatDataRequest extends Request {
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
    @NameInMap("ParentArea")
    private String parentArea;

    private DescribeChannelAreaDistributionStatDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.createdTs = builder.createdTs;
        this.destroyedTs = builder.destroyedTs;
        this.parentArea = builder.parentArea;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelAreaDistributionStatDataRequest create() {
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
     * @return parentArea
     */
    public String getParentArea() {
        return this.parentArea;
    }

    public static final class Builder extends Request.Builder<DescribeChannelAreaDistributionStatDataRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long createdTs; 
        private Long destroyedTs; 
        private String parentArea; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChannelAreaDistributionStatDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.createdTs = request.createdTs;
            this.destroyedTs = request.destroyedTs;
            this.parentArea = request.parentArea;
        } 

        /**
         * APP ID。
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
         * ParentArea.
         */
        public Builder parentArea(String parentArea) {
            this.putQueryParameter("ParentArea", parentArea);
            this.parentArea = parentArea;
            return this;
        }

        @Override
        public DescribeChannelAreaDistributionStatDataRequest build() {
            return new DescribeChannelAreaDistributionStatDataRequest(this);
        } 

    } 

}
