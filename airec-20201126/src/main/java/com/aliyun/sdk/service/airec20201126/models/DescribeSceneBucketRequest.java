// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSceneBucketRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneBucketRequest</p>
 */
public class DescribeSceneBucketRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private DescribeSceneBucketRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneBucketRequest create() {
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DescribeSceneBucketRequest, Builder> {
        private String instanceId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneBucketRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sceneId = request.sceneId;
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
         * <p>test</p>
         */
        public Builder sceneId(String sceneId) {
            this.putPathParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DescribeSceneBucketRequest build() {
            return new DescribeSceneBucketRequest(this);
        } 

    } 

}
