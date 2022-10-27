// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodesRequest} extends {@link RequestModel}
 *
 * <p>DeleteNodesRequest</p>
 */
public class DeleteNodesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Instance")
    @Validation(required = true)
    private java.util.List < Instance> instance;

    @Query
    @NameInMap("ReleaseInstance")
    private Boolean releaseInstance;

    @Query
    @NameInMap("Sync")
    private Boolean sync;

    private DeleteNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instance = builder.instance;
        this.releaseInstance = builder.releaseInstance;
        this.sync = builder.sync;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instance
     */
    public java.util.List < Instance> getInstance() {
        return this.instance;
    }

    /**
     * @return releaseInstance
     */
    public Boolean getReleaseInstance() {
        return this.releaseInstance;
    }

    /**
     * @return sync
     */
    public Boolean getSync() {
        return this.sync;
    }

    public static final class Builder extends Request.Builder<DeleteNodesRequest, Builder> {
        private String clusterId; 
        private java.util.List < Instance> instance; 
        private Boolean releaseInstance; 
        private Boolean sync; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instance = request.instance;
            this.releaseInstance = request.releaseInstance;
            this.sync = request.sync;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Instance.
         */
        public Builder instance(java.util.List < Instance> instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * ReleaseInstance.
         */
        public Builder releaseInstance(Boolean releaseInstance) {
            this.putQueryParameter("ReleaseInstance", releaseInstance);
            this.releaseInstance = releaseInstance;
            return this;
        }

        /**
         * Sync.
         */
        public Builder sync(Boolean sync) {
            this.putQueryParameter("Sync", sync);
            this.sync = sync;
            return this;
        }

        @Override
        public DeleteNodesRequest build() {
            return new DeleteNodesRequest(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("Id")
        private String id;

        private Instance(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
