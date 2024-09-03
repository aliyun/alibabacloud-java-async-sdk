// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFlowJSONAssetRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowJSONAssetRequest</p>
 */
public class UpdateFlowJSONAssetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    private UpdateFlowJSONAssetRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.filePath = builder.filePath;
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowJSONAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    public static final class Builder extends Request.Builder<UpdateFlowJSONAssetRequest, Builder> {
        private String custSpaceId; 
        private String filePath; 
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowJSONAssetRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.filePath = request.filePath;
            this.flowId = request.flowId;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * The Flow ID.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public UpdateFlowJSONAssetRequest build() {
            return new UpdateFlowJSONAssetRequest(this);
        } 

    } 

}
