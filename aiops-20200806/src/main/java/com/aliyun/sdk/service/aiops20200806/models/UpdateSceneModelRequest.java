// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSceneModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateSceneModelRequest</p>
 */
public class UpdateSceneModelRequest extends Request {
    @Body
    @NameInMap("FcFunctionName")
    private String fcFunctionName;

    @Body
    @NameInMap("FcHandler")
    private String fcHandler;

    @Body
    @NameInMap("FcInitializer")
    private String fcInitializer;

    @Body
    @NameInMap("FcRegionNo")
    private String fcRegionNo;

    @Body
    @NameInMap("FcServiceName")
    private String fcServiceName;

    @Body
    @NameInMap("ModelDesc")
    private String modelDesc;

    @Body
    @NameInMap("ModelId")
    private Long modelId;

    @Body
    @NameInMap("ModelLanguage")
    private Integer modelLanguage;

    @Body
    @NameInMap("ModelMemo")
    private String modelMemo;

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
    @NameInMap("RootCauseDesc")
    private String rootCauseDesc;

    @Body
    @NameInMap("RootCauseSolution")
    private String rootCauseSolution;

    private UpdateSceneModelRequest(Builder builder) {
        super(builder);
        this.fcFunctionName = builder.fcFunctionName;
        this.fcHandler = builder.fcHandler;
        this.fcInitializer = builder.fcInitializer;
        this.fcRegionNo = builder.fcRegionNo;
        this.fcServiceName = builder.fcServiceName;
        this.modelDesc = builder.modelDesc;
        this.modelId = builder.modelId;
        this.modelLanguage = builder.modelLanguage;
        this.modelMemo = builder.modelMemo;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.operaUid = builder.operaUid;
        this.rootCauseDesc = builder.rootCauseDesc;
        this.rootCauseSolution = builder.rootCauseSolution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSceneModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fcFunctionName
     */
    public String getFcFunctionName() {
        return this.fcFunctionName;
    }

    /**
     * @return fcHandler
     */
    public String getFcHandler() {
        return this.fcHandler;
    }

    /**
     * @return fcInitializer
     */
    public String getFcInitializer() {
        return this.fcInitializer;
    }

    /**
     * @return fcRegionNo
     */
    public String getFcRegionNo() {
        return this.fcRegionNo;
    }

    /**
     * @return fcServiceName
     */
    public String getFcServiceName() {
        return this.fcServiceName;
    }

    /**
     * @return modelDesc
     */
    public String getModelDesc() {
        return this.modelDesc;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return modelLanguage
     */
    public Integer getModelLanguage() {
        return this.modelLanguage;
    }

    /**
     * @return modelMemo
     */
    public String getModelMemo() {
        return this.modelMemo;
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
     * @return rootCauseDesc
     */
    public String getRootCauseDesc() {
        return this.rootCauseDesc;
    }

    /**
     * @return rootCauseSolution
     */
    public String getRootCauseSolution() {
        return this.rootCauseSolution;
    }

    public static final class Builder extends Request.Builder<UpdateSceneModelRequest, Builder> {
        private String fcFunctionName; 
        private String fcHandler; 
        private String fcInitializer; 
        private String fcRegionNo; 
        private String fcServiceName; 
        private String modelDesc; 
        private Long modelId; 
        private Integer modelLanguage; 
        private String modelMemo; 
        private String modelName; 
        private Integer modelType; 
        private String operaUid; 
        private String rootCauseDesc; 
        private String rootCauseSolution; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSceneModelRequest request) {
            super(request);
            this.fcFunctionName = request.fcFunctionName;
            this.fcHandler = request.fcHandler;
            this.fcInitializer = request.fcInitializer;
            this.fcRegionNo = request.fcRegionNo;
            this.fcServiceName = request.fcServiceName;
            this.modelDesc = request.modelDesc;
            this.modelId = request.modelId;
            this.modelLanguage = request.modelLanguage;
            this.modelMemo = request.modelMemo;
            this.modelName = request.modelName;
            this.modelType = request.modelType;
            this.operaUid = request.operaUid;
            this.rootCauseDesc = request.rootCauseDesc;
            this.rootCauseSolution = request.rootCauseSolution;
        } 

        /**
         * FcFunctionName.
         */
        public Builder fcFunctionName(String fcFunctionName) {
            this.putBodyParameter("FcFunctionName", fcFunctionName);
            this.fcFunctionName = fcFunctionName;
            return this;
        }

        /**
         * FcHandler.
         */
        public Builder fcHandler(String fcHandler) {
            this.putBodyParameter("FcHandler", fcHandler);
            this.fcHandler = fcHandler;
            return this;
        }

        /**
         * FcInitializer.
         */
        public Builder fcInitializer(String fcInitializer) {
            this.putBodyParameter("FcInitializer", fcInitializer);
            this.fcInitializer = fcInitializer;
            return this;
        }

        /**
         * FcRegionNo.
         */
        public Builder fcRegionNo(String fcRegionNo) {
            this.putBodyParameter("FcRegionNo", fcRegionNo);
            this.fcRegionNo = fcRegionNo;
            return this;
        }

        /**
         * FcServiceName.
         */
        public Builder fcServiceName(String fcServiceName) {
            this.putBodyParameter("FcServiceName", fcServiceName);
            this.fcServiceName = fcServiceName;
            return this;
        }

        /**
         * ModelDesc.
         */
        public Builder modelDesc(String modelDesc) {
            this.putBodyParameter("ModelDesc", modelDesc);
            this.modelDesc = modelDesc;
            return this;
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
         * ModelLanguage.
         */
        public Builder modelLanguage(Integer modelLanguage) {
            this.putBodyParameter("ModelLanguage", modelLanguage);
            this.modelLanguage = modelLanguage;
            return this;
        }

        /**
         * ModelMemo.
         */
        public Builder modelMemo(String modelMemo) {
            this.putBodyParameter("ModelMemo", modelMemo);
            this.modelMemo = modelMemo;
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
         * RootCauseDesc.
         */
        public Builder rootCauseDesc(String rootCauseDesc) {
            this.putBodyParameter("RootCauseDesc", rootCauseDesc);
            this.rootCauseDesc = rootCauseDesc;
            return this;
        }

        /**
         * RootCauseSolution.
         */
        public Builder rootCauseSolution(String rootCauseSolution) {
            this.putBodyParameter("RootCauseSolution", rootCauseSolution);
            this.rootCauseSolution = rootCauseSolution;
            return this;
        }

        @Override
        public UpdateSceneModelRequest build() {
            return new UpdateSceneModelRequest(this);
        } 

    } 

}
