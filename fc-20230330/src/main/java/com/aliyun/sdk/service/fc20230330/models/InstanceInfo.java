// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link InstanceInfo} extends {@link TeaModel}
 *
 * <p>InstanceInfo</p>
 */
public class InstanceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTimeMs")
    private Long createdTimeMs;

    @com.aliyun.core.annotation.NameInMap("destroyedTimeMs")
    private Long destroyedTimeMs;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("versionId")
    private String versionId;

    private InstanceInfo(Builder builder) {
        this.createdTimeMs = builder.createdTimeMs;
        this.destroyedTimeMs = builder.destroyedTimeMs;
        this.instanceId = builder.instanceId;
        this.qualifier = builder.qualifier;
        this.status = builder.status;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceInfo create() {
        return builder().build();
    }

    /**
     * @return createdTimeMs
     */
    public Long getCreatedTimeMs() {
        return this.createdTimeMs;
    }

    /**
     * @return destroyedTimeMs
     */
    public Long getDestroyedTimeMs() {
        return this.destroyedTimeMs;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private Long createdTimeMs; 
        private Long destroyedTimeMs; 
        private String instanceId; 
        private String qualifier; 
        private String status; 
        private String versionId; 

        /**
         * createdTimeMs.
         */
        public Builder createdTimeMs(Long createdTimeMs) {
            this.createdTimeMs = createdTimeMs;
            return this;
        }

        /**
         * destroyedTimeMs.
         */
        public Builder destroyedTimeMs(Long destroyedTimeMs) {
            this.destroyedTimeMs = destroyedTimeMs;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public InstanceInfo build() {
            return new InstanceInfo(this);
        } 

    } 

}
