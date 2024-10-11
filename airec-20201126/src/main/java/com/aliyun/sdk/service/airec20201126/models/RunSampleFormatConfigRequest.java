// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunSampleFormatConfigRequest} extends {@link RequestModel}
 *
 * <p>RunSampleFormatConfigRequest</p>
 */
public class RunSampleFormatConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sampleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    private RunSampleFormatConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sampleId = builder.sampleId;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSampleFormatConfigRequest create() {
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
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<RunSampleFormatConfigRequest, Builder> {
        private String instanceId; 
        private String sampleId; 
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(RunSampleFormatConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sampleId = request.sampleId;
            this.mode = request.mode;
        } 

        /**
         * <p>The instance ID.</p>
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
         * <p>The sample ID.</p>
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
         * <p>The mode of the formatting. Default value: Latest. This value indicates that the latest formatting configurations are used.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public RunSampleFormatConfigRequest build() {
            return new RunSampleFormatConfigRequest(this);
        } 

    } 

}
