// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIndexVersionRequest} extends {@link RequestModel}
 *
 * <p>ModifyIndexVersionRequest</p>
 */
public class ModifyIndexVersionRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("clusterName")
    private String clusterName;

    @Body
    @NameInMap("body")
    private java.util.List < ModifyIndexVersionRequestBody> body;

    private ModifyIndexVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clusterName = builder.clusterName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIndexVersionRequest create() {
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
     * @return body
     */
    public java.util.List < ModifyIndexVersionRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifyIndexVersionRequest, Builder> {
        private String instanceId; 
        private String clusterName; 
        private java.util.List < ModifyIndexVersionRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIndexVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clusterName = request.clusterName;
            this.body = request.body;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder clusterName(String clusterName) {
            this.putPathParameter("clusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The keyword used to search for a version. Fuzzy match is supported.
         */
        public Builder body(java.util.List < ModifyIndexVersionRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifyIndexVersionRequest build() {
            return new ModifyIndexVersionRequest(this);
        } 

    } 

    public static class ModifyIndexVersionRequestBody extends TeaModel {
        @NameInMap("buildDeployId")
        private String buildDeployId;

        @NameInMap("indexName")
        private String indexName;

        @NameInMap("version")
        private String version;

        private ModifyIndexVersionRequestBody(Builder builder) {
            this.buildDeployId = builder.buildDeployId;
            this.indexName = builder.indexName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyIndexVersionRequestBody create() {
            return builder().build();
        }

        /**
         * @return buildDeployId
         */
        public String getBuildDeployId() {
            return this.buildDeployId;
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String buildDeployId; 
            private String indexName; 
            private String version; 

            /**
             * The ID of the index deployed in offline mode.
             */
            public Builder buildDeployId(String buildDeployId) {
                this.buildDeployId = buildDeployId;
                return this;
            }

            /**
             * The name of the index.
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * The version of the index.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ModifyIndexVersionRequestBody build() {
                return new ModifyIndexVersionRequestBody(this);
            } 

        } 

    }
}
