// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSortScriptResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSortScriptResponseBody</p>
 */
public class CreateSortScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private CreateSortScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSortScriptResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateSortScriptResponseBody build() {
            return new CreateSortScriptResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("scriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.scope = builder.scope;
            this.scriptName = builder.scriptName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String scope; 
            private String scriptName; 
            private String type; 

            /**
             * The sort phase to which the script applies.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The script name.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * The script type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
