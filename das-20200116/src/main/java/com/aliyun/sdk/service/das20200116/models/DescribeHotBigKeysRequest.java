// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeHotBigKeysRequest} extends {@link RequestModel}
 *
 * <p>DescribeHotBigKeysRequest</p>
 */
public class DescribeHotBigKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private DescribeHotBigKeysRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHotBigKeysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<DescribeHotBigKeysRequest, Builder> {
        private String consoleContext; 
        private String instanceId; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHotBigKeysRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
        } 

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * <p>The ID of the ApsaraDB for Redis instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp18ff4a195d****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the data shard on the ApsaraDB for Redis instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-****-db-0</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public DescribeHotBigKeysRequest build() {
            return new DescribeHotBigKeysRequest(this);
        } 

    } 

}
