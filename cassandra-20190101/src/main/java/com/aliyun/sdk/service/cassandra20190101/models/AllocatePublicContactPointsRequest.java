// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocatePublicContactPointsRequest} extends {@link RequestModel}
 *
 * <p>AllocatePublicContactPointsRequest</p>
 */
public class AllocatePublicContactPointsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DataCenterId")
    @Validation(required = true)
    private String dataCenterId;

    private AllocatePublicContactPointsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.dataCenterId = builder.dataCenterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocatePublicContactPointsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dataCenterId
     */
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public static final class Builder extends Request.Builder<AllocatePublicContactPointsRequest, Builder> {
        private String clientToken; 
        private String clusterId; 
        private String dataCenterId; 

        private Builder() {
            super();
        } 

        private Builder(AllocatePublicContactPointsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.clusterId = response.clusterId;
            this.dataCenterId = response.dataCenterId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * DataCenterId.
         */
        public Builder dataCenterId(String dataCenterId) {
            this.putQueryParameter("DataCenterId", dataCenterId);
            this.dataCenterId = dataCenterId;
            return this;
        }

        @Override
        public AllocatePublicContactPointsRequest build() {
            return new AllocatePublicContactPointsRequest(this);
        } 

    } 

}
