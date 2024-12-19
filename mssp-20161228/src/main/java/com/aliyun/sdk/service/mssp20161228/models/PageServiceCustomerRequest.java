// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link PageServiceCustomerRequest} extends {@link RequestModel}
 *
 * <p>PageServiceCustomerRequest</p>
 */
public class PageServiceCustomerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthStatus")
    private Integer authStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CmAuthStatus")
    private Integer cmAuthStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MonitorAuthStatus")
    private Integer monitorAuthStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private PageServiceCustomerRequest(Builder builder) {
        super(builder);
        this.authStatus = builder.authStatus;
        this.cmAuthStatus = builder.cmAuthStatus;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.monitorAuthStatus = builder.monitorAuthStatus;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageServiceCustomerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authStatus
     */
    public Integer getAuthStatus() {
        return this.authStatus;
    }

    /**
     * @return cmAuthStatus
     */
    public Integer getCmAuthStatus() {
        return this.cmAuthStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return monitorAuthStatus
     */
    public Integer getMonitorAuthStatus() {
        return this.monitorAuthStatus;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<PageServiceCustomerRequest, Builder> {
        private Integer authStatus; 
        private Integer cmAuthStatus; 
        private Integer currentPage; 
        private Long endTime; 
        private Integer monitorAuthStatus; 
        private Integer pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(PageServiceCustomerRequest request) {
            super(request);
            this.authStatus = request.authStatus;
            this.cmAuthStatus = request.cmAuthStatus;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.monitorAuthStatus = request.monitorAuthStatus;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Authorization status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authStatus(Integer authStatus) {
            this.putBodyParameter("AuthStatus", authStatus);
            this.authStatus = authStatus;
            return this;
        }

        /**
         * <p>Cloud Monitoring - Alert authorization status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cmAuthStatus(Integer cmAuthStatus) {
            this.putBodyParameter("CmAuthStatus", cmAuthStatus);
            this.cmAuthStatus = cmAuthStatus;
            return this;
        }

        /**
         * <p>The page number of the query result, default is 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>End time. The format is a Unix timestamp, which is the number of milliseconds since January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1710641101123</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Cloud Security - Alert authorization status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder monitorAuthStatus(Integer monitorAuthStatus) {
            this.putBodyParameter("MonitorAuthStatus", monitorAuthStatus);
            this.monitorAuthStatus = monitorAuthStatus;
            return this;
        }

        /**
         * <p>Number of records per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Start time. The format is a Unix timestamp, which is the number of milliseconds since January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1710641101000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public PageServiceCustomerRequest build() {
            return new PageServiceCustomerRequest(this);
        } 

    } 

}
