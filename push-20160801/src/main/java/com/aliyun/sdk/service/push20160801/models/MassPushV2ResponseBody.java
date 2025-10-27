// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link MassPushV2ResponseBody} extends {@link TeaModel}
 *
 * <p>MassPushV2ResponseBody</p>
 */
public class MassPushV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageIds")
    private java.util.List<String> messageIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private MassPushV2ResponseBody(Builder builder) {
        this.messageIds = builder.messageIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MassPushV2ResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageIds
     */
    public java.util.List<String> getMessageIds() {
        return this.messageIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> messageIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(MassPushV2ResponseBody model) {
            this.messageIds = model.messageIds;
            this.requestId = model.requestId;
        } 

        /**
         * MessageIds.
         */
        public Builder messageIds(java.util.List<String> messageIds) {
            this.messageIds = messageIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MassPushV2ResponseBody build() {
            return new MassPushV2ResponseBody(this);
        } 

    } 

}
