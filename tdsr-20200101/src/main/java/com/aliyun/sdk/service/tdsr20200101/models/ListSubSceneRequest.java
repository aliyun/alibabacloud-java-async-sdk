// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubSceneRequest} extends {@link RequestModel}
 *
 * <p>ListSubSceneRequest</p>
 */
public class ListSubSceneRequest extends Request {
    @Query
    @NameInMap("PageNum")
    @Validation(required = true, minimum = 1)
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, minimum = 1)
    private Long pageSize;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("ShowLayoutData")
    private Boolean showLayoutData;

    private ListSubSceneRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sceneId = builder.sceneId;
        this.showLayoutData = builder.showLayoutData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return showLayoutData
     */
    public Boolean getShowLayoutData() {
        return this.showLayoutData;
    }

    public static final class Builder extends Request.Builder<ListSubSceneRequest, Builder> {
        private Long pageNum; 
        private Long pageSize; 
        private String sceneId; 
        private Boolean showLayoutData; 

        private Builder() {
            super();
        } 

        private Builder(ListSubSceneRequest response) {
            super(response);
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.sceneId = response.sceneId;
            this.showLayoutData = response.showLayoutData;
        } 

        /**
         * 页码
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * 页长
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 场景ID
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * ShowLayoutData.
         */
        public Builder showLayoutData(Boolean showLayoutData) {
            this.putQueryParameter("ShowLayoutData", showLayoutData);
            this.showLayoutData = showLayoutData;
            return this;
        }

        @Override
        public ListSubSceneRequest build() {
            return new ListSubSceneRequest(this);
        } 

    } 

}
