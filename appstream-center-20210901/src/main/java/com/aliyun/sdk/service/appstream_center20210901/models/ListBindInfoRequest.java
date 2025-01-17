// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListBindInfoRequest} extends {@link RequestModel}
 *
 * <p>ListBindInfoRequest</p>
 */
public class ListBindInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppIdList")
    private java.util.List<String> appIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupIdList")
    private java.util.List<String> appInstanceGroupIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceIdList")
    private java.util.List<String> appInstanceIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIdList")
    private java.util.List<String> userIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WyIdList")
    private java.util.List<String> wyIdList;

    private ListBindInfoRequest(Builder builder) {
        super(builder);
        this.appIdList = builder.appIdList;
        this.appInstanceGroupIdList = builder.appInstanceGroupIdList;
        this.appInstanceIdList = builder.appInstanceIdList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.userIdList = builder.userIdList;
        this.wyIdList = builder.wyIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIdList
     */
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    /**
     * @return appInstanceGroupIdList
     */
    public java.util.List<String> getAppInstanceGroupIdList() {
        return this.appInstanceGroupIdList;
    }

    /**
     * @return appInstanceIdList
     */
    public java.util.List<String> getAppInstanceIdList() {
        return this.appInstanceIdList;
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
     * @return userIdList
     */
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    /**
     * @return wyIdList
     */
    public java.util.List<String> getWyIdList() {
        return this.wyIdList;
    }

    public static final class Builder extends Request.Builder<ListBindInfoRequest, Builder> {
        private java.util.List<String> appIdList; 
        private java.util.List<String> appInstanceGroupIdList; 
        private java.util.List<String> appInstanceIdList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> userIdList; 
        private java.util.List<String> wyIdList; 

        private Builder() {
            super();
        } 

        private Builder(ListBindInfoRequest request) {
            super(request);
            this.appIdList = request.appIdList;
            this.appInstanceGroupIdList = request.appInstanceGroupIdList;
            this.appInstanceIdList = request.appInstanceIdList;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.userIdList = request.userIdList;
            this.wyIdList = request.wyIdList;
        } 

        /**
         * AppIdList.
         */
        public Builder appIdList(java.util.List<String> appIdList) {
            this.putBodyParameter("AppIdList", appIdList);
            this.appIdList = appIdList;
            return this;
        }

        /**
         * AppInstanceGroupIdList.
         */
        public Builder appInstanceGroupIdList(java.util.List<String> appInstanceGroupIdList) {
            this.putBodyParameter("AppInstanceGroupIdList", appInstanceGroupIdList);
            this.appInstanceGroupIdList = appInstanceGroupIdList;
            return this;
        }

        /**
         * AppInstanceIdList.
         */
        public Builder appInstanceIdList(java.util.List<String> appInstanceIdList) {
            this.putBodyParameter("AppInstanceIdList", appInstanceIdList);
            this.appInstanceIdList = appInstanceIdList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * UserIdList.
         */
        public Builder userIdList(java.util.List<String> userIdList) {
            this.putBodyParameter("UserIdList", userIdList);
            this.userIdList = userIdList;
            return this;
        }

        /**
         * WyIdList.
         */
        public Builder wyIdList(java.util.List<String> wyIdList) {
            this.putBodyParameter("WyIdList", wyIdList);
            this.wyIdList = wyIdList;
            return this;
        }

        @Override
        public ListBindInfoRequest build() {
            return new ListBindInfoRequest(this);
        } 

    } 

}
