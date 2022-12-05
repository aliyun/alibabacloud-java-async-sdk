// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageRequest} extends {@link RequestModel}
 *
 * <p>ListMessageRequest</p>
 */
public class ListMessageRequest extends Request {
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
    @Validation(required = true)
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("SortType")
    private Integer sortType;

    @Body
    @NameInMap("Type")
    private Integer type;

    private ListMessageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortType = builder.sortType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageRequest create() {
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

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListMessageRequest, Builder> {
        private String appId; 
        private String groupId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer sortType; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(ListMessageRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortType = request.sortType;
            this.type = request.type;
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

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListMessageRequest build() {
            return new ListMessageRequest(this);
        } 

    } 

}
