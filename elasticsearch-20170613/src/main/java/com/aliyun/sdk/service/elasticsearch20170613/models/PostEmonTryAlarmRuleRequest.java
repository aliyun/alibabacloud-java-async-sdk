// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PostEmonTryAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>PostEmonTryAlarmRuleRequest</p>
 */
public class PostEmonTryAlarmRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlarmGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alarmGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private PostEmonTryAlarmRuleRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.alarmGroupId = builder.alarmGroupId;
        this.body = builder.body;
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

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PostEmonTryAlarmRuleRequest, Builder> {
        private String projectId; 
        private String alarmGroupId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(PostEmonTryAlarmRuleRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.alarmGroupId = request.alarmGroupId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-133071096032****</p>
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder alarmGroupId(String alarmGroupId) {
            this.putPathParameter("AlarmGroupId", alarmGroupId);
            this.alarmGroupId = alarmGroupId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PostEmonTryAlarmRuleRequest build() {
            return new PostEmonTryAlarmRuleRequest(this);
        } 

    } 

}
