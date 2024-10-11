// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIndexVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListIndexVersionsRequest</p>
 */
public class ListIndexVersionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("algorithmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmId;

    private ListIndexVersionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.algorithmId = builder.algorithmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexVersionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListIndexVersionsRequest, Builder> {
        private String instanceId; 
        private String algorithmId; 

        private Builder() {
            super();
        } 

        private Builder(ListIndexVersionsRequest request) {
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
         * <p>abc</p>
         */
        public Builder algorithmId(String algorithmId) {
            this.putPathParameter("algorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        @Override
        public ListIndexVersionsRequest build() {
            return new ListIndexVersionsRequest(this);
        } 

    } 

}
