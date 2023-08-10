// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSortScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GetSortScriptResponseBody</p>
 */
public class GetSortScriptResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private GetSortScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSortScriptResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the script
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetSortScriptResponseBody build() {
            return new GetSortScriptResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("createTime")
        private String createTime;

        @NameInMap("modifyTime")
        private String modifyTime;

        @NameInMap("scope")
        private String scope;

        @NameInMap("status")
        private String status;

        @NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.scope = builder.scope;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String modifyTime; 
            private String scope; 
            private String status; 
            private String type; 

            /**
             * The time when the script was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the script was last modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The sort phase to which the script applies.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The status of the script. For more information, see the Script status table.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the script.
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
