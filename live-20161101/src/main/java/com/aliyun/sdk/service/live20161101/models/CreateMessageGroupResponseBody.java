// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMessageGroupResponseBody</p>
 */
public class CreateMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateMessageGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMessageGroupResponseBody create() {
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
         * Id of the request
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

        public CreateMessageGroupResponseBody build() {
            return new CreateMessageGroupResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Extension")
        private java.util.Map < String, ? > extension;

        @NameInMap("GroupId")
        private String groupId;

        private Result(Builder builder) {
            this.extension = builder.extension;
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public java.util.Map < String, ? > getExtension() {
            return this.extension;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private java.util.Map < String, ? > extension; 
            private String groupId; 

            /**
             * Extension.
             */
            public Builder extension(java.util.Map < String, ? > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * 用于长连接建连的token
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
