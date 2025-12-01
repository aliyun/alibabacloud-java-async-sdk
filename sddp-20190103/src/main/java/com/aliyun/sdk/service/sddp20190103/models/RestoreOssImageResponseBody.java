// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link RestoreOssImageResponseBody} extends {@link TeaModel}
 *
 * <p>RestoreOssImageResponseBody</p>
 */
public class RestoreOssImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoredImageKey")
    private String restoredImageKey;

    private RestoreOssImageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoredImageKey = builder.restoredImageKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreOssImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoredImageKey
     */
    public String getRestoredImageKey() {
        return this.restoredImageKey;
    }

    public static final class Builder {
        private String requestId; 
        private String restoredImageKey; 

        private Builder() {
        } 

        private Builder(RestoreOssImageResponseBody model) {
            this.requestId = model.requestId;
            this.restoredImageKey = model.restoredImageKey;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RestoredImageKey.
         */
        public Builder restoredImageKey(String restoredImageKey) {
            this.restoredImageKey = restoredImageKey;
            return this;
        }

        public RestoreOssImageResponseBody build() {
            return new RestoreOssImageResponseBody(this);
        } 

    } 

}
