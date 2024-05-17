// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AISearchResult} extends {@link TeaModel}
 *
 * <p>AISearchResult</p>
 */
public class AISearchResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private EventHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private String payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AISearchResult(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchResult create() {
        return builder().build();
    }

    /**
     * @return header
     */
    public EventHeader getHeader() {
        return this.header;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EventHeader header; 
        private String payload; 
        private String requestId; 

        /**
         * header.
         */
        public Builder header(EventHeader header) {
            this.header = header;
            return this;
        }

        /**
         * payload.
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AISearchResult build() {
            return new AISearchResult(this);
        } 

    } 

}
