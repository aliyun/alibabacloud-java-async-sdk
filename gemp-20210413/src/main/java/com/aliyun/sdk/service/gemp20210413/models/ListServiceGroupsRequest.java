// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceGroupsRequest</p>
 */
public class ListServiceGroupsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("isScheduled")
    private Boolean isScheduled;

    @Body
    @NameInMap("orderByScheduleStatus")
    private Boolean orderByScheduleStatus;

    @Body
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("pageSize")
    private Long pageSize;

    @Body
    @NameInMap("queryName")
    private String queryName;

    @Body
    @NameInMap("queryType")
    private String queryType;

    @Body
    @NameInMap("userId")
    private Long userId;

    private ListServiceGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.isScheduled = builder.isScheduled;
        this.orderByScheduleStatus = builder.orderByScheduleStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryName = builder.queryName;
        this.queryType = builder.queryType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return isScheduled
     */
    public Boolean getIsScheduled() {
        return this.isScheduled;
    }

    /**
     * @return orderByScheduleStatus
     */
    public Boolean getOrderByScheduleStatus() {
        return this.orderByScheduleStatus;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryName
     */
    public String getQueryName() {
        return this.queryName;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListServiceGroupsRequest, Builder> {
        private String clientToken; 
        private Boolean isScheduled; 
        private Boolean orderByScheduleStatus; 
        private Long pageNumber; 
        private Long pageSize; 
        private String queryName; 
        private String queryType; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceGroupsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.isScheduled = response.isScheduled;
            this.orderByScheduleStatus = response.orderByScheduleStatus;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.queryName = response.queryName;
            this.queryType = response.queryType;
            this.userId = response.userId;
        } 

        /**
         * 幂等号
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 是否已经排班
         */
        public Builder isScheduled(Boolean isScheduled) {
            this.putBodyParameter("isScheduled", isScheduled);
            this.isScheduled = isScheduled;
            return this;
        }

        /**
         * 是否根据排班状态排序
         */
        public Builder orderByScheduleStatus(Boolean orderByScheduleStatus) {
            this.putBodyParameter("orderByScheduleStatus", orderByScheduleStatus);
            this.orderByScheduleStatus = orderByScheduleStatus;
            return this;
        }

        /**
         * 当前页
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页大小
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 搜索名称
         */
        public Builder queryName(String queryName) {
            this.putBodyParameter("queryName", queryName);
            this.queryName = queryName;
            return this;
        }

        /**
         * 搜索类型。USER用户 SERVICEGROUP服务组
         */
        public Builder queryType(String queryType) {
            this.putBodyParameter("queryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * 用户ID
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListServiceGroupsRequest build() {
            return new ListServiceGroupsRequest(this);
        } 

    } 

}
