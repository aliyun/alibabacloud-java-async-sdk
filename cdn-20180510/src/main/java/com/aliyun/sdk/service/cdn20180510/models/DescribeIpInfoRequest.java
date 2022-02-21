// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpInfoRequest</p>
 */
public class DescribeIpInfoRequest extends Request {
    @Query
    @NameInMap("IP")
    @Validation(required = true)
    private String IP;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeIpInfoRequest(Builder builder) {
        super(builder);
        this.IP = builder.IP;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeIpInfoRequest, Builder> {
        private String IP; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpInfoRequest response) {
            super(response);
            this.IP = response.IP;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
        } 

        /**
         * IP.
         */
        public Builder IP(String IP) {
            this.putQueryParameter("IP", IP);
            this.IP = IP;
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

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeIpInfoRequest build() {
            return new DescribeIpInfoRequest(this);
        } 

    } 

}
