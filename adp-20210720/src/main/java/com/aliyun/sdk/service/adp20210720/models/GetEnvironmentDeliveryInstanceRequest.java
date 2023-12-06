// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentDeliveryInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetEnvironmentDeliveryInstanceRequest</p>
 */
public class GetEnvironmentDeliveryInstanceRequest extends Request {
    @Query
    @NameInMap("clusterUID")
    private String clusterUID;

    @Query
    @NameInMap("envUID")
    private String envUID;

    private GetEnvironmentDeliveryInstanceRequest(Builder builder) {
        super(builder);
        this.clusterUID = builder.clusterUID;
        this.envUID = builder.envUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentDeliveryInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterUID
     */
    public String getClusterUID() {
        return this.clusterUID;
    }

    /**
     * @return envUID
     */
    public String getEnvUID() {
        return this.envUID;
    }

    public static final class Builder extends Request.Builder<GetEnvironmentDeliveryInstanceRequest, Builder> {
        private String clusterUID; 
        private String envUID; 

        private Builder() {
            super();
        } 

        private Builder(GetEnvironmentDeliveryInstanceRequest request) {
            super(request);
            this.clusterUID = request.clusterUID;
            this.envUID = request.envUID;
        } 

        /**
         * clusterUID.
         */
        public Builder clusterUID(String clusterUID) {
            this.putQueryParameter("clusterUID", clusterUID);
            this.clusterUID = clusterUID;
            return this;
        }

        /**
         * envUID.
         */
        public Builder envUID(String envUID) {
            this.putQueryParameter("envUID", envUID);
            this.envUID = envUID;
            return this;
        }

        @Override
        public GetEnvironmentDeliveryInstanceRequest build() {
            return new GetEnvironmentDeliveryInstanceRequest(this);
        } 

    } 

}
