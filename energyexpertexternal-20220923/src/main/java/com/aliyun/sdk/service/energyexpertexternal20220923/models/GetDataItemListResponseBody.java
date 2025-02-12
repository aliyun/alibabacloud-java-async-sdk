// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetDataItemListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataItemListResponseBody</p>
 */
public class GetDataItemListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDataItemListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataItemListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        /**
         * <p>Response parameters.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataItemListResponseBody build() {
            return new GetDataItemListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataItemListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataItemListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Data(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.period = builder.period;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private Integer period; 
            private String unit; 

            /**
             * <p>The identifier of the data item.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_api_code</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the data item.</p>
             * 
             * <strong>example:</strong>
             * <p>name_bbb</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Data filling method, 1: monthly value 2: annual value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The data item unit.</p>
             * 
             * <strong>example:</strong>
             * <p>kg</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
