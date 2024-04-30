// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGADInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGADInstanceResponseBody</p>
 */
public class CreateGADInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CreateGADInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGADInstanceResponseBody create() {
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
         * The data returned.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateGADInstanceResponseBody build() {
            return new CreateGADInstanceResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateMemberCount")
        private String createMemberCount;

        @com.aliyun.core.annotation.NameInMap("GadInstanceName")
        private String gadInstanceName;

        @com.aliyun.core.annotation.NameInMap("TaskID")
        private String taskID;

        private Result(Builder builder) {
            this.createMemberCount = builder.createMemberCount;
            this.gadInstanceName = builder.gadInstanceName;
            this.taskID = builder.taskID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createMemberCount
         */
        public String getCreateMemberCount() {
            return this.createMemberCount;
        }

        /**
         * @return gadInstanceName
         */
        public String getGadInstanceName() {
            return this.gadInstanceName;
        }

        /**
         * @return taskID
         */
        public String getTaskID() {
            return this.taskID;
        }

        public static final class Builder {
            private String createMemberCount; 
            private String gadInstanceName; 
            private String taskID; 

            /**
             * The number of unit nodes that are created by calling this operation.
             */
            public Builder createMemberCount(String createMemberCount) {
                this.createMemberCount = createMemberCount;
                return this;
            }

            /**
             * The ID of the global active database cluster.
             */
            public Builder gadInstanceName(String gadInstanceName) {
                this.gadInstanceName = gadInstanceName;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskID(String taskID) {
                this.taskID = taskID;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
