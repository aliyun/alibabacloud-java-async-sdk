// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGadInstanceMemberResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGadInstanceMemberResponseBody</p>
 */
public class CreateGadInstanceMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateGadInstanceMemberResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGadInstanceMemberResponseBody create() {
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

        public CreateGadInstanceMemberResponseBody build() {
            return new CreateGadInstanceMemberResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CreateCount")
        private String createCount;

        @NameInMap("GadInstanceName")
        private String gadInstanceName;

        private Result(Builder builder) {
            this.createCount = builder.createCount;
            this.gadInstanceName = builder.gadInstanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createCount
         */
        public String getCreateCount() {
            return this.createCount;
        }

        /**
         * @return gadInstanceName
         */
        public String getGadInstanceName() {
            return this.gadInstanceName;
        }

        public static final class Builder {
            private String createCount; 
            private String gadInstanceName; 

            /**
             * CreateCount.
             */
            public Builder createCount(String createCount) {
                this.createCount = createCount;
                return this;
            }

            /**
             * GadInstanceName.
             */
            public Builder gadInstanceName(String gadInstanceName) {
                this.gadInstanceName = gadInstanceName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
