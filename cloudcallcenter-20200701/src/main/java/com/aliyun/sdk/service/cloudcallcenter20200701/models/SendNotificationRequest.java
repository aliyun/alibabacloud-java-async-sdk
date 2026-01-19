// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

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
 * {@link SendNotificationRequest} extends {@link RequestModel}
 *
 * <p>SendNotificationRequest</p>
 */
public class SendNotificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageBody")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationTarget")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notificationTarget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notificationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardingKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shardingKey;

    private SendNotificationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.messageBody = builder.messageBody;
        this.notificationTarget = builder.notificationTarget;
        this.notificationType = builder.notificationType;
        this.shardingKey = builder.shardingKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendNotificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return messageBody
     */
    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * @return notificationTarget
     */
    public String getNotificationTarget() {
        return this.notificationTarget;
    }

    /**
     * @return notificationType
     */
    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     * @return shardingKey
     */
    public String getShardingKey() {
        return this.shardingKey;
    }

    public static final class Builder extends Request.Builder<SendNotificationRequest, Builder> {
        private String instanceId; 
        private String messageBody; 
        private String notificationTarget; 
        private String notificationType; 
        private String shardingKey; 

        private Builder() {
            super();
        } 

        private Builder(SendNotificationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.messageBody = request.messageBody;
            this.notificationTarget = request.notificationTarget;
            this.notificationType = request.notificationType;
            this.shardingKey = request.shardingKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;eventType&quot;: &quot;VnRecordingReady&quot;,   &quot;eventTime&quot;: &quot;2025-11-05T01:51:20.974Z&quot;,    &quot;instanceId&quot;: &quot;ccc-test&quot;,                    &quot;scenarioId&quot;: &quot;scenario-xxxx&quot;,               &quot;contactId&quot;: &quot;job-xxxxxx&quot;,                   &quot;duration&quot;: 59,                              &quot;startTime&quot;: &quot;2025-11-05T01:50:04.732Z&quot;,    &quot;endTime&quot;: &quot;2025-11-05T01:51:02.822Z&quot;,      &quot;fileName&quot;: &quot;xxxxxxx.wav&quot;,                   &quot;downloadURL&quot;: &quot;<a href="https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-record-mixed/xxxxxxx.wav?Expires=1762393880">https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-record-mixed/xxxxxxx.wav?Expires=1762393880</a>&quot; }</p>
         */
        public Builder messageBody(String messageBody) {
            this.putQueryParameter("MessageBody", messageBody);
            this.messageBody = messageBody;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        public Builder notificationTarget(String notificationTarget) {
            this.putQueryParameter("NotificationTarget", notificationTarget);
            this.notificationTarget = notificationTarget;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VnRecordingReady</p>
         */
        public Builder notificationType(String notificationType) {
            this.putQueryParameter("NotificationType", notificationType);
            this.notificationType = notificationType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxxxx</p>
         */
        public Builder shardingKey(String shardingKey) {
            this.putQueryParameter("ShardingKey", shardingKey);
            this.shardingKey = shardingKey;
            return this;
        }

        @Override
        public SendNotificationRequest build() {
            return new SendNotificationRequest(this);
        } 

    } 

}
