// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSupportFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupportFeaturesResponseBody</p>
 */
public class ListSupportFeaturesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportFeatures")
    private java.util.List < SupportFeatures> supportFeatures;

    private ListSupportFeaturesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportFeatures = builder.supportFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportFeaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportFeatures
     */
    public java.util.List < SupportFeatures> getSupportFeatures() {
        return this.supportFeatures;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SupportFeatures> supportFeatures; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SupportFeatures.
         */
        public Builder supportFeatures(java.util.List < SupportFeatures> supportFeatures) {
            this.supportFeatures = supportFeatures;
            return this;
        }

        public ListSupportFeaturesResponseBody build() {
            return new ListSupportFeaturesResponseBody(this);
        } 

    } 

    public static class SupportFeatures extends TeaModel {
        @NameInMap("Name")
        private String name;

        private SupportFeatures(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportFeatures create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SupportFeatures build() {
                return new SupportFeatures(this);
            } 

        } 

    }
}
