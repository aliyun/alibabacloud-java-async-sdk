// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBgpPeerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBgpPeerResponseBody</p>
 */
public class CreateBgpPeerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BgpPeerId")
    private String bgpPeerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBgpPeerResponseBody(Builder builder) {
        this.bgpPeerId = builder.bgpPeerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBgpPeerResponseBody create() {
        return builder().build();
    }

    /**
     * @return bgpPeerId
     */
    public String getBgpPeerId() {
        return this.bgpPeerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bgpPeerId; 
        private String requestId; 

        /**
         * The ID of the BGP peer.
         */
        public Builder bgpPeerId(String bgpPeerId) {
            this.bgpPeerId = bgpPeerId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBgpPeerResponseBody build() {
            return new CreateBgpPeerResponseBody(this);
        } 

    } 

}
