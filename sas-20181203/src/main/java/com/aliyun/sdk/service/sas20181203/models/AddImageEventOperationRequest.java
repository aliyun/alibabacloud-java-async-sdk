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
 * {@link AddImageEventOperationRequest} extends {@link RequestModel}
 *
 * <p>AddImageEventOperationRequest</p>
 */
public class AddImageEventOperationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private String conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventKey")
    private String eventKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationCode")
    private String operationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenarios")
    private String scenarios;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private AddImageEventOperationRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.eventKey = builder.eventKey;
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.note = builder.note;
        this.operationCode = builder.operationCode;
        this.scenarios = builder.scenarios;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageEventOperationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public String getConditions() {
        return this.conditions;
    }

    /**
     * @return eventKey
     */
    public String getEventKey() {
        return this.eventKey;
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
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return scenarios
     */
    public String getScenarios() {
        return this.scenarios;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<AddImageEventOperationRequest, Builder> {
        private String conditions; 
        private String eventKey; 
        private String eventName; 
        private String eventType; 
        private String note; 
        private String operationCode; 
        private String scenarios; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(AddImageEventOperationRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.eventKey = request.eventKey;
            this.eventName = request.eventName;
            this.eventType = request.eventType;
            this.note = request.note;
            this.operationCode = request.operationCode;
            this.scenarios = request.scenarios;
            this.source = request.source;
        } 

        /**
         * <p>The rule conditions. The value is in the JSON format. Valid values of keys:</p>
         * <ul>
         * <li><strong>condition</strong>: the matching condition.</li>
         * <li><strong>type</strong>: the matching type.</li>
         * <li><strong>value</strong>: the matching value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;condition&quot;: &quot;MD5&quot;, &quot;type&quot;: &quot;equals&quot;, &quot;value&quot;: &quot;0083a31cc0083a31ccf7c10367a6e783e&quot;}]</p>
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The keyword of the alert item.</p>
         * 
         * <strong>example:</strong>
         * <p>PEM</p>
         */
        public Builder eventKey(String eventKey) {
            this.putQueryParameter("EventKey", eventKey);
            this.eventKey = eventKey;
            return this;
        }

        /**
         * <p>The name of the alert item.</p>
         * 
         * <strong>example:</strong>
         * <p>PEM</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The alert type.</p>
         * <ul>
         * <li>Set the value to <strong>sensitiveFile</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sensitiveFile</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The remarks that you want to add.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * <p>The operation code.</p>
         * <ul>
         * <li>Set the value to <strong>whitelist</strong> to add the alert item to the whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>whitelist</p>
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * <p>The application scope of the rule. The value is in the JSON format. Valid values of keys:</p>
         * <ul>
         * <li><strong>type</strong></li>
         * <li><strong>value</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;: &quot;repo&quot;, &quot;value&quot;: &quot;test-aaa/shenzhen-repo-01&quot;}</p>
         */
        public Builder scenarios(String scenarios) {
            this.putQueryParameter("Scenarios", scenarios);
            this.scenarios = scenarios;
            return this;
        }

        /**
         * <p>The source of the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>image</strong>: image.</li>
         * <li><strong>agentless</strong>: agentless detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public AddImageEventOperationRequest build() {
            return new AddImageEventOperationRequest(this);
        } 

    } 

}
