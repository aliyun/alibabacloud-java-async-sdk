// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListManagedRulesGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListManagedRulesGroupsResponseBody</p>
 */
public class ListManagedRulesGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManagedRulesGroups")
    private java.util.List<ManagedRulesGroups> managedRulesGroups;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return managedRulesGroups
     */
    public java.util.List<ManagedRulesGroups> getManagedRulesGroups() {
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
        private java.util.List<ManagedRulesGroups> managedRulesGroups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListManagedRulesGroupsResponseBody model) {
            this.managedRulesGroups = model.managedRulesGroups;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>List of managed rule group information.</p>
         */
        public Builder managedRulesGroups(java.util.List<ManagedRulesGroups> managedRulesGroups) {
            this.managedRulesGroups = managedRulesGroups;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of records after filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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

            private Builder() {
            } 

            private Builder(ManagedRulesGroups model) {
                this.name = model.name;
                this.ruleCount = model.ruleCount;
            } 

            /**
             * <p>Name of the managed rule group.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Number of rules within the managed rule group.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
