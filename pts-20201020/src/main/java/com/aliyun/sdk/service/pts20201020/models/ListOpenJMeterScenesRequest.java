// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpenJMeterScenesRequest} extends {@link RequestModel}
 *
 * <p>ListOpenJMeterScenesRequest</p>
 */
public class ListOpenJMeterScenesRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("SceneId")
    private String sceneId;

    @Query
    @NameInMap("SceneName")
    private String sceneName;

    private ListOpenJMeterScenesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sceneId = builder.sceneId;
        this.sceneName = builder.sceneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenJMeterScenesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    public static final class Builder extends Request.Builder<ListOpenJMeterScenesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sceneId; 
        private String sceneName; 

        private Builder() {
            super();
        } 

        private Builder(ListOpenJMeterScenesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sceneId = request.sceneId;
            this.sceneName = request.sceneName;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 场景id
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * 场景名
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        @Override
        public ListOpenJMeterScenesRequest build() {
            return new ListOpenJMeterScenesRequest(this);
        } 

    } 

}
