// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeVscResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVscResponseBody</p>
 */
public class DescribeVscResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VscId")
    private String vscId;

    @com.aliyun.core.annotation.NameInMap("VscName")
    private String vscName;

    @com.aliyun.core.annotation.NameInMap("VscType")
    private String vscType;

    private DescribeVscResponseBody(Builder builder) {
        this.nodeId = builder.nodeId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.vscId = builder.vscId;
        this.vscName = builder.vscName;
        this.vscType = builder.vscType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVscResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vscId
     */
    public String getVscId() {
        return this.vscId;
    }

    /**
     * @return vscName
     */
    public String getVscName() {
        return this.vscName;
    }

    /**
     * @return vscType
     */
    public String getVscType() {
        return this.vscType;
    }

    public static final class Builder {
        private String nodeId; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private String vscId; 
        private String vscName; 
        private String vscType; 

        private Builder() {
        } 

        private Builder(DescribeVscResponseBody model) {
            this.nodeId = model.nodeId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.vscId = model.vscId;
            this.vscName = model.vscName;
            this.vscType = model.vscType;
        } 

        /**
         * <p>ID of the compute node where the Vsc is located</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-kvw44e6dn04</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Resource Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2k3rqlvv6ytq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Status of the Vsc</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Vsc ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-001</p>
         */
        public Builder vscId(String vscId) {
            this.vscId = vscId;
            return this;
        }

        /**
         * <p>Custom name of the Vsc</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder vscName(String vscName) {
            this.vscName = vscName;
            return this;
        }

        /**
         * <p>Vsc type</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder vscType(String vscType) {
            this.vscType = vscType;
            return this;
        }

        public DescribeVscResponseBody build() {
            return new DescribeVscResponseBody(this);
        } 

    } 

}
