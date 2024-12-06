// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePublicNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePublicNetworkResponseBody</p>
 */
public class UpdatePublicNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private UpdatePublicNetworkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublicNetworkResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2A88ECA1-D827-4581-AD39-05149586****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return results.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdatePublicNetworkResponseBody build() {
            return new UpdatePublicNetworkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePublicNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePublicNetworkResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enablePublic")
        private Boolean enablePublic;

        private Result(Builder builder) {
            this.enablePublic = builder.enablePublic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return enablePublic
         */
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

        public static final class Builder {
            private Boolean enablePublic; 

            /**
             * <p>The status of the public network access switch.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enablePublic(Boolean enablePublic) {
                this.enablePublic = enablePublic;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
