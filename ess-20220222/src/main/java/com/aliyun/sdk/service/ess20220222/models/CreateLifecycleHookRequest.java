// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link CreateLifecycleHookRequest} extends {@link RequestModel}
 *
 * <p>CreateLifecycleHookRequest</p>
 */
public class CreateLifecycleHookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultResult")
    private String defaultResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HeartbeatTimeout")
    private Integer heartbeatTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHookName")
    private String lifecycleHookName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleTransition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lifecycleTransition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationArn")
    private String notificationArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationMetadata")
    private String notificationMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    private CreateLifecycleHookRequest(Builder builder) {
        super(builder);
        this.defaultResult = builder.defaultResult;
        this.heartbeatTimeout = builder.heartbeatTimeout;
        this.lifecycleHookName = builder.lifecycleHookName;
        this.lifecycleTransition = builder.lifecycleTransition;
        this.notificationArn = builder.notificationArn;
        this.notificationMetadata = builder.notificationMetadata;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLifecycleHookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultResult
     */
    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * @return heartbeatTimeout
     */
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * @return lifecycleHookName
     */
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    /**
     * @return lifecycleTransition
     */
    public String getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * @return notificationArn
     */
    public String getNotificationArn() {
        return this.notificationArn;
    }

    /**
     * @return notificationMetadata
     */
    public String getNotificationMetadata() {
        return this.notificationMetadata;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<CreateLifecycleHookRequest, Builder> {
        private String defaultResult; 
        private Integer heartbeatTimeout; 
        private String lifecycleHookName; 
        private String lifecycleTransition; 
        private String notificationArn; 
        private String notificationMetadata; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLifecycleHookRequest request) {
            super(request);
            this.defaultResult = request.defaultResult;
            this.heartbeatTimeout = request.heartbeatTimeout;
            this.lifecycleHookName = request.lifecycleHookName;
            this.lifecycleTransition = request.lifecycleTransition;
            this.notificationArn = request.notificationArn;
            this.notificationMetadata = request.notificationMetadata;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>The action that you want Auto Scaling to perform after the lifecycle hook times out. Valid values:</p>
         * <ul>
         * <li>CONTINUE: Auto Scaling continues to respond to scale-in or scale-out requests.</li>
         * <li>ABANDON: Auto Scaling releases Elastic Compute Service (ECS) instances that are created during scale-out activities, or removes ECS instances from the scaling group during scale-in activities.</li>
         * </ul>
         * <p>If multiple lifecycle hooks in a scaling group are triggered during scale-in activities and you set the DefaultResult parameter to ABANDON for one of the lifecycle hooks, Auto Scaling immediately performs the action after the lifecycle hook whose DefaultResult is set to ABANDON times out. As a result, other lifecycle hooks time out ahead of schedule. In other cases, Auto Scaling performs the action only after all lifecycle hooks time out.</p>
         * <p>Default value: CONTINUE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        public Builder defaultResult(String defaultResult) {
            this.putQueryParameter("DefaultResult", defaultResult);
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * <p>The period of time before the lifecycle hook times out. After the lifecycle hook times out, Auto Scaling performs the default action. Valid values: 30 to 21600. Unit: seconds.</p>
         * <p>After you create a lifecycle hook, you can call the RecordLifecycleActionHeartbeat operation to prolong the timeout period of the lifecycle hook. You can also call the CompleteLifecycleAction operation to end the timeout period of the lifecycle hook ahead of schedule.</p>
         * <p>Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            this.putQueryParameter("HeartbeatTimeout", heartbeatTimeout);
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * <p>The name of the lifecycle hook. Each lifecycle hook name must be unique within a scaling group. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or a digit.</p>
         * <p>If you do not specify this parameter, the value of the LifecycleHookId parameter is used.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclehook****</p>
         */
        public Builder lifecycleHookName(String lifecycleHookName) {
            this.putQueryParameter("LifecycleHookName", lifecycleHookName);
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }

        /**
         * <p>The type of the scaling activity to which the lifecycle hook applies. Valid values:</p>
         * <ul>
         * <li>SCALE_OUT</li>
         * <li>SCALE_IN</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        public Builder lifecycleTransition(String lifecycleTransition) {
            this.putQueryParameter("LifecycleTransition", lifecycleTransition);
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the notification recipient. If you do not specify this parameter, no notification is sent when the lifecycle hook takes effect. If you specify this parameter, the value must be in one of the following formats:</p>
         * <ul>
         * <li>If you specify a Simple Message Queue (SMQ, formerly MNS) as the notification recipient, specify the value in the acs:mns:{region-id}:{account-id}:queue/{queuename} format.</li>
         * <li>If you specify an SMQ topic as the notification recipient, specify the value in the acs:mns:{region-id}:{account-id}:topic/{topicname} format.</li>
         * <li>If you specify a CloudOps Orchestration Service (OOS) template as the notification recipient, specify the value in the acs:oos:{region-id}:{account-id}:template/{templatename} format.</li>
         * <li>If you specify an event bus as the notification recipient, specify the value in the acs:eventbridge:{region-id}:{account-id}:eventbus/default format.</li>
         * </ul>
         * <p>The variables in the preceding value formats have the following meanings:</p>
         * <ul>
         * <li>region-id: the region ID of your scaling group.</li>
         * <li>account-id: the ID of the Alibaba Cloud account. IDs of Resource Access Management (RAM) users are not supported.</li>
         * <li>queuename: the name of the SMQ queue.</li>
         * <li>topicname: the name of the SMQ topic.</li>
         * <li>templatename: the name of the OOS template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-beijing:161456884340****:queue/modifyLifecycleHo****</p>
         */
        public Builder notificationArn(String notificationArn) {
            this.putQueryParameter("NotificationArn", notificationArn);
            this.notificationArn = notificationArn;
            return this;
        }

        /**
         * <p>The notification metadata that is sent when the lifecycle hook takes effect. This helps you manage and categorize notifications in an efficient manner. If you specify this parameter, you must specify the NotificationArn parameter. The parameter value cannot exceed 4,096 characters in length.</p>
         * <p>If you use the NotificationArn parameter to specify a public or customOOS template, the value of the NotificationMetadata parameter must be a JSON string that contains the OOS template parameters. For example, your OOS template includes the following parameters: <code>{&quot;dbInstanceId&quot;: &quot;dds-bp17661e0135****&quot;, &quot;modifyMode&quot;: &quot;Append&quot;}</code>, <code>dbInstanceId</code>, and <code>modifyMode</code>. Some parameters defined in your OOS template have default values. When you specify the NotificationMetadata parameter, specify parameters that do not have default values. If you specify parameters that have default values, the default values are overwritten. However, the default values of the following parameters must be retained to obtain information about scaling activities that are in progress:</p>
         * <ul>
         * <li><code>regionId</code>: the region ID of the scaling activity that is in progress. Default value: ${regionId}.</li>
         * <li><code>instanceIds</code>: the IDs of ECS instances that are scaled in in the scaling activity. Default value: ${instanceIds}.</li>
         * <li><code>lifecycleHookId</code>: the ID of the lifecycle hook. Default value: ${lifecycleHookId}.</li>
         * <li><code>lifecycleActionToken</code>: the token of the lifecycle action. You can use the token to end the timeout period of the lifecycle hook ahead of schedule. Default value: ${lifecycleActionToken}</li>
         * <li><code>scalingGroupId</code>: the ID of the scaling group in which the scaling activity is executed. Default value: ${scalingGroupId}.</li>
         * </ul>
         * <blockquote>
         * <p>You can obtain template parameter information in the <a href="https://oos.console.aliyun.com/">OOS console</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test lifecycle hook.</p>
         */
        public Builder notificationMetadata(String notificationMetadata) {
            this.putQueryParameter("NotificationMetadata", notificationMetadata);
            this.notificationMetadata = notificationMetadata;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1eyv4qn8ssgv43****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public CreateLifecycleHookRequest build() {
            return new CreateLifecycleHookRequest(this);
        } 

    } 

}
