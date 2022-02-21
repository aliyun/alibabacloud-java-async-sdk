// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIpWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpWhiteListResponseBody</p>
 */
public class GetIpWhiteListResponseBody extends TeaModel {
    @NameInMap("IpList")
    private String ipList;

    @NameInMap("LedgerId")
    private String ledgerId;

    @NameInMap("RequestId")
    private String requestId;

    private GetIpWhiteListResponseBody(Builder builder) {
        this.ipList = builder.ipList;
        this.ledgerId = builder.ledgerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpWhiteListResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipList; 
        private String ledgerId; 
        private String requestId; 

        /**
         * IpList.
         */
        public Builder ipList(String ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIpWhiteListResponseBody build() {
            return new GetIpWhiteListResponseBody(this);
        } 

    } 

}
