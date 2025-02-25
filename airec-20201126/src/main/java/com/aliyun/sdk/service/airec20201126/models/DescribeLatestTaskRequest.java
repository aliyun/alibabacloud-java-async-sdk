// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLatestTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeLatestTaskRequest</p>
 */
public class DescribeLatestTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("algorithmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmId;

    private DescribeLatestTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.algorithmId = builder.algorithmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLatestTaskRequest create() {
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
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public static final class Builder extends Request.Builder<DescribeLatestTaskRequest, Builder> {
        private String instanceId; 
        private String algorithmId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLatestTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.algorithmId = request.algorithmId;
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
        public Builder algorithmId(String algorithmId) {
            this.putPathParameter("algorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        @Override
        public DescribeLatestTaskRequest build() {
            return new DescribeLatestTaskRequest(this);
        } 

    } 

}
