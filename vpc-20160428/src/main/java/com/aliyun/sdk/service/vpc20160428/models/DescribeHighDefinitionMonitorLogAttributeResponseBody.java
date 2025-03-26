// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeHighDefinitionMonitorLogAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHighDefinitionMonitorLogAttributeResponseBody</p>
 */
public class DescribeHighDefinitionMonitorLogAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("LogProject")
    private String logProject;

    @com.aliyun.core.annotation.NameInMap("LogStore")
    private String logStore;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHighDefinitionMonitorLogAttributeResponseBody model) {
            this.instanceId = model.instanceId;
            this.instanceType = model.instanceType;
            this.logProject = model.logProject;
            this.logStore = model.logStore;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the instance whose fine-grained monitoring configurations you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-wz9fi6qboho9fwgx7****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of instance for which you want to query fine-grained monitoring. Only <strong>EIP</strong> may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>hdmonitor-cn-shenzhen-1658206966225390</p>
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>hdmonitor</p>
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
