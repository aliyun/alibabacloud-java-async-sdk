// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlHtmlResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ControlHtmlResourceResponseBody</p>
 */
public class ControlHtmlResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamId")
    private String streamId;

    private ControlHtmlResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.streamId = builder.streamId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ControlHtmlResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamId
     */
    public String getStreamId() {
        return this.streamId;
    }

    public static final class Builder {
        private String requestId; 
        private String streamId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamId.
         */
        public Builder streamId(String streamId) {
            this.streamId = streamId;
            return this;
        }

        public ControlHtmlResourceResponseBody build() {
            return new ControlHtmlResourceResponseBody(this);
        } 

    } 

}
