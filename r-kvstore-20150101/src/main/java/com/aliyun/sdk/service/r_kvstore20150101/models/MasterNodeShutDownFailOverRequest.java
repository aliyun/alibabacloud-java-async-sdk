// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MasterNodeShutDownFailOverRequest} extends {@link RequestModel}
 *
 * <p>MasterNodeShutDownFailOverRequest</p>
 */
public class MasterNodeShutDownFailOverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBFaultMode")
    private String DBFaultMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodes")
    private String DBNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailMode")
    private String failMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyFaultMode")
    private String proxyFaultMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyInstanceIds")
    private String proxyInstanceIds;

    private MasterNodeShutDownFailOverRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.DBFaultMode = builder.DBFaultMode;
        this.DBNodes = builder.DBNodes;
        this.failMode = builder.failMode;
        this.instanceId = builder.instanceId;
        this.proxyFaultMode = builder.proxyFaultMode;
        this.proxyInstanceIds = builder.proxyInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MasterNodeShutDownFailOverRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return DBFaultMode
     */
    public String getDBFaultMode() {
        return this.DBFaultMode;
    }

    /**
     * @return DBNodes
     */
    public String getDBNodes() {
        return this.DBNodes;
    }

    /**
     * @return failMode
     */
    public String getFailMode() {
        return this.failMode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return proxyFaultMode
     */
    public String getProxyFaultMode() {
        return this.proxyFaultMode;
    }

    /**
     * @return proxyInstanceIds
     */
    public String getProxyInstanceIds() {
        return this.proxyInstanceIds;
    }

    public static final class Builder extends Request.Builder<MasterNodeShutDownFailOverRequest, Builder> {
        private String category; 
        private String DBFaultMode; 
        private String DBNodes; 
        private String failMode; 
        private String instanceId; 
        private String proxyFaultMode; 
        private String proxyInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(MasterNodeShutDownFailOverRequest request) {
            super(request);
            this.category = request.category;
            this.DBFaultMode = request.DBFaultMode;
            this.DBNodes = request.DBNodes;
            this.failMode = request.failMode;
            this.instanceId = request.instanceId;
            this.proxyFaultMode = request.proxyFaultMode;
            this.proxyInstanceIds = request.proxyInstanceIds;
        } 

        /**
         * <p>The resource category. Set the value to instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <ul>
         * <li>Specify: This mode allows you to specify a database node to use.</li>
         * <li>Random: In this mode, a random database node is selected when no database node is specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Random</p>
         */
        public Builder DBFaultMode(String DBFaultMode) {
            this.putQueryParameter("DBFaultMode", DBFaultMode);
            this.DBFaultMode = DBFaultMode;
            return this;
        }

        /**
         * <p>The IDs of the database nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>r-rdsdavinx01003-db-0,r-rdsdavinx01003-db-1</p>
         */
        public Builder DBNodes(String DBNodes) {
            this.putQueryParameter("DBNodes", DBNodes);
            this.DBNodes = DBNodes;
            return this;
        }

        /**
         * <ul>
         * <li>Safe: safe shutdown. This mode involves using redis_safe to shut down the Redis process.</li>
         * <li>UnSafe: non-secure shutdown. This mode involves using the shutdown command to shut down the Redis process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Safe</p>
         */
        public Builder failMode(String failMode) {
            this.putQueryParameter("FailMode", failMode);
            this.failMode = failMode;
            return this;
        }

        /**
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/60933.html">DescribeInstances</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <ul>
         * <li>Specify: This mode allows you to specify a proxy node to use.</li>
         * <li>Random: In this mode, a random proxy node is selected when no proxy node is specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Specify</p>
         */
        public Builder proxyFaultMode(String proxyFaultMode) {
            this.putQueryParameter("ProxyFaultMode", proxyFaultMode);
            this.proxyFaultMode = proxyFaultMode;
            return this;
        }

        /**
         * <p>The IDs of the proxy nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>6981,6982</p>
         */
        public Builder proxyInstanceIds(String proxyInstanceIds) {
            this.putQueryParameter("ProxyInstanceIds", proxyInstanceIds);
            this.proxyInstanceIds = proxyInstanceIds;
            return this;
        }

        @Override
        public MasterNodeShutDownFailOverRequest build() {
            return new MasterNodeShutDownFailOverRequest(this);
        } 

    } 

}
