// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link PreviewOutputFileRequest} extends {@link RequestModel}
 *
 * <p>PreviewOutputFileRequest</p>
 */
public class PreviewOutputFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputItemId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String outputItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionId")
    private String versionId;

    private PreviewOutputFileRequest(Builder builder) {
        super(builder);
        this.outputItemId = builder.outputItemId;
        this.tenantId = builder.tenantId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewOutputFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputItemId
     */
    public String getOutputItemId() {
        return this.outputItemId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<PreviewOutputFileRequest, Builder> {
        private String outputItemId; 
        private String tenantId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(PreviewOutputFileRequest request) {
            super(request);
            this.outputItemId = request.outputItemId;
            this.tenantId = request.tenantId;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The output item ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleOutputItemId</p>
         */
        public Builder outputItemId(String outputItemId) {
            this.putBodyParameter("outputItemId", outputItemId);
            this.outputItemId = outputItemId;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The version referenced by the alias.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleVersionId</p>
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public PreviewOutputFileRequest build() {
            return new PreviewOutputFileRequest(this);
        } 

    } 

}
