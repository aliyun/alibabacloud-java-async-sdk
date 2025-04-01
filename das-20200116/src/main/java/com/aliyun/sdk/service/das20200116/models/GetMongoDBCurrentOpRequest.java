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
 * {@link GetMongoDBCurrentOpRequest} extends {@link RequestModel}
 *
 * <p>GetMongoDBCurrentOpRequest</p>
 */
public class GetMongoDBCurrentOpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterDoc")
    private String filterDoc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    private GetMongoDBCurrentOpRequest(Builder builder) {
        super(builder);
        this.filterDoc = builder.filterDoc;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMongoDBCurrentOpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterDoc
     */
    public String getFilterDoc() {
        return this.filterDoc;
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

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder extends Request.Builder<GetMongoDBCurrentOpRequest, Builder> {
        private String filterDoc; 
        private String instanceId; 
        private String nodeId; 
        private String role; 

        private Builder() {
            super();
        } 

        private Builder(GetMongoDBCurrentOpRequest request) {
            super(request);
            this.filterDoc = request.filterDoc;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.role = request.role;
        } 

        /**
         * <p>The <code>db.currentOp()</code> command that is used to filter sessions. For more information, see <a href="https://docs.mongodb.com/manual/reference/method/db.currentOp/">db.currentOp()</a> of MongoDB Documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;active&quot; : true }</p>
         */
        public Builder filterDoc(String filterDoc) {
            this.putQueryParameter("FilterDoc", filterDoc);
            this.filterDoc = filterDoc;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-uf608087********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> If you do not specify a node ID, the sessions of the primary node are queried by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23302531</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>A reserved parameter. You do not need to specify the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        @Override
        public GetMongoDBCurrentOpRequest build() {
            return new GetMongoDBCurrentOpRequest(this);
        } 

    } 

}
