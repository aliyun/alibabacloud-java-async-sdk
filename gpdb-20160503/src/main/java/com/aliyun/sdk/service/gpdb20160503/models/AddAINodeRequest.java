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
         * <p>The ID of the resource pool to which the AI node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>aipool-xxxxx</p>
         */
        public Builder AINodePoolId(String AINodePoolId) {
            this.putQueryParameter("AINodePoolId", AINodePoolId);
            this.AINodePoolId = AINodePoolId;
            return this;
        }

        /**
         * <p>The AI node specifications.</p>
         * <p>This parameter is required.</p>
         */
        public Builder AINodeSpecInfos(java.util.List<AINodeSpecInfos> AINodeSpecInfos) {
            this.putQueryParameter("AINodeSpecInfos", AINodeSpecInfos);
            this.AINodeSpecInfos = AINodeSpecInfos;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
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
             * <p>The number of AI nodes.</p>
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
             * <p>The AI node specifications.</p>
             * <pre><code>ADB.AIStandard.1
             * ADB.AIMedium.1
             * ADB.AILarge.1
             * ADB.AIStandard.2
             * ADB.AIMedium.2
             * ADB.AILarge.2
             * ADB.AIXLarge.2
             * ADB.AIStandard.6
             * ADB.AIMedium.6
             * ADB.AILarge.6
             * ADB.AIXLarge.6
             * ADB.AIStandard.3
             * ADB.AIMedium.3
             * ADB.AILarge.3
             * ADB.AIXLarge.3
             * ADB.AIStandard.4
             * ADB.AIMedium.4
             * ADB.AILarge.4
             * ADB.AIXLarge.4
             * ADB.AIStandard.5
             * ADB.AIMedium.5
             * ADB.AILarge.5
             * ADB.AIXLarge.5
             * ADB.AIStandard.8
             * ADB.AIMedium.8
             * ADB.AILarge.8
             * ADB.AIXLarge.8
             * ADB.AI2XLarge.8
             * </code></pre>
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
