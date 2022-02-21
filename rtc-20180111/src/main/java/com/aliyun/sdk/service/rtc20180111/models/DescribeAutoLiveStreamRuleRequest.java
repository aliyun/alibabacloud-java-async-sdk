// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoLiveStreamRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoLiveStreamRuleRequest</p>
 */
public class DescribeAutoLiveStreamRuleRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeAutoLiveStreamRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoLiveStreamRuleRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeAutoLiveStreamRuleRequest, Builder> {
        private String appId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoLiveStreamRuleRequest response) {
            super(response);
            this.appId = response.appId;
            this.ownerId = response.ownerId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeAutoLiveStreamRuleRequest build() {
            return new DescribeAutoLiveStreamRuleRequest(this);
        } 

    } 

}
