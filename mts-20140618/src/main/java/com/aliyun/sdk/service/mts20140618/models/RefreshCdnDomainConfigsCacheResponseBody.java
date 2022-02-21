// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshCdnDomainConfigsCacheResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshCdnDomainConfigsCacheResponseBody</p>
 */
public class RefreshCdnDomainConfigsCacheResponseBody extends TeaModel {
    @NameInMap("FailedDomains")
    private FailedDomains failedDomains;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SucessDomains")
    private SucessDomains sucessDomains;

    private RefreshCdnDomainConfigsCacheResponseBody(Builder builder) {
        this.failedDomains = builder.failedDomains;
        this.requestId = builder.requestId;
        this.sucessDomains = builder.sucessDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshCdnDomainConfigsCacheResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedDomains
     */
    public FailedDomains getFailedDomains() {
        return this.failedDomains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sucessDomains
     */
    public SucessDomains getSucessDomains() {
        return this.sucessDomains;
    }

    public static final class Builder {
        private FailedDomains failedDomains; 
        private String requestId; 
        private SucessDomains sucessDomains; 

        /**
         * FailedDomains.
         */
        public Builder failedDomains(FailedDomains failedDomains) {
            this.failedDomains = failedDomains;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SucessDomains.
         */
        public Builder sucessDomains(SucessDomains sucessDomains) {
            this.sucessDomains = sucessDomains;
            return this;
        }

        public RefreshCdnDomainConfigsCacheResponseBody build() {
            return new RefreshCdnDomainConfigsCacheResponseBody(this);
        } 

    } 

    public static class FailedDomains extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private FailedDomains(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedDomains create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public FailedDomains build() {
                return new FailedDomains(this);
            } 

        } 

    }
    public static class SucessDomains extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private SucessDomains(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SucessDomains create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public SucessDomains build() {
                return new SucessDomains(this);
            } 

        } 

    }
}
