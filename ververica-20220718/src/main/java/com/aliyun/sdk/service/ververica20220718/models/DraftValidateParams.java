// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link DraftValidateParams} extends {@link TeaModel}
 *
 * <p>DraftValidateParams</p>
 */
public class DraftValidateParams extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deploymentDraftId")
    private String deploymentDraftId;

    @com.aliyun.core.annotation.NameInMap("deploymentTargetName")
    private String deploymentTargetName;

    private DraftValidateParams(Builder builder) {
        this.deploymentDraftId = builder.deploymentDraftId;
        this.deploymentTargetName = builder.deploymentTargetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DraftValidateParams create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentDraftId
     */
    public String getDeploymentDraftId() {
        return this.deploymentDraftId;
    }

    /**
     * @return deploymentTargetName
     */
    public String getDeploymentTargetName() {
        return this.deploymentTargetName;
    }

    public static final class Builder {
        private String deploymentDraftId; 
        private String deploymentTargetName; 

        private Builder() {
        } 

        private Builder(DraftValidateParams model) {
            this.deploymentDraftId = model.deploymentDraftId;
            this.deploymentTargetName = model.deploymentTargetName;
        } 

        /**
         * deploymentDraftId.
         */
        public Builder deploymentDraftId(String deploymentDraftId) {
            this.deploymentDraftId = deploymentDraftId;
            return this;
        }

        /**
         * deploymentTargetName.
         */
        public Builder deploymentTargetName(String deploymentTargetName) {
            this.deploymentTargetName = deploymentTargetName;
            return this;
        }

        public DraftValidateParams build() {
            return new DraftValidateParams(this);
        } 

    } 

}
