// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyInstancesResponse} extends {@link TeaModel}
 *
 * <p>DescribePolicyInstancesResponse</p>
 */
public class DescribePolicyInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribePolicyInstancesResponseBody> body;

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
    public java.util.Map < String, String > getHeaders() {
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
    public java.util.List < DescribePolicyInstancesResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePolicyInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < DescribePolicyInstancesResponseBody> body);

        @Override
        DescribePolicyInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePolicyInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < DescribePolicyInstancesResponseBody> body; 

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
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(java.util.List < DescribePolicyInstancesResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePolicyInstancesResponse build() {
            return new DescribePolicyInstancesResponse(this);
        } 

    } 

    public static class DescribePolicyInstancesResponseBody extends TeaModel {
        @NameInMap("ali_uid")
        private String aliUid;

        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("instance_name")
        private String instanceName;

        @NameInMap("policy_name")
        private String policyName;

        @NameInMap("policy_category")
        private String policyCategory;

        @NameInMap("policy_description")
        private String policyDescription;

        @NameInMap("policy_parameters")
        private String policyParameters;

        @NameInMap("policy_severity")
        private String policySeverity;

        @NameInMap("policy_scope")
        private String policyScope;

        @NameInMap("policy_action")
        private String policyAction;

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

            /**
             * The UID of the Alibaba Cloud account that is used to deploy the policy instance.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the policy instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The type of policy.
             */
            public Builder policyCategory(String policyCategory) {
                this.policyCategory = policyCategory;
                return this;
            }

            /**
             * The description of the policy template.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * The parameters of the policy instance.
             */
            public Builder policyParameters(String policyParameters) {
                this.policyParameters = policyParameters;
                return this;
            }

            /**
             * The severity level of the policy instance.
             */
            public Builder policySeverity(String policySeverity) {
                this.policySeverity = policySeverity;
                return this;
            }

            /**
             * The applicable scope of the policy instance.
             * <p>
             * 
             * A value of \* indicates all namespaces in the cluster. This is the default value.
             * 
             * Multiple namespaces are separated by commas (,).
             */
            public Builder policyScope(String policyScope) {
                this.policyScope = policyScope;
                return this;
            }

            /**
             * The action of the policy. Valid values:
             * <p>
             * 
             * *   `deny`: Deployments that match the policy are denied.
             * *   `warn`: Alerts are generated for deployments that match the policy.
             */
            public Builder policyAction(String policyAction) {
                this.policyAction = policyAction;
                return this;
            }

            public DescribePolicyInstancesResponseBody build() {
                return new DescribePolicyInstancesResponseBody(this);
            } 

        } 

    }
}
