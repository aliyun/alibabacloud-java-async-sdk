// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterRtcInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterRtcInfoResponseBody</p>
 */
public class DescribeCasterRtcInfoResponseBody extends TeaModel {
    @NameInMap("AuthToken")
    private String authToken;

    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCasterRtcInfoResponseBody(Builder builder) {
        this.authToken = builder.authToken;
        this.casterId = builder.casterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterRtcInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return authToken
     */
    public String getAuthToken() {
        return this.authToken;
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

    public static final class Builder {
        private String authToken; 
        private String casterId; 
        private String requestId; 

        /**
         * AuthToken.
         */
        public Builder authToken(String authToken) {
            this.authToken = authToken;
            return this;
        }

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

        public DescribeCasterRtcInfoResponseBody build() {
            return new DescribeCasterRtcInfoResponseBody(this);
        } 

    } 

}
