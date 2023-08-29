// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnFullDomainsBlockIPConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnFullDomainsBlockIPConfigRequest</p>
 */
public class DescribeDcdnFullDomainsBlockIPConfigRequest extends Request {
    @Query
    @NameInMap("IPList")
    private String IPList;

    private DescribeDcdnFullDomainsBlockIPConfigRequest(Builder builder) {
        super(builder);
        this.IPList = builder.IPList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnFullDomainsBlockIPConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return IPList
     */
    public String getIPList() {
        return this.IPList;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnFullDomainsBlockIPConfigRequest, Builder> {
        private String IPList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnFullDomainsBlockIPConfigRequest request) {
            super(request);
            this.IPList = request.IPList;
        } 

        /**
         * The IP address or CIDR block to query. Separate multiple values with commas (,). You can specify up to 50 IP addresses or CIDR blocks.
         */
        public Builder IPList(String IPList) {
            this.putQueryParameter("IPList", IPList);
            this.IPList = IPList;
            return this;
        }

        @Override
        public DescribeDcdnFullDomainsBlockIPConfigRequest build() {
            return new DescribeDcdnFullDomainsBlockIPConfigRequest(this);
        } 

    } 

}
