// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeInstanceAntiBruteForceRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAntiBruteForceRulesResponseBody</p>
 */
public class DescribeInstanceAntiBruteForceRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private DescribeInstanceAntiBruteForceRulesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAntiBruteForceRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<Rules> rules; 

        private Builder() {
        } 

        private Builder(DescribeInstanceAntiBruteForceRulesResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.rules = model.rules;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>97286A-4A6B-4A4-95FA-EC7E3E2451</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array consisting of the servers to which a defense rule is applied.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        public DescribeInstanceAntiBruteForceRulesResponseBody build() {
            return new DescribeInstanceAntiBruteForceRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAntiBruteForceRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAntiBruteForceRulesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of servers returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of servers returned.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAntiBruteForceRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAntiBruteForceRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Rules(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.id = model.id;
                this.name = model.name;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The ID of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>215779601</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>TestRule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The UUID of the server to which the defense rule is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
