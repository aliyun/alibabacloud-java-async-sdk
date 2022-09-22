// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMeetingTransRequest} extends {@link RequestModel}
 *
 * <p>StopMeetingTransRequest</p>
 */
public class StopMeetingTransRequest extends Request {
    @Path
    @NameInMap("MeetingId")
    @Validation(required = true)
    private String meetingId;

    private StopMeetingTransRequest(Builder builder) {
        super(builder);
        this.meetingId = builder.meetingId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopMeetingTransRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return meetingId
     */
    public String getMeetingId() {
        return this.meetingId;
    }

    public static final class Builder extends Request.Builder<StopMeetingTransRequest, Builder> {
        private String meetingId; 

        private Builder() {
            super();
        } 

        private Builder(StopMeetingTransRequest request) {
            super(request);
            this.meetingId = request.meetingId;
        } 

        /**
         * 会议ID。
         */
        public Builder meetingId(String meetingId) {
            this.putPathParameter("MeetingId", meetingId);
            this.meetingId = meetingId;
            return this;
        }

        @Override
        public StopMeetingTransRequest build() {
            return new StopMeetingTransRequest(this);
        } 

    } 

}
