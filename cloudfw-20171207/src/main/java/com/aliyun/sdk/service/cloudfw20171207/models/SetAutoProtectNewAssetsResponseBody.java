// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link SetAutoProtectNewAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>SetAutoProtectNewAssetsResponseBody</p>
 */
public class SetAutoProtectNewAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetAutoProtectNewAssetsResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAutoProtectNewAssetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetAutoProtectNewAssetsResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The firewall module.</p>
         * 
         * <strong>example:</strong>
         * <p>api_server</p>
         */
        public Builder module(String module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetAutoProtectNewAssetsResponseBody build() {
            return new SetAutoProtectNewAssetsResponseBody(this);
        } 

    } 

}
