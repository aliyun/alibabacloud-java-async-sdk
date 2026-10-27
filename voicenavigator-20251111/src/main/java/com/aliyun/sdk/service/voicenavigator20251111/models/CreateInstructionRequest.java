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
 * {@link CreateInstructionRequest} extends {@link RequestModel}
 *
 * <p>CreateInstructionRequest</p>
 */
public class CreateInstructionRequest extends Request {
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

    private CreateInstructionRequest(Builder builder) {
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

    public static CreateInstructionRequest create() {
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

    public static final class Builder extends Request.Builder<CreateInstructionRequest, Builder> {
        private String code; 
        private String config; 
        private String instanceId; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstructionRequest request) {
            super(request);
            this.code = request.code;
            this.config = request.config;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * <p>The instruction code.</p>
         * <blockquote>
         * <p>Notice: Globally unique.</notice></p>
         * </blockquote>
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
         * <p>The instruction configuration.</p>
         * <blockquote>
         * <ul>
         * <li>providerId: the ID of the human agent service provider. You can obtain the ID by calling ListCallCenterProviders.</li>
         * <li>transferMethod: the transfer method. Valid values: BYE, BRIDGE, and REFER.</li>
         * <li>transferType: the transfer target type. Valid values: External (external number), Agent (agent), and SkillGroup (skill group).</li>
         * <li>transferTarget: the transfer target.</li>
         * <li>transferor: the caller number. If this parameter is left empty, the mobile phone number of the calling customer is used by default.</li>
         * <li>timeoutSeconds: the timeout period for transferring to a human agent, in seconds. Default value: 30.</li>
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
         * <p>The instance ID.</p>
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
         * <p>The instruction name.</p>
         * 
         * <strong>example:</strong>
         * <p>Transfer to human agent instruction 1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The instruction type.</p>
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
        public CreateInstructionRequest build() {
            return new CreateInstructionRequest(this);
        } 

    } 

}
