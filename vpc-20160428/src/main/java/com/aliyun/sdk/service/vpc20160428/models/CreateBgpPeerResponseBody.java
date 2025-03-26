// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateBgpPeerResponseBody model) {
            this.bgpPeerId = model.bgpPeerId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the BGP peer.</p>
         * 
         * <strong>example:</strong>
         * <p>bgp-m5eoyp2mwegk8ce9v****</p>
         */
        public Builder bgpPeerId(String bgpPeerId) {
            this.bgpPeerId = bgpPeerId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D4B7649A-61BB-4C64-A586-1DFF1EDA6A42</p>
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
