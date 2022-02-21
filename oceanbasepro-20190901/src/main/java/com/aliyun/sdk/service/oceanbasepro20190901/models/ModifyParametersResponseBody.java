// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParametersResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyParametersResponseBody</p>
 */
public class ModifyParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private Results results;

    private ModifyParametersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public Results getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private Results results; 

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 修改结果信息。
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        public ModifyParametersResponseBody build() {
            return new ModifyParametersResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
        private Boolean success;

        private Results(Builder builder) {
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String message; 
            private Boolean success; 

            /**
             * 修改失败信息。
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 是否修改成功。 - true：修改成功 - false：修改失败
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
