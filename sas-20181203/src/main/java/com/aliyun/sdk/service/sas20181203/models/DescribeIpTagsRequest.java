// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpTagsRequest</p>
 */
public class DescribeIpTagsRequest extends Request {
    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    @Query
    @NameInMap("SecurityEventId")
    @Validation(required = true)
    private String securityEventId;

    private DescribeIpTagsRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
        this.securityEventId = builder.securityEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return securityEventId
     */
    public String getSecurityEventId() {
        return this.securityEventId;
    }

    public static final class Builder extends Request.Builder<DescribeIpTagsRequest, Builder> {
        private String ip; 
        private String securityEventId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpTagsRequest request) {
            super(request);
            this.ip = request.ip;
            this.securityEventId = request.securityEventId;
        } 

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * SecurityEventId.
         */
        public Builder securityEventId(String securityEventId) {
            this.putQueryParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        @Override
        public DescribeIpTagsRequest build() {
            return new DescribeIpTagsRequest(this);
        } 

    } 

}
