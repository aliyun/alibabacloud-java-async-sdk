// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScenesRequest} extends {@link RequestModel}
 *
 * <p>DescribeScenesRequest</p>
 */
public class DescribeScenesRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("FlowName")
    private String flowName;

    @Body
    @NameInMap("ModelId")
    private Long modelId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SceneName")
    private String sceneName;

    @Body
    @NameInMap("SceneStatus")
    private Integer sceneStatus;

    private DescribeScenesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.flowName = builder.flowName;
        this.modelId = builder.modelId;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.sceneName = builder.sceneName;
        this.sceneStatus = builder.sceneStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScenesRequest create() {
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
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
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

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return sceneStatus
     */
    public Integer getSceneStatus() {
        return this.sceneStatus;
    }

    public static final class Builder extends Request.Builder<DescribeScenesRequest, Builder> {
        private Integer currentPage; 
        private String flowName; 
        private Long modelId; 
        private String operaUid; 
        private Integer pageSize; 
        private String sceneName; 
        private Integer sceneStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScenesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.flowName = request.flowName;
            this.modelId = request.modelId;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.sceneName = request.sceneName;
            this.sceneStatus = request.sceneStatus;
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
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
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
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.putBodyParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * SceneStatus.
         */
        public Builder sceneStatus(Integer sceneStatus) {
            this.putBodyParameter("SceneStatus", sceneStatus);
            this.sceneStatus = sceneStatus;
            return this;
        }

        @Override
        public DescribeScenesRequest build() {
            return new DescribeScenesRequest(this);
        } 

    } 

}
