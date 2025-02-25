// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSampleRequest} extends {@link RequestModel}
 *
 * <p>GetSampleRequest</p>
 */
public class GetSampleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sampleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withExtendParmas")
    private Boolean withExtendParmas;

    private GetSampleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sampleId = builder.sampleId;
        this.withExtendParmas = builder.withExtendParmas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSampleRequest create() {
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
     * @return withExtendParmas
     */
    public Boolean getWithExtendParmas() {
        return this.withExtendParmas;
    }

    public static final class Builder extends Request.Builder<GetSampleRequest, Builder> {
        private String instanceId; 
        private String sampleId; 
        private Boolean withExtendParmas; 

        private Builder() {
            super();
        } 

        private Builder(GetSampleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sampleId = request.sampleId;
            this.withExtendParmas = request.withExtendParmas;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test001</p>
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
         * <p>xxx</p>
         */
        public Builder sampleId(String sampleId) {
            this.putPathParameter("sampleId", sampleId);
            this.sampleId = sampleId;
            return this;
        }

        /**
         * withExtendParmas.
         */
        public Builder withExtendParmas(Boolean withExtendParmas) {
            this.putQueryParameter("withExtendParmas", withExtendParmas);
            this.withExtendParmas = withExtendParmas;
            return this;
        }

        @Override
        public GetSampleRequest build() {
            return new GetSampleRequest(this);
        } 

    } 

}
