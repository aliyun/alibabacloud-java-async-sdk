// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link QuickAddTaskRequest} extends {@link RequestModel}
 *
 * <p>QuickAddTaskRequest</p>
 */
public class QuickAddTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentGroupId")
    private Long agentGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTimeList")
    private java.util.List<CallTimeList> callTimeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTimeStrList")
    private java.util.List<CallTimeStrList> callTimeStrList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long referenceTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateId")
    private Long smsTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private Long templateType;

    private QuickAddTaskRequest(Builder builder) {
        super(builder);
        this.agentGroupId = builder.agentGroupId;
        this.callTimeList = builder.callTimeList;
        this.callTimeStrList = builder.callTimeStrList;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.referenceTaskId = builder.referenceTaskId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smsTemplateId = builder.smsTemplateId;
        this.startTime = builder.startTime;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuickAddTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentGroupId
     */
    public Long getAgentGroupId() {
        return this.agentGroupId;
    }

    /**
     * @return callTimeList
     */
    public java.util.List<CallTimeList> getCallTimeList() {
        return this.callTimeList;
    }

    /**
     * @return callTimeStrList
     */
    public java.util.List<CallTimeStrList> getCallTimeStrList() {
        return this.callTimeStrList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return referenceTaskId
     */
    public Long getReferenceTaskId() {
        return this.referenceTaskId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return smsTemplateId
     */
    public Long getSmsTemplateId() {
        return this.smsTemplateId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public Long getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<QuickAddTaskRequest, Builder> {
        private Long agentGroupId; 
        private java.util.List<CallTimeList> callTimeList; 
        private java.util.List<CallTimeStrList> callTimeStrList; 
        private String name; 
        private Long ownerId; 
        private Long referenceTaskId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long smsTemplateId; 
        private String startTime; 
        private Long templateId; 
        private Long templateType; 

        private Builder() {
            super();
        } 

        private Builder(QuickAddTaskRequest request) {
            super(request);
            this.agentGroupId = request.agentGroupId;
            this.callTimeList = request.callTimeList;
            this.callTimeStrList = request.callTimeStrList;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.referenceTaskId = request.referenceTaskId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smsTemplateId = request.smsTemplateId;
            this.startTime = request.startTime;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
        } 

        /**
         * <p>坐席组ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder agentGroupId(Long agentGroupId) {
            this.putQueryParameter("AgentGroupId", agentGroupId);
            this.agentGroupId = agentGroupId;
            return this;
        }

        /**
         * <p>外呼时间</p>
         */
        public Builder callTimeList(java.util.List<CallTimeList> callTimeList) {
            String callTimeListShrink = shrink(callTimeList, "CallTimeList", "json");
            this.putQueryParameter("CallTimeList", callTimeListShrink);
            this.callTimeList = callTimeList;
            return this;
        }

        /**
         * <p>外呼时间:精确到分钟.如果两个字段都存在值，以该字段为准。建议用该字段，精确到分钟, 08:31-12:05 13:33-19:00 则传[[&quot;08:31&quot;,&quot;12:05&quot;][&quot;13:33&quot;,&quot;19:00&quot;]]；默认为[[&quot;08:00&quot;,&quot;20:00&quot;]]</p>
         * 
         * <strong>example:</strong>
         * <p>[[&quot;08:31&quot;,&quot;12:05&quot;][&quot;13:33&quot;,&quot;19:00&quot;]]；默认为[[&quot;08:00&quot;,&quot;20:00&quot;]]</p>
         */
        public Builder callTimeStrList(java.util.List<CallTimeStrList> callTimeStrList) {
            String callTimeStrListShrink = shrink(callTimeStrList, "CallTimeStrList", "json");
            this.putQueryParameter("CallTimeStrList", callTimeStrListShrink);
            this.callTimeStrList = callTimeStrList;
            return this;
        }

        /**
         * <p>任务名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        /**
         * <p>被复制任务ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder referenceTaskId(Long referenceTaskId) {
            this.putQueryParameter("ReferenceTaskId", referenceTaskId);
            this.referenceTaskId = referenceTaskId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>短信模板ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder smsTemplateId(Long smsTemplateId) {
            this.putQueryParameter("SmsTemplateId", smsTemplateId);
            this.smsTemplateId = smsTemplateId;
            return this;
        }

        /**
         * <p>任务启动日期</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-30</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>话术模板ID,如果不传则使用被复制任务的话术模板</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>话术模板类型</p>
         * 
         * <strong>example:</strong>
         * <p>1：单模版；2：智能话术策略模板。不填默认1。</p>
         */
        public Builder templateType(Long templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public QuickAddTaskRequest build() {
            return new QuickAddTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link QuickAddTaskRequest} extends {@link TeaModel}
     *
     * <p>QuickAddTaskRequest</p>
     */
    public static class CallTimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallTime")
        private java.util.List<String> callTime;

        private CallTimeList(Builder builder) {
            this.callTime = builder.callTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallTimeList create() {
            return builder().build();
        }

        /**
         * @return callTime
         */
        public java.util.List<String> getCallTime() {
            return this.callTime;
        }

        public static final class Builder {
            private java.util.List<String> callTime; 

            private Builder() {
            } 

            private Builder(CallTimeList model) {
                this.callTime = model.callTime;
            } 

            /**
             * <p>外呼时间</p>
             */
            public Builder callTime(java.util.List<String> callTime) {
                this.callTime = callTime;
                return this;
            }

            public CallTimeList build() {
                return new CallTimeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuickAddTaskRequest} extends {@link TeaModel}
     *
     * <p>QuickAddTaskRequest</p>
     */
    public static class CallTimeStrList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallTime")
        private java.util.List<String> callTime;

        private CallTimeStrList(Builder builder) {
            this.callTime = builder.callTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallTimeStrList create() {
            return builder().build();
        }

        /**
         * @return callTime
         */
        public java.util.List<String> getCallTime() {
            return this.callTime;
        }

        public static final class Builder {
            private java.util.List<String> callTime; 

            private Builder() {
            } 

            private Builder(CallTimeStrList model) {
                this.callTime = model.callTime;
            } 

            /**
             * <p>外呼时间</p>
             */
            public Builder callTime(java.util.List<String> callTime) {
                this.callTime = callTime;
                return this;
            }

            public CallTimeStrList build() {
                return new CallTimeStrList(this);
            } 

        } 

    }
}
