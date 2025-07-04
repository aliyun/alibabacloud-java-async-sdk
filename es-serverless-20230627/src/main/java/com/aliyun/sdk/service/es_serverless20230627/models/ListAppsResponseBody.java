// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link ListAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppsResponseBody</p>
 */
public class ListAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer totalCount;

    private ListAppsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsResponseBody create() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAppsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.totalCount = model.totalCount;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAppsResponseBody build() {
            return new ListAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("appName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("appType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("modifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ownerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.version = builder.version;
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
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appType; 
            private String createTime; 
            private String description; 
            private String instanceId; 
            private String modifiedTime; 
            private String ownerId; 
            private String regionId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String version; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.appType = model.appType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
                this.ownerId = model.ownerId;
                this.regionId = model.regionId;
                this.status = model.status;
                this.tags = model.tags;
                this.version = model.version;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>代表资源名称的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>es-severless-test-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * appType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>代表创建时间的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-27T07:09:11.000Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>应用备注</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * modifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>OwnerID账号ID</p>
             * 
             * <strong>example:</strong>
             * <p>*********7595</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>代表region的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>代表资源状态的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
