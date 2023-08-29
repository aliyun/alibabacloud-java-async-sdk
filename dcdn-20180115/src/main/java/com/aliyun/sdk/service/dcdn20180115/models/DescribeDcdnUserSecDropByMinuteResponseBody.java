// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserSecDropByMinuteResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserSecDropByMinuteResponseBody</p>
 */
public class DescribeDcdnUserSecDropByMinuteResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("Len")
    private Integer len;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rows")
    private java.util.List < Rows> rows;

    @NameInMap("TotalCount")
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
    public java.util.List < Rows> getRows() {
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
        private java.util.List < Rows> rows; 
        private Integer totalCount; 

        /**
         * The description of HTTP responses.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder len(Integer len) {
            this.len = len;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array.
         */
        public Builder rows(java.util.List < Rows> rows) {
            this.rows = rows;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBody build() {
            return new DescribeDcdnUserSecDropByMinuteResponseBody(this);
        } 

    } 

    public static class Rows extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Drops")
        private Integer drops;

        @NameInMap("Object")
        private String object;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SecFunc")
        private String secFunc;

        @NameInMap("TmStr")
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

            /**
             * The domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The number of packets blocked within 5 minutes.
             */
            public Builder drops(Integer drops) {
                this.drops = drops;
                return this;
            }

            /**
             * The object that triggered rate limiting.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * The rule that was triggered.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The security feature that blocked the packets.
             */
            public Builder secFunc(String secFunc) {
                this.secFunc = secFunc;
                return this;
            }

            /**
             * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
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
