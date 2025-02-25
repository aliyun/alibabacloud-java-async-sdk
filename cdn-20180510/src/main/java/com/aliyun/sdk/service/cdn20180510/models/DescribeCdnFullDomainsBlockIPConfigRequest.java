// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnFullDomainsBlockIPConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnFullDomainsBlockIPConfigRequest</p>
 */
public class DescribeCdnFullDomainsBlockIPConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IPList")
    private String IPList;

    private DescribeCdnFullDomainsBlockIPConfigRequest(Builder builder) {
        super(builder);
        this.IPList = builder.IPList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnFullDomainsBlockIPConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCdnFullDomainsBlockIPConfigRequest, Builder> {
        private String IPList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnFullDomainsBlockIPConfigRequest request) {
            super(request);
            this.IPList = request.IPList;
        } 

        /**
         * <p>The IP address or CIDR block to query. Separate multiple values with commas (,). You can specify up to 50 IP addresses or CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>1.XXX.XXX.1,2.XXX.XXX.2</p>
         */
        public Builder IPList(String IPList) {
            this.putBodyParameter("IPList", IPList);
            this.IPList = IPList;
            return this;
        }

        @Override
        public DescribeCdnFullDomainsBlockIPConfigRequest build() {
            return new DescribeCdnFullDomainsBlockIPConfigRequest(this);
        } 

    } 

}
