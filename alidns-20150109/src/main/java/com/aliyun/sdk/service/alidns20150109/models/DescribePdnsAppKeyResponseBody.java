// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsAppKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePdnsAppKeyResponseBody</p>
 */
public class DescribePdnsAppKeyResponseBody extends TeaModel {
    @NameInMap("AppKey")
    private AppKey appKey;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePdnsAppKeyResponseBody(Builder builder) {
        this.appKey = builder.appKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsAppKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return appKey
     */
    public AppKey getAppKey() {
        return this.appKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppKey appKey; 
        private String requestId; 

        /**
         * AppKey.
         */
        public Builder appKey(AppKey appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePdnsAppKeyResponseBody build() {
            return new DescribePdnsAppKeyResponseBody(this);
        } 

    } 

    public static class AppKey extends TeaModel {
        @NameInMap("AppKeyId")
        private String appKeyId;

        @NameInMap("AppKeySecret")
        private String appKeySecret;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("State")
        private String state;

        private AppKey(Builder builder) {
            this.appKeyId = builder.appKeyId;
            this.appKeySecret = builder.appKeySecret;
            this.createDate = builder.createDate;
            this.createTimestamp = builder.createTimestamp;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppKey create() {
            return builder().build();
        }

        /**
         * @return appKeyId
         */
        public String getAppKeyId() {
            return this.appKeyId;
        }

        /**
         * @return appKeySecret
         */
        public String getAppKeySecret() {
            return this.appKeySecret;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String appKeyId; 
            private String appKeySecret; 
            private String createDate; 
            private Long createTimestamp; 
            private String state; 

            /**
             * AppKeyId.
             */
            public Builder appKeyId(String appKeyId) {
                this.appKeyId = appKeyId;
                return this;
            }

            /**
             * AppKeySecret.
             */
            public Builder appKeySecret(String appKeySecret) {
                this.appKeySecret = appKeySecret;
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
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AppKey build() {
                return new AppKey(this);
            } 

        } 

    }
}
