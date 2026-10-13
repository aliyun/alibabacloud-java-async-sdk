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
 * {@link ImportScriptRequest} extends {@link RequestModel}
 *
 * <p>ImportScriptRequest</p>
 */
public class ImportScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluEngine")
    private String nluEngine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signatureUrl;

    private ImportScriptRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nluEngine = builder.nluEngine;
        this.signatureUrl = builder.signatureUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nluEngine
     */
    public String getNluEngine() {
        return this.nluEngine;
    }

    /**
     * @return signatureUrl
     */
    public String getSignatureUrl() {
        return this.signatureUrl;
    }

    public static final class Builder extends Request.Builder<ImportScriptRequest, Builder> {
        private String instanceId; 
        private String nluEngine; 
        private String signatureUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImportScriptRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nluEngine = request.nluEngine;
            this.signatureUrl = request.signatureUrl;
        } 

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00b37342-e759-4fe5-b296-aef775933af0</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>NLU engine. Applies only to Large Language Model (LLM) scenarios.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Prompts: LLM scenario.</p>
         * </li>
         * <li><p>Empty: Non-LLM scenario.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prompts</p>
         */
        public Builder nluEngine(String nluEngine) {
            this.putQueryParameter("NluEngine", nluEngine);
            this.nluEngine = nluEngine;
            return this;
        }

        /**
         * <p>URL of the scenario JSON file to import.</p>
         * <blockquote>
         * <p>This value is the Folder parameter returned by the GetJobDataUploadParams operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOADED/SCRIPT/136a055e-***-46c6-853a-731b3a2973de/18dc6d79-338f-413c-a5a8-dcce5f05b41a_9bd7916d-a340-4925-a911-92390cbe0f33.json</p>
         */
        public Builder signatureUrl(String signatureUrl) {
            this.putQueryParameter("SignatureUrl", signatureUrl);
            this.signatureUrl = signatureUrl;
            return this;
        }

        @Override
        public ImportScriptRequest build() {
            return new ImportScriptRequest(this);
        } 

    } 

}
