// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyWebLockCreateConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWebLockCreateConfigResponseBody</p>
 */
public class ModifyWebLockCreateConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyWebLockCreateConfigResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockCreateConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyWebLockCreateConfigResponseBody model) {
            this.configId = model.configId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration ID of the protected directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1404656</p>
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D9354C1A-D709-4873-9AAE-41513327B247</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyWebLockCreateConfigResponseBody build() {
            return new ModifyWebLockCreateConfigResponseBody(this);
        } 

    } 

}
