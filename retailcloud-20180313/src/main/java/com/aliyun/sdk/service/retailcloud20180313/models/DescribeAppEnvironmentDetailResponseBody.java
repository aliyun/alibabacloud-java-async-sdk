// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvironmentDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppEnvironmentDetailResponseBody</p>
 */
public class DescribeAppEnvironmentDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeAppEnvironmentDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppEnvironmentDetailResponseBody create() {
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

        public DescribeAppEnvironmentDetailResponseBody build() {
            return new DescribeAppEnvironmentDetailResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppSchemaId")
        private Long appSchemaId;

        @NameInMap("EnvId")
        private Long envId;

        @NameInMap("EnvName")
        private String envName;

        @NameInMap("EnvType")
        private Integer envType;

        @NameInMap("EnvTypeName")
        private String envTypeName;

        @NameInMap("Region")
        private String region;

        @NameInMap("Replicas")
        private Integer replicas;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appSchemaId = builder.appSchemaId;
            this.envId = builder.envId;
            this.envName = builder.envName;
            this.envType = builder.envType;
            this.envTypeName = builder.envTypeName;
            this.region = builder.region;
            this.replicas = builder.replicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appSchemaId
         */
        public Long getAppSchemaId() {
            return this.appSchemaId;
        }

        /**
         * @return envId
         */
        public Long getEnvId() {
            return this.envId;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return envType
         */
        public Integer getEnvType() {
            return this.envType;
        }

        /**
         * @return envTypeName
         */
        public String getEnvTypeName() {
            return this.envTypeName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return replicas
         */
        public Integer getReplicas() {
            return this.replicas;
        }

        public static final class Builder {
            private Long appId; 
            private Long appSchemaId; 
            private Long envId; 
            private String envName; 
            private Integer envType; 
            private String envTypeName; 
            private String region; 
            private Integer replicas; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppSchemaId.
             */
            public Builder appSchemaId(Long appSchemaId) {
                this.appSchemaId = appSchemaId;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(Long envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * EnvTypeName.
             */
            public Builder envTypeName(String envTypeName) {
                this.envTypeName = envTypeName;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Replicas.
             */
            public Builder replicas(Integer replicas) {
                this.replicas = replicas;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
