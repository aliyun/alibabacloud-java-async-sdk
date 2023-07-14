// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertEventsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertEventsRequest</p>
 */
public class ListAlertEventsRequest extends Request {
    @Query
    @NameInMap("AlertName")
    private String alertName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MatchingConditions")
    private String matchingConditions;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    private ListAlertEventsRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.endTime = builder.endTime;
        this.matchingConditions = builder.matchingConditions;
        this.page = builder.page;
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
            this.size = request.size;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * The name of the alert.
         */
        public Builder alertName(String alertName) {
            this.putQueryParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * The end time of the alert events that you want to query. Specify the time in the YYYY-MM-DD HH:mm:ss format.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The list of matching conditions.
         */
        public Builder matchingConditions(String matchingConditions) {
            this.putQueryParameter("MatchingConditions", matchingConditions);
            this.matchingConditions = matchingConditions;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * The start time of the alert events that you want to query. Specify the time in the YYYY-MM-DD HH:mm:ss format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the alert events. Valid values:
         * <p>
         * 
         * *   Active
         * *   Silenced
         * *   Resolved
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
