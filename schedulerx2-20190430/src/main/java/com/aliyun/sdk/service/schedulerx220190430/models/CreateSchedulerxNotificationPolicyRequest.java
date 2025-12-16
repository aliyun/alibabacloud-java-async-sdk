// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link CreateSchedulerxNotificationPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateSchedulerxNotificationPolicyRequest</p>
 */
public class CreateSchedulerxNotificationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelTimeRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelTimeRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateSchedulerxNotificationPolicyRequest(Builder builder) {
        super(builder);
        this.channelTimeRange = builder.channelTimeRange;
        this.description = builder.description;
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchedulerxNotificationPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelTimeRange
     */
    public String getChannelTimeRange() {
        return this.channelTimeRange;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateSchedulerxNotificationPolicyRequest, Builder> {
        private String channelTimeRange; 
        private String description; 
        private String policyName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSchedulerxNotificationPolicyRequest request) {
            super(request);
            this.channelTimeRange = request.channelTimeRange;
            this.description = request.description;
            this.policyName = request.policyName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The configuration for the effective time periods of notification channels.</p>
         * <blockquote>
         * <p> Please see the detailed explanation of this parameter below.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;sendChannel&quot;: &quot;sms,webhook,mail,phone&quot;,
         *   &quot;timezone&quot;: &quot;UTC+08:00&quot;,
         *   &quot;webhookIsAtAll&quot;: &quot;false&quot;,
         *   &quot;timeRanges&quot;: {
         *     &quot;all&quot;: [
         *       {
         *         &quot;startTime&quot;: &quot;08:00&quot;,
         *         &quot;endTime&quot;: &quot;18:00&quot;,
         *         &quot;daysOfWeek&quot;: [1, 2, 3, 4, 5]
         *       }
         *     ]
         *   }
         * }</p>
         */
        public Builder channelTimeRange(String channelTimeRange) {
            this.putBodyParameter("ChannelTimeRange", channelTimeRange);
            this.channelTimeRange = channelTimeRange;
            return this;
        }

        /**
         * <p>The description of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Monday-Friday only</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the notification policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-weekdays</p>
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateSchedulerxNotificationPolicyRequest build() {
            return new CreateSchedulerxNotificationPolicyRequest(this);
        } 

    } 

}
