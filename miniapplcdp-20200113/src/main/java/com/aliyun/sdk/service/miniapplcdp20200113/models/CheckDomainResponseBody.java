// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainResponseBody</p>
 */
public class CheckDomainResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private CheckDomainResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDomainResponseBody build() {
            return new CheckDomainResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Valid")
        private Boolean valid;

        private Data(Builder builder) {
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private Boolean valid; 

            /**
             * Valid.
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
