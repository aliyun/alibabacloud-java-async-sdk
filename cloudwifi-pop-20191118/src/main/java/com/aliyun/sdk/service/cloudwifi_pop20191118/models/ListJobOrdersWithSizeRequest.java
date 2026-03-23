// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link ListJobOrdersWithSizeRequest} extends {@link RequestModel}
 *
 * <p>ListJobOrdersWithSizeRequest</p>
 */
public class ListJobOrdersWithSizeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangingType")
    private String changingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSystem")
    private String clientSystem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUniqueId")
    private String clientUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cursor")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Handler")
    private String handler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderStatus")
    private String orderStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private ListJobOrdersWithSizeRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.changingType = builder.changingType;
        this.clientSystem = builder.clientSystem;
        this.clientUniqueId = builder.clientUniqueId;
        this.cursor = builder.cursor;
        this.endTime = builder.endTime;
        this.handler = builder.handler;
        this.id = builder.id;
        this.orderStatus = builder.orderStatus;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobOrdersWithSizeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return changingType
     */
    public String getChangingType() {
        return this.changingType;
    }

    /**
     * @return clientSystem
     */
    public String getClientSystem() {
        return this.clientSystem;
    }

    /**
     * @return clientUniqueId
     */
    public String getClientUniqueId() {
        return this.clientUniqueId;
    }

    /**
     * @return cursor
     */
    public Long getCursor() {
        return this.cursor;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return handler
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<ListJobOrdersWithSizeRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String changingType; 
        private String clientSystem; 
        private String clientUniqueId; 
        private Long cursor; 
        private String endTime; 
        private String handler; 
        private String id; 
        private String orderStatus; 
        private Integer pageSize; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ListJobOrdersWithSizeRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.changingType = request.changingType;
            this.clientSystem = request.clientSystem;
            this.clientUniqueId = request.clientUniqueId;
            this.cursor = request.cursor;
            this.endTime = request.endTime;
            this.handler = request.handler;
            this.id = request.id;
            this.orderStatus = request.orderStatus;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.startTime = request.startTime;
            this.status = request.status;
            this.title = request.title;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ChangingType.
         */
        public Builder changingType(String changingType) {
            this.putQueryParameter("ChangingType", changingType);
            this.changingType = changingType;
            return this;
        }

        /**
         * ClientSystem.
         */
        public Builder clientSystem(String clientSystem) {
            this.putQueryParameter("ClientSystem", clientSystem);
            this.clientSystem = clientSystem;
            return this;
        }

        /**
         * ClientUniqueId.
         */
        public Builder clientUniqueId(String clientUniqueId) {
            this.putQueryParameter("ClientUniqueId", clientUniqueId);
            this.clientUniqueId = clientUniqueId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cursor(Long cursor) {
            this.putQueryParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Handler.
         */
        public Builder handler(String handler) {
            this.putQueryParameter("Handler", handler);
            this.handler = handler;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * OrderStatus.
         */
        public Builder orderStatus(String orderStatus) {
            this.putQueryParameter("OrderStatus", orderStatus);
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public ListJobOrdersWithSizeRequest build() {
            return new ListJobOrdersWithSizeRequest(this);
        } 

    } 

}
