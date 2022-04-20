// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMemberRequest} extends {@link RequestModel}
 *
 * <p>AddMemberRequest</p>
 */
public class AddMemberRequest extends Request {
    @Body
    @NameInMap("ConferenceId")
    @Validation(required = true)
    private String conferenceId;

    @Body
    @NameInMap("FromUserId")
    @Validation(required = true)
    private String fromUserId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ToUserId")
    @Validation(required = true)
    private String toUserId;

    private AddMemberRequest(Builder builder) {
        super(builder);
        this.conferenceId = builder.conferenceId;
        this.fromUserId = builder.fromUserId;
        this.regionId = builder.regionId;
        this.toUserId = builder.toUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMemberRequest create() {
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
     * @return fromUserId
     */
    public String getFromUserId() {
        return this.fromUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return toUserId
     */
    public String getToUserId() {
        return this.toUserId;
    }

    public static final class Builder extends Request.Builder<AddMemberRequest, Builder> {
        private String conferenceId; 
        private String fromUserId; 
        private String regionId; 
        private String toUserId; 

        private Builder() {
            super();
        } 

        private Builder(AddMemberRequest request) {
            super(request);
            this.conferenceId = request.conferenceId;
            this.fromUserId = request.fromUserId;
            this.regionId = request.regionId;
            this.toUserId = request.toUserId;
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
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public AddMemberRequest build() {
            return new AddMemberRequest(this);
        } 

    } 

}
