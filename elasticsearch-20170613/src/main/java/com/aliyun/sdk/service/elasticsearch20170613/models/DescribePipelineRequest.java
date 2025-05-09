// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DescribePipelineRequest} extends {@link RequestModel}
 *
 * <p>DescribePipelineRequest</p>
 */
public class DescribePipelineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    private DescribePipelineRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePipelineRequest create() {
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
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<DescribePipelineRequest, Builder> {
        private String instanceId; 
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePipelineRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pipelineId = request.pipelineId;
        } 

        /**
         * <p>The information about the returned pipeline. For more information, see <a href="https://www.elastic.co/guide/en/logstash/6.7/logstash-settings-file.html">logstash.yml</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-oew1qbgl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline_test</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putPathParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public DescribePipelineRequest build() {
            return new DescribePipelineRequest(this);
        } 

    } 

}
