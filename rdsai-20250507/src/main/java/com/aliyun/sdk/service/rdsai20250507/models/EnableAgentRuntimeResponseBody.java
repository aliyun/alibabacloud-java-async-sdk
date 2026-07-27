// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link EnableAgentRuntimeResponseBody} extends {@link TeaModel}
 *
 * <p>EnableAgentRuntimeResponseBody</p>
 */
public class EnableAgentRuntimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BranchName")
    private String branchName;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableAgentRuntimeResponseBody(Builder builder) {
        this.branchName = builder.branchName;
        this.instanceName = builder.instanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAgentRuntimeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String branchName; 
        private String instanceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EnableAgentRuntimeResponseBody model) {
            this.branchName = model.branchName;
            this.instanceName = model.instanceName;
            this.requestId = model.requestId;
        } 

        /**
         * BranchName.
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableAgentRuntimeResponseBody build() {
            return new EnableAgentRuntimeResponseBody(this);
        } 

    } 

}
