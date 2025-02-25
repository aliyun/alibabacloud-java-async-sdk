// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GithubEventPayload} extends {@link TeaModel}
 *
 * <p>GithubEventPayload</p>
 */
public class GithubEventPayload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("originalPayload")
    private byte[] originalPayload;

    private GithubEventPayload(Builder builder) {
        this.originalPayload = builder.originalPayload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GithubEventPayload create() {
        return builder().build();
    }

    /**
     * @return originalPayload
     */
    public byte[] getOriginalPayload() {
        return this.originalPayload;
    }

    public static final class Builder {
        private byte[] originalPayload; 

        /**
         * originalPayload.
         */
        public Builder originalPayload(byte[] originalPayload) {
            this.originalPayload = originalPayload;
            return this;
        }

        public GithubEventPayload build() {
            return new GithubEventPayload(this);
        } 

    } 

}
