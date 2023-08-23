// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AdvanceSecurityEventOperationsRequest} extends {@link RequestModel}
 *
 * <p>AdvanceSecurityEventOperationsRequest</p>
 */
public class AdvanceSecurityEventOperationsRequest extends Request {
    @Query
    @NameInMap("EventName")
    private String eventName;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RuleId")
    private Integer ruleId;

    private AdvanceSecurityEventOperationsRequest(Builder builder) {
        super(builder);
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AdvanceSecurityEventOperationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return ruleId
     */
    public Integer getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<AdvanceSecurityEventOperationsRequest, Builder> {
        private String eventName; 
        private String eventType; 
        private Long resourceOwnerId; 
        private Integer ruleId; 

        private Builder() {
            super();
        } 

        private Builder(AdvanceSecurityEventOperationsRequest request) {
            super(request);
            this.eventName = request.eventName;
            this.eventType = request.eventType;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleId = request.ruleId;
        } 

        /**
         * The alert name.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The alert event type. Valid values:
         * <p>
         * 
         * *   Suspicious process
         * *   Webshell
         * *   Unusual logon
         * *   Exception
         * *   Sensitive file tampering
         * *   Malicious process (cloud threat detection)
         * *   Unusual network connection
         * *   Abnormal account
         * *   Application intrusion event
         * *   Cloud threat detection
         * *   Precision defense
         * *   Application whitelist
         * *   Persistent webshell
         * *   Web application threat detection
         * *   Malicious script
         * *   Threat intelligence
         * *   Malicious network activity
         * *   Cluster exception
         * *   Webshell (on-premises threat detection)
         * *   Vulnerability exploitation
         * *   Malicious process (on-premises threat detection)
         * *   Trusted exception
         * *   Others
         * 
         * For more information about alert types, see [Alerts](~~68388~~).
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
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
         * The rule ID.
         */
        public Builder ruleId(Integer ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public AdvanceSecurityEventOperationsRequest build() {
            return new AdvanceSecurityEventOperationsRequest(this);
        } 

    } 

}
