// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceRequest</p>
 */
public class DeleteInstanceRequest extends Request {
    @Body
    @NameInMap("DeleteInstanceRequest")
    @Validation(required = true)
    private DeleteInstanceRequestDeleteInstanceRequest deleteInstanceRequest;

    private DeleteInstanceRequest(Builder builder) {
        super(builder);
        this.deleteInstanceRequest = builder.deleteInstanceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteInstanceRequest
     */
    public DeleteInstanceRequestDeleteInstanceRequest getDeleteInstanceRequest() {
        return this.deleteInstanceRequest;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceRequest, Builder> {
        private DeleteInstanceRequestDeleteInstanceRequest deleteInstanceRequest; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceRequest response) {
            super(response);
            this.deleteInstanceRequest = response.deleteInstanceRequest;
        } 

        /**
         * DeleteInstanceRequest.
         */
        public Builder deleteInstanceRequest(DeleteInstanceRequestDeleteInstanceRequest deleteInstanceRequest) {
            this.putBodyParameter("DeleteInstanceRequest", deleteInstanceRequest);
            this.deleteInstanceRequest = deleteInstanceRequest;
            return this;
        }

        @Override
        public DeleteInstanceRequest build() {
            return new DeleteInstanceRequest(this);
        } 

    } 

    public static class DeleteInstanceRequestDeleteInstanceRequest extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        private DeleteInstanceRequestDeleteInstanceRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteInstanceRequestDeleteInstanceRequest create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String instanceId; 
            private String region; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public DeleteInstanceRequestDeleteInstanceRequest build() {
                return new DeleteInstanceRequestDeleteInstanceRequest(this);
            } 

        } 

    }
}
