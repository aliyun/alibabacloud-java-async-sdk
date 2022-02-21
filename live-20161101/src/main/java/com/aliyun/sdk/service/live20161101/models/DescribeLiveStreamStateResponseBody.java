// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamStateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamStateResponseBody</p>
 */
public class DescribeLiveStreamStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamState")
    private String streamState;

    @NameInMap("Type")
    private String type;

    private DescribeLiveStreamStateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.streamState = builder.streamState;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamStateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamState
     */
    public String getStreamState() {
        return this.streamState;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String requestId; 
        private String streamState; 
        private String type; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamState.
         */
        public Builder streamState(String streamState) {
            this.streamState = streamState;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeLiveStreamStateResponseBody build() {
            return new DescribeLiveStreamStateResponseBody(this);
        } 

    } 

}
