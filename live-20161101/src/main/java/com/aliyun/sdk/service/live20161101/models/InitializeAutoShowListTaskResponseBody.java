// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeAutoShowListTaskResponseBody} extends {@link TeaModel}
 *
 * <p>InitializeAutoShowListTaskResponseBody</p>
 */
public class InitializeAutoShowListTaskResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamList")
    private String streamList;

    private InitializeAutoShowListTaskResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.requestId = builder.requestId;
        this.streamList = builder.streamList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeAutoShowListTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamList
     */
    public String getStreamList() {
        return this.streamList;
    }

    public static final class Builder {
        private String casterId; 
        private String requestId; 
        private String streamList; 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamList.
         */
        public Builder streamList(String streamList) {
            this.streamList = streamList;
            return this;
        }

        public InitializeAutoShowListTaskResponseBody build() {
            return new InitializeAutoShowListTaskResponseBody(this);
        } 

    } 

}
