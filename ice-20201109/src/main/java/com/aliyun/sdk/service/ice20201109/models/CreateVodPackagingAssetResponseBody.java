// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateVodPackagingAssetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVodPackagingAssetResponseBody</p>
 */
public class CreateVodPackagingAssetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Asset")
    private VodPackagingAsset asset;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateVodPackagingAssetResponseBody(Builder builder) {
        this.asset = builder.asset;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVodPackagingAssetResponseBody create() {
        return builder().build();
    }

    /**
     * @return asset
     */
    public VodPackagingAsset getAsset() {
        return this.asset;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private VodPackagingAsset asset; 
        private String requestId; 

        /**
         * <p>The information about the asset.</p>
         */
        public Builder asset(VodPackagingAsset asset) {
            this.asset = asset;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVodPackagingAssetResponseBody build() {
            return new CreateVodPackagingAssetResponseBody(this);
        } 

    } 

}
