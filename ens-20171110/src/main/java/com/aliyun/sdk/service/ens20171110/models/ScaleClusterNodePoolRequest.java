// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ScaleClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>ScaleClusterNodePoolRequest</p>
 */
public class ScaleClusterNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    private ScaleClusterNodePoolRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodepoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    private ScaleClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleClusterNodePoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ScaleClusterNodePoolRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public static final class Builder extends Request.Builder<ScaleClusterNodePoolRequest, Builder> {
        private ScaleClusterNodePoolRequestBody body; 
        private String clusterId; 
        private String nodepoolId; 

        private Builder() {
            super();
        } 

        private Builder(ScaleClusterNodePoolRequest request) {
            super(request);
            this.body = request.body;
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
        } 

        /**
         * Body.
         */
        public Builder body(ScaleClusterNodePoolRequestBody body) {
            String bodyShrink = shrink(body, "Body", "json");
            this.putQueryParameter("Body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eck-xxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np2201da356f5245cf8faa522a8a4c8224</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putQueryParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        @Override
        public ScaleClusterNodePoolRequest build() {
            return new ScaleClusterNodePoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link ScaleClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ScaleClusterNodePoolRequest</p>
     */
    public static class ScaleClusterNodePoolRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer count;

        private ScaleClusterNodePoolRequestBody(Builder builder) {
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleClusterNodePoolRequestBody create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private Integer count; 

            private Builder() {
            } 

            private Builder(ScaleClusterNodePoolRequestBody model) {
                this.count = model.count;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public ScaleClusterNodePoolRequestBody build() {
                return new ScaleClusterNodePoolRequestBody(this);
            } 

        } 

    }
}
