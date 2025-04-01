// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTenantReadableScnResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantReadableScnResponseBody</p>
 */
public class DescribeTenantReadableScnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTenantReadableScnResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantReadableScnResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeTenantReadableScnResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data in the return result of the request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8442BB1E-3171-1192-B9DC-F6F4E53B2673</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTenantReadableScnResponseBody build() {
            return new DescribeTenantReadableScnResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTenantReadableScnResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantReadableScnResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadableScn")
        private Long readableScn;

        private Data(Builder builder) {
            this.readableScn = builder.readableScn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return readableScn
         */
        public Long getReadableScn() {
            return this.readableScn;
        }

        public static final class Builder {
            private Long readableScn; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.readableScn = model.readableScn;
            } 

            /**
             * <p>The maximum readable timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1715329164977</p>
             */
            public Builder readableScn(Long readableScn) {
                this.readableScn = readableScn;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
