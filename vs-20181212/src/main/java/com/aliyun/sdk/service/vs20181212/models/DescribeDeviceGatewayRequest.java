// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceGatewayRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceGatewayRequest</p>
 */
public class DescribeDeviceGatewayRequest extends Request {
    @Query
    @NameInMap("ClientIp")
    private String clientIp;

    @Query
    @NameInMap("Expire")
    private Long expire;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeDeviceGatewayRequest(Builder builder) {
        super(builder);
        this.clientIp = builder.clientIp;
        this.expire = builder.expire;
        this.id = builder.id;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceGatewayRequest, Builder> {
        private String clientIp; 
        private Long expire; 
        private String id; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceGatewayRequest response) {
            super(response);
            this.clientIp = response.clientIp;
            this.expire = response.expire;
            this.id = response.id;
            this.ownerId = response.ownerId;
        } 

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Long expire) {
            this.putQueryParameter("Expire", expire);
            this.expire = expire;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeDeviceGatewayRequest build() {
            return new DescribeDeviceGatewayRequest(this);
        } 

    } 

}
