// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetCustomizedResponseBody} extends {@link TeaModel}
 *
 * <p>ResetCustomizedResponseBody</p>
 */
public class ResetCustomizedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SdkDemos")
    private SdkDemos sdkDemos;

    private ResetCustomizedResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdkDemos = builder.sdkDemos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetCustomizedResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sdkDemos
     */
    public SdkDemos getSdkDemos() {
        return this.sdkDemos;
    }

    public static final class Builder {
        private String requestId; 
        private SdkDemos sdkDemos; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SdkDemos.
         */
        public Builder sdkDemos(SdkDemos sdkDemos) {
            this.sdkDemos = sdkDemos;
            return this;
        }

        public ResetCustomizedResponseBody build() {
            return new ResetCustomizedResponseBody(this);
        } 

    } 

    public static class SdkDemo extends TeaModel {
        @NameInMap("CallDemo")
        private String callDemo;

        @NameInMap("IdeKey")
        private String ideKey;

        private SdkDemo(Builder builder) {
            this.callDemo = builder.callDemo;
            this.ideKey = builder.ideKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkDemo create() {
            return builder().build();
        }

        /**
         * @return callDemo
         */
        public String getCallDemo() {
            return this.callDemo;
        }

        /**
         * @return ideKey
         */
        public String getIdeKey() {
            return this.ideKey;
        }

        public static final class Builder {
            private String callDemo; 
            private String ideKey; 

            /**
             * CallDemo.
             */
            public Builder callDemo(String callDemo) {
                this.callDemo = callDemo;
                return this;
            }

            /**
             * IdeKey.
             */
            public Builder ideKey(String ideKey) {
                this.ideKey = ideKey;
                return this;
            }

            public SdkDemo build() {
                return new SdkDemo(this);
            } 

        } 

    }
    public static class SdkDemos extends TeaModel {
        @NameInMap("SdkDemo")
        private java.util.List < SdkDemo> sdkDemo;

        private SdkDemos(Builder builder) {
            this.sdkDemo = builder.sdkDemo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkDemos create() {
            return builder().build();
        }

        /**
         * @return sdkDemo
         */
        public java.util.List < SdkDemo> getSdkDemo() {
            return this.sdkDemo;
        }

        public static final class Builder {
            private java.util.List < SdkDemo> sdkDemo; 

            /**
             * SdkDemo.
             */
            public Builder sdkDemo(java.util.List < SdkDemo> sdkDemo) {
                this.sdkDemo = sdkDemo;
                return this;
            }

            public SdkDemos build() {
                return new SdkDemos(this);
            } 

        } 

    }
}
