// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneModelDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneModelDetailRequest</p>
 */
public class DescribeSceneModelDetailRequest extends Request {
    @Body
    @NameInMap("ModelId")
    private Long modelId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private DescribeSceneModelDetailRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneModelDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DescribeSceneModelDetailRequest, Builder> {
        private Long modelId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneModelDetailRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.operaUid = request.operaUid;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(Long modelId) {
            this.putBodyParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public DescribeSceneModelDetailRequest build() {
            return new DescribeSceneModelDetailRequest(this);
        } 

    } 

}
