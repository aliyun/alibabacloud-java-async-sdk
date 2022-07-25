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

    @Query
    @NameInMap("SortField")
    private String sortField;

    private ListSubSceneRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sceneId = builder.sceneId;
        this.showLayoutData = builder.showLayoutData;
        this.sortField = builder.sortField;
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

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    public static final class Builder extends Request.Builder<ListSubSceneRequest, Builder> {
        private Long pageNum; 
        private Long pageSize; 
        private String sceneId; 
        private Boolean showLayoutData; 
        private String sortField; 

        private Builder() {
            super();
        } 

        private Builder(ListSubSceneRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sceneId = request.sceneId;
            this.showLayoutData = request.showLayoutData;
            this.sortField = request.sortField;
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

        /**
         * 排序字段，默认：NAME（名称），SEQUENCE（自定义排序）
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        @Override
        public ListSubSceneRequest build() {
            return new ListSubSceneRequest(this);
        } 

    } 

}
