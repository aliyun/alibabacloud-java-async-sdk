// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnUserSecDropByMinuteResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserSecDropByMinuteResponseBody</p>
 */
public class DescribeDcdnUserSecDropByMinuteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Len")
    private Integer len;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rows")
    private java.util.List<Rows> rows;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDcdnUserSecDropByMinuteResponseBody(Builder builder) {
        this.description = builder.description;
        this.len = builder.len;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rows = builder.rows;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserSecDropByMinuteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return len
     */
    public Integer getLen() {
        return this.len;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return rows
     */
    public java.util.List<Rows> getRows() {
        return this.rows;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String description; 
        private Integer len; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Rows> rows; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDcdnUserSecDropByMinuteResponseBody model) {
            this.description = model.description;
            this.len = model.len;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.rows = model.rows;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The description of HTTP responses.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder len(Integer len) {
            this.len = len;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8143fA8A-B2B2-4915-538D-546B538D25FA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array.</p>
         */
        public Builder rows(java.util.List<Rows> rows) {
            this.rows = rows;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5738</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBody build() {
            return new DescribeDcdnUserSecDropByMinuteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnUserSecDropByMinuteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserSecDropByMinuteResponseBody</p>
     */
    public static class Rows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Drops")
        private Integer drops;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SecFunc")
        private String secFunc;

        @com.aliyun.core.annotation.NameInMap("TmStr")
        private String tmStr;

        private Rows(Builder builder) {
            this.domain = builder.domain;
            this.drops = builder.drops;
            this.object = builder.object;
            this.ruleName = builder.ruleName;
            this.secFunc = builder.secFunc;
            this.tmStr = builder.tmStr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rows create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return drops
         */
        public Integer getDrops() {
            return this.drops;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return secFunc
         */
        public String getSecFunc() {
            return this.secFunc;
        }

        /**
         * @return tmStr
         */
        public String getTmStr() {
            return this.tmStr;
        }

        public static final class Builder {
            private String domain; 
            private Integer drops; 
            private String object; 
            private String ruleName; 
            private String secFunc; 
            private String tmStr; 

            private Builder() {
            } 

            private Builder(Rows model) {
                this.domain = model.domain;
                this.drops = model.drops;
                this.object = model.object;
                this.ruleName = model.ruleName;
                this.secFunc = model.secFunc;
                this.tmStr = model.tmStr;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The number of packets blocked within 5 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>264</p>
             */
            public Builder drops(Integer drops) {
                this.drops = drops;
                return this;
            }

            /**
             * <p>The object that triggered rate limiting.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal Mode</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The rule that was triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal Mode</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The security feature that blocked the packets.</p>
             * 
             * <strong>example:</strong>
             * <p>robot</p>
             */
            public Builder secFunc(String secFunc) {
                this.secFunc = secFunc;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-31T15:04:04Z</p>
             */
            public Builder tmStr(String tmStr) {
                this.tmStr = tmStr;
                return this;
            }

            public Rows build() {
                return new Rows(this);
            } 

        } 

    }
}
