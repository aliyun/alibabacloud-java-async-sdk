// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteNamespaceRequest</p>
 */
public class DeleteNamespaceRequest extends Request {
    @Body
    @NameInMap("DeleteNamespaceRequest")
    @Validation(required = true)
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
         * DeleteNamespaceRequest.
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

    public static class DeleteNamespaceRequestDeleteNamespaceRequest extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("Namespace")
        @Validation(required = true)
        private String namespace;

        @NameInMap("Region")
        @Validation(required = true)
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

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Region.
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
