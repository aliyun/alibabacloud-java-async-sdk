// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateHybridProxyRequest} extends {@link RequestModel}
 *
 * <p>UpdateHybridProxyRequest</p>
 */
public class UpdateHybridProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyUuid;

    private UpdateHybridProxyRequest(Builder builder) {
        super(builder);
        this.proxyUuid = builder.proxyUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHybridProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return proxyUuid
     */
    public String getProxyUuid() {
        return this.proxyUuid;
    }

    public static final class Builder extends Request.Builder<UpdateHybridProxyRequest, Builder> {
        private String proxyUuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHybridProxyRequest request) {
            super(request);
            this.proxyUuid = request.proxyUuid;
        } 

        /**
         * <p>The UUID of the Security Center agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-proxy-14bbbb37-c4b9-4e86-83bd-137a940a6ec4</p>
         */
        public Builder proxyUuid(String proxyUuid) {
            this.putQueryParameter("ProxyUuid", proxyUuid);
            this.proxyUuid = proxyUuid;
            return this;
        }

        @Override
        public UpdateHybridProxyRequest build() {
            return new UpdateHybridProxyRequest(this);
        } 

    } 

}
