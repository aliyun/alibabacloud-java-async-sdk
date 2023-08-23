// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnConditionIPBInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnConditionIPBInfoResponseBody</p>
 */
public class DescribeCdnConditionIPBInfoResponseBody extends TeaModel {
    @NameInMap("Datas")
    private java.util.List < Datas> datas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCdnConditionIPBInfoResponseBody(Builder builder) {
        this.datas = builder.datas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnConditionIPBInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return datas
     */
    public java.util.List < Datas> getDatas() {
        return this.datas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Datas> datas; 
        private String requestId; 

        /**
         * Datas.
         */
        public Builder datas(java.util.List < Datas> datas) {
            this.datas = datas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnConditionIPBInfoResponseBody build() {
            return new DescribeCdnConditionIPBInfoResponseBody(this);
        } 

    } 

    public static class Datas extends TeaModel {
        @NameInMap("Value")
        private String value;

        private Datas(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String value; 

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
}
