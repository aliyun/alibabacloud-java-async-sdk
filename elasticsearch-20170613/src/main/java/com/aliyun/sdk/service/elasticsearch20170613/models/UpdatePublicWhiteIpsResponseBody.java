// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePublicWhiteIpsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePublicWhiteIpsResponseBody</p>
 */
public class UpdatePublicWhiteIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private UpdatePublicWhiteIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublicWhiteIpsResponseBody create() {
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

        public UpdatePublicWhiteIpsResponseBody build() {
            return new UpdatePublicWhiteIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePublicWhiteIpsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePublicWhiteIpsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("publicIpWhitelist")
        private java.util.List < String > publicIpWhitelist;

        private Result(Builder builder) {
            this.publicIpWhitelist = builder.publicIpWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return publicIpWhitelist
         */
        public java.util.List < String > getPublicIpWhitelist() {
            return this.publicIpWhitelist;
        }

        public static final class Builder {
            private java.util.List < String > publicIpWhitelist; 

            /**
             * publicIpWhitelist.
             */
            public Builder publicIpWhitelist(java.util.List < String > publicIpWhitelist) {
                this.publicIpWhitelist = publicIpWhitelist;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
