// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportScriptRequest} extends {@link RequestModel}
 *
 * <p>ImportScriptRequest</p>
 */
public class ImportScriptRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SignatureUrl")
    @Validation(required = true)
    private String signatureUrl;

    private ImportScriptRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
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
     * @return signatureUrl
     */
    public String getSignatureUrl() {
        return this.signatureUrl;
    }

    public static final class Builder extends Request.Builder<ImportScriptRequest, Builder> {
        private String instanceId; 
        private String signatureUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImportScriptRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.signatureUrl = request.signatureUrl;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SignatureUrl.
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
