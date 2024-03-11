// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCallUserExpRequest} extends {@link RequestModel}
 *
 * <p>DescribeCallUserExpRequest</p>
 */
public class DescribeCallUserExpRequest extends Request {
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

    private DescribeCallUserExpRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.createdTs = builder.createdTs;
        this.destroyedTs = builder.destroyedTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallUserExpRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCallUserExpRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long createdTs; 
        private Long destroyedTs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCallUserExpRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.createdTs = request.createdTs;
            this.destroyedTs = request.destroyedTs;
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

        @Override
        public DescribeCallUserExpRequest build() {
            return new DescribeCallUserExpRequest(this);
        } 

    } 

}
