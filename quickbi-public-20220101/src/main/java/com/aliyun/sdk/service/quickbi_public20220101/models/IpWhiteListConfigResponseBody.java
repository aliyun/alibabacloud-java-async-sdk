// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link IpWhiteListConfigResponseBody} extends {@link TeaModel}
 *
 * <p>IpWhiteListConfigResponseBody</p>
 */
public class IpWhiteListConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private IpWhiteListConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IpWhiteListConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(IpWhiteListConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IP whitelist.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public IpWhiteListConfigResponseBody build() {
            return new IpWhiteListConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IpWhiteListConfigResponseBody} extends {@link TeaModel}
     *
     * <p>IpWhiteListConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpWhiteList")
        private java.util.List<String> ipWhiteList;

        private Result(Builder builder) {
            this.ipWhiteList = builder.ipWhiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return ipWhiteList
         */
        public java.util.List<String> getIpWhiteList() {
            return this.ipWhiteList;
        }

        public static final class Builder {
            private java.util.List<String> ipWhiteList; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.ipWhiteList = model.ipWhiteList;
            } 

            /**
             * <p>The IP whitelist array.</p>
             */
            public Builder ipWhiteList(java.util.List<String> ipWhiteList) {
                this.ipWhiteList = ipWhiteList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
