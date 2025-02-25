// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumAdminStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumAdminStatusResponseBody</p>
 */
public class DescribeFabricConsortiumAdminStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFabricConsortiumAdminStatusResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricConsortiumAdminStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeFabricConsortiumAdminStatusResponseBody build() {
            return new DescribeFabricConsortiumAdminStatusResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsortiumAdministrator")
        private Boolean consortiumAdministrator;

        @com.aliyun.core.annotation.NameInMap("ConsortiumId")
        private String consortiumId;

        private Result(Builder builder) {
            this.consortiumAdministrator = builder.consortiumAdministrator;
            this.consortiumId = builder.consortiumId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return consortiumAdministrator
         */
        public Boolean getConsortiumAdministrator() {
            return this.consortiumAdministrator;
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public static final class Builder {
            private Boolean consortiumAdministrator; 
            private String consortiumId; 

            /**
             * ConsortiumAdministrator.
             */
            public Builder consortiumAdministrator(Boolean consortiumAdministrator) {
                this.consortiumAdministrator = consortiumAdministrator;
                return this;
            }

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
