// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

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
 * {@link AndroidPayload} extends {@link TeaModel}
 *
 * <p>AndroidPayload</p>
 */
public class AndroidPayload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("body")
    private Body body;

    @com.aliyun.core.annotation.NameInMap("displayType")
    private String displayType;

    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map<String, ?> extra;

    @com.aliyun.core.annotation.NameInMap("message2ThirdChannel")
    private Message2ThirdChannel message2ThirdChannel;

    private AndroidPayload(Builder builder) {
        this.body = builder.body;
        this.displayType = builder.displayType;
        this.extra = builder.extra;
        this.message2ThirdChannel = builder.message2ThirdChannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AndroidPayload create() {
        return builder().build();
    }

    /**
     * @return body
     */
    public Body getBody() {
        return this.body;
    }

    /**
     * @return displayType
     */
    public String getDisplayType() {
        return this.displayType;
    }

    /**
     * @return extra
     */
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    /**
     * @return message2ThirdChannel
     */
    public Message2ThirdChannel getMessage2ThirdChannel() {
        return this.message2ThirdChannel;
    }

    public static final class Builder {
        private Body body; 
        private String displayType; 
        private java.util.Map<String, ?> extra; 
        private Message2ThirdChannel message2ThirdChannel; 

        /**
         * body.
         */
        public Builder body(Body body) {
            this.body = body;
            return this;
        }

        /**
         * displayType.
         */
        public Builder displayType(String displayType) {
            this.displayType = displayType;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }

        /**
         * message2ThirdChannel.
         */
        public Builder message2ThirdChannel(Message2ThirdChannel message2ThirdChannel) {
            this.message2ThirdChannel = message2ThirdChannel;
            return this;
        }

        public AndroidPayload build() {
            return new AndroidPayload(this);
        } 

    } 

}
