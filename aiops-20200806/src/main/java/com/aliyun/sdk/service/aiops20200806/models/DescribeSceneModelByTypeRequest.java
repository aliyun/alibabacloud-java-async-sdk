// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneModelByTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneModelByTypeRequest</p>
 */
public class DescribeSceneModelByTypeRequest extends Request {
    @Body
    @NameInMap("ModelType")
    private Integer modelType;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private DescribeSceneModelByTypeRequest(Builder builder) {
        super(builder);
        this.modelType = builder.modelType;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneModelByTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelType
     */
    public Integer getModelType() {
        return this.modelType;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DescribeSceneModelByTypeRequest, Builder> {
        private Integer modelType; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneModelByTypeRequest request) {
            super(request);
            this.modelType = request.modelType;
            this.operaUid = request.operaUid;
        } 

        /**
         * ModelType.
         */
        public Builder modelType(Integer modelType) {
            this.putBodyParameter("ModelType", modelType);
            this.modelType = modelType;
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
        public DescribeSceneModelByTypeRequest build() {
            return new DescribeSceneModelByTypeRequest(this);
        } 

    } 

}
