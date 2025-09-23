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
 * {@link AddAINodeRequest} extends {@link RequestModel}
 *
 * <p>AddAINodeRequest</p>
 */
public class AddAINodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AINodePoolId")
    private String AINodePoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AINodeSpecInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AINodeSpecInfos> AINodeSpecInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    private AddAINodeRequest(Builder builder) {
        super(builder);
        this.AINodePoolId = builder.AINodePoolId;
        this.AINodeSpecInfos = builder.AINodeSpecInfos;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAINodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AINodePoolId
     */
    public String getAINodePoolId() {
        return this.AINodePoolId;
    }

    /**
     * @return AINodeSpecInfos
     */
    public java.util.List<AINodeSpecInfos> getAINodeSpecInfos() {
        return this.AINodeSpecInfos;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<AddAINodeRequest, Builder> {
        private String AINodePoolId; 
        private java.util.List<AINodeSpecInfos> AINodeSpecInfos; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(AddAINodeRequest request) {
            super(request);
            this.AINodePoolId = request.AINodePoolId;
            this.AINodeSpecInfos = request.AINodeSpecInfos;
            this.DBInstanceId = request.DBInstanceId;
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
         */
        public Builder AINodeSpecInfos(java.util.List<AINodeSpecInfos> AINodeSpecInfos) {
            this.putQueryParameter("AINodeSpecInfos", AINodeSpecInfos);
            this.AINodeSpecInfos = AINodeSpecInfos;
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

        @Override
        public AddAINodeRequest build() {
            return new AddAINodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddAINodeRequest} extends {@link TeaModel}
     *
     * <p>AddAINodeRequest</p>
     */
    public static class AINodeSpecInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeNum;

        @com.aliyun.core.annotation.NameInMap("NodeSpec")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeSpec;

        private AINodeSpecInfos(Builder builder) {
            this.nodeNum = builder.nodeNum;
            this.nodeSpec = builder.nodeSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AINodeSpecInfos create() {
            return builder().build();
        }

        /**
         * @return nodeNum
         */
        public String getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return nodeSpec
         */
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        public static final class Builder {
            private String nodeNum; 
            private String nodeSpec; 

            private Builder() {
            } 

            private Builder(AINodeSpecInfos model) {
                this.nodeNum = model.nodeNum;
                this.nodeSpec = model.nodeSpec;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeNum(String nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ADB.AIStandard.1</p>
             */
            public Builder nodeSpec(String nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            public AINodeSpecInfos build() {
                return new AINodeSpecInfos(this);
            } 

        } 

    }
}
