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
 * {@link DeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceRequest</p>
 */
public class DeleteInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteInstanceRequest")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteInstanceRequest request) {
            super(request);
            this.deleteInstanceRequest = request.deleteInstanceRequest;
        } 

        /**
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link DeleteInstanceRequest} extends {@link TeaModel}
     *
     * <p>DeleteInstanceRequest</p>
     */
    public static class DeleteInstanceRequestDeleteInstanceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(DeleteInstanceRequestDeleteInstanceRequest model) {
                this.instanceId = model.instanceId;
                this.region = model.region;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>223493C7-FCA9-13D4-B75B-AF8B32F4****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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

            public DeleteInstanceRequestDeleteInstanceRequest build() {
                return new DeleteInstanceRequestDeleteInstanceRequest(this);
            } 

        } 

    }
}
