// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMessageAppRequest} extends {@link RequestModel}
 *
 * <p>QueryMessageAppRequest</p>
 */
public class QueryMessageAppRequest extends Request {
    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("PageNum")
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SortType")
    private Integer sortType;

    private QueryMessageAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return sortType
     */
    public Integer getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<QueryMessageAppRequest, Builder> {
        private String appId; 
        private String appName; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer sortType; 

        private Builder() {
            super();
        } 

        private Builder(QueryMessageAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortType = request.sortType;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * SortType.
         */
        public Builder sortType(Integer sortType) {
            this.putBodyParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public QueryMessageAppRequest build() {
            return new QueryMessageAppRequest(this);
        } 

    } 

}
