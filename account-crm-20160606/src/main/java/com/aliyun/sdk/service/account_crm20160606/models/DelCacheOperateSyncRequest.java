// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link DelCacheOperateSyncRequest} extends {@link RequestModel}
 *
 * <p>DelCacheOperateSyncRequest</p>
 */
public class DelCacheOperateSyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    private DelCacheOperateSyncRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelCacheOperateSyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<DelCacheOperateSyncRequest, Builder> {
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(DelCacheOperateSyncRequest request) {
            super(request);
            this.key = request.key;
        } 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public DelCacheOperateSyncRequest build() {
            return new DelCacheOperateSyncRequest(this);
        } 

    } 

}
