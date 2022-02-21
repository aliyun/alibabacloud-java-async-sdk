// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostEmonTryAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>PostEmonTryAlarmRuleRequest</p>
 */
public class PostEmonTryAlarmRuleRequest extends Request {
    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Path
    @NameInMap("AlarmGroupId")
    @Validation(required = true)
    private String alarmGroupId;

    private PostEmonTryAlarmRuleRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.alarmGroupId = builder.alarmGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostEmonTryAlarmRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return alarmGroupId
     */
    public String getAlarmGroupId() {
        return this.alarmGroupId;
    }

    public static final class Builder extends Request.Builder<PostEmonTryAlarmRuleRequest, Builder> {
        private String projectId; 
        private String alarmGroupId; 

        private Builder() {
            super();
        } 

        private Builder(PostEmonTryAlarmRuleRequest response) {
            super(response);
            this.projectId = response.projectId;
            this.alarmGroupId = response.alarmGroupId;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * AlarmGroupId.
         */
        public Builder alarmGroupId(String alarmGroupId) {
            this.putPathParameter("AlarmGroupId", alarmGroupId);
            this.alarmGroupId = alarmGroupId;
            return this;
        }

        @Override
        public PostEmonTryAlarmRuleRequest build() {
            return new PostEmonTryAlarmRuleRequest(this);
        } 

    } 

}
