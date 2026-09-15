// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

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
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
        private Long resourceDirectoryAccountId; 
        private Long resourceOwnerId; 
        private Integer ruleId; 

        private Builder() {
            super();
        } 

        private Builder(AdvanceSecurityEventOperationsRequest request) {
            super(request);
            this.eventName = request.eventName;
            this.eventType = request.eventType;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The alert name. The EventName and EventType parameters must be specified together. If only one of them is specified, the API returns a 400 error.</p>
         * 
         * <strong>example:</strong>
         * <p>Malicious script code execution</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The type of the alerting event. Valid values:</p>
         * <ul>
         * <li>Abnormal process behavior</li>
         * <li>Web shell</li>
         * <li>Unusual logon</li>
         * <li>Abnormal event</li>
         * <li>Sensitive file tampering</li>
         * <li>Malicious process (cloud scan)</li>
         * <li>Suspicious network connection</li>
         * <li>Abnormal account</li>
         * <li>Application intrusion event</li>
         * <li>Cloud service threat detection</li>
         * <li>Precise defense</li>
         * <li>Application whitelist</li>
         * <li>Persistent backdoor</li>
         * <li>Web application threat detection</li>
         * <li>Malicious script</li>
         * <li>Threat intelligence</li>
         * <li>Malicious network behavior</li>
         * <li>Container cluster exception</li>
         * <li>Web shell (local scan)</li>
         * <li>Vulnerability exploits</li>
         * <li>Malicious process (local scan)</li>
         * <li>Trusted exception</li>
         * <li>Other</li>
         * </ul>
         * <p>For more information about alert types, see <a href="https://help.aliyun.com/document_detail/68388.html">Security alert check items</a>.</p>
         * <p>The EventName and EventType parameters must be specified together. If only one of them is specified, the API returns a 400 error.</p>
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
         * <p>The member account ID in the resource directory (Alibaba Cloud account).</p>
         * 
         * <strong>example:</strong>
         * <p>1232428423234****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
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
