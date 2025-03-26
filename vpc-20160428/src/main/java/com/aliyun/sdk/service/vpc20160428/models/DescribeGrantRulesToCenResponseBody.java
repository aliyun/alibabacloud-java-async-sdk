// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeGrantRulesToCenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesToCenResponseBody</p>
 */
public class DescribeGrantRulesToCenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenGrantRules")
    private CenGrantRules cenGrantRules;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGrantRulesToCenResponseBody(Builder builder) {
        this.cenGrantRules = builder.cenGrantRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantRulesToCenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenGrantRules
     */
    public CenGrantRules getCenGrantRules() {
        return this.cenGrantRules;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CenGrantRules cenGrantRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeGrantRulesToCenResponseBody model) {
            this.cenGrantRules = model.cenGrantRules;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the authorization.</p>
         */
        public Builder cenGrantRules(CenGrantRules cenGrantRules) {
            this.cenGrantRules = cenGrantRules;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F5BB78C8-5F41-464F-B9FF-5E0A7198BA26</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGrantRulesToCenResponseBody build() {
            return new DescribeGrantRulesToCenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGrantRulesToCenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantRulesToCenResponseBody</p>
     */
    public static class CbnGrantRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenInstanceId")
        private String cenInstanceId;

        @com.aliyun.core.annotation.NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        private CbnGrantRule(Builder builder) {
            this.cenInstanceId = builder.cenInstanceId;
            this.cenOwnerId = builder.cenOwnerId;
            this.creationTime = builder.creationTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CbnGrantRule create() {
            return builder().build();
        }

        /**
         * @return cenInstanceId
         */
        public String getCenInstanceId() {
            return this.cenInstanceId;
        }

        /**
         * @return cenOwnerId
         */
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        public static final class Builder {
            private String cenInstanceId; 
            private Long cenOwnerId; 
            private String creationTime; 

            private Builder() {
            } 

            private Builder(CbnGrantRule model) {
                this.cenInstanceId = model.cenInstanceId;
                this.cenOwnerId = model.cenOwnerId;
                this.creationTime = model.creationTime;
            } 

            /**
             * <p>The ID of the authorized CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-9gsm1q2yh1prpt****</p>
             */
            public Builder cenInstanceId(String cenInstanceId) {
                this.cenInstanceId = cenInstanceId;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account to which the authorized CEN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>132193271328****</p>
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-15T09:26:36Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            public CbnGrantRule build() {
                return new CbnGrantRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGrantRulesToCenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGrantRulesToCenResponseBody</p>
     */
    public static class CenGrantRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CbnGrantRule")
        private java.util.List<CbnGrantRule> cbnGrantRule;

        private CenGrantRules(Builder builder) {
            this.cbnGrantRule = builder.cbnGrantRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenGrantRules create() {
            return builder().build();
        }

        /**
         * @return cbnGrantRule
         */
        public java.util.List<CbnGrantRule> getCbnGrantRule() {
            return this.cbnGrantRule;
        }

        public static final class Builder {
            private java.util.List<CbnGrantRule> cbnGrantRule; 

            private Builder() {
            } 

            private Builder(CenGrantRules model) {
                this.cbnGrantRule = model.cbnGrantRule;
            } 

            /**
             * CbnGrantRule.
             */
            public Builder cbnGrantRule(java.util.List<CbnGrantRule> cbnGrantRule) {
                this.cbnGrantRule = cbnGrantRule;
                return this;
            }

            public CenGrantRules build() {
                return new CenGrantRules(this);
            } 

        } 

    }
}
