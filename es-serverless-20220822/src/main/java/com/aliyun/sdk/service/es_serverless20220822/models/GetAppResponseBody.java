// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppResponseBody</p>
 */
public class GetAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private GetAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppResponseBody create() {
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
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetAppResponseBody build() {
            return new GetAppResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("appName")
        private String appName;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("description")
        private String description;

        @NameInMap("flowQuota")
        private String flowQuota;

        @NameInMap("ownerId")
        private String ownerId;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("status")
        private String status;

        @NameInMap("storageQuota")
        private String storageQuota;

        private Result(Builder builder) {
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.flowQuota = builder.flowQuota;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.storageQuota = builder.storageQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return flowQuota
         */
        public String getFlowQuota() {
            return this.flowQuota;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageQuota
         */
        public String getStorageQuota() {
            return this.storageQuota;
        }

        public static final class Builder {
            private String appName; 
            private String createTime; 
            private String description; 
            private String flowQuota; 
            private String ownerId; 
            private String regionId; 
            private String status; 
            private String storageQuota; 

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 应用备注
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 流量限流额
             */
            public Builder flowQuota(String flowQuota) {
                this.flowQuota = flowQuota;
                return this;
            }

            /**
             * OwnerID账号ID
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * 代表region的资源属性字段
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 代表资源状态的资源属性字段
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 存储限流额
             */
            public Builder storageQuota(String storageQuota) {
                this.storageQuota = storageQuota;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
