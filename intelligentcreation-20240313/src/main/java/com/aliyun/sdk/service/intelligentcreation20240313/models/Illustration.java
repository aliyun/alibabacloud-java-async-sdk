// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Illustration} extends {@link TeaModel}
 *
 * <p>Illustration</p>
 */
public class Illustration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("illustrationId")
    private Long illustrationId;

    @com.aliyun.core.annotation.NameInMap("oss")
    private String oss;

    private Illustration(Builder builder) {
        this.illustrationId = builder.illustrationId;
        this.oss = builder.oss;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Illustration create() {
        return builder().build();
    }

    /**
     * @return illustrationId
     */
    public Long getIllustrationId() {
        return this.illustrationId;
    }

    /**
     * @return oss
     */
    public String getOss() {
        return this.oss;
    }

    public static final class Builder {
        private Long illustrationId; 
        private String oss; 

        /**
         * illustrationId.
         */
        public Builder illustrationId(Long illustrationId) {
            this.illustrationId = illustrationId;
            return this;
        }

        /**
         * oss.
         */
        public Builder oss(String oss) {
            this.oss = oss;
            return this;
        }

        public Illustration build() {
            return new Illustration(this);
        } 

    } 

}
