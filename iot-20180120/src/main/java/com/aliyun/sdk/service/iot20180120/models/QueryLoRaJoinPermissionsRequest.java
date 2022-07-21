// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoRaJoinPermissionsRequest} extends {@link RequestModel}
 *
 * <p>QueryLoRaJoinPermissionsRequest</p>
 */
public class QueryLoRaJoinPermissionsRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private QueryLoRaJoinPermissionsRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLoRaJoinPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<QueryLoRaJoinPermissionsRequest, Builder> {
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryLoRaJoinPermissionsRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public QueryLoRaJoinPermissionsRequest build() {
            return new QueryLoRaJoinPermissionsRequest(this);
        } 

    } 

}
