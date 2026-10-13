// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link StartJobRequest} extends {@link RequestModel}
 *
 * <p>StartJobRequest</p>
 */
public class StartJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    private String scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    private StartJobRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobJson = builder.jobJson;
        this.scenarioId = builder.scenarioId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callingNumber
     */
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobJson
     */
    public String getJobJson() {
        return this.jobJson;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<StartJobRequest, Builder> {
        private java.util.List<String> callingNumber; 
        private String instanceId; 
        private String jobGroupId; 
        private String jobJson; 
        private String scenarioId; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(StartJobRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobJson = request.jobJson;
            this.scenarioId = request.scenarioId;
            this.scriptId = request.scriptId;
        } 

        /**
         * <p>List of caller numbers</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>Instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Task group ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f21446e-324e-46f2-bf62-7f341fb004ea</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>Job data, which includes the following fields:</p>
         * <p>extras // Optional extra information</p>
         * <ul>
         * <li><p>key // Key for a custom variable</p>
         * </li>
         * <li><p>value // Value for a custom variable</p>
         * </li>
         * </ul>
         * <p>contacts // Required contact information for the callee</p>
         * <ul>
         * <li><p>phoneNumber // Required phone number of the callee</p>
         * </li>
         * <li><p>referenceId // Required contact ID (user-defined) to avoid duplicate names</p>
         * </li>
         * <li><p>role // Optional role of this contact in the outbound call scenario. If omitted, no role distinction is made</p>
         * </li>
         * <li><p>honorific // Optional honorific for the contact</p>
         * </li>
         * <li><p>name // Optional name of the contact</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;extras&quot;: [{
         *         &quot;value&quot;: &quot;测试&quot;,
         *         &quot;key&quot;: &quot;测试&quot;
         *     }, {
         *         &quot;key&quot;: &quot;ServiceId&quot;,
         *         &quot;value&quot;: null
         *     }, {
         *         &quot;key&quot;: &quot;TenantId&quot;,
         *         &quot;value&quot;: null
         *     }],
         *     &quot;contacts&quot;: [{
         *         &quot;phonenumber&quot;: &quot;198********&quot;,
         *         &quot;name&quot;: &quot;张三&quot;,
         *         &quot;priority&quot;: 5,
         *         &quot;referenceId&quot;: &quot;C01&quot;
         *     }]
         * }</p>
         */
        public Builder jobJson(String jobJson) {
            this.putQueryParameter("JobJson", jobJson);
            this.jobJson = jobJson;
            return this;
        }

        /**
         * <p>Scenario ID. This field supports backward compatibility with legacy outbound calling features. You can omit it.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * <p>Scenario ID (required)</p>
         * 
         * <strong>example:</strong>
         * <p>1eeae263-54ca-4a52-ae14-62da58f3c473</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public StartJobRequest build() {
            return new StartJobRequest(this);
        } 

    } 

}
