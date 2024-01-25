// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenarioListRequest} extends {@link RequestModel}
 *
 * <p>GetScenarioListRequest</p>
 */
public class GetScenarioListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageNo")
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ScenarioName")
    private String scenarioName;

    @Query
    @NameInMap("SceneSelectLabel")
    private String sceneSelectLabel;

    private GetScenarioListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.scenarioName = builder.scenarioName;
        this.sceneSelectLabel = builder.sceneSelectLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenarioListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scenarioName
     */
    public String getScenarioName() {
        return this.scenarioName;
    }

    /**
     * @return sceneSelectLabel
     */
    public String getSceneSelectLabel() {
        return this.sceneSelectLabel;
    }

    public static final class Builder extends Request.Builder<GetScenarioListRequest, Builder> {
        private String operaUid; 
        private Long pageNo; 
        private Long pageSize; 
        private String scenarioName; 
        private String sceneSelectLabel; 

        private Builder() {
            super();
        } 

        private Builder(GetScenarioListRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.scenarioName = request.scenarioName;
            this.sceneSelectLabel = request.sceneSelectLabel;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ScenarioName.
         */
        public Builder scenarioName(String scenarioName) {
            this.putQueryParameter("ScenarioName", scenarioName);
            this.scenarioName = scenarioName;
            return this;
        }

        /**
         * SceneSelectLabel.
         */
        public Builder sceneSelectLabel(String sceneSelectLabel) {
            this.putQueryParameter("SceneSelectLabel", sceneSelectLabel);
            this.sceneSelectLabel = sceneSelectLabel;
            return this;
        }

        @Override
        public GetScenarioListRequest build() {
            return new GetScenarioListRequest(this);
        } 

    } 

}
