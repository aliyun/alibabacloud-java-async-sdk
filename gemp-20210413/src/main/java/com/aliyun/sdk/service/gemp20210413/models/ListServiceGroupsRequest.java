// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceGroupsRequest</p>
 */
public class ListServiceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isScheduled")
    private Boolean isScheduled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderByScheduleStatus")
    private Boolean orderByScheduleStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queryName")
    private String queryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queryType")
    private String queryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private Long serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
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
        this.serviceId = builder.serviceId;
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
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
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
        private Long serviceId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceGroupsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.isScheduled = request.isScheduled;
            this.orderByScheduleStatus = request.orderByScheduleStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryName = request.queryName;
            this.queryType = request.queryType;
            this.serviceId = request.serviceId;
            this.userId = request.userId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * isScheduled.
         */
        public Builder isScheduled(Boolean isScheduled) {
            this.putBodyParameter("isScheduled", isScheduled);
            this.isScheduled = isScheduled;
            return this;
        }

        /**
         * orderByScheduleStatus.
         */
        public Builder orderByScheduleStatus(Boolean orderByScheduleStatus) {
            this.putBodyParameter("orderByScheduleStatus", orderByScheduleStatus);
            this.orderByScheduleStatus = orderByScheduleStatus;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * queryName.
         */
        public Builder queryName(String queryName) {
            this.putBodyParameter("queryName", queryName);
            this.queryName = queryName;
            return this;
        }

        /**
         * queryType.
         */
        public Builder queryType(String queryType) {
            this.putBodyParameter("queryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * userId.
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
