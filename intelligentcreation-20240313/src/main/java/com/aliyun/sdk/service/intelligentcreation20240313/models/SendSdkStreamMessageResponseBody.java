// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link SendSdkStreamMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendSdkStreamMessageResponseBody</p>
 */
public class SendSdkStreamMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("commonStreamMessage")
    private String commonStreamMessage;

    private SendSdkStreamMessageResponseBody(Builder builder) {
        this.commonStreamMessage = builder.commonStreamMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSdkStreamMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commonStreamMessage
     */
    public String getCommonStreamMessage() {
        return this.commonStreamMessage;
    }

    public static final class Builder {
        private String commonStreamMessage; 

        private Builder() {
        } 

        private Builder(SendSdkStreamMessageResponseBody model) {
            this.commonStreamMessage = model.commonStreamMessage;
        } 

        /**
         * commonStreamMessage.
         */
        public Builder commonStreamMessage(String commonStreamMessage) {
            this.commonStreamMessage = commonStreamMessage;
            return this;
        }

        public SendSdkStreamMessageResponseBody build() {
            return new SendSdkStreamMessageResponseBody(this);
        } 

    } 

}
