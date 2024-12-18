// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribePolicyInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribePolicyInstancesResponse</p>
 */
public class DescribePolicyInstancesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<DescribePolicyInstancesResponseBody> body;

    private DescribePolicyInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribePolicyInstancesResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<DescribePolicyInstancesResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePolicyInstancesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<DescribePolicyInstancesResponseBody> body);

        @Override
        DescribePolicyInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePolicyInstancesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<DescribePolicyInstancesResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePolicyInstancesResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<DescribePolicyInstancesResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePolicyInstancesResponse build() {
            return new DescribePolicyInstancesResponse(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolicyInstancesResponse} extends {@link TeaModel}
     *
     * <p>DescribePolicyInstancesResponse</p>
     */
    public static class DescribePolicyInstancesResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ali_uid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("instance_name")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("policy_name")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("policy_category")
        private String policyCategory;

        @com.aliyun.core.annotation.NameInMap("policy_description")
        private String policyDescription;

        @com.aliyun.core.annotation.NameInMap("policy_parameters")
        private String policyParameters;

        @com.aliyun.core.annotation.NameInMap("policy_severity")
        private String policySeverity;

        @com.aliyun.core.annotation.NameInMap("policy_scope")
        private String policyScope;

        @com.aliyun.core.annotation.NameInMap("policy_action")
        private String policyAction;

        @com.aliyun.core.annotation.NameInMap("Created")
        @Deprecated
        private String created;

        @com.aliyun.core.annotation.NameInMap("Updated")
        @Deprecated
        private String updated;

        @com.aliyun.core.annotation.NameInMap("resource_id")
        @Deprecated
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("total_violations")
        @Deprecated
        private Long totalViolations;

        @com.aliyun.core.annotation.NameInMap("is_deleted")
        @Deprecated
        private Long isDeleted;

        private DescribePolicyInstancesResponseBody(Builder builder) {
            this.aliUid = builder.aliUid;
            this.clusterId = builder.clusterId;
            this.instanceName = builder.instanceName;
            this.policyName = builder.policyName;
            this.policyCategory = builder.policyCategory;
            this.policyDescription = builder.policyDescription;
            this.policyParameters = builder.policyParameters;
            this.policySeverity = builder.policySeverity;
            this.policyScope = builder.policyScope;
            this.policyAction = builder.policyAction;
            this.created = builder.created;
            this.updated = builder.updated;
            this.resourceId = builder.resourceId;
            this.totalViolations = builder.totalViolations;
            this.isDeleted = builder.isDeleted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribePolicyInstancesResponseBody create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyCategory
         */
        public String getPolicyCategory() {
            return this.policyCategory;
        }

        /**
         * @return policyDescription
         */
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        /**
         * @return policyParameters
         */
        public String getPolicyParameters() {
            return this.policyParameters;
        }

        /**
         * @return policySeverity
         */
        public String getPolicySeverity() {
            return this.policySeverity;
        }

        /**
         * @return policyScope
         */
        public String getPolicyScope() {
            return this.policyScope;
        }

        /**
         * @return policyAction
         */
        public String getPolicyAction() {
            return this.policyAction;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return totalViolations
         */
        public Long getTotalViolations() {
            return this.totalViolations;
        }

        /**
         * @return isDeleted
         */
        public Long getIsDeleted() {
            return this.isDeleted;
        }

        public static final class Builder {
            private String aliUid; 
            private String clusterId; 
            private String instanceName; 
            private String policyName; 
            private String policyCategory; 
            private String policyDescription; 
            private String policyParameters; 
            private String policySeverity; 
            private String policyScope; 
            private String policyAction; 
            private String created; 
            private String updated; 
            private String resourceId; 
            private Long totalViolations; 
            private Long isDeleted; 

            /**
             * <p>The UID of the Alibaba Cloud account that is used to deploy the policy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>16298168****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c8155823d057948c69a****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the policy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>no-env-var-secrets-****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>ACKPSPCapabilities</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The type of policy.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-general</p>
             */
            public Builder policyCategory(String policyCategory) {
                this.policyCategory = policyCategory;
                return this;
            }

            /**
             * <p>The description of the policy template.</p>
             * 
             * <strong>example:</strong>
             * <p>Restricts secrets used in pod envs</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The parameters of the policy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;restrictedNamespaces&quot;: [ &quot;test&quot; ]</p>
             */
            public Builder policyParameters(String policyParameters) {
                this.policyParameters = policyParameters;
                return this;
            }

            /**
             * <p>The severity level of the policy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder policySeverity(String policySeverity) {
                this.policySeverity = policySeverity;
                return this;
            }

            /**
             * <p>The applicable scope of the policy instance.</p>
             * <p>A value of * indicates all namespaces in the cluster. This is the default value.</p>
             * <p>Multiple namespaces are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder policyScope(String policyScope) {
                this.policyScope = policyScope;
                return this;
            }

            /**
             * <p>The action of the policy. Valid values:</p>
             * <ul>
             * <li><code>deny</code>: Deployments that match the policy are denied.</li>
             * <li><code>warn</code>: Alerts are generated for deployments that match the policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder policyAction(String policyAction) {
                this.policyAction = policyAction;
                return this;
            }

            /**
             * <p>Creation time (deprecated, do not use).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-29T18:09:12+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>Update time (deprecated, do not use).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-29T18:09:12+08:00</p>
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * <p>Resource ID (deprecated, do not use).</p>
             * 
             * <strong>example:</strong>
             * <p>123456***</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Violation count processing in the cluster (deprecated, do not use).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalViolations(Long totalViolations) {
                this.totalViolations = totalViolations;
                return this;
            }

            /**
             * <p>Deletion status (deprecated, do not use).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isDeleted(Long isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            public DescribePolicyInstancesResponseBody build() {
                return new DescribePolicyInstancesResponseBody(this);
            } 

        } 

    }
}
