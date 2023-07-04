// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHighDefinitionMonitorLogAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHighDefinitionMonitorLogAttributeResponseBody</p>
 */
public class DescribeHighDefinitionMonitorLogAttributeResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("LogProject")
    private String logProject;

    @NameInMap("LogStore")
    private String logStore;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeHighDefinitionMonitorLogAttributeResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.logProject = builder.logProject;
        this.logStore = builder.logStore;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHighDefinitionMonitorLogAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return logProject
     */
    public String getLogProject() {
        return this.logProject;
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String instanceId; 
        private String instanceType; 
        private String logProject; 
        private String logStore; 
        private String requestId; 
        private String success; 

        /**
         * The ID of the fine-grained monitoring instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the monitoring instance that is queried. The value is set to **EIP**.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The name of the log project of Log Service.
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * The name of the Logstore of Log Service.
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation is performed. Valid values:
         * <p>
         * 
         * *   **true**: The operation is performed.
         * *   **false**: The operation is not performed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeHighDefinitionMonitorLogAttributeResponseBody build() {
            return new DescribeHighDefinitionMonitorLogAttributeResponseBody(this);
        } 

    } 

}
