// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DeleteAINodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteAINodeRequest</p>
 */
public class DeleteAINodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AINodeNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer AINodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AINodePoolId")
    private String AINodePoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private java.util.List<String> nodeNames;

    private DeleteAINodeRequest(Builder builder) {
        super(builder);
        this.AINodeNum = builder.AINodeNum;
        this.AINodePoolId = builder.AINodePoolId;
        this.DBInstanceId = builder.DBInstanceId;
        this.nodeNames = builder.nodeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAINodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AINodeNum
     */
    public Integer getAINodeNum() {
        return this.AINodeNum;
    }

    /**
     * @return AINodePoolId
     */
    public String getAINodePoolId() {
        return this.AINodePoolId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return nodeNames
     */
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public static final class Builder extends Request.Builder<DeleteAINodeRequest, Builder> {
        private Integer AINodeNum; 
        private String AINodePoolId; 
        private String DBInstanceId; 
        private java.util.List<String> nodeNames; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAINodeRequest request) {
            super(request);
            this.AINodeNum = request.AINodeNum;
            this.AINodePoolId = request.AINodePoolId;
            this.DBInstanceId = request.DBInstanceId;
            this.nodeNames = request.nodeNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder AINodeNum(Integer AINodeNum) {
            this.putQueryParameter("AINodeNum", AINodeNum);
            this.AINodeNum = AINodeNum;
            return this;
        }

        /**
         * AINodePoolId.
         */
        public Builder AINodePoolId(String AINodePoolId) {
            this.putQueryParameter("AINodePoolId", AINodePoolId);
            this.AINodePoolId = AINodePoolId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * NodeNames.
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            this.putQueryParameter("NodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        @Override
        public DeleteAINodeRequest build() {
            return new DeleteAINodeRequest(this);
        } 

    } 

}
