// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AndroidShortPayload} extends {@link TeaModel}
 *
 * <p>AndroidShortPayload</p>
 */
public class AndroidShortPayload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("body")
    private AndroidShortPayloadBody body;

    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map < String, ? > extra;

    private AndroidShortPayload(Builder builder) {
        this.body = builder.body;
        this.extra = builder.extra;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AndroidShortPayload create() {
        return builder().build();
    }

    /**
     * @return body
     */
    public AndroidShortPayloadBody getBody() {
        return this.body;
    }

    /**
     * @return extra
     */
    public java.util.Map < String, ? > getExtra() {
        return this.extra;
    }

    public static final class Builder {
        private AndroidShortPayloadBody body; 
        private java.util.Map < String, ? > extra; 

        /**
         * body.
         */
        public Builder body(AndroidShortPayloadBody body) {
            this.body = body;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(java.util.Map < String, ? > extra) {
            this.extra = extra;
            return this;
        }

        public AndroidShortPayload build() {
            return new AndroidShortPayload(this);
        } 

    } 

    /**
     * 
     * {@link AndroidShortPayload} extends {@link TeaModel}
     *
     * <p>AndroidShortPayload</p>
     */
    public static class AndroidShortPayloadBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("custom")
        private String custom;

        private AndroidShortPayloadBody(Builder builder) {
            this.custom = builder.custom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AndroidShortPayloadBody create() {
            return builder().build();
        }

        /**
         * @return custom
         */
        public String getCustom() {
            return this.custom;
        }

        public static final class Builder {
            private String custom; 

            /**
             * custom.
             */
            public Builder custom(String custom) {
                this.custom = custom;
                return this;
            }

            public AndroidShortPayloadBody build() {
                return new AndroidShortPayloadBody(this);
            } 

        } 

    }
}
