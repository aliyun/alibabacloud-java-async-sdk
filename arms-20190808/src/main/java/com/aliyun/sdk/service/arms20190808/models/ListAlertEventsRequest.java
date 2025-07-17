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
 * {@link ListAlertEventsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertEventsRequest</p>
 */
public class ListAlertEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertName")
    private String alertName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchingConditions")
    private String matchingConditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowNotificationPolicies")
    private Boolean showNotificationPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListAlertEventsRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.endTime = builder.endTime;
        this.matchingConditions = builder.matchingConditions;
        this.page = builder.page;
        this.showNotificationPolicies = builder.showNotificationPolicies;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return matchingConditions
     */
    public String getMatchingConditions() {
        return this.matchingConditions;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return showNotificationPolicies
     */
    public Boolean getShowNotificationPolicies() {
        return this.showNotificationPolicies;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
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

    public static final class Builder extends Request.Builder<ListAlertEventsRequest, Builder> {
        private String alertName; 
        private String endTime; 
        private String matchingConditions; 
        private Long page; 
        private Boolean showNotificationPolicies; 
        private Long size; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertEventsRequest request) {
            super(request);
            this.alertName = request.alertName;
            this.endTime = request.endTime;
            this.matchingConditions = request.matchingConditions;
            this.page = request.page;
            this.showNotificationPolicies = request.showNotificationPolicies;
            this.size = request.size;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * <p>The name of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Test-triggered alert</p>
         */
        public Builder alertName(String alertName) {
            this.putQueryParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * <p>The end time of the alert events that you want to query. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-22 23:59:59</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of matching conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>[         {           &quot;value&quot;: &quot;ARMS_NOTIFICATION&quot;,           &quot;key&quot;: &quot;clustername&quot;,           &quot;operator&quot;: &quot;eq&quot;         }       ]     },{       &quot;matchingConditions&quot;: [         {           &quot;value&quot;: &quot;test&quot;,           &quot;key&quot;: &quot;alertname&quot;,           &quot;operator&quot;: &quot;eq&quot;         }       ]</p>
         */
        public Builder matchingConditions(String matchingConditions) {
            this.putQueryParameter("MatchingConditions", matchingConditions);
            this.matchingConditions = matchingConditions;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>Specifies whether to show the associated notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder showNotificationPolicies(Boolean showNotificationPolicies) {
            this.putQueryParameter("ShowNotificationPolicies", showNotificationPolicies);
            this.showNotificationPolicies = showNotificationPolicies;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The start time of the alert events that you want to query. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-19 00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the alert events. Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>Silenced</li>
         * <li>Resolved</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAlertEventsRequest build() {
            return new ListAlertEventsRequest(this);
        } 

    } 

}
