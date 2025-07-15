// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyLiveMessageAppDisableResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyLiveMessageAppDisableResponseBody</p>
 */
public class ModifyLiveMessageAppDisableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppSign")
    private String appSign;

    @com.aliyun.core.annotation.NameInMap("Disable")
    private Boolean disable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyLiveMessageAppDisableResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appSign = builder.appSign;
        this.disable = builder.disable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageAppDisableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appSign
     */
    public String getAppSign() {
        return this.appSign;
    }

    /**
     * @return disable
     */
    public Boolean getDisable() {
        return this.disable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String appSign; 
        private Boolean disable; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyLiveMessageAppDisableResponseBody model) {
            this.appId = model.appId;
            this.appSign = model.appSign;
            this.disable = model.disable;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>ab6b5740****</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
         * 
         * <strong>example:</strong>
         * <p>H4sIAAAAAAAE/wBwAI//zguHB+lYCilkv7diSkk4GhHQAvMXs5tWyI+I09+uEBiB5sqa28ycJSJFmsd50Mhz8nDrvvqmti+fVaNLC5CMgLvNIy48v1aV9x74LRNFN0+Dxd2Al51xuDNkEIDaEwjqfyxscTXjSr0iQjHu2WgkpQAAAP//AQAA//+yR5XCc****</p>
         */
        public Builder appSign(String appSign) {
            this.appSign = appSign;
            return this;
        }

        /**
         * <p>Indicates whether the interactive messaging application is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disable(Boolean disable) {
            this.disable = disable;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6AA1AE11-EA78-1FD4-A966-6BA843073F6D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyLiveMessageAppDisableResponseBody build() {
            return new ModifyLiveMessageAppDisableResponseBody(this);
        } 

    } 

}
