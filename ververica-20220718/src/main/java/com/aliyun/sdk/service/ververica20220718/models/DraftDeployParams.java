// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DraftDeployParams} extends {@link TeaModel}
 *
 * <p>DraftDeployParams</p>
 */
public class DraftDeployParams extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deploymentDraftId")
    private String deploymentDraftId;

    @com.aliyun.core.annotation.NameInMap("deploymentTarget")
    private BriefDeploymentTarget deploymentTarget;

    @com.aliyun.core.annotation.NameInMap("skipValidate")
    private Boolean skipValidate;

    private DraftDeployParams(Builder builder) {
        this.deploymentDraftId = builder.deploymentDraftId;
        this.deploymentTarget = builder.deploymentTarget;
        this.skipValidate = builder.skipValidate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DraftDeployParams create() {
        return builder().build();
    }

    /**
     * @return deploymentDraftId
     */
    public String getDeploymentDraftId() {
        return this.deploymentDraftId;
    }

    /**
     * @return deploymentTarget
     */
    public BriefDeploymentTarget getDeploymentTarget() {
        return this.deploymentTarget;
    }

    /**
     * @return skipValidate
     */
    public Boolean getSkipValidate() {
        return this.skipValidate;
    }

    public static final class Builder {
        private String deploymentDraftId; 
        private BriefDeploymentTarget deploymentTarget; 
        private Boolean skipValidate; 

        /**
         * deploymentDraftId.
         */
        public Builder deploymentDraftId(String deploymentDraftId) {
            this.deploymentDraftId = deploymentDraftId;
            return this;
        }

        /**
         * deploymentTarget.
         */
        public Builder deploymentTarget(BriefDeploymentTarget deploymentTarget) {
            this.deploymentTarget = deploymentTarget;
            return this;
        }

        /**
         * skipValidate.
         */
        public Builder skipValidate(Boolean skipValidate) {
            this.skipValidate = skipValidate;
            return this;
        }

        public DraftDeployParams build() {
            return new DraftDeployParams(this);
        } 

    } 

}
