// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListEventsRequest} extends {@link RequestModel}
 *
 * <p>ListEventsRequest</p>
 */
public class ListEventsRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxAttendees")
    private Integer maxAttendees;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SeriesMasterId")
    private String seriesMasterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowDeleted")
    private Boolean showDeleted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncToken")
    private String syncToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeMax")
    private String timeMax;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeMin")
    private String timeMin;

    private ListEventsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.calendarId = builder.calendarId;
        this.maxAttendees = builder.maxAttendees;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.seriesMasterId = builder.seriesMasterId;
        this.showDeleted = builder.showDeleted;
        this.syncToken = builder.syncToken;
        this.timeMax = builder.timeMax;
        this.timeMin = builder.timeMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return calendarId
     */
    public String getCalendarId() {
        return this.calendarId;
    }

    /**
     * @return maxAttendees
     */
    public Integer getMaxAttendees() {
        return this.maxAttendees;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return seriesMasterId
     */
    public String getSeriesMasterId() {
        return this.seriesMasterId;
    }

    /**
     * @return showDeleted
     */
    public Boolean getShowDeleted() {
        return this.showDeleted;
    }

    /**
     * @return syncToken
     */
    public String getSyncToken() {
        return this.syncToken;
    }

    /**
     * @return timeMax
     */
    public String getTimeMax() {
        return this.timeMax;
    }

    /**
     * @return timeMin
     */
    public String getTimeMin() {
        return this.timeMin;
    }

    public static final class Builder extends Request.Builder<ListEventsRequest, Builder> {
        private AccountContext accountContext; 
        private String calendarId; 
        private Integer maxAttendees; 
        private Integer maxResults; 
        private String nextToken; 
        private String seriesMasterId; 
        private Boolean showDeleted; 
        private String syncToken; 
        private String timeMax; 
        private String timeMin; 

        private Builder() {
            super();
        } 

        private Builder(ListEventsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.calendarId = request.calendarId;
            this.maxAttendees = request.maxAttendees;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.seriesMasterId = request.seriesMasterId;
            this.showDeleted = request.showDeleted;
            this.syncToken = request.syncToken;
            this.timeMax = request.timeMax;
            this.timeMin = request.timeMin;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder calendarId(String calendarId) {
            this.putBodyParameter("CalendarId", calendarId);
            this.calendarId = calendarId;
            return this;
        }

        /**
         * MaxAttendees.
         */
        public Builder maxAttendees(Integer maxAttendees) {
            this.putBodyParameter("MaxAttendees", maxAttendees);
            this.maxAttendees = maxAttendees;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SeriesMasterId.
         */
        public Builder seriesMasterId(String seriesMasterId) {
            this.putBodyParameter("SeriesMasterId", seriesMasterId);
            this.seriesMasterId = seriesMasterId;
            return this;
        }

        /**
         * ShowDeleted.
         */
        public Builder showDeleted(Boolean showDeleted) {
            this.putBodyParameter("ShowDeleted", showDeleted);
            this.showDeleted = showDeleted;
            return this;
        }

        /**
         * SyncToken.
         */
        public Builder syncToken(String syncToken) {
            this.putBodyParameter("SyncToken", syncToken);
            this.syncToken = syncToken;
            return this;
        }

        /**
         * TimeMax.
         */
        public Builder timeMax(String timeMax) {
            this.putBodyParameter("TimeMax", timeMax);
            this.timeMax = timeMax;
            return this;
        }

        /**
         * TimeMin.
         */
        public Builder timeMin(String timeMin) {
            this.putBodyParameter("TimeMin", timeMin);
            this.timeMin = timeMin;
            return this;
        }

        @Override
        public ListEventsRequest build() {
            return new ListEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListEventsRequest} extends {@link TeaModel}
     *
     * <p>ListEventsRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>208579</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
}
