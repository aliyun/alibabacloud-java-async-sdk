// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyLinkMicRequest} extends {@link RequestModel}
 *
 * <p>ApplyLinkMicRequest</p>
 */
public class ApplyLinkMicRequest extends Request {
    @Body
    @NameInMap("ConferenceId")
    @Validation(required = true)
    private String conferenceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ApplyLinkMicRequest(Builder builder) {
        super(builder);
        this.conferenceId = builder.conferenceId;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyLinkMicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ApplyLinkMicRequest, Builder> {
        private String conferenceId; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyLinkMicRequest response) {
            super(response);
            this.conferenceId = response.conferenceId;
            this.regionId = response.regionId;
            this.userId = response.userId;
        } 

        /**
         * 会议唯一标识
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("ConferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 申请连麦用户
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ApplyLinkMicRequest build() {
            return new ApplyLinkMicRequest(this);
        } 

    } 

}
