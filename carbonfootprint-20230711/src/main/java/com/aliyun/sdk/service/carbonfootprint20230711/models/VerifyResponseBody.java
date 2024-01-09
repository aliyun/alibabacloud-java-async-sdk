// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyResponseBody</p>
 */
public class VerifyResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyResponseBody create() {
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

        public VerifyResponseBody build() {
            return new VerifyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AllowedUids")
        private java.util.List < String > allowedUids;

        private Data(Builder builder) {
            this.allowedUids = builder.allowedUids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowedUids
         */
        public java.util.List < String > getAllowedUids() {
            return this.allowedUids;
        }

        public static final class Builder {
            private java.util.List < String > allowedUids; 

            /**
             * AllowedUids.
             */
            public Builder allowedUids(java.util.List < String > allowedUids) {
                this.allowedUids = allowedUids;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
