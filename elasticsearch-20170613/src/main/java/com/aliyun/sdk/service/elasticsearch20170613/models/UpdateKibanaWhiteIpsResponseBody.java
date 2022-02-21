// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKibanaWhiteIpsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKibanaWhiteIpsResponseBody</p>
 */
public class UpdateKibanaWhiteIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private UpdateKibanaWhiteIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKibanaWhiteIpsResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateKibanaWhiteIpsResponseBody build() {
            return new UpdateKibanaWhiteIpsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("kibanaIPWhitelist")
        private java.util.List < String > kibanaIPWhitelist;

        @NameInMap("kibanaPrivateIPWhitelist")
        private java.util.List < String > kibanaPrivateIPWhitelist;

        private Result(Builder builder) {
            this.kibanaIPWhitelist = builder.kibanaIPWhitelist;
            this.kibanaPrivateIPWhitelist = builder.kibanaPrivateIPWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return kibanaIPWhitelist
         */
        public java.util.List < String > getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

        /**
         * @return kibanaPrivateIPWhitelist
         */
        public java.util.List < String > getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        public static final class Builder {
            private java.util.List < String > kibanaIPWhitelist; 
            private java.util.List < String > kibanaPrivateIPWhitelist; 

            /**
             * kibanaIPWhitelist.
             */
            public Builder kibanaIPWhitelist(java.util.List < String > kibanaIPWhitelist) {
                this.kibanaIPWhitelist = kibanaIPWhitelist;
                return this;
            }

            /**
             * kibanaPrivateIPWhitelist.
             */
            public Builder kibanaPrivateIPWhitelist(java.util.List < String > kibanaPrivateIPWhitelist) {
                this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
