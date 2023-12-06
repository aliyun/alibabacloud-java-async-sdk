// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductComponentVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductComponentVersionRequest</p>
 */
public class UpdateProductComponentVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("relationUID")
    @Validation(required = true)
    private String relationUID;

    @Body
    @NameInMap("componentOrchestrationValues")
    private String componentOrchestrationValues;

    @Body
    @NameInMap("componentSpecificationUid")
    private String componentSpecificationUid;

    @Body
    @NameInMap("componentSpecificationValues")
    private String componentSpecificationValues;

    @Body
    @NameInMap("enable")
    private Boolean enable;

    @Body
    @NameInMap("newComponentVersionUID")
    private String newComponentVersionUID;

    @Body
    @NameInMap("policy")
    private Policy policy;

    @Body
    @NameInMap("releaseName")
    private String releaseName;

    @Body
    @NameInMap("unsetComponentVersionSpec")
    private Boolean unsetComponentVersionSpec;

    private UpdateProductComponentVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.relationUID = builder.relationUID;
        this.componentOrchestrationValues = builder.componentOrchestrationValues;
        this.componentSpecificationUid = builder.componentSpecificationUid;
        this.componentSpecificationValues = builder.componentSpecificationValues;
        this.enable = builder.enable;
        this.newComponentVersionUID = builder.newComponentVersionUID;
        this.policy = builder.policy;
        this.releaseName = builder.releaseName;
        this.unsetComponentVersionSpec = builder.unsetComponentVersionSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductComponentVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return relationUID
     */
    public String getRelationUID() {
        return this.relationUID;
    }

    /**
     * @return componentOrchestrationValues
     */
    public String getComponentOrchestrationValues() {
        return this.componentOrchestrationValues;
    }

    /**
     * @return componentSpecificationUid
     */
    public String getComponentSpecificationUid() {
        return this.componentSpecificationUid;
    }

    /**
     * @return componentSpecificationValues
     */
    public String getComponentSpecificationValues() {
        return this.componentSpecificationValues;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return newComponentVersionUID
     */
    public String getNewComponentVersionUID() {
        return this.newComponentVersionUID;
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    /**
     * @return unsetComponentVersionSpec
     */
    public Boolean getUnsetComponentVersionSpec() {
        return this.unsetComponentVersionSpec;
    }

    public static final class Builder extends Request.Builder<UpdateProductComponentVersionRequest, Builder> {
        private String uid; 
        private String relationUID; 
        private String componentOrchestrationValues; 
        private String componentSpecificationUid; 
        private String componentSpecificationValues; 
        private Boolean enable; 
        private String newComponentVersionUID; 
        private Policy policy; 
        private String releaseName; 
        private Boolean unsetComponentVersionSpec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductComponentVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.relationUID = request.relationUID;
            this.componentOrchestrationValues = request.componentOrchestrationValues;
            this.componentSpecificationUid = request.componentSpecificationUid;
            this.componentSpecificationValues = request.componentSpecificationValues;
            this.enable = request.enable;
            this.newComponentVersionUID = request.newComponentVersionUID;
            this.policy = request.policy;
            this.releaseName = request.releaseName;
            this.unsetComponentVersionSpec = request.unsetComponentVersionSpec;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * relationUID.
         */
        public Builder relationUID(String relationUID) {
            this.putPathParameter("relationUID", relationUID);
            this.relationUID = relationUID;
            return this;
        }

        /**
         * componentOrchestrationValues.
         */
        public Builder componentOrchestrationValues(String componentOrchestrationValues) {
            this.putBodyParameter("componentOrchestrationValues", componentOrchestrationValues);
            this.componentOrchestrationValues = componentOrchestrationValues;
            return this;
        }

        /**
         * componentSpecificationUid.
         */
        public Builder componentSpecificationUid(String componentSpecificationUid) {
            this.putBodyParameter("componentSpecificationUid", componentSpecificationUid);
            this.componentSpecificationUid = componentSpecificationUid;
            return this;
        }

        /**
         * componentSpecificationValues.
         */
        public Builder componentSpecificationValues(String componentSpecificationValues) {
            this.putBodyParameter("componentSpecificationValues", componentSpecificationValues);
            this.componentSpecificationValues = componentSpecificationValues;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * newComponentVersionUID.
         */
        public Builder newComponentVersionUID(String newComponentVersionUID) {
            this.putBodyParameter("newComponentVersionUID", newComponentVersionUID);
            this.newComponentVersionUID = newComponentVersionUID;
            return this;
        }

        /**
         * policy.
         */
        public Builder policy(Policy policy) {
            this.putBodyParameter("policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * releaseName.
         */
        public Builder releaseName(String releaseName) {
            this.putBodyParameter("releaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        /**
         * unsetComponentVersionSpec.
         */
        public Builder unsetComponentVersionSpec(Boolean unsetComponentVersionSpec) {
            this.putBodyParameter("unsetComponentVersionSpec", unsetComponentVersionSpec);
            this.unsetComponentVersionSpec = unsetComponentVersionSpec;
            return this;
        }

        @Override
        public UpdateProductComponentVersionRequest build() {
            return new UpdateProductComponentVersionRequest(this);
        } 

    } 

    public static class MultiCluster extends TeaModel {
        @NameInMap("autoInstall")
        private Boolean autoInstall;

        @NameInMap("targetClusters")
        private java.util.List < String > targetClusters;

        private MultiCluster(Builder builder) {
            this.autoInstall = builder.autoInstall;
            this.targetClusters = builder.targetClusters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiCluster create() {
            return builder().build();
        }

        /**
         * @return autoInstall
         */
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        /**
         * @return targetClusters
         */
        public java.util.List < String > getTargetClusters() {
            return this.targetClusters;
        }

        public static final class Builder {
            private Boolean autoInstall; 
            private java.util.List < String > targetClusters; 

            /**
             * autoInstall.
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * targetClusters.
             */
            public Builder targetClusters(java.util.List < String > targetClusters) {
                this.targetClusters = targetClusters;
                return this;
            }

            public MultiCluster build() {
                return new MultiCluster(this);
            } 

        } 

    }
    public static class Policy extends TeaModel {
        @NameInMap("multiCluster")
        private MultiCluster multiCluster;

        private Policy(Builder builder) {
            this.multiCluster = builder.multiCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return multiCluster
         */
        public MultiCluster getMultiCluster() {
            return this.multiCluster;
        }

        public static final class Builder {
            private MultiCluster multiCluster; 

            /**
             * multiCluster.
             */
            public Builder multiCluster(MultiCluster multiCluster) {
                this.multiCluster = multiCluster;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
