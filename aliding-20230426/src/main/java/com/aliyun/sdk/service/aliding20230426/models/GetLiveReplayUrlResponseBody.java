// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLiveReplayUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveReplayUrlResponseBody</p>
 */
public class GetLiveReplayUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("replayUrl")
    private String replayUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetLiveReplayUrlResponseBody(Builder builder) {
        this.replayUrl = builder.replayUrl;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveReplayUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return replayUrl
     */
    public String getReplayUrl() {
        return this.replayUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String replayUrl; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * replayUrl.
         */
        public Builder replayUrl(String replayUrl) {
            this.replayUrl = replayUrl;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetLiveReplayUrlResponseBody build() {
            return new GetLiveReplayUrlResponseBody(this);
        } 

    } 

}
