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
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-10963442671187****</p>
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>When the TaskListJson parameter is set to &quot;fields&quot;, this parameter specifies the field content to fetch.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;code&quot;: &quot;OrderNo&quot;,
         *     &quot;name&quot;: &quot;订单号&quot;,
         *     &quot;description&quot;: &quot;订单号&quot;
         *   },
         *   {
         *     &quot;code&quot;: &quot;ProductName&quot;,
         *     &quot;name&quot;: &quot;商品名称&quot;,
         *     &quot;description&quot;: &quot;商品名称&quot;
         *   }
         * ]</p>
         */
        public Builder fieldListJson(String fieldListJson) {
            this.putQueryParameter("FieldListJson", fieldListJson);
            this.fieldListJson = fieldListJson;
            return this;
        }

        /**
         * <p>Cloud Contact Center instance ID</p>
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
         * <p>List of Task Types for analysis. Valid values include:</p>
         * <ul>
         * <li><p>title: title</p>
         * </li>
         * <li><p>summary: summary</p>
         * </li>
         * <li><p>keywords: keywords</p>
         * </li>
         * <li><p>fields: fields</p>
         * </li>
         * </ul>
         * <p>Currently, only &quot;summary&quot; and &quot;title&quot; can be passed together. All other parameters must be passed individually.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;keywords&quot;]</p>
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
