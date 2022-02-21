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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Len.
         */
        public Builder len(Integer len) {
            this.len = len;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rows.
         */
        public Builder rows(java.util.List < Rows> rows) {
            this.rows = rows;
            return this;
        }

        /**
         * TotalCount.
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Drops.
             */
            public Builder drops(Integer drops) {
                this.drops = drops;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SecFunc.
             */
            public Builder secFunc(String secFunc) {
                this.secFunc = secFunc;
                return this;
            }

            /**
             * TmStr.
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
