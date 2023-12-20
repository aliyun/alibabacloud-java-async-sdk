// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEiamInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEiamInstancesResponseBody</p>
 */
public class ListEiamInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
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

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEiamInstancesResponseBody build() {
            return new ListEiamInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DeveloperAPIPrivateDomain")
        private String developerAPIPrivateDomain;

        @NameInMap("DeveloperAPIPublicDomain")
        private String developerAPIPublicDomain;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceVersion")
        private String instanceVersion;

        @NameInMap("OpenAPIPrivateDomain")
        private String openAPIPrivateDomain;

        @NameInMap("OpenAPIPublicDomain")
        private String openAPIPublicDomain;

        @NameInMap("SSODomain")
        private String SSODomain;

        @NameInMap("StartTime")
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

            /**
             * 实例描述信息
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 实例developer私网域名地址
             */
            public Builder developerAPIPrivateDomain(String developerAPIPrivateDomain) {
                this.developerAPIPrivateDomain = developerAPIPrivateDomain;
                return this;
            }

            /**
             * 实例developer公网域名地址
             */
            public Builder developerAPIPublicDomain(String developerAPIPublicDomain) {
                this.developerAPIPublicDomain = developerAPIPublicDomain;
                return this;
            }

            /**
             * 实例id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 实例状态，Pending(初始状态)、Creating(创建中)、Running(运行中)、Disabled(禁用)、CreateFailed(创建失败)
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * 实例版本，EIAM2.0/ EIAM1.0
             */
            public Builder instanceVersion(String instanceVersion) {
                this.instanceVersion = instanceVersion;
                return this;
            }

            /**
             * 实例openApi私网域名地址
             */
            public Builder openAPIPrivateDomain(String openAPIPrivateDomain) {
                this.openAPIPrivateDomain = openAPIPrivateDomain;
                return this;
            }

            /**
             * 实例openApi公网域名地址
             */
            public Builder openAPIPublicDomain(String openAPIPublicDomain) {
                this.openAPIPublicDomain = openAPIPublicDomain;
                return this;
            }

            /**
             * 实例域名地址
             */
            public Builder SSODomain(String SSODomain) {
                this.SSODomain = SSODomain;
                return this;
            }

            /**
             * 实例的创建时间
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
