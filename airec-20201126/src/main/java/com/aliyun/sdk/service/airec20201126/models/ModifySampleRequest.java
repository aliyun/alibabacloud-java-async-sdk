// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySampleRequest} extends {@link RequestModel}
 *
 * <p>ModifySampleRequest</p>
 */
public class ModifySampleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sampleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map < String, ? > body;

    private ModifySampleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sampleId = builder.sampleId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySampleRequest create() {
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
     * @return sampleId
     */
    public String getSampleId() {
        return this.sampleId;
    }

    /**
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifySampleRequest, Builder> {
        private String instanceId; 
        private String sampleId; 
        private java.util.Map < String, ? > body; 

        private Builder() {
            super();
        } 

        private Builder(ModifySampleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sampleId = request.sampleId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder sampleId(String sampleId) {
            this.putPathParameter("sampleId", sampleId);
            this.sampleId = sampleId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.Map < String, ? > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifySampleRequest build() {
            return new ModifySampleRequest(this);
        } 

    } 

}
