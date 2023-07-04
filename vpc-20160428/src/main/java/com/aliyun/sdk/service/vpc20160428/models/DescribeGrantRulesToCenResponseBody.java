// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGrantRulesToCenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesToCenResponseBody</p>
 */
public class DescribeGrantRulesToCenResponseBody extends TeaModel {
    @NameInMap("CenGrantRules")
    private CenGrantRules cenGrantRules;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * The ID of the authorized CEN instance.
         */
        public Builder cenGrantRules(CenGrantRules cenGrantRules) {
            this.cenGrantRules = cenGrantRules;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the authorization.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGrantRulesToCenResponseBody build() {
            return new DescribeGrantRulesToCenResponseBody(this);
        } 

    } 

    public static class CbnGrantRule extends TeaModel {
        @NameInMap("CenInstanceId")
        private String cenInstanceId;

        @NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @NameInMap("CreationTime")
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

            /**
             * The UID of the Alibaba Cloud account to which the authorized CEN instance belongs.
             */
            public Builder cenInstanceId(String cenInstanceId) {
                this.cenInstanceId = cenInstanceId;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * CreationTime.
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
    public static class CenGrantRules extends TeaModel {
        @NameInMap("CbnGrantRule")
        private java.util.List < CbnGrantRule> cbnGrantRule;

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
        public java.util.List < CbnGrantRule> getCbnGrantRule() {
            return this.cbnGrantRule;
        }

        public static final class Builder {
            private java.util.List < CbnGrantRule> cbnGrantRule; 

            /**
             * CbnGrantRule.
             */
            public Builder cbnGrantRule(java.util.List < CbnGrantRule> cbnGrantRule) {
                this.cbnGrantRule = cbnGrantRule;
                return this;
            }

            public CenGrantRules build() {
                return new CenGrantRules(this);
            } 

        } 

    }
}
