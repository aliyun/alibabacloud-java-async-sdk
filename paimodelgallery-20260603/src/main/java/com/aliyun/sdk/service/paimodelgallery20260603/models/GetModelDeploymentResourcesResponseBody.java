// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20260603.models;

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
 * {@link GetModelDeploymentResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelDeploymentResourcesResponseBody</p>
 */
public class GetModelDeploymentResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MemberMatches")
    private java.util.List<MemberMatches> memberMatches;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetModelDeploymentResourcesResponseBody(Builder builder) {
        this.memberMatches = builder.memberMatches;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelDeploymentResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberMatches
     */
    public java.util.List<MemberMatches> getMemberMatches() {
        return this.memberMatches;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MemberMatches> memberMatches; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetModelDeploymentResourcesResponseBody model) {
            this.memberMatches = model.memberMatches;
            this.requestId = model.requestId;
        } 

        /**
         * MemberMatches.
         */
        public Builder memberMatches(java.util.List<MemberMatches> memberMatches) {
            this.memberMatches = memberMatches;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetModelDeploymentResourcesResponseBody build() {
            return new GetModelDeploymentResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelDeploymentResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelDeploymentResourcesResponseBody</p>
     */
    public static class DedicatedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private DedicatedResources(Builder builder) {
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedResources create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private String resourceId; 

            private Builder() {
            } 

            private Builder(DedicatedResources model) {
                this.resourceId = model.resourceId;
            } 

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public DedicatedResources build() {
                return new DedicatedResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelDeploymentResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelDeploymentResourcesResponseBody</p>
     */
    public static class PublicResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private PublicResources(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicResources create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            private Builder() {
            } 

            private Builder(PublicResources model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public PublicResources build() {
                return new PublicResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelDeploymentResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelDeploymentResourcesResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaId")
        private String quotaId;

        private Quotas(Builder builder) {
            this.quotaId = builder.quotaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return quotaId
         */
        public String getQuotaId() {
            return this.quotaId;
        }

        public static final class Builder {
            private String quotaId; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.quotaId = model.quotaId;
            } 

            /**
             * QuotaId.
             */
            public Builder quotaId(String quotaId) {
                this.quotaId = quotaId;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelDeploymentResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelDeploymentResourcesResponseBody</p>
     */
    public static class MemberMatches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedResources")
        private java.util.List<DedicatedResources> dedicatedResources;

        @com.aliyun.core.annotation.NameInMap("MemberType")
        private String memberType;

        @com.aliyun.core.annotation.NameInMap("PublicResources")
        private java.util.List<PublicResources> publicResources;

        @com.aliyun.core.annotation.NameInMap("Quotas")
        private java.util.List<Quotas> quotas;

        private MemberMatches(Builder builder) {
            this.dedicatedResources = builder.dedicatedResources;
            this.memberType = builder.memberType;
            this.publicResources = builder.publicResources;
            this.quotas = builder.quotas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberMatches create() {
            return builder().build();
        }

        /**
         * @return dedicatedResources
         */
        public java.util.List<DedicatedResources> getDedicatedResources() {
            return this.dedicatedResources;
        }

        /**
         * @return memberType
         */
        public String getMemberType() {
            return this.memberType;
        }

        /**
         * @return publicResources
         */
        public java.util.List<PublicResources> getPublicResources() {
            return this.publicResources;
        }

        /**
         * @return quotas
         */
        public java.util.List<Quotas> getQuotas() {
            return this.quotas;
        }

        public static final class Builder {
            private java.util.List<DedicatedResources> dedicatedResources; 
            private String memberType; 
            private java.util.List<PublicResources> publicResources; 
            private java.util.List<Quotas> quotas; 

            private Builder() {
            } 

            private Builder(MemberMatches model) {
                this.dedicatedResources = model.dedicatedResources;
                this.memberType = model.memberType;
                this.publicResources = model.publicResources;
                this.quotas = model.quotas;
            } 

            /**
             * DedicatedResources.
             */
            public Builder dedicatedResources(java.util.List<DedicatedResources> dedicatedResources) {
                this.dedicatedResources = dedicatedResources;
                return this;
            }

            /**
             * MemberType.
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            /**
             * PublicResources.
             */
            public Builder publicResources(java.util.List<PublicResources> publicResources) {
                this.publicResources = publicResources;
                return this;
            }

            /**
             * Quotas.
             */
            public Builder quotas(java.util.List<Quotas> quotas) {
                this.quotas = quotas;
                return this;
            }

            public MemberMatches build() {
                return new MemberMatches(this);
            } 

        } 

    }
}
