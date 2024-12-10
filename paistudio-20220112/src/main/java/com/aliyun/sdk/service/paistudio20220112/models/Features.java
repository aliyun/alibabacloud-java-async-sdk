// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Features} extends {@link TeaModel}
 *
 * <p>Features</p>
 */
public class Features extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Quota quota;

    private Features(Builder builder) {
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Features create() {
        return builder().build();
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    public static final class Builder {
        private Quota quota; 

        /**
         * Quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        public Features build() {
            return new Features(this);
        } 

    } 

    /**
     * 
     * {@link Features} extends {@link TeaModel}
     *
     * <p>Features</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Boolean isEnabled;

        private Quota(Builder builder) {
            this.isEnabled = builder.isEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return isEnabled
         */
        public Boolean getIsEnabled() {
            return this.isEnabled;
        }

        public static final class Builder {
            private Boolean isEnabled; 

            /**
             * IsEnabled.
             */
            public Builder isEnabled(Boolean isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
}
