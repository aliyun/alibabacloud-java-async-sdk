// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePubUserListBySubUserRequest} extends {@link RequestModel}
 *
 * <p>DescribePubUserListBySubUserRequest</p>
 */
public class DescribePubUserListBySubUserRequest extends Request {
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
    @NameInMap("SubUserId")
    @Validation(required = true)
    private String subUserId;

    private DescribePubUserListBySubUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.createdTs = builder.createdTs;
        this.destroyedTs = builder.destroyedTs;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePubUserListBySubUserRequest create() {
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
     * @return subUserId
     */
    public String getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<DescribePubUserListBySubUserRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long createdTs; 
        private Long destroyedTs; 
        private String subUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePubUserListBySubUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.createdTs = request.createdTs;
            this.destroyedTs = request.destroyedTs;
            this.subUserId = request.subUserId;
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
         * SubUserId.
         */
        public Builder subUserId(String subUserId) {
            this.putQueryParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public DescribePubUserListBySubUserRequest build() {
            return new DescribePubUserListBySubUserRequest(this);
        } 

    } 

}
