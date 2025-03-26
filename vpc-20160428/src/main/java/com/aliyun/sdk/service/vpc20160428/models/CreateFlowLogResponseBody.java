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
 * {@link CreateFlowLogResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFlowLogResponseBody</p>
 */
public class CreateFlowLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowLogId")
    private String flowLogId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateFlowLogResponseBody(Builder builder) {
        this.flowLogId = builder.flowLogId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowLogId
     */
    public String getFlowLogId() {
        return this.flowLogId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String flowLogId; 
        private String requestId; 
        private String resourceGroupId; 
        private String success; 

        private Builder() {
        } 

        private Builder(CreateFlowLogResponseBody model) {
            this.flowLogId = model.flowLogId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>fl-m5e8vhz2t21sel1nq****</p>
         */
        public Builder flowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazdjdhd****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateFlowLogResponseBody build() {
            return new CreateFlowLogResponseBody(this);
        } 

    } 

}
