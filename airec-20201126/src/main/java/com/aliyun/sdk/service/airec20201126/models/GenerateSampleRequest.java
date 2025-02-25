// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateSampleRequest} extends {@link RequestModel}
 *
 * <p>GenerateSampleRequest</p>
 */
public class GenerateSampleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sampleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleId;

    private GenerateSampleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sampleId = builder.sampleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSampleRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateSampleRequest, Builder> {
        private String instanceId; 
        private String sampleId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateSampleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sampleId = request.sampleId;
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

        @Override
        public GenerateSampleRequest build() {
            return new GenerateSampleRequest(this);
        } 

    } 

}
