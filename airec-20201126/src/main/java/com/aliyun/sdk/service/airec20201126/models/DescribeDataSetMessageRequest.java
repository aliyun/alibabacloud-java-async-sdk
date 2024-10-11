// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataSetMessageRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSetMessageRequest</p>
 */
public class DescribeDataSetMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("versionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionId;

    private DescribeDataSetMessageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSetMessageRequest create() {
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
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DescribeDataSetMessageRequest, Builder> {
        private String instanceId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataSetMessageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.versionId = request.versionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder versionId(String versionId) {
            this.putPathParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DescribeDataSetMessageRequest build() {
            return new DescribeDataSetMessageRequest(this);
        } 

    } 

}
