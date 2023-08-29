// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnIpInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnIpInfoRequest</p>
 */
public class DescribeDcdnIpInfoRequest extends Request {
    @Query
    @NameInMap("IP")
    @Validation(required = true)
    private String ip;

    private DescribeDcdnIpInfoRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnIpInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnIpInfoRequest, Builder> {
        private String ip; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnIpInfoRequest request) {
            super(request);
            this.ip = request.ip;
        } 

        /**
         * The IP address. You can specify only one IP address.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("IP", ip);
            this.ip = ip;
            return this;
        }

        @Override
        public DescribeDcdnIpInfoRequest build() {
            return new DescribeDcdnIpInfoRequest(this);
        } 

    } 

}
