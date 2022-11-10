// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveMemberRequest</p>
 */
public class RemoveMemberRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ConferenceId")
    @Validation(required = true)
    private String conferenceId;

    @Body
    @NameInMap("FromUserId")
    @Validation(required = true)
    private String fromUserId;

    @Body
    @NameInMap("ToUserId")
    @Validation(required = true)
    private String toUserId;

    private RemoveMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.conferenceId = builder.conferenceId;
        this.fromUserId = builder.fromUserId;
        this.toUserId = builder.toUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return fromUserId
     */
    public String getFromUserId() {
        return this.fromUserId;
    }

    /**
     * @return toUserId
     */
    public String getToUserId() {
        return this.toUserId;
    }

    public static final class Builder extends Request.Builder<RemoveMemberRequest, Builder> {
        private String regionId; 
        private String conferenceId; 
        private String fromUserId; 
        private String toUserId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.conferenceId = request.conferenceId;
            this.fromUserId = request.fromUserId;
            this.toUserId = request.toUserId;
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
         * 会议唯一标识
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("ConferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * 邀请者用户ID
         */
        public Builder fromUserId(String fromUserId) {
            this.putBodyParameter("FromUserId", fromUserId);
            this.fromUserId = fromUserId;
            return this;
        }

        /**
         * 被邀请用户ID
         */
        public Builder toUserId(String toUserId) {
            this.putBodyParameter("ToUserId", toUserId);
            this.toUserId = toUserId;
            return this;
        }

        @Override
        public RemoveMemberRequest build() {
            return new RemoveMemberRequest(this);
        } 

    } 

}
