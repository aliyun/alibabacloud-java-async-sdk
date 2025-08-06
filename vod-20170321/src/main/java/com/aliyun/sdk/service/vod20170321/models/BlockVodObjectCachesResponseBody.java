// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link BlockVodObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>BlockVodObjectCachesResponseBody</p>
 */
public class BlockVodObjectCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlockTaskId")
    private String blockTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BlockVodObjectCachesResponseBody(Builder builder) {
        this.blockTaskId = builder.blockTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BlockVodObjectCachesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockTaskId
     */
    public String getBlockTaskId() {
        return this.blockTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String blockTaskId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BlockVodObjectCachesResponseBody model) {
            this.blockTaskId = model.blockTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * BlockTaskId.
         */
        public Builder blockTaskId(String blockTaskId) {
            this.blockTaskId = blockTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BlockVodObjectCachesResponseBody build() {
            return new BlockVodObjectCachesResponseBody(this);
        } 

    } 

}
