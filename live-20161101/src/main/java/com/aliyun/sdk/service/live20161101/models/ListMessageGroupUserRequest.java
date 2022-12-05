// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageGroupUserRequest} extends {@link RequestModel}
 *
 * <p>ListMessageGroupUserRequest</p>
 */
public class ListMessageGroupUserRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("PageNum")
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SortType")
    private Integer sortType;

    private ListMessageGroupUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageGroupUserRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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

    public static final class Builder extends Request.Builder<ListMessageGroupUserRequest, Builder> {
        private String appId; 
        private String groupId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListMessageGroupUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
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
        public ListMessageGroupUserRequest build() {
            return new ListMessageGroupUserRequest(this);
        } 

    } 

}
