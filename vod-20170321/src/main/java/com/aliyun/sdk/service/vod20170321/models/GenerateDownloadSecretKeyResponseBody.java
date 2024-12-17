// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GenerateDownloadSecretKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDownloadSecretKeyResponseBody</p>
 */
public class GenerateDownloadSecretKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppEncryptKey")
    private String appEncryptKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The key file for secure download.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appEncryptKey(String appEncryptKey) {
            this.appEncryptKey = appEncryptKey;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E99B9BAD-7F9D-552B-A689-B72E92EA040E</p>
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
