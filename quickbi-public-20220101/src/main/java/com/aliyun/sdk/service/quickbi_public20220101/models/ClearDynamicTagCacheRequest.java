// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ClearDynamicTagCacheRequest} extends {@link RequestModel}
 *
 * <p>ClearDynamicTagCacheRequest</p>
 */
public class ClearDynamicTagCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    private ClearDynamicTagCacheRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearDynamicTagCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    public static final class Builder extends Request.Builder<ClearDynamicTagCacheRequest, Builder> {
        private String configId; 

        private Builder() {
            super();
        } 

        private Builder(ClearDynamicTagCacheRequest request) {
            super(request);
            this.configId = request.configId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cfg************405791744</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public ClearDynamicTagCacheRequest build() {
            return new ClearDynamicTagCacheRequest(this);
        } 

    } 

}
