// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ListSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListSchemasRequest</p>
 */
public class ListSchemasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessKey")
    private String accessKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessSecret")
    private String accessSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("partition")
    private String partition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ListSchemasRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.accessKey = builder.accessKey;
        this.accessSecret = builder.accessSecret;
        this.endpoint = builder.endpoint;
        this.namespace = builder.namespace;
        this.partition = builder.partition;
        this.project = builder.project;
        this.table = builder.table;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchemasRequest create() {
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
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return accessSecret
     */
    public String getAccessSecret() {
        return this.accessSecret;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return partition
     */
    public String getPartition() {
        return this.partition;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListSchemasRequest, Builder> {
        private String instanceId; 
        private String accessKey; 
        private String accessSecret; 
        private String endpoint; 
        private String namespace; 
        private String partition; 
        private String project; 
        private String table; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListSchemasRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.accessKey = request.accessKey;
            this.accessSecret = request.accessSecret;
            this.endpoint = request.endpoint;
            this.namespace = request.namespace;
            this.partition = request.partition;
            this.project = request.project;
            this.table = request.table;
            this.type = request.type;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rq6610a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The AccessKey ID of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ak</p>
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("accessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * <p>The AccessKey secret of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p>as</p>
         */
        public Builder accessSecret(String accessSecret) {
            this.putQueryParameter("accessSecret", accessSecret);
            this.accessSecret = accessSecret;
            return this;
        }

        /**
         * <p>The endpoint of the MaxCompute data source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The namespace of the SARO data source.</p>
         * 
         * <strong>example:</strong>
         * <p>igraph-cn-tl32wnrhi04</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The shard name.</p>
         * 
         * <strong>example:</strong>
         * <p>dt=20230520</p>
         */
        public Builder partition(String partition) {
            this.putQueryParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * <p>The name of the MaxCompute project that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>start-flask-v3-obcc</p>
         */
        public Builder project(String project) {
            this.putQueryParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the MaxCompute table that is used as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        public Builder table(String table) {
            this.putQueryParameter("table", table);
            this.table = table;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values: odps, swift, saro, oss, and unKnow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListSchemasRequest build() {
            return new ListSchemasRequest(this);
        } 

    } 

}
