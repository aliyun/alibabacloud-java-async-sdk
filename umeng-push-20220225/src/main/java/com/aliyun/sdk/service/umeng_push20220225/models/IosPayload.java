// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IosPayload} extends {@link TeaModel}
 *
 * <p>IosPayload</p>
 */
public class IosPayload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aps")
    private Aps aps;

    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map < String, ? > extra;

    private IosPayload(Builder builder) {
        this.aps = builder.aps;
        this.extra = builder.extra;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IosPayload create() {
        return builder().build();
    }

    /**
     * @return aps
     */
    public Aps getAps() {
        return this.aps;
    }

    /**
     * @return extra
     */
    public java.util.Map < String, ? > getExtra() {
        return this.extra;
    }

    public static final class Builder {
        private Aps aps; 
        private java.util.Map < String, ? > extra; 

        /**
         * aps.
         */
        public Builder aps(Aps aps) {
            this.aps = aps;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(java.util.Map < String, ? > extra) {
            this.extra = extra;
            return this;
        }

        public IosPayload build() {
            return new IosPayload(this);
        } 

    } 

}
