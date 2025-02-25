// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuickQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuickQueryResponseBody</p>
 */
public class ListQuickQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListQuickQueryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuickQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQuickQueryResponseBody build() {
            return new ListQuickQueryResponseBody(this);
        } 

    } 

    public static class QuickQueryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private QuickQueryList(Builder builder) {
            this.displayName = builder.displayName;
            this.query = builder.query;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuickQueryList create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private String displayName; 
            private String query; 
            private String searchName; 

            /**
             * The alias of the saved search.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The query statement corresponding to the saved search.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * The name of the saved search.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public QuickQueryList build() {
                return new QuickQueryList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("QuickQueryList")
        private java.util.List < QuickQueryList> quickQueryList;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.count = builder.count;
            this.quickQueryList = builder.quickQueryList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return quickQueryList
         */
        public java.util.List < QuickQueryList> getQuickQueryList() {
            return this.quickQueryList;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List < QuickQueryList> quickQueryList; 
            private Integer total; 

            /**
             * The number of saved searches per page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The saved search.
             */
            public Builder quickQueryList(java.util.List < QuickQueryList> quickQueryList) {
                this.quickQueryList = quickQueryList;
                return this;
            }

            /**
             * The total number of saved searches that meet the query conditions.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
