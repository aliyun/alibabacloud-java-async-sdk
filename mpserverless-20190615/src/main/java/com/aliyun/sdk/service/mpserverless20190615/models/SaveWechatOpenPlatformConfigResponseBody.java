// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWechatOpenPlatformConfigResponseBody} extends {@link TeaModel}
 *
 * <p>SaveWechatOpenPlatformConfigResponseBody</p>
 */
public class SaveWechatOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SaveWechatOpenPlatformConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWechatOpenPlatformConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SaveWechatOpenPlatformConfigResponseBody build() {
            return new SaveWechatOpenPlatformConfigResponseBody(this);
        } 

    } 

}
