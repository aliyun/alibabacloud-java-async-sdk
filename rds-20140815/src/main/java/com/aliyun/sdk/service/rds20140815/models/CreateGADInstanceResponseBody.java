// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGADInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGADInstanceResponseBody</p>
 */
public class CreateGADInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
         * An array that consists of the information returned.
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
        @NameInMap("CreateMemberCount")
        private String createMemberCount;

        @NameInMap("GadInstanceName")
        private String gadInstanceName;

        @NameInMap("TaskID")
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
             * The ID of the task.
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
