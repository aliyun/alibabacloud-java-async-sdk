// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMailAddressMsgCallBackUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetMailAddressMsgCallBackUrlResponseBody</p>
 */
public class GetMailAddressMsgCallBackUrlResponseBody extends TeaModel {
    @NameInMap("NotifyUrl")
    private Integer notifyUrl;

    @NameInMap("NotifyUrlStatus")
    private Integer notifyUrlStatus;

    @NameInMap("RequestId")
    private String requestId;

    private GetMailAddressMsgCallBackUrlResponseBody(Builder builder) {
        this.notifyUrl = builder.notifyUrl;
        this.notifyUrlStatus = builder.notifyUrlStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMailAddressMsgCallBackUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return notifyUrl
     */
    public Integer getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return notifyUrlStatus
     */
    public Integer getNotifyUrlStatus() {
        return this.notifyUrlStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer notifyUrl; 
        private Integer notifyUrlStatus; 
        private String requestId; 

        /**
         * NotifyUrl.
         */
        public Builder notifyUrl(Integer notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * NotifyUrlStatus.
         */
        public Builder notifyUrlStatus(Integer notifyUrlStatus) {
            this.notifyUrlStatus = notifyUrlStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMailAddressMsgCallBackUrlResponseBody build() {
            return new GetMailAddressMsgCallBackUrlResponseBody(this);
        } 

    } 

}
