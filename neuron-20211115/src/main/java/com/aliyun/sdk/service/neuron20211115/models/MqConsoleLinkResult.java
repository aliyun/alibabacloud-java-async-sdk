// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MqConsoleLinkResult} extends {@link TeaModel}
 *
 * <p>MqConsoleLinkResult</p>
 */
public class MqConsoleLinkResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupLinkUrl")
    private String groupLinkUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("topicLinkUrl")
    private String topicLinkUrl;

    private MqConsoleLinkResult(Builder builder) {
        this.groupLinkUrl = builder.groupLinkUrl;
        this.requestId = builder.requestId;
        this.topicLinkUrl = builder.topicLinkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MqConsoleLinkResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupLinkUrl
     */
    public String getGroupLinkUrl() {
        return this.groupLinkUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topicLinkUrl
     */
    public String getTopicLinkUrl() {
        return this.topicLinkUrl;
    }

    public static final class Builder {
        private String groupLinkUrl; 
        private String requestId; 
        private String topicLinkUrl; 

        private Builder() {
        } 

        private Builder(MqConsoleLinkResult model) {
            this.groupLinkUrl = model.groupLinkUrl;
            this.requestId = model.requestId;
            this.topicLinkUrl = model.topicLinkUrl;
        } 

        /**
         * groupLinkUrl.
         */
        public Builder groupLinkUrl(String groupLinkUrl) {
            this.groupLinkUrl = groupLinkUrl;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * topicLinkUrl.
         */
        public Builder topicLinkUrl(String topicLinkUrl) {
            this.topicLinkUrl = topicLinkUrl;
            return this;
        }

        public MqConsoleLinkResult build() {
            return new MqConsoleLinkResult(this);
        } 

    } 

}
