// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListInstancesOutput} extends {@link TeaModel}
 *
 * <p>ListInstancesOutput</p>
 */
public class ListInstancesOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentError")
    private String currentError;

    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<InstanceInfo> instances;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("versionStatus")
    private java.util.Map<String, VersionStatus> versionStatus;

    private ListInstancesOutput(Builder builder) {
        this.currentError = builder.currentError;
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.versionStatus = builder.versionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesOutput create() {
        return builder().build();
    }

    /**
     * @return currentError
     */
    public String getCurrentError() {
        return this.currentError;
    }

    /**
     * @return instances
     */
    public java.util.List<InstanceInfo> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionStatus
     */
    public java.util.Map<String, VersionStatus> getVersionStatus() {
        return this.versionStatus;
    }

    public static final class Builder {
        private String currentError; 
        private java.util.List<InstanceInfo> instances; 
        private String requestId; 
        private java.util.Map<String, VersionStatus> versionStatus; 

        /**
         * currentError.
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * instances.
         */
        public Builder instances(java.util.List<InstanceInfo> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * versionStatus.
         */
        public Builder versionStatus(java.util.Map<String, VersionStatus> versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }

        public ListInstancesOutput build() {
            return new ListInstancesOutput(this);
        } 

    } 

}
