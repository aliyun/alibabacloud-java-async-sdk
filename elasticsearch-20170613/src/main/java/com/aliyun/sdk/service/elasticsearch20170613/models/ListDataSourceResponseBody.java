// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceResponseBody</p>
 */
public class ListDataSourceResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListDataSourceResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
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

        public ListDataSourceResponseBody build() {
            return new ListDataSourceResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("XTotalCount")
        private Integer XTotalCount;

        private Headers(Builder builder) {
            this.XTotalCount = builder.XTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return XTotalCount
         */
        public Integer getXTotalCount() {
            return this.XTotalCount;
        }

        public static final class Builder {
            private Integer XTotalCount; 

            /**
             * XTotalCount.
             */
            public Builder XTotalCount(Integer XTotalCount) {
                this.XTotalCount = XTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Meta extends TeaModel {
        @NameInMap("AccessKey")
        private String accessKey;

        @NameInMap("AccessSecret")
        private String accessSecret;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("EndPoint")
        private String endPoint;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Password")
        private String password;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("UserName")
        private String userName;

        private Meta(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessSecret = builder.accessSecret;
            this.dbName = builder.dbName;
            this.endPoint = builder.endPoint;
            this.instanceId = builder.instanceId;
            this.password = builder.password;
            this.port = builder.port;
            this.projectName = builder.projectName;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessSecret
         */
        public String getAccessSecret() {
            return this.accessSecret;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessSecret; 
            private String dbName; 
            private String endPoint; 
            private String instanceId; 
            private String password; 
            private Integer port; 
            private String projectName; 
            private String userName; 

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * AccessSecret.
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * EndPoint.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("Meta")
        private Meta meta;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.meta = builder.meta;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private Meta meta; 
            private String name; 
            private String ownerId; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Meta.
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
