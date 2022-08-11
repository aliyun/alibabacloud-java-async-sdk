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

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribePolicyInstancesResponseBody> body;

    private DescribePolicyInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public java.util.List < DescribePolicyInstancesResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePolicyInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < DescribePolicyInstancesResponseBody> body);

        @Override
        DescribePolicyInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePolicyInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < DescribePolicyInstancesResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePolicyInstancesResponse response) {
            super(response);
            this.headers = response.headers;
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
             * 策略实例实施者UID
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * 目标集群ID
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * 规则实例名称
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * 策略治理规则名称
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * 策略类型名称
             */
            public Builder policyCategory(String policyCategory) {
                this.policyCategory = policyCategory;
                return this;
            }

            /**
             * 规则模板描述
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * 当前规则实例的配置参数
             */
            public Builder policyParameters(String policyParameters) {
                this.policyParameters = policyParameters;
                return this;
            }

            /**
             * 规则实例治理等级
             */
            public Builder policySeverity(String policySeverity) {
                this.policySeverity = policySeverity;
                return this;
            }

            /**
             * 策略实例实施范围： 默认"*"代表集群所有ns 否则返回作用namespaces名称，多个namespaces以逗号分隔
             */
            public Builder policyScope(String policyScope) {
                this.policyScope = policyScope;
                return this;
            }

            /**
             * 规则治理动作  deny: 拦截违规部署  warn：告警
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
