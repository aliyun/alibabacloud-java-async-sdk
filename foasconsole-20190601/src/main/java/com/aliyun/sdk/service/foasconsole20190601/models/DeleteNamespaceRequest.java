// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

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
 * {@link DeleteNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteNamespaceRequest</p>
 */
public class DeleteNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteNamespaceRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteNamespaceRequestDeleteNamespaceRequest deleteNamespaceRequest;

    private DeleteNamespaceRequest(Builder builder) {
        super(builder);
        this.deleteNamespaceRequest = builder.deleteNamespaceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNamespaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteNamespaceRequest
     */
    public DeleteNamespaceRequestDeleteNamespaceRequest getDeleteNamespaceRequest() {
        return this.deleteNamespaceRequest;
    }

    public static final class Builder extends Request.Builder<DeleteNamespaceRequest, Builder> {
        private DeleteNamespaceRequestDeleteNamespaceRequest deleteNamespaceRequest; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNamespaceRequest request) {
            super(request);
            this.deleteNamespaceRequest = request.deleteNamespaceRequest;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deleteNamespaceRequest(DeleteNamespaceRequestDeleteNamespaceRequest deleteNamespaceRequest) {
            this.putBodyParameter("DeleteNamespaceRequest", deleteNamespaceRequest);
            this.deleteNamespaceRequest = deleteNamespaceRequest;
            return this;
        }

        @Override
        public DeleteNamespaceRequest build() {
            return new DeleteNamespaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteNamespaceRequest} extends {@link TeaModel}
     *
     * <p>DeleteNamespaceRequest</p>
     */
    public static class DeleteNamespaceRequestDeleteNamespaceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        private DeleteNamespaceRequestDeleteNamespaceRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteNamespaceRequestDeleteNamespaceRequest create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String instanceId; 
            private String namespace; 
            private String region; 

            private Builder() {
            } 

            private Builder(DeleteNamespaceRequestDeleteNamespaceRequest model) {
                this.instanceId = model.instanceId;
                this.namespace = model.namespace;
                this.region = model.region;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sc_flinkserverlesspost_public_cn-0ju2bj2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ns-1</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public DeleteNamespaceRequestDeleteNamespaceRequest build() {
                return new DeleteNamespaceRequestDeleteNamespaceRequest(this);
            } 

        } 

    }
}
