// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImportContactFlowRequest} extends {@link RequestModel}
 *
 * <p>ImportContactFlowRequest</p>
 */
public class ImportContactFlowRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowPackageData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowPackageData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImportContactFlowRequest(Builder builder) {
        super(builder);
        this.flowPackageData = builder.flowPackageData;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportContactFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowPackageData
     */
    public String getFlowPackageData() {
        return this.flowPackageData;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<ImportContactFlowRequest, Builder> {
        private String flowPackageData; 
        private String instanceId; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(ImportContactFlowRequest request) {
            super(request);
            this.flowPackageData = request.flowPackageData;
            this.instanceId = request.instanceId;
            this.requestId = request.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder flowPackageData(String flowPackageData) {
            this.putBodyParameter("FlowPackageData", flowPackageData);
            this.flowPackageData = flowPackageData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public ImportContactFlowRequest build() {
            return new ImportContactFlowRequest(this);
        } 

    } 

}
