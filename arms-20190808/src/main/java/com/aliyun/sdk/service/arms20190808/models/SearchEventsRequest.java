// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link SearchEventsRequest} extends {@link RequestModel}
 *
 * <p>SearchEventsRequest</p>
 */
public class SearchEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertId")
    private Long alertId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertType")
    private Integer alertType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsTrigger")
    private Integer isTrigger;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private SearchEventsRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.alertType = builder.alertType;
        this.appType = builder.appType;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.isTrigger = builder.isTrigger;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    /**
     * @return alertType
     */
    public Integer getAlertType() {
        return this.alertType;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
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
     * @return isTrigger
     */
    public Integer getIsTrigger() {
        return this.isTrigger;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<SearchEventsRequest, Builder> {
        private Long alertId; 
        private Integer alertType; 
        private String appType; 
        private Integer currentPage; 
        private Long endTime; 
        private Integer isTrigger; 
        private Integer pageSize; 
        private String pid; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(SearchEventsRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.alertType = request.alertType;
            this.appType = request.appType;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.isTrigger = request.isTrigger;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the alert rule. You can call the SearchAlertRules operation and view the <code>Id</code> parameter in the response. For more information, see <a href="https://help.aliyun.com/document_detail/175825.html">SearchAlertRules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * <p>The type of the alert rule. Valid values:</p>
         * <ul>
         * <li><code>1</code>: custom alert rules to monitor drill-down data sets</li>
         * <li><code>3</code>: custom alert rules to monitor tiled data sets</li>
         * <li><code>4</code>: alert rules to monitor the frontend, including the default frontend alert rules</li>
         * <li><code>5</code>: alert rules to monitor applications, including the default application alert rules</li>
         * <li><code>6</code>: the default frontend alert rules</li>
         * <li><code>7</code>: the default application alert rules</li>
         * <li><code>8</code>: Tracing Analysis alert rules</li>
         * <li><code>101</code>: Prometheus alert rules</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder alertType(Integer alertType) {
            this.putQueryParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * <p>The type of the application that is associated with the alert rule. Valid values:</p>
         * <ul>
         * <li><code>TRACE</code>: application monitoring</li>
         * <li><code>RETCODE</code>: frontend monitoring</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <code>1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify a UNIX timestamp of the LONG data type, in milliseconds. The default value is the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1595568970000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether the alert event is triggered. If you do not set this parameter, all alert events are queried. Valid values:</p>
         * <ul>
         * <li><code>1</code>: The event is triggered.</li>
         * <li><code>0</code>: The event is not triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isTrigger(Integer isTrigger) {
            this.putQueryParameter("IsTrigger", isTrigger);
            this.isTrigger = isTrigger;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <code>10</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The process identifier (PID) of the application that is associated with the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>atc889zkcf@d8deedfa9bf****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify a UNIX timestamp of the LONG data type, in milliseconds. The default value is 10 minutes before the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1595565300000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public SearchEventsRequest build() {
            return new SearchEventsRequest(this);
        } 

    } 

}
