// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneModelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneModelsRequest</p>
 */
public class DescribeSceneModelsRequest extends Request {
    @Body
    @NameInMap("ApplyStatus")
    private Integer applyStatus;

    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("ModelName")
    private String modelName;

    @Body
    @NameInMap("ModelType")
    private Integer modelType;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeSceneModelsRequest(Builder builder) {
        super(builder);
        this.applyStatus = builder.applyStatus;
        this.currentPage = builder.currentPage;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneModelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyStatus
     */
    public Integer getApplyStatus() {
        return this.applyStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
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

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeSceneModelsRequest, Builder> {
        private Integer applyStatus; 
        private Integer currentPage; 
        private String modelName; 
        private Integer modelType; 
        private String operaUid; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneModelsRequest request) {
            super(request);
            this.applyStatus = request.applyStatus;
            this.currentPage = request.currentPage;
            this.modelName = request.modelName;
            this.modelType = request.modelType;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
        } 

        /**
         * ApplyStatus.
         */
        public Builder applyStatus(Integer applyStatus) {
            this.putBodyParameter("ApplyStatus", applyStatus);
            this.applyStatus = applyStatus;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putBodyParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
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

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeSceneModelsRequest build() {
            return new DescribeSceneModelsRequest(this);
        } 

    } 

}
