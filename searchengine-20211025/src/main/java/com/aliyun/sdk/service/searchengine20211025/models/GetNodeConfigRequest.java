// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetNodeConfigRequest} extends {@link RequestModel}
 *
 * <p>GetNodeConfigRequest</p>
 */
public class GetNodeConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GetNodeConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clusterName = builder.clusterName;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeConfigRequest create() {
        return builder().build();
    }

    @Override
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetNodeConfigRequest, Builder> {
        private String instanceId; 
        private String clusterName; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clusterName = request.clusterName;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rewdi02</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the cluster</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_sh_domain_2</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("clusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-30174dhoz53_qrs</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>qrs: Query Result Searcher (QRS) worker</li>
         * <li>search: Search worker</li>
         * <li>index: index</li>
         * <li>cluster: cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>index</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetNodeConfigRequest build() {
            return new GetNodeConfigRequest(this);
        } 

    } 

}
