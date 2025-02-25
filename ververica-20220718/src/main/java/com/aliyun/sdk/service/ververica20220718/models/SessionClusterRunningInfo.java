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
 * {@link SessionClusterRunningInfo} extends {@link TeaModel}
 *
 * <p>SessionClusterRunningInfo</p>
 */
public class SessionClusterRunningInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("lastUpdateTime")
    private Long lastUpdateTime;

    @com.aliyun.core.annotation.NameInMap("referenceDeploymentIds")
    private java.util.List<String> referenceDeploymentIds;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private Long startedAt;

    private SessionClusterRunningInfo(Builder builder) {
        this.lastUpdateTime = builder.lastUpdateTime;
        this.referenceDeploymentIds = builder.referenceDeploymentIds;
        this.startedAt = builder.startedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SessionClusterRunningInfo create() {
        return builder().build();
    }

    /**
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * @return referenceDeploymentIds
     */
    public java.util.List<String> getReferenceDeploymentIds() {
        return this.referenceDeploymentIds;
    }

    /**
     * @return startedAt
     */
    public Long getStartedAt() {
        return this.startedAt;
    }

    public static final class Builder {
        private Long lastUpdateTime; 
        private java.util.List<String> referenceDeploymentIds; 
        private Long startedAt; 

        /**
         * lastUpdateTime.
         */
        public Builder lastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * referenceDeploymentIds.
         */
        public Builder referenceDeploymentIds(java.util.List<String> referenceDeploymentIds) {
            this.referenceDeploymentIds = referenceDeploymentIds;
            return this;
        }

        /**
         * startedAt.
         */
        public Builder startedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        public SessionClusterRunningInfo build() {
            return new SessionClusterRunningInfo(this);
        } 

    } 

}
