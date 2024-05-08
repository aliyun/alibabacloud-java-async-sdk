// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventsViewRequest} extends {@link RequestModel}
 *
 * <p>ListEventsViewRequest</p>
 */
public class ListEventsViewRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TimeMax")
    private String timeMax;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeMin")
    private String timeMin;

    private ListEventsViewRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.calendarId = builder.calendarId;
        this.maxAttendees = builder.maxAttendees;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.timeMax = builder.timeMax;
        this.timeMin = builder.timeMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventsViewRequest create() {
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

    public static final class Builder extends Request.Builder<ListEventsViewRequest, Builder> {
        private AccountContext accountContext; 
        private String calendarId; 
        private Integer maxAttendees; 
        private Integer maxResults; 
        private String nextToken; 
        private String timeMax; 
        private String timeMin; 

        private Builder() {
            super();
        } 

        private Builder(ListEventsViewRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.calendarId = request.calendarId;
            this.maxAttendees = request.maxAttendees;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
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
         * CalendarId.
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
        public ListEventsViewRequest build() {
            return new ListEventsViewRequest(this);
        } 

    } 

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
             * accountId.
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
