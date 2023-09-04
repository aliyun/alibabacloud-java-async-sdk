// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCostUnitResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCostUnitResponseBody</p>
 */
public class DeleteCostUnitResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DeleteCostUnitResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCostUnitResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteCostUnitResponseBody build() {
            return new DeleteCostUnitResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("IsSuccess")
        private Boolean isSuccess;

        @NameInMap("OwnerUid")
        private Long ownerUid;

        @NameInMap("UnitId")
        private Long unitId;

        private Data(Builder builder) {
            this.isSuccess = builder.isSuccess;
            this.ownerUid = builder.ownerUid;
            this.unitId = builder.unitId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isSuccess
         */
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return unitId
         */
        public Long getUnitId() {
            return this.unitId;
        }

        public static final class Builder {
            private Boolean isSuccess; 
            private Long ownerUid; 
            private Long unitId; 

            /**
             * Indicates whether the call is complete.
             */
            public Builder isSuccess(Boolean isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * The user ID of the cost center owner.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * The ID of the cost center.
             */
            public Builder unitId(Long unitId) {
                this.unitId = unitId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
