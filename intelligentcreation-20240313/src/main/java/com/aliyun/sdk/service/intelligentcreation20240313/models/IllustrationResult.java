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
 * {@link IllustrationResult} extends {@link TeaModel}
 *
 * <p>IllustrationResult</p>
 */
public class IllustrationResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("illustration")
    private Illustration illustration;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private IllustrationResult(Builder builder) {
        this.illustration = builder.illustration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IllustrationResult create() {
        return builder().build();
    }

    /**
     * @return illustration
     */
    public Illustration getIllustration() {
        return this.illustration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Illustration illustration; 
        private String requestId; 

        /**
         * illustration.
         */
        public Builder illustration(Illustration illustration) {
            this.illustration = illustration;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public IllustrationResult build() {
            return new IllustrationResult(this);
        } 

    } 

}
