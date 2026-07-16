// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeConditionIPBInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConditionIPBInfoResponseBody</p>
 */
public class DescribeConditionIPBInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datas")
    private java.util.List<Datas> datas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeConditionIPBInfoResponseBody(Builder builder) {
        this.datas = builder.datas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConditionIPBInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeConditionIPBInfoResponseBody model) {
            this.datas = model.datas;
            this.requestId = model.requestId;
        } 

        /**
         * Datas.
         */
        public Builder datas(java.util.List<Datas> datas) {
            this.datas = datas;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConditionIPBInfoResponseBody build() {
            return new DescribeConditionIPBInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConditionIPBInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConditionIPBInfoResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Datas model) {
                this.value = model.value;
            } 

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
