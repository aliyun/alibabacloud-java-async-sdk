// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveSnapshotNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveSnapshotNotifyConfigResponseBody</p>
 */
public class DescribeLiveSnapshotNotifyConfigResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("NotifyAuthKey")
    private String notifyAuthKey;

    @NameInMap("NotifyReqAuth")
    private String notifyReqAuth;

    @NameInMap("NotifyUrl")
    private String notifyUrl;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveSnapshotNotifyConfigResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.notifyAuthKey = builder.notifyAuthKey;
        this.notifyReqAuth = builder.notifyReqAuth;
        this.notifyUrl = builder.notifyUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveSnapshotNotifyConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return notifyAuthKey
     */
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    /**
     * @return notifyReqAuth
     */
    public String getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainName; 
        private String notifyAuthKey; 
        private String notifyReqAuth; 
        private String notifyUrl; 
        private String requestId; 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * NotifyAuthKey.
         */
        public Builder notifyAuthKey(String notifyAuthKey) {
            this.notifyAuthKey = notifyAuthKey;
            return this;
        }

        /**
         * NotifyReqAuth.
         */
        public Builder notifyReqAuth(String notifyReqAuth) {
            this.notifyReqAuth = notifyReqAuth;
            return this;
        }

        /**
         * NotifyUrl.
         */
        public Builder notifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveSnapshotNotifyConfigResponseBody build() {
            return new DescribeLiveSnapshotNotifyConfigResponseBody(this);
        } 

    } 

}
