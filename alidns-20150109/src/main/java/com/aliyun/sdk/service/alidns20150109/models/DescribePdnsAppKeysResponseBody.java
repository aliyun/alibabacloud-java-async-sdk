// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsAppKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsAppKeysResponseBody</p>
 */
public class DescribePdnsAppKeysResponseBody extends TeaModel {
    @NameInMap("AppKeys")
    private java.util.List < AppKeys> appKeys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePdnsAppKeysResponseBody(Builder builder) {
        this.appKeys = builder.appKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsAppKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return appKeys
     */
    public java.util.List < AppKeys> getAppKeys() {
        return this.appKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AppKeys> appKeys; 
        private String requestId; 

        /**
         * AppKeys.
         */
        public Builder appKeys(java.util.List < AppKeys> appKeys) {
            this.appKeys = appKeys;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePdnsAppKeysResponseBody build() {
            return new DescribePdnsAppKeysResponseBody(this);
        } 

    } 

    public static class AppKeys extends TeaModel {
        @NameInMap("AppKeyId")
        private String appKeyId;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("State")
        private String state;

        private AppKeys(Builder builder) {
            this.appKeyId = builder.appKeyId;
            this.createDate = builder.createDate;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppKeys create() {
            return builder().build();
        }

        /**
         * @return appKeyId
         */
        public String getAppKeyId() {
            return this.appKeyId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String appKeyId; 
            private String createDate; 
            private String state; 

            /**
             * AppKeyId.
             */
            public Builder appKeyId(String appKeyId) {
                this.appKeyId = appKeyId;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AppKeys build() {
                return new AppKeys(this);
            } 

        } 

    }
}
