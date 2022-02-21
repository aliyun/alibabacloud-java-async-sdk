// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeSpaceEventRequest} extends {@link RequestModel}
 *
 * <p>SubscribeSpaceEventRequest</p>
 */
public class SubscribeSpaceEventRequest extends Request {
    @Query
    @NameInMap("PushConfig")
    @Validation(required = true)
    private String pushConfig;

    @Query
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private SubscribeSpaceEventRequest(Builder builder) {
        super(builder);
        this.pushConfig = builder.pushConfig;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeSpaceEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pushConfig
     */
    public String getPushConfig() {
        return this.pushConfig;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<SubscribeSpaceEventRequest, Builder> {
        private String pushConfig; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeSpaceEventRequest response) {
            super(response);
            this.pushConfig = response.pushConfig;
            this.spaceId = response.spaceId;
        } 

        /**
         * PushConfig.
         */
        public Builder pushConfig(String pushConfig) {
            this.putQueryParameter("PushConfig", pushConfig);
            this.pushConfig = pushConfig;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putQueryParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public SubscribeSpaceEventRequest build() {
            return new SubscribeSpaceEventRequest(this);
        } 

    } 

}
