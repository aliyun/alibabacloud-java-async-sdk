// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindUserAvailbleResourcesRequest} extends {@link RequestModel}
 *
 * <p>FindUserAvailbleResourcesRequest</p>
 */
public class FindUserAvailbleResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bussinessCode")
    private String bussinessCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currPage")
    private Integer currPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private FindUserAvailbleResourcesRequest(Builder builder) {
        super(builder);
        this.bussinessCode = builder.bussinessCode;
        this.currPage = builder.currPage;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUserAvailbleResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bussinessCode
     */
    public String getBussinessCode() {
        return this.bussinessCode;
    }

    /**
     * @return currPage
     */
    public Integer getCurrPage() {
        return this.currPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<FindUserAvailbleResourcesRequest, Builder> {
        private String bussinessCode; 
        private Integer currPage; 
        private Integer pageSize; 
        private String resourceType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(FindUserAvailbleResourcesRequest request) {
            super(request);
            this.bussinessCode = request.bussinessCode;
            this.currPage = request.currPage;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.userId = request.userId;
        } 

        /**
         * bussinessCode.
         */
        public Builder bussinessCode(String bussinessCode) {
            this.putQueryParameter("bussinessCode", bussinessCode);
            this.bussinessCode = bussinessCode;
            return this;
        }

        /**
         * currPage.
         */
        public Builder currPage(Integer currPage) {
            this.putQueryParameter("currPage", currPage);
            this.currPage = currPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public FindUserAvailbleResourcesRequest build() {
            return new FindUserAvailbleResourcesRequest(this);
        } 

    } 

}
