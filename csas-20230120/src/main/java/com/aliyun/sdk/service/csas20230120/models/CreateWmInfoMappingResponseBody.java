// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateWmInfoMappingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWmInfoMappingResponseBody</p>
 */
public class CreateWmInfoMappingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateWmInfoMappingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWmInfoMappingResponseBody create() {
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

        public CreateWmInfoMappingResponseBody build() {
            return new CreateWmInfoMappingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWmInfoMappingResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWmInfoMappingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WmInfoUint")
        private Long wmInfoUint;

        private Data(Builder builder) {
            this.wmInfoUint = builder.wmInfoUint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return wmInfoUint
         */
        public Long getWmInfoUint() {
            return this.wmInfoUint;
        }

        public static final class Builder {
            private Long wmInfoUint; 

            /**
             * WmInfoUint.
             */
            public Builder wmInfoUint(Long wmInfoUint) {
                this.wmInfoUint = wmInfoUint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
