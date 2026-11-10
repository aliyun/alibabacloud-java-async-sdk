// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link ContinuouslyPushRequest} extends {@link RequestModel}
 *
 * <p>ContinuouslyPushRequest</p>
 */
public class ContinuouslyPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetValue;

    private ContinuouslyPushRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.messageId = builder.messageId;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinuouslyPushRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return targetValue
     */
    public String getTargetValue() {
        return this.targetValue;
    }

    public static final class Builder extends Request.Builder<ContinuouslyPushRequest, Builder> {
        private Long appKey; 
        private String messageId; 
        private String target; 
        private String targetValue; 

        private Builder() {
            super();
        } 

        private Builder(ContinuouslyPushRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.messageId = request.messageId;
            this.target = request.target;
            this.targetValue = request.targetValue;
        } 

        /**
         * <p>The AppKey information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The message ID.</p>
         * <p>The MessageId obtained after calling the Push operation and setting Target to TBD. It represents a message that has been saved to the push system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500131</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The push target:</p>
         * <ul>
         * <li><strong>DEVICE</strong>: Push based on devices.</li>
         * <li><strong>ACCOUNT</strong>: Push based on accounts.</li>
         * <li><strong>ALIAS</strong>: Push based on aliases.</li>
         * </ul>
         * <p>Continuous push supports only these three target types.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>Set this parameter based on Target. Separate multiple values with commas. If the limit is exceeded, push the message in multiple batches.</p>
         * <ul>
         * <li>If Target is set to DEVICE, the value is in the format of <code>deviceid1,deviceid2</code>. A maximum of 1,000 devices are supported.</li>
         * <li>If Target is set to ACCOUNT, the value is in the format of <code>account1,account2</code>. A maximum of 1,000 accounts are supported.</li>
         * <li>If Target is set to ALIAS, the value is in the format of <code>alias1,alias2</code>. A maximum of 1,000 aliases are supported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a692961a92534047ad3625****</p>
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public ContinuouslyPushRequest build() {
            return new ContinuouslyPushRequest(this);
        } 

    } 

}
