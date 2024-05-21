// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetSwitchInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDatasetSwitchInfoResponseBody</p>
 */
public class QueryDatasetSwitchInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDatasetSwitchInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetSwitchInfoResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
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
        public Builder result(Result result) {
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

        public QueryDatasetSwitchInfoResponseBody build() {
            return new QueryDatasetSwitchInfoResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CubeId")
        private String cubeId;

        @com.aliyun.core.annotation.NameInMap("IsOpenColumnLevelPermission")
        private Integer isOpenColumnLevelPermission;

        @com.aliyun.core.annotation.NameInMap("IsOpenRowLevelPermission")
        private Integer isOpenRowLevelPermission;

        private Result(Builder builder) {
            this.cubeId = builder.cubeId;
            this.isOpenColumnLevelPermission = builder.isOpenColumnLevelPermission;
            this.isOpenRowLevelPermission = builder.isOpenRowLevelPermission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cubeId
         */
        public String getCubeId() {
            return this.cubeId;
        }

        /**
         * @return isOpenColumnLevelPermission
         */
        public Integer getIsOpenColumnLevelPermission() {
            return this.isOpenColumnLevelPermission;
        }

        /**
         * @return isOpenRowLevelPermission
         */
        public Integer getIsOpenRowLevelPermission() {
            return this.isOpenRowLevelPermission;
        }

        public static final class Builder {
            private String cubeId; 
            private Integer isOpenColumnLevelPermission; 
            private Integer isOpenRowLevelPermission; 

            /**
             * CubeId.
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * IsOpenColumnLevelPermission.
             */
            public Builder isOpenColumnLevelPermission(Integer isOpenColumnLevelPermission) {
                this.isOpenColumnLevelPermission = isOpenColumnLevelPermission;
                return this;
            }

            /**
             * IsOpenRowLevelPermission.
             */
            public Builder isOpenRowLevelPermission(Integer isOpenRowLevelPermission) {
                this.isOpenRowLevelPermission = isOpenRowLevelPermission;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
