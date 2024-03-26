// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDownloadSecretKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDownloadSecretKeyResponseBody</p>
 */
public class GenerateDownloadSecretKeyResponseBody extends TeaModel {
    @NameInMap("AppEncryptKey")
    private String appEncryptKey;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateDownloadSecretKeyResponseBody(Builder builder) {
        this.appEncryptKey = builder.appEncryptKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDownloadSecretKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return appEncryptKey
     */
    public String getAppEncryptKey() {
        return this.appEncryptKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appEncryptKey; 
        private String requestId; 

        /**
         * The key file for secure download.
         */
        public Builder appEncryptKey(String appEncryptKey) {
            this.appEncryptKey = appEncryptKey;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateDownloadSecretKeyResponseBody build() {
            return new GenerateDownloadSecretKeyResponseBody(this);
        } 

    } 

}
