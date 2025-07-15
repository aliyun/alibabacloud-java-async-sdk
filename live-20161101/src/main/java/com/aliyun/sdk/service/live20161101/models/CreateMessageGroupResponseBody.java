// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMessageGroupResponseBody</p>
 */
public class CreateMessageGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(CreateMessageGroupResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateMessageGroupResponseBody build() {
            return new CreateMessageGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMessageGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMessageGroupResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private java.util.Map<String, ?> extension;

        @com.aliyun.core.annotation.NameInMap("GroupId")
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
        public java.util.Map<String, ?> getExtension() {
            return this.extension;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private java.util.Map<String, ?> extension; 
            private String groupId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.extension = model.extension;
                this.groupId = model.groupId;
            } 

            /**
             * <p>The extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>test001</p>
             */
            public Builder extension(java.util.Map<String, ?> extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The ID of the message group.</p>
             * 
             * <strong>example:</strong>
             * <p>AE35-****-T95F</p>
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
