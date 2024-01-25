// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSceneListRequest} extends {@link RequestModel}
 *
 * <p>GetSceneListRequest</p>
 */
public class GetSceneListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PageTotal")
    private Integer pageTotal;

    @Query
    @NameInMap("SceneType")
    private String sceneType;

    @Query
    @NameInMap("SearchName")
    private String searchName;

    @Query
    @NameInMap("SearchValue")
    private String searchValue;

    @Query
    @NameInMap("Status")
    private Integer status;

    private GetSceneListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.pageTotal = builder.pageTotal;
        this.sceneType = builder.sceneType;
        this.searchName = builder.searchName;
        this.searchValue = builder.searchValue;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSceneListRequest create() {
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
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageTotal
     */
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    /**
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return searchValue
     */
    public String getSearchValue() {
        return this.searchValue;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetSceneListRequest, Builder> {
        private String operaUid; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer pageTotal; 
        private String sceneType; 
        private String searchName; 
        private String searchValue; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetSceneListRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.pageTotal = request.pageTotal;
            this.sceneType = request.sceneType;
            this.searchName = request.searchName;
            this.searchValue = request.searchValue;
            this.status = request.status;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * PageTotal.
         */
        public Builder pageTotal(Integer pageTotal) {
            this.putQueryParameter("PageTotal", pageTotal);
            this.pageTotal = pageTotal;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * SearchName.
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * SearchValue.
         */
        public Builder searchValue(String searchValue) {
            this.putQueryParameter("SearchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetSceneListRequest build() {
            return new GetSceneListRequest(this);
        } 

    } 

}
