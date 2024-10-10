// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AdvanceSecurityEventOperationsRequest} extends {@link RequestModel}
 *
 * <p>AdvanceSecurityEventOperationsRequest</p>
 */
public class AdvanceSecurityEventOperationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
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
         * <p>The alert name.</p>
         * 
         * <strong>example:</strong>
         * <p>Execution of malicious script code</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The alert event type. Valid values:</p>
         * <ul>
         * <li>Suspicious process</li>
         * <li>Webshell</li>
         * <li>Unusual logon</li>
         * <li>Exception</li>
         * <li>Sensitive file tampering</li>
         * <li>Malicious process (cloud threat detection)</li>
         * <li>Unusual network connection</li>
         * <li>Abnormal account</li>
         * <li>Application intrusion event</li>
         * <li>Cloud threat detection</li>
         * <li>Precision defense</li>
         * <li>Application whitelist</li>
         * <li>Persistent webshell</li>
         * <li>Web application threat detection</li>
         * <li>Malicious script</li>
         * <li>Threat intelligence</li>
         * <li>Malicious network activity</li>
         * <li>Cluster exception</li>
         * <li>Webshell (on-premises threat detection)</li>
         * <li>Vulnerability exploitation</li>
         * <li>Malicious process (on-premises threat detection)</li>
         * <li>Trusted exception</li>
         * <li>Others</li>
         * </ul>
         * <p>For more information about alert types, see <a href="https://help.aliyun.com/document_detail/68388.html">Alerts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Malicious script</p>
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
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
