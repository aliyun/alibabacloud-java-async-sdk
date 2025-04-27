// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListDataStreamsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataStreamsResponseBody</p>
 */
public class ListDataStreamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListDataStreamsResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataStreamsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListDataStreamsResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

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
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListDataStreamsResponseBody build() {
            return new ListDataStreamsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataStreamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataStreamsResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Managed-Count")
        private Integer xManagedCount;

        @com.aliyun.core.annotation.NameInMap("X-Managed-StorageSize")
        private Long xManagedStorageSize;

        private Headers(Builder builder) {
            this.xManagedCount = builder.xManagedCount;
            this.xManagedStorageSize = builder.xManagedStorageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xManagedCount
         */
        public Integer getXManagedCount() {
            return this.xManagedCount;
        }

        /**
         * @return xManagedStorageSize
         */
        public Long getXManagedStorageSize() {
            return this.xManagedStorageSize;
        }

        public static final class Builder {
            private Integer xManagedCount; 
            private Long xManagedStorageSize; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.xManagedCount = model.xManagedCount;
                this.xManagedStorageSize = model.xManagedStorageSize;
            } 

            /**
             * X-Managed-Count.
             */
            public Builder xManagedCount(Integer xManagedCount) {
                this.xManagedCount = xManagedCount;
                return this;
            }

            /**
             * X-Managed-StorageSize.
             */
            public Builder xManagedStorageSize(Long xManagedStorageSize) {
                this.xManagedStorageSize = xManagedStorageSize;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataStreamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataStreamsResponseBody</p>
     */
    public static class Indices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("isManaged")
        private Boolean isManaged;

        @com.aliyun.core.annotation.NameInMap("managedStatus")
        private String managedStatus;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        private Indices(Builder builder) {
            this.createTime = builder.createTime;
            this.health = builder.health;
            this.isManaged = builder.isManaged;
            this.managedStatus = builder.managedStatus;
            this.name = builder.name;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Indices create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return health
         */
        public String getHealth() {
            return this.health;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        /**
         * @return managedStatus
         */
        public String getManagedStatus() {
            return this.managedStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String createTime; 
            private String health; 
            private Boolean isManaged; 
            private String managedStatus; 
            private String name; 
            private Long size; 

            private Builder() {
            } 

            private Builder(Indices model) {
                this.createTime = model.createTime;
                this.health = model.health;
                this.isManaged = model.isManaged;
                this.managedStatus = model.managedStatus;
                this.name = model.name;
                this.size = model.size;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * health.
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * isManaged.
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            /**
             * managedStatus.
             */
            public Builder managedStatus(String managedStatus) {
                this.managedStatus = managedStatus;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Indices build() {
                return new Indices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataStreamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataStreamsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("ilmPolicyName")
        private String ilmPolicyName;

        @com.aliyun.core.annotation.NameInMap("indexTemplateName")
        private String indexTemplateName;

        @com.aliyun.core.annotation.NameInMap("indices")
        private java.util.List<Indices> indices;

        @com.aliyun.core.annotation.NameInMap("managedStorageSize")
        private Long managedStorageSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("totalStorageSize")
        private Long totalStorageSize;

        private Result(Builder builder) {
            this.health = builder.health;
            this.ilmPolicyName = builder.ilmPolicyName;
            this.indexTemplateName = builder.indexTemplateName;
            this.indices = builder.indices;
            this.managedStorageSize = builder.managedStorageSize;
            this.name = builder.name;
            this.totalStorageSize = builder.totalStorageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return health
         */
        public String getHealth() {
            return this.health;
        }

        /**
         * @return ilmPolicyName
         */
        public String getIlmPolicyName() {
            return this.ilmPolicyName;
        }

        /**
         * @return indexTemplateName
         */
        public String getIndexTemplateName() {
            return this.indexTemplateName;
        }

        /**
         * @return indices
         */
        public java.util.List<Indices> getIndices() {
            return this.indices;
        }

        /**
         * @return managedStorageSize
         */
        public Long getManagedStorageSize() {
            return this.managedStorageSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return totalStorageSize
         */
        public Long getTotalStorageSize() {
            return this.totalStorageSize;
        }

        public static final class Builder {
            private String health; 
            private String ilmPolicyName; 
            private String indexTemplateName; 
            private java.util.List<Indices> indices; 
            private Long managedStorageSize; 
            private String name; 
            private Long totalStorageSize; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.health = model.health;
                this.ilmPolicyName = model.ilmPolicyName;
                this.indexTemplateName = model.indexTemplateName;
                this.indices = model.indices;
                this.managedStorageSize = model.managedStorageSize;
                this.name = model.name;
                this.totalStorageSize = model.totalStorageSize;
            } 

            /**
             * health.
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * ilmPolicyName.
             */
            public Builder ilmPolicyName(String ilmPolicyName) {
                this.ilmPolicyName = ilmPolicyName;
                return this;
            }

            /**
             * indexTemplateName.
             */
            public Builder indexTemplateName(String indexTemplateName) {
                this.indexTemplateName = indexTemplateName;
                return this;
            }

            /**
             * indices.
             */
            public Builder indices(java.util.List<Indices> indices) {
                this.indices = indices;
                return this;
            }

            /**
             * managedStorageSize.
             */
            public Builder managedStorageSize(Long managedStorageSize) {
                this.managedStorageSize = managedStorageSize;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * totalStorageSize.
             */
            public Builder totalStorageSize(Long totalStorageSize) {
                this.totalStorageSize = totalStorageSize;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
