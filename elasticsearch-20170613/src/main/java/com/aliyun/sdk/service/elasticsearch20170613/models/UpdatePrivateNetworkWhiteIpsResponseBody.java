// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrivateNetworkWhiteIpsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePrivateNetworkWhiteIpsResponseBody</p>
 */
public class UpdatePrivateNetworkWhiteIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private UpdatePrivateNetworkWhiteIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateNetworkWhiteIpsResponseBody create() {
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
         * Cover
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdatePrivateNetworkWhiteIpsResponseBody build() {
            return new UpdatePrivateNetworkWhiteIpsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("privateNetworkIpWhiteList")
        private java.util.List < String > privateNetworkIpWhiteList;

        private Result(Builder builder) {
            this.privateNetworkIpWhiteList = builder.privateNetworkIpWhiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return privateNetworkIpWhiteList
         */
        public java.util.List < String > getPrivateNetworkIpWhiteList() {
            return this.privateNetworkIpWhiteList;
        }

        public static final class Builder {
            private java.util.List < String > privateNetworkIpWhiteList; 

            /**
             * The results that are returned.
             */
            public Builder privateNetworkIpWhiteList(java.util.List < String > privateNetworkIpWhiteList) {
                this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
