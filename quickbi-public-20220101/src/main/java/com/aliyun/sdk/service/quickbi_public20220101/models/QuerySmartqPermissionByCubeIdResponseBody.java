// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QuerySmartqPermissionByCubeIdResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmartqPermissionByCubeIdResponseBody</p>
 */
public class QuerySmartqPermissionByCubeIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySmartqPermissionByCubeIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmartqPermissionByCubeIdResponseBody create() {
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

        public QuerySmartqPermissionByCubeIdResponseBody build() {
            return new QuerySmartqPermissionByCubeIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmartqPermissionByCubeIdResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmartqPermissionByCubeIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CubeId")
        private String cubeId;

        @com.aliyun.core.annotation.NameInMap("CubeName")
        private String cubeName;

        @com.aliyun.core.annotation.NameInMap("HasPerssion")
        private Boolean hasPerssion;

        private Result(Builder builder) {
            this.cubeId = builder.cubeId;
            this.cubeName = builder.cubeName;
            this.hasPerssion = builder.hasPerssion;
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
         * @return cubeName
         */
        public String getCubeName() {
            return this.cubeName;
        }

        /**
         * @return hasPerssion
         */
        public Boolean getHasPerssion() {
            return this.hasPerssion;
        }

        public static final class Builder {
            private String cubeId; 
            private String cubeName; 
            private Boolean hasPerssion; 

            /**
             * CubeId.
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * CubeName.
             */
            public Builder cubeName(String cubeName) {
                this.cubeName = cubeName;
                return this;
            }

            /**
             * HasPerssion.
             */
            public Builder hasPerssion(Boolean hasPerssion) {
                this.hasPerssion = hasPerssion;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
