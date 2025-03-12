// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnConditionIPBInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnConditionIPBInfoResponseBody</p>
 */
public class DescribeCdnConditionIPBInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datas")
    private java.util.List<Datas> datas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<Datas> getDatas() {
        return this.datas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Datas> datas; 
        private String requestId; 

        /**
         * <p>The data that is returned.</p>
         */
        public Builder datas(java.util.List<Datas> datas) {
            this.datas = datas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C4AA72D-8C00-1113-BD68-8BC4E3CF4FF6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnConditionIPBInfoResponseBody build() {
            return new DescribeCdnConditionIPBInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnConditionIPBInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnConditionIPBInfoResponseBody</p>
     */
    public static class Datas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The configuration value.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;[{&quot;text&quot;:&quot;阿鲁巴&quot;,&quot;value&quot;:&quot;AW&quot;}]&quot;</p>
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
