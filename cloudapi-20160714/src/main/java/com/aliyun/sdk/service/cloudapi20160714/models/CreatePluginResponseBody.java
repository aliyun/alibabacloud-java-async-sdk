// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePluginResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePluginResponseBody</p>
 */
public class CreatePluginResponseBody extends TeaModel {
    @NameInMap("PluginId")
    private String pluginId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagStatus")
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
         * PluginId.
         */
        public Builder pluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TagStatus.
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
