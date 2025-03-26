// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateGadInstanceMemberResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGadInstanceMemberResponseBody</p>
 */
public class CreateGadInstanceMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

        private Builder(CreateGadInstanceMemberResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16C62438-491B-5C02-9B49-BA924A1372A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the information returned.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateGadInstanceMemberResponseBody build() {
            return new CreateGadInstanceMemberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateGadInstanceMemberResponseBody} extends {@link TeaModel}
     *
     * <p>CreateGadInstanceMemberResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateCount")
        private String createCount;

        @com.aliyun.core.annotation.NameInMap("GadInstanceName")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.createCount = model.createCount;
                this.gadInstanceName = model.gadInstanceName;
            } 

            /**
             * <p>The number of unit nodes that are created by calling this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder createCount(String createCount) {
                this.createCount = createCount;
                return this;
            }

            /**
             * <p>The ID of the global active database cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>gad-rm-bp1npi2j8********</p>
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
