// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneDefensePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneDefensePoliciesResponseBody</p>
 */
public class DescribeSceneDefensePoliciesResponseBody extends TeaModel {
    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSceneDefensePoliciesResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneDefensePoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Policies> policies; 
        private String requestId; 
        private Boolean success; 

        /**
         * Policies.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSceneDefensePoliciesResponseBody build() {
            return new DescribeSceneDefensePoliciesResponseBody(this);
        } 

    } 

    public static class RuntimePolicies extends TeaModel {
        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("PolicyType")
        private Integer policyType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("oldValue")
        private String oldValue;

        private RuntimePolicies(Builder builder) {
            this.newValue = builder.newValue;
            this.policyType = builder.policyType;
            this.status = builder.status;
            this.oldValue = builder.oldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimePolicies create() {
            return builder().build();
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return policyType
         */
        public Integer getPolicyType() {
            return this.policyType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        public static final class Builder {
            private String newValue; 
            private Integer policyType; 
            private Integer status; 
            private String oldValue; 

            /**
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(Integer policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * oldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            public RuntimePolicies build() {
                return new RuntimePolicies(this);
            } 

        } 

    }
    public static class Policies extends TeaModel {
        @NameInMap("Done")
        private Integer done;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("ObjectCount")
        private Integer objectCount;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("RuntimePolicies")
        private java.util.List < RuntimePolicies> runtimePolicies;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Template")
        private String template;

        private Policies(Builder builder) {
            this.done = builder.done;
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.objectCount = builder.objectCount;
            this.policyId = builder.policyId;
            this.runtimePolicies = builder.runtimePolicies;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return done
         */
        public Integer getDone() {
            return this.done;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectCount
         */
        public Integer getObjectCount() {
            return this.objectCount;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return runtimePolicies
         */
        public java.util.List < RuntimePolicies> getRuntimePolicies() {
            return this.runtimePolicies;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private Integer done; 
            private Long endTime; 
            private String name; 
            private Integer objectCount; 
            private String policyId; 
            private java.util.List < RuntimePolicies> runtimePolicies; 
            private Long startTime; 
            private Integer status; 
            private String template; 

            /**
             * Done.
             */
            public Builder done(Integer done) {
                this.done = done;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObjectCount.
             */
            public Builder objectCount(Integer objectCount) {
                this.objectCount = objectCount;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * RuntimePolicies.
             */
            public Builder runtimePolicies(java.util.List < RuntimePolicies> runtimePolicies) {
                this.runtimePolicies = runtimePolicies;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
