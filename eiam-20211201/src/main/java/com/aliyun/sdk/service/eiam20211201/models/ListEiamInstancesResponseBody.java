// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListEiamInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEiamInstancesResponseBody</p>
 */
public class ListEiamInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEiamInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEiamInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListEiamInstancesResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance list.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEiamInstancesResponseBody build() {
            return new ListEiamInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEiamInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEiamInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeveloperAPIPrivateDomain")
        private String developerAPIPrivateDomain;

        @com.aliyun.core.annotation.NameInMap("DeveloperAPIPublicDomain")
        private String developerAPIPublicDomain;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceVersion")
        private String instanceVersion;

        @com.aliyun.core.annotation.NameInMap("OpenAPIPrivateDomain")
        private String openAPIPrivateDomain;

        @com.aliyun.core.annotation.NameInMap("OpenAPIPublicDomain")
        private String openAPIPublicDomain;

        @com.aliyun.core.annotation.NameInMap("SSODomain")
        private String SSODomain;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Instances(Builder builder) {
            this.description = builder.description;
            this.developerAPIPrivateDomain = builder.developerAPIPrivateDomain;
            this.developerAPIPublicDomain = builder.developerAPIPublicDomain;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.instanceVersion = builder.instanceVersion;
            this.openAPIPrivateDomain = builder.openAPIPrivateDomain;
            this.openAPIPublicDomain = builder.openAPIPublicDomain;
            this.SSODomain = builder.SSODomain;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return developerAPIPrivateDomain
         */
        public String getDeveloperAPIPrivateDomain() {
            return this.developerAPIPrivateDomain;
        }

        /**
         * @return developerAPIPublicDomain
         */
        public String getDeveloperAPIPublicDomain() {
            return this.developerAPIPublicDomain;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceVersion
         */
        public String getInstanceVersion() {
            return this.instanceVersion;
        }

        /**
         * @return openAPIPrivateDomain
         */
        public String getOpenAPIPrivateDomain() {
            return this.openAPIPrivateDomain;
        }

        /**
         * @return openAPIPublicDomain
         */
        public String getOpenAPIPublicDomain() {
            return this.openAPIPublicDomain;
        }

        /**
         * @return SSODomain
         */
        public String getSSODomain() {
            return this.SSODomain;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String description; 
            private String developerAPIPrivateDomain; 
            private String developerAPIPublicDomain; 
            private String instanceId; 
            private String instanceStatus; 
            private String instanceVersion; 
            private String openAPIPrivateDomain; 
            private String openAPIPublicDomain; 
            private String SSODomain; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.description = model.description;
                this.developerAPIPrivateDomain = model.developerAPIPrivateDomain;
                this.developerAPIPublicDomain = model.developerAPIPublicDomain;
                this.instanceId = model.instanceId;
                this.instanceStatus = model.instanceStatus;
                this.instanceVersion = model.instanceVersion;
                this.openAPIPrivateDomain = model.openAPIPrivateDomain;
                this.openAPIPublicDomain = model.openAPIPublicDomain;
                this.SSODomain = model.SSODomain;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>instance test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The private domain name of the instance Developer API.</p>
             * 
             * <strong>example:</strong>
             * <p>eiam-developerapi-cn.vpc-proxy.aliyuncs.com</p>
             */
            public Builder developerAPIPrivateDomain(String developerAPIPrivateDomain) {
                this.developerAPIPrivateDomain = developerAPIPrivateDomain;
                return this;
            }

            /**
             * <p>The public domain of the instance Developer API.</p>
             * 
             * <strong>example:</strong>
             * <p>eiam-developerapi.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder developerAPIPublicDomain(String developerAPIPublicDomain) {
                this.developerAPIPublicDomain = developerAPIPublicDomain;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_eypq6ljgyeuwmlw672sulxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The instance version.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>EIAM 2.0</li>
             * <li>EIAM 1.0</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EIAM 2.0</p>
             */
            public Builder instanceVersion(String instanceVersion) {
                this.instanceVersion = instanceVersion;
                return this;
            }

            /**
             * <p>The private domain of the instance OpenAPI.</p>
             * 
             * <strong>example:</strong>
             * <p>eiam-cn.vpc-proxy.aliyuncs.com</p>
             */
            public Builder openAPIPrivateDomain(String openAPIPrivateDomain) {
                this.openAPIPrivateDomain = openAPIPrivateDomain;
                return this;
            }

            /**
             * <p>The public domain of the instance OpenAPI.</p>
             * 
             * <strong>example:</strong>
             * <p>eiam.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder openAPIPublicDomain(String openAPIPublicDomain) {
                this.openAPIPublicDomain = openAPIPublicDomain;
                return this;
            }

            /**
             * <p>The single sign-on (SSO) domain  of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx.aliyunidaas.com</p>
             */
            public Builder SSODomain(String SSODomain) {
                this.SSODomain = SSODomain;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1677810869300</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
