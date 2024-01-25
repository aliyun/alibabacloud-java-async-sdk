// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneSystemModelRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneSystemModelRequest</p>
 */
public class DescribeSceneSystemModelRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("ModelName")
    private String modelName;

    @Body
    @NameInMap("ModelStatus")
    private Integer modelStatus;

    @Body
    @NameInMap("ModelType")
    private Integer modelType;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("TypeId")
    private Long typeId;

    private DescribeSceneSystemModelRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.modelName = builder.modelName;
        this.modelStatus = builder.modelStatus;
        this.modelType = builder.modelType;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.typeId = builder.typeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneSystemModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return modelStatus
     */
    public Integer getModelStatus() {
        return this.modelStatus;
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

    /**
     * @return typeId
     */
    public Long getTypeId() {
        return this.typeId;
    }

    public static final class Builder extends Request.Builder<DescribeSceneSystemModelRequest, Builder> {
        private Integer currentPage; 
        private String modelName; 
        private Integer modelStatus; 
        private Integer modelType; 
        private String operaUid; 
        private Integer pageSize; 
        private Long typeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneSystemModelRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.modelName = request.modelName;
            this.modelStatus = request.modelStatus;
            this.modelType = request.modelType;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.typeId = request.typeId;
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
         * ModelStatus.
         */
        public Builder modelStatus(Integer modelStatus) {
            this.putBodyParameter("ModelStatus", modelStatus);
            this.modelStatus = modelStatus;
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

        /**
         * TypeId.
         */
        public Builder typeId(Long typeId) {
            this.putBodyParameter("TypeId", typeId);
            this.typeId = typeId;
            return this;
        }

        @Override
        public DescribeSceneSystemModelRequest build() {
            return new DescribeSceneSystemModelRequest(this);
        } 

    } 

}
