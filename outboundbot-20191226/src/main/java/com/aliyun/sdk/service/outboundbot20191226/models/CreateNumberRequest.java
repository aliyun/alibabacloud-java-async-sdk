// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateNumberRequest} extends {@link RequestModel}
 *
 * <p>CreateNumberRequest</p>
 */
public class CreateNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Numbers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Numbers> numbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrunkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trunkId;

    private CreateNumberRequest(Builder builder) {
        super(builder);
        this.numbers = builder.numbers;
        this.trunkId = builder.trunkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return numbers
     */
    public java.util.List<Numbers> getNumbers() {
        return this.numbers;
    }

    /**
     * @return trunkId
     */
    public String getTrunkId() {
        return this.trunkId;
    }

    public static final class Builder extends Request.Builder<CreateNumberRequest, Builder> {
        private java.util.List<Numbers> numbers; 
        private String trunkId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNumberRequest request) {
            super(request);
            this.numbers = request.numbers;
            this.trunkId = request.trunkId;
        } 

        /**
         * <p>The list of phone numbers to create and associate. A maximum of 100 phone numbers can be specified in a single request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder numbers(java.util.List<Numbers> numbers) {
            this.putQueryParameter("Numbers", numbers);
            this.numbers = numbers;
            return this;
        }

        /**
         * <p>The unique identifier of the SIP trunk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6bf8a1d2-3c4e-4f5a-9b8c-7d6e5f4a3b2c</p>
         */
        public Builder trunkId(String trunkId) {
            this.putQueryParameter("TrunkId", trunkId);
            this.trunkId = trunkId;
            return this;
        }

        @Override
        public CreateNumberRequest build() {
            return new CreateNumberRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNumberRequest} extends {@link TeaModel}
     *
     * <p>CreateNumberRequest</p>
     */
    public static class Numbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("RateLimitCount")
        private Integer rateLimitCount;

        @com.aliyun.core.annotation.NameInMap("RateLimitPeriod")
        private Integer rateLimitPeriod;

        private Numbers(Builder builder) {
            this.number = builder.number;
            this.rateLimitCount = builder.rateLimitCount;
            this.rateLimitPeriod = builder.rateLimitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Numbers create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return rateLimitCount
         */
        public Integer getRateLimitCount() {
            return this.rateLimitCount;
        }

        /**
         * @return rateLimitPeriod
         */
        public Integer getRateLimitPeriod() {
            return this.rateLimitPeriod;
        }

        public static final class Builder {
            private String number; 
            private Integer rateLimitCount; 
            private Integer rateLimitPeriod; 

            private Builder() {
            } 

            private Builder(Numbers model) {
                this.number = model.number;
                this.rateLimitCount = model.rateLimitCount;
                this.rateLimitPeriod = model.rateLimitPeriod;
            } 

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>057188886666</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The maximum number of requests allowed within the throttling period.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rateLimitCount(Integer rateLimitCount) {
                this.rateLimitCount = rateLimitCount;
                return this;
            }

            /**
             * <p>The throttling period, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder rateLimitPeriod(Integer rateLimitPeriod) {
                this.rateLimitPeriod = rateLimitPeriod;
                return this;
            }

            public Numbers build() {
                return new Numbers(this);
            } 

        } 

    }
}
