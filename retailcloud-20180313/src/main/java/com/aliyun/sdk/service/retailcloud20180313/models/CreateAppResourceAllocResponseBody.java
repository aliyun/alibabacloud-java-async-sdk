// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppResourceAllocResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppResourceAllocResponseBody</p>
 */
public class CreateAppResourceAllocResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private CreateAppResourceAllocResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppResourceAllocResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAppResourceAllocResponseBody build() {
            return new CreateAppResourceAllocResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppEnvId")
        private Long appEnvId;

        @NameInMap("AppId")
        private Long appId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ResourceDef")
        private String resourceDef;

        private Result(Builder builder) {
            this.appEnvId = builder.appEnvId;
            this.appId = builder.appId;
            this.clusterId = builder.clusterId;
            this.id = builder.id;
            this.resourceDef = builder.resourceDef;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appEnvId
         */
        public Long getAppEnvId() {
            return this.appEnvId;
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return resourceDef
         */
        public String getResourceDef() {
            return this.resourceDef;
        }

        public static final class Builder {
            private Long appEnvId; 
            private Long appId; 
            private String clusterId; 
            private Long id; 
            private String resourceDef; 

            /**
             * AppEnvId.
             */
            public Builder appEnvId(Long appEnvId) {
                this.appEnvId = appEnvId;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ResourceDef.
             */
            public Builder resourceDef(String resourceDef) {
                this.resourceDef = resourceDef;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
