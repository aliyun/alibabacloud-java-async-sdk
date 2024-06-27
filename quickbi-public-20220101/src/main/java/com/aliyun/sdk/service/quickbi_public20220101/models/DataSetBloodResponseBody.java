// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSetBloodResponseBody} extends {@link TeaModel}
 *
 * <p>DataSetBloodResponseBody</p>
 */
public class DataSetBloodResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DataSetBloodResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSetBloodResponseBody create() {
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
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

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

        public DataSetBloodResponseBody build() {
            return new DataSetBloodResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WorksId")
        private String worksId;

        @com.aliyun.core.annotation.NameInMap("WorksType")
        private String worksType;

        private Result(Builder builder) {
            this.worksId = builder.worksId;
            this.worksType = builder.worksType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return worksId
         */
        public String getWorksId() {
            return this.worksId;
        }

        /**
         * @return worksType
         */
        public String getWorksType() {
            return this.worksType;
        }

        public static final class Builder {
            private String worksId; 
            private String worksType; 

            /**
             * WorksId.
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            /**
             * WorksType.
             */
            public Builder worksType(String worksType) {
                this.worksType = worksType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
