// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppReleaseStageExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppReleaseStageExecutionsResponseBody</p>
 */
public class ListAppReleaseStageExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("pages")
    private Long pages;

    @com.aliyun.core.annotation.NameInMap("perPage")
    private Long perPage;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAppReleaseStageExecutionsResponseBody(Builder builder) {
        this.current = builder.current;
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.pages = builder.pages;
        this.perPage = builder.perPage;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppReleaseStageExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pages
     */
    public Long getPages() {
        return this.pages;
    }

    /**
     * @return perPage
     */
    public Long getPerPage() {
        return this.perPage;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long current; 
        private java.util.List < Data> data; 
        private String nextToken; 
        private Long pages; 
        private Long perPage; 
        private Long total; 

        /**
         * current.
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * pages.
         */
        public Builder pages(Long pages) {
            this.pages = pages;
            return this;
        }

        /**
         * perPage.
         */
        public Builder perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAppReleaseStageExecutionsResponseBody build() {
            return new ListAppReleaseStageExecutionsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("triggerMode")
        private String triggerMode;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.number = builder.number;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.triggerMode = builder.triggerMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return triggerMode
         */
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public static final class Builder {
            private String endTime; 
            private String number; 
            private String startTime; 
            private String state; 
            private String triggerMode; 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * triggerMode.
             */
            public Builder triggerMode(String triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
