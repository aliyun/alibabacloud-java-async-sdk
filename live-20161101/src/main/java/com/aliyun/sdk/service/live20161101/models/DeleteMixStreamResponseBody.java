// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMixStreamResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMixStreamResponseBody</p>
 */
public class DeleteMixStreamResponseBody extends TeaModel {
    @NameInMap("MixStreamId")
    private String mixStreamId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteMixStreamResponseBody(Builder builder) {
        this.mixStreamId = builder.mixStreamId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMixStreamResponseBody create() {
        return builder().build();
    }

    /**
     * @return mixStreamId
     */
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mixStreamId; 
        private String requestId; 

        /**
         * MixStreamId.
         */
        public Builder mixStreamId(String mixStreamId) {
            this.mixStreamId = mixStreamId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteMixStreamResponseBody build() {
            return new DeleteMixStreamResponseBody(this);
        } 

    } 

}
