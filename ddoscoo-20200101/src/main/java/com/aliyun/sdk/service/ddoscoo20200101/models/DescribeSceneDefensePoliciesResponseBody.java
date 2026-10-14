// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeSceneDefensePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneDefensePoliciesResponseBody</p>
 */
public class DescribeSceneDefensePoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policies
     */
    public java.util.List<Policies> getPolicies() {
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
        private java.util.List<Policies> policies; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeSceneDefensePoliciesResponseBody model) {
            this.policies = model.policies;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed configurations of the scenario-specific policies.</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F65DF043-E0EB-4796-9467-23DDCDF92C1D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSceneDefensePoliciesResponseBody build() {
            return new DescribeSceneDefensePoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSceneDefensePoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSceneDefensePoliciesResponseBody</p>
     */
    public static class RuntimePolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private Integer policyType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("oldValue")
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

            private Builder() {
            } 

            private Builder(RuntimePolicies model) {
                this.newValue = model.newValue;
                this.policyType = model.policyType;
                this.status = model.status;
                this.oldValue = model.oldValue;
            } 

            /**
             * <p>The protection rule when the policy takes effect.</p>
             * <p>If <strong>PolicyType</strong> is <strong>1</strong>, the value is <strong>{&quot;cc_rule_enable&quot;: false }</strong>, which indicates that frequency control is disabled.</p>
             * <p>If <strong>PolicyType</strong> is <strong>2</strong>, the value is <strong>{&quot;ai_rule_enable&quot;: 0}</strong>, which indicates that AI-based intelligent analysis is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cc_rule_enable&quot;: false }</p>
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * <p>The type of protection feature change triggered when the policy takes effect. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: frequency control feature change.</li>
             * <li><strong>2</strong>: AI-based intelligent analysis feature change.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder policyType(Integer policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The runtime status of the policy. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: not delivered or policy restored successfully.</li>
             * <li><strong>1</strong>: active (policy takes effect).</li>
             * <li><strong>2</strong>: being restored (policy restoration).</li>
             * <li><strong>3</strong>: policy took effect successfully.</li>
             * <li><strong>4</strong>: policy failed to take effect.</li>
             * <li><strong>5</strong>: policy restoration failed.</li>
             * <li><strong>6</strong>: the configuration of the object associated with the policy does not exist (may have been deleted).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The protection rule before the policy takes effect.</p>
             * <p>If <strong>PolicyType</strong> is <strong>1</strong>, the value is <strong>{&quot;cc_rule_enable&quot;: true}</strong>, which indicates that frequency control is enabled.</p>
             * <p>If <strong>PolicyType</strong> is <strong>2</strong>, the value is <strong>{&quot;ai_rule_enable&quot;: 1}</strong>, which indicates that AI-based intelligent analysis is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cc_rule_enable&quot;: true}</p>
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
    /**
     * 
     * {@link DescribeSceneDefensePoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSceneDefensePoliciesResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Done")
        private Integer done;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectCount")
        private Integer objectCount;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("RuntimePolicies")
        private java.util.List<RuntimePolicies> runtimePolicies;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Template")
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
        public java.util.List<RuntimePolicies> getRuntimePolicies() {
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
            private java.util.List<RuntimePolicies> runtimePolicies; 
            private Long startTime; 
            private Integer status; 
            private String template; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.done = model.done;
                this.endTime = model.endTime;
                this.name = model.name;
                this.objectCount = model.objectCount;
                this.policyId = model.policyId;
                this.runtimePolicies = model.runtimePolicies;
                this.startTime = model.startTime;
                this.status = model.status;
                this.template = model.template;
            } 

            /**
             * <p>The execution status of the policy. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: not executed or execution completed.</li>
             * <li><strong>0</strong>: being executed.</li>
             * <li><strong>-1</strong>: execution failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder done(Integer done) {
                this.done = done;
                return this;
            }

            /**
             * <p>The time when the policy stops taking effect. The value is a timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1586016000000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>testpolicy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of protected objects in the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder objectCount(Integer objectCount) {
                this.objectCount = objectCount;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>321a-fd31-df51-****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The runtime rules of the policy.</p>
             */
            public Builder runtimePolicies(java.util.List<RuntimePolicies> runtimePolicies) {
                this.runtimePolicies = runtimePolicies;
                return this;
            }

            /**
             * <p>The time when the policy starts to take effect. The value is a timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1585670400000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the policy. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: pending activation.</li>
             * <li><strong>2</strong>: active.</li>
             * <li><strong>3</strong>: expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The templatetype used by the policy. Valid values:</p>
             * <ul>
             * <li><strong>promotion</strong>: Important Activity template.</li>
             * <li><strong>bypass</strong>: full forwarding template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>promotion</p>
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
