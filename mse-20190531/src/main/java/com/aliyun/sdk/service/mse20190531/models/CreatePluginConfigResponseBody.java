// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePluginConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePluginConfigResponseBody</p>
 */
public class CreatePluginConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PluginConfigID")
    private Long pluginConfigID;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePluginConfigResponseBody(Builder builder) {
        this.pluginConfigID = builder.pluginConfigID;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePluginConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return pluginConfigID
     */
    public Long getPluginConfigID() {
        return this.pluginConfigID;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long pluginConfigID; 
        private String requestId; 

        /**
         * PluginConfigID.
         */
        public Builder pluginConfigID(Long pluginConfigID) {
            this.pluginConfigID = pluginConfigID;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePluginConfigResponseBody build() {
            return new CreatePluginConfigResponseBody(this);
        } 

    } 

}
