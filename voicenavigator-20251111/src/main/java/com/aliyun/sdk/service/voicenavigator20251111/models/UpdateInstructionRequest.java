// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link UpdateInstructionRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstructionRequest</p>
 */
public class UpdateInstructionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateInstructionRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.config = builder.config;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstructionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateInstructionRequest, Builder> {
        private String code; 
        private String config; 
        private String instanceId; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstructionRequest request) {
            super(request);
            this.code = request.code;
            this.config = request.config;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * <p>The unique code for the instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>Transfer00</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The configuration for the instruction, specified as a JSON string.</p>
         * <blockquote>
         * <ul>
         * <li><p><code>providerId</code>: The ID of the live agent service provider. Call the <code>ListCallCenterProviders</code> operation to obtain this ID.</p>
         * </li>
         * <li><p><code>transferMethod</code>: The method used for the transfer. Valid values: <code>BYE</code>, <code>BRIDGE</code>, and <code>REFER</code>.</p>
         * </li>
         * <li><p><code>transferType</code>: The transfer destination type. Valid values: <code>External</code> (external number), <code>Agent</code> (agent), and <code>SkillGroup</code> (skill group).</p>
         * </li>
         * <li><p><code>transferTarget</code>: The destination of the transfer, such as a phone number, an agent ID, or a skill group ID. The value of this parameter depends on the <code>transferType</code>.</p>
         * </li>
         * <li><p><code>transferor</code>: The caller ID to display for the transfer. If this parameter is not specified, the caller\&quot;s original phone number is used.</p>
         * </li>
         * <li><p><code>timeoutSeconds</code>: The timeout in seconds for transferring a call to an agent. Default: 30.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;providerId&quot;: &quot;xxxxxxxxx&quot;,
         *     &quot;transferMethod&quot;: &quot;BYE&quot;,
         *     &quot;transferType&quot;: &quot;External&quot;,
         *     &quot;transferTarget&quot;: &quot;152******&quot;,
         *     &quot;transferor&quot;: &quot;01*****&quot;,
         *     &quot;timeoutSeconds&quot;: &quot;10&quot;
         * }</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>转人工指令一</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>TRANSFER</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateInstructionRequest build() {
            return new UpdateInstructionRequest(this);
        } 

    } 

}
