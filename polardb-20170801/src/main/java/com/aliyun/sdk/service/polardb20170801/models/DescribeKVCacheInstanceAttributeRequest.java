// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKVCacheInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeKVCacheInstanceAttributeRequest</p>
 */
public class DescribeKVCacheInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KVCacheInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String KVCacheInstanceId;

    private DescribeKVCacheInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.KVCacheInstanceId = builder.KVCacheInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKVCacheInstanceAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return KVCacheInstanceId
     */
    public String getKVCacheInstanceId() {
        return this.KVCacheInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeKVCacheInstanceAttributeRequest, Builder> {
        private String KVCacheInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKVCacheInstanceAttributeRequest request) {
            super(request);
            this.KVCacheInstanceId = request.KVCacheInstanceId;
        } 

        /**
         * <p>The ID of the KVCache instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkv-123456</p>
         */
        public Builder KVCacheInstanceId(String KVCacheInstanceId) {
            this.putQueryParameter("KVCacheInstanceId", KVCacheInstanceId);
            this.KVCacheInstanceId = KVCacheInstanceId;
            return this;
        }

        @Override
        public DescribeKVCacheInstanceAttributeRequest build() {
            return new DescribeKVCacheInstanceAttributeRequest(this);
        } 

    } 

}
