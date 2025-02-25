// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutMonitorGroupDynamicRuleRequest} extends {@link RequestModel}
 *
 * <p>PutMonitorGroupDynamicRuleRequest</p>
 */
public class PutMonitorGroupDynamicRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < GroupRules> groupRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAsync")
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
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>None.</p>
         * <p>This parameter is required.</p>
         */
        public Builder groupRules(java.util.List < GroupRules> groupRules) {
            this.putQueryParameter("GroupRules", groupRules);
            this.groupRules = groupRules;
            return this;
        }

        /**
         * <p>The mode for creating the alert rule. Valid values:</p>
         * <ul>
         * <li>true: creates asynchronously</li>
         * <li>false (default): creates synchronously</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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

    /**
     * 
     * {@link PutMonitorGroupDynamicRuleRequest} extends {@link TeaModel}
     *
     * <p>PutMonitorGroupDynamicRuleRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        @com.aliyun.core.annotation.Validation(required = true)
        private String function;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The method that is used to filter instances. Valid values of N: 1 to 3. Valid values:</p>
             * <ul>
             * <li>contains: contains</li>
             * <li>notContains: does not contain</li>
             * <li>startWith: starts with a prefix</li>
             * <li>endWith: ends with a suffix</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>contains</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The name of the field based on which instances are filtered. Valid values of N: 1 to 3.</p>
             * <p>Only hostnames are supported. Example: hostName.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>hostName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value to be matched with the specified field. Valid values of N: 1 to 3.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
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
    /**
     * 
     * {@link PutMonitorGroupDynamicRuleRequest} extends {@link TeaModel}
     *
     * <p>PutMonitorGroupDynamicRuleRequest</p>
     */
    public static class GroupRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("FilterRelation")
        @com.aliyun.core.annotation.Validation(required = true)
        private String filterRelation;

        @com.aliyun.core.annotation.NameInMap("Filters")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The cloud service to which the alert rule is applied. Valid values of N: 1 to 3. Valid values:</p>
             * <ul>
             * <li>ecs: Elastic Compute Service (ECS)</li>
             * <li>rds: ApsaraDB RDS</li>
             * <li>slb: Server Load Balancer (SLB)</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The logical operator used between conditional expressions in the alert rule. Valid values of N: 1 to 3. Valid values:</p>
             * <ul>
             * <li>and: The instances that meet all the conditional expressions are automatically added to the application group.</li>
             * <li>or: The instances that meet one of the conditional expressions are automatically added to the application group.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>and</p>
             */
            public Builder filterRelation(String filterRelation) {
                this.filterRelation = filterRelation;
                return this;
            }

            /**
             * <p>None.</p>
             * <p>This parameter is required.</p>
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
