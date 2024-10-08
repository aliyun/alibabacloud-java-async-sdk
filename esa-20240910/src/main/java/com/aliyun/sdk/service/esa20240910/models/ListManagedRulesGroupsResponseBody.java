// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListManagedRulesGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListManagedRulesGroupsResponseBody</p>
 */
public class ListManagedRulesGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManagedRulesGroups")
    private java.util.List < ManagedRulesGroups> managedRulesGroups;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListManagedRulesGroupsResponseBody(Builder builder) {
        this.managedRulesGroups = builder.managedRulesGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListManagedRulesGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return managedRulesGroups
     */
    public java.util.List < ManagedRulesGroups> getManagedRulesGroups() {
        return this.managedRulesGroups;
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
        private java.util.List < ManagedRulesGroups> managedRulesGroups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ManagedRulesGroups.
         */
        public Builder managedRulesGroups(java.util.List < ManagedRulesGroups> managedRulesGroups) {
            this.managedRulesGroups = managedRulesGroups;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListManagedRulesGroupsResponseBody build() {
            return new ListManagedRulesGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListManagedRulesGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListManagedRulesGroupsResponseBody</p>
     */
    public static class ManagedRulesGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Long ruleCount;

        private ManagedRulesGroups(Builder builder) {
            this.name = builder.name;
            this.ruleCount = builder.ruleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRulesGroups create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleCount
         */
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public static final class Builder {
            private String name; 
            private Long ruleCount; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleCount.
             */
            public Builder ruleCount(Long ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public ManagedRulesGroups build() {
                return new ManagedRulesGroups(this);
            } 

        } 

    }
}
