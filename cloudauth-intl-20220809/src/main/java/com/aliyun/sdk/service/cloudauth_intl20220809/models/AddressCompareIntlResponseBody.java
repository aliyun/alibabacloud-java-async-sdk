// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link AddressCompareIntlResponseBody} extends {@link TeaModel}
 *
 * <p>AddressCompareIntlResponseBody</p>
 */
public class AddressCompareIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private AddressCompareIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressCompareIntlResponseBody create() {
        return builder().build();
    }

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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(AddressCompareIntlResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Return code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public AddressCompareIntlResponseBody build() {
            return new AddressCompareIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddressCompareIntlResponseBody} extends {@link TeaModel}
     *
     * <p>AddressCompareIntlResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        private Result(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        public static final class Builder {
            private String data; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
            } 

            /**
             * <p>The values of sameLevel include:</p>
             * <ul>
             * <li>all: Exactly the same</li>
             * <li>prov: Provincial level</li>
             * <li>city: City level</li>
             * <li>district: District level</li>
             * <li>town: Town level</li>
             * <li>road: Road level</li>
             * <li>roadno: Road number</li>
             * <li>poi: Point of interest (e.g., residential area)</li>
             * <li>roomno: Room number</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *      sameLevel: &quot;city&quot;, 
             *      distance:  5997.34m, -- 地址相差距离
             *      same_info: {    -- 相同信息
             *               prov: &quot;浙江省&quot;,
             *               city: &quot;杭州市&quot;,
             *               district: &quot;西湖区&quot;
             *       } 
             * }</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
