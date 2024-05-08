// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePluginResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePluginResponseBody</p>
 */
public class CreatePluginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagStatus")
    private Boolean tagStatus;

    private CreatePluginResponseBody(Builder builder) {
        this.pluginId = builder.pluginId;
        this.requestId = builder.requestId;
        this.tagStatus = builder.tagStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePluginResponseBody create() {
        return builder().build();
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagStatus
     */
    public Boolean getTagStatus() {
        return this.tagStatus;
    }

    public static final class Builder {
        private String pluginId; 
        private String requestId; 
        private Boolean tagStatus; 

        /**
         * The ID of the plug-in.
         */
        public Builder pluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the plug-in is successfully marked.
         */
        public Builder tagStatus(Boolean tagStatus) {
            this.tagStatus = tagStatus;
            return this;
        }

        public CreatePluginResponseBody build() {
            return new CreatePluginResponseBody(this);
        } 

    } 

}
