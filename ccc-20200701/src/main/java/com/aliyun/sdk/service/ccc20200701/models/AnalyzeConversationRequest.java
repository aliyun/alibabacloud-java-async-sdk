// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AnalyzeConversationRequest} extends {@link RequestModel}
 *
 * <p>AnalyzeConversationRequest</p>
 */
public class AnalyzeConversationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldListJson")
    private String fieldListJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskListJson")
    private String taskListJson;

    private AnalyzeConversationRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.fieldListJson = builder.fieldListJson;
        this.instanceId = builder.instanceId;
        this.taskListJson = builder.taskListJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeConversationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return fieldListJson
     */
    public String getFieldListJson() {
        return this.fieldListJson;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskListJson
     */
    public String getTaskListJson() {
        return this.taskListJson;
    }

    public static final class Builder extends Request.Builder<AnalyzeConversationRequest, Builder> {
        private String contactId; 
        private String fieldListJson; 
        private String instanceId; 
        private String taskListJson; 

        private Builder() {
            super();
        } 

        private Builder(AnalyzeConversationRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.fieldListJson = request.fieldListJson;
            this.instanceId = request.instanceId;
            this.taskListJson = request.taskListJson;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * FieldListJson.
         */
        public Builder fieldListJson(String fieldListJson) {
            this.putQueryParameter("FieldListJson", fieldListJson);
            this.fieldListJson = fieldListJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TaskListJson.
         */
        public Builder taskListJson(String taskListJson) {
            this.putQueryParameter("TaskListJson", taskListJson);
            this.taskListJson = taskListJson;
            return this;
        }

        @Override
        public AnalyzeConversationRequest build() {
            return new AnalyzeConversationRequest(this);
        } 

    } 

}
