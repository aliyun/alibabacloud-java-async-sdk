// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePersistentVolumeClaimResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePersistentVolumeClaimResponseBody</p>
 */
public class CreatePersistentVolumeClaimResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreatePersistentVolumeClaimResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersistentVolumeClaimResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
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
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * RequestId.
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

        public CreatePersistentVolumeClaimResponseBody build() {
            return new CreatePersistentVolumeClaimResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("PersistentVolumeClaimId")
        private Long persistentVolumeClaimId;

        private Result(Builder builder) {
            this.persistentVolumeClaimId = builder.persistentVolumeClaimId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return persistentVolumeClaimId
         */
        public Long getPersistentVolumeClaimId() {
            return this.persistentVolumeClaimId;
        }

        public static final class Builder {
            private Long persistentVolumeClaimId; 

            /**
             * PersistentVolumeClaimId.
             */
            public Builder persistentVolumeClaimId(Long persistentVolumeClaimId) {
                this.persistentVolumeClaimId = persistentVolumeClaimId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
