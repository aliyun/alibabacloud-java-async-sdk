// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMonitorGroupDynamicRuleRequest} extends {@link RequestModel}
 *
 * <p>PutMonitorGroupDynamicRuleRequest</p>
 */
public class PutMonitorGroupDynamicRuleRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("GroupRules")
    @Validation(required = true)
    private java.util.List < GroupRules> groupRules;

    @Query
    @NameInMap("IsAsync")
    private Boolean isAsync;

    private PutMonitorGroupDynamicRuleRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupRules = builder.groupRules;
        this.isAsync = builder.isAsync;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMonitorGroupDynamicRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupRules
     */
    public java.util.List < GroupRules> getGroupRules() {
        return this.groupRules;
    }

    /**
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public static final class Builder extends Request.Builder<PutMonitorGroupDynamicRuleRequest, Builder> {
        private Long groupId; 
        private java.util.List < GroupRules> groupRules; 
        private Boolean isAsync; 

        private Builder() {
            super();
        } 

        private Builder(PutMonitorGroupDynamicRuleRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupRules = request.groupRules;
            this.isAsync = request.isAsync;
        } 

        /**
         * The method that is used to filter instances. Valid values of N: 1 to 3. Valid values:
         * <p>
         * 
         * *   contains: contains
         * *   notContains: excludes
         * *   startWith: starts with a prefix
         * *   endWith: ends with a suffix
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupRules.
         */
        public Builder groupRules(java.util.List < GroupRules> groupRules) {
            this.putQueryParameter("GroupRules", groupRules);
            this.groupRules = groupRules;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder isAsync(Boolean isAsync) {
            this.putQueryParameter("IsAsync", isAsync);
            this.isAsync = isAsync;
            return this;
        }

        @Override
        public PutMonitorGroupDynamicRuleRequest build() {
            return new PutMonitorGroupDynamicRuleRequest(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @NameInMap("Function")
        @Validation(required = true)
        private String function;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private Filters(Builder builder) {
            this.function = builder.function;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String function; 
            private String name; 
            private String value; 

            /**
             * The error message.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **PutMonitorGroupDynamicRule**.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    public static class GroupRules extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        private String category;

        @NameInMap("FilterRelation")
        @Validation(required = true)
        private String filterRelation;

        @NameInMap("Filters")
        @Validation(required = true)
        private java.util.List < Filters> filters;

        private GroupRules(Builder builder) {
            this.category = builder.category;
            this.filterRelation = builder.filterRelation;
            this.filters = builder.filters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupRules create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return filterRelation
         */
        public String getFilterRelation() {
            return this.filterRelation;
        }

        /**
         * @return filters
         */
        public java.util.List < Filters> getFilters() {
            return this.filters;
        }

        public static final class Builder {
            private String category; 
            private String filterRelation; 
            private java.util.List < Filters> filters; 

            /**
             * The logical operator used between conditional expressions in the alert rule. Valid values of N: 1 to 3. Valid values:
             * <p>
             * 
             * *   and: The instances that meet all the conditional expressions are automatically added to the application group.
             * *   or: The instances that meet one of the conditional expressions are automatically added to the application group.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The mode for creating the alert rule. Valid values:
             * <p>
             * 
             * *   true: creates asynchronously
             * *   false (default value): creates synchronously
             */
            public Builder filterRelation(String filterRelation) {
                this.filterRelation = filterRelation;
                return this;
            }

            /**
             * Filters.
             */
            public Builder filters(java.util.List < Filters> filters) {
                this.filters = filters;
                return this;
            }

            public GroupRules build() {
                return new GroupRules(this);
            } 

        } 

    }
}
