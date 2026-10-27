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
 * {@link CreateScriptRequest} extends {@link RequestModel}
 *
 * <p>CreateScriptRequest</p>
 */
public class CreateScriptRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Integer concurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NluEngine")
    private String nluEngine;

    private CreateScriptRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.nluEngine = builder.nluEngine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrency
     */
    public Integer getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return nluEngine
     */
    public String getNluEngine() {
        return this.nluEngine;
    }

    public static final class Builder extends Request.Builder<CreateScriptRequest, Builder> {
        private Integer concurrency; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String nluEngine; 

        private Builder() {
            super();
        } 

        private Builder(CreateScriptRequest request) {
            super(request);
            this.concurrency = request.concurrency;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.nluEngine = request.nluEngine;
        } 

        /**
         * <p>The concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder concurrency(Integer concurrency) {
            this.putBodyParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>First navigation instance</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
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
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>Navigation test instance</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The NLU engine. Valid values:</p>
         * <ul>
         * <li>PROMPTS: Prompt mode.</li>
         * <li>FUNCTION: Function computing mode.</li>
         * <li>BEEBOT: Workflow mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BEEBOT</p>
         */
        public Builder nluEngine(String nluEngine) {
            this.putBodyParameter("NluEngine", nluEngine);
            this.nluEngine = nluEngine;
            return this;
        }

        @Override
        public CreateScriptRequest build() {
            return new CreateScriptRequest(this);
        } 

    } 

}
