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
 * {@link PushItemDataRequest} extends {@link RequestModel}
 *
 * <p>PushItemDataRequest</p>
 */
public class PushItemDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("items")
    @com.aliyun.core.annotation.Validation(required = true)
    private Items items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("year")
    @com.aliyun.core.annotation.Validation(required = true)
    private String year;

    private PushItemDataRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.items = builder.items;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushItemDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return year
     */
    public String getYear() {
        return this.year;
    }

    public static final class Builder extends Request.Builder<PushItemDataRequest, Builder> {
        private String code; 
        private Items items; 
        private String year; 

        private Builder() {
            super();
        } 

        private Builder(PushItemDataRequest request) {
            super(request);
            this.code = request.code;
            this.items = request.items;
            this.year = request.year;
        } 

        /**
         * <p>The enterprise code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C-20210223-01</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>List of data to be pushed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder items(Items items) {
            this.putBodyParameter("items", items);
            this.items = items;
            return this;
        }

        /**
         * <p>The year of the data created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024</p>
         */
        public Builder year(String year) {
            this.putBodyParameter("year", year);
            this.year = year;
            return this;
        }

        @Override
        public PushItemDataRequest build() {
            return new PushItemDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushItemDataRequest} extends {@link TeaModel}
     *
     * <p>PushItemDataRequest</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("month")
        @com.aliyun.core.annotation.Validation(required = true)
        private String month;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double value;

        private Items(Builder builder) {
            this.code = builder.code;
            this.month = builder.month;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String month; 
            private Double value; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.code = model.code;
                this.month = model.month;
                this.value = model.value;
            } 

            /**
             * <p>API data identification.&lt;props=&quot;intl&quot;&gt;For details: <a href="https://www.alibabacloud.com/help/en/energy-expert/developer-reference/api-energyexpertexternal-2022-09-23-getdataitemlist">GetDataItemList </a></p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_api_code</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The month.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder month(String month) {
                this.month = month;
                return this;
            }

            /**
             * <p>The value of the data item.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1.11</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
