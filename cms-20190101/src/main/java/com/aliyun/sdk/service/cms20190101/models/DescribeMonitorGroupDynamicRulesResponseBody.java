// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitorGroupDynamicRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupDynamicRulesResponseBody</p>
 */
public class DescribeMonitorGroupDynamicRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMonitorGroupDynamicRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupDynamicRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Resource resource; 
        private Boolean success; 

        /**
         * <p>The responses code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2170B94A-1576-4D65-900E-2093037CDAF3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources that are associated with the application group.</p>
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitorGroupDynamicRulesResponseBody build() {
            return new DescribeMonitorGroupDynamicRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorGroupDynamicRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupDynamicRulesResponseBody</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filter(Builder builder) {
            this.function = builder.function;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
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
             * <p>The method that is used to filter the instances. Valid values:</p>
             * <ul>
             * <li>contains: contains</li>
             * <li>startWith: starts with a prefix</li>
             * <li>endWith: ends with a suffix</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contains</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>hostName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the dynamic rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupDynamicRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupDynamicRulesResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Filter")
        private java.util.List < Filter> filter;

        private Filters(Builder builder) {
            this.filter = builder.filter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return filter
         */
        public java.util.List < Filter> getFilter() {
            return this.filter;
        }

        public static final class Builder {
            private java.util.List < Filter> filter; 

            /**
             * Filter.
             */
            public Builder filter(java.util.List < Filter> filter) {
                this.filter = filter;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupDynamicRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupDynamicRulesResponseBody</p>
     */
    public static class ResourceResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("FilterRelation")
        private String filterRelation;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private Filters filters;

        private ResourceResource(Builder builder) {
            this.category = builder.category;
            this.filterRelation = builder.filterRelation;
            this.filters = builder.filters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceResource create() {
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
        public Filters getFilters() {
            return this.filters;
        }

        public static final class Builder {
            private String category; 
            private String filterRelation; 
            private Filters filters; 

            /**
             * <p>The type of the cloud service to which the dynamic rule belongs. Valid values:</p>
             * <ul>
             * <li>ecs: Elastic Compute Service (ECS)</li>
             * <li>rds: ApsaraDB RDS</li>
             * <li>slb: Server Load Balancer (SLB)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The filter condition. Valid values:</p>
             * <ul>
             * <li>and: queries the instances that meet all alert rules.</li>
             * <li>or: queries the instances that meet any alert rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>and</p>
             */
            public Builder filterRelation(String filterRelation) {
                this.filterRelation = filterRelation;
                return this;
            }

            /**
             * <p>The dynamic rules of the application group.</p>
             */
            public Builder filters(Filters filters) {
                this.filters = filters;
                return this;
            }

            public ResourceResource build() {
                return new ResourceResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupDynamicRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupDynamicRulesResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List < ResourceResource> resource;

        private Resource(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < ResourceResource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < ResourceResource> resource; 

            /**
             * <p>The resources that are associated with the application group.</p>
             */
            public Builder resource(java.util.List < ResourceResource> resource) {
                this.resource = resource;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
