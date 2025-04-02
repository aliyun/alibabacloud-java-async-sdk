// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreatePluginConfigResponseBody model) {
            this.pluginConfigID = model.pluginConfigID;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The plug-in configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pluginConfigID(Long pluginConfigID) {
            this.pluginConfigID = pluginConfigID;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>03A3E2F4-6804-5663-9D5D-2EC47A1*****</p>
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
