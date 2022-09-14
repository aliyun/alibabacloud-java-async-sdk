// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentClientVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ListCurrentClientVersionResponseBody</p>
 */
public class ListCurrentClientVersionResponseBody extends TeaModel {
    @NameInMap("ClientVersion")
    private String clientVersion;

    @NameInMap("RequestId")
    private String requestId;

    private ListCurrentClientVersionResponseBody(Builder builder) {
        this.clientVersion = builder.clientVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCurrentClientVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientVersion; 
        private String requestId; 

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCurrentClientVersionResponseBody build() {
            return new ListCurrentClientVersionResponseBody(this);
        } 

    } 

}
