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

    @Body
    @NameInMap("MeetingRoleNum")
    private Integer meetingRoleNum;

    @Body
    @NameInMap("OnlyRoleSplitResult")
    private Boolean onlyRoleSplitResult;

    private StopMeetingTransRequest(Builder builder) {
        super(builder);
        this.meetingId = builder.meetingId;
        this.meetingRoleNum = builder.meetingRoleNum;
        this.onlyRoleSplitResult = builder.onlyRoleSplitResult;
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

    /**
     * @return meetingRoleNum
     */
    public Integer getMeetingRoleNum() {
        return this.meetingRoleNum;
    }

    /**
     * @return onlyRoleSplitResult
     */
    public Boolean getOnlyRoleSplitResult() {
        return this.onlyRoleSplitResult;
    }

    public static final class Builder extends Request.Builder<StopMeetingTransRequest, Builder> {
        private String meetingId; 
        private Integer meetingRoleNum; 
        private Boolean onlyRoleSplitResult; 

        private Builder() {
            super();
        } 

        private Builder(StopMeetingTransRequest request) {
            super(request);
            this.meetingId = request.meetingId;
            this.meetingRoleNum = request.meetingRoleNum;
            this.onlyRoleSplitResult = request.onlyRoleSplitResult;
        } 

        /**
         * 会议ID。
         */
        public Builder meetingId(String meetingId) {
            this.putPathParameter("MeetingId", meetingId);
            this.meetingId = meetingId;
            return this;
        }

        /**
         * 会后进行识别结果角色区分人数，在AudioOutputEnabled=true、MeetingResultEnabled=true且DocResultEnabled=true 时生效，默认是1。
         * <p>
         * 0：按多人进行角色区分。
         * 1：按1人进行角色区分，即不区分。
         * 2：按2人进行角色区分。
         */
        public Builder meetingRoleNum(Integer meetingRoleNum) {
            this.putBodyParameter("MeetingRoleNum", meetingRoleNum);
            this.meetingRoleNum = meetingRoleNum;
            return this;
        }

        /**
         * 会后结果中docResult字段是否只存储角色时间戳映射信息，即不带转写文字结果，默认是false。
         */
        public Builder onlyRoleSplitResult(Boolean onlyRoleSplitResult) {
            this.putBodyParameter("OnlyRoleSplitResult", onlyRoleSplitResult);
            this.onlyRoleSplitResult = onlyRoleSplitResult;
            return this;
        }

        @Override
        public StopMeetingTransRequest build() {
            return new StopMeetingTransRequest(this);
        } 

    } 

}
