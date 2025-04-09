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
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NluEngine.
         */
        public Builder nluEngine(String nluEngine) {
            this.putQueryParameter("NluEngine", nluEngine);
            this.nluEngine = nluEngine;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
