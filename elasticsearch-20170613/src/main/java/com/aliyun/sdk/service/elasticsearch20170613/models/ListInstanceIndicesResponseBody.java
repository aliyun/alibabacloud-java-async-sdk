// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceIndicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceIndicesResponseBody</p>
 */
public class ListInstanceIndicesResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListInstanceIndicesResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceIndicesResponseBody create() {
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

        public ListInstanceIndicesResponseBody build() {
            return new ListInstanceIndicesResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("X-Managed-Count")
        private Integer xManagedCount;

        @NameInMap("X-Managed-StorageSize")
        private Long xManagedStorageSize;

        @NameInMap("X-OSS-Count")
        private Integer xOSSCount;

        @NameInMap("X-OSS-StorageSize")
        private Long xOSSStorageSize;

        private Headers(Builder builder) {
            this.xManagedCount = builder.xManagedCount;
            this.xManagedStorageSize = builder.xManagedStorageSize;
            this.xOSSCount = builder.xOSSCount;
            this.xOSSStorageSize = builder.xOSSStorageSize;
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

        /**
         * @return xOSSCount
         */
        public Integer getXOSSCount() {
            return this.xOSSCount;
        }

        /**
         * @return xOSSStorageSize
         */
        public Long getXOSSStorageSize() {
            return this.xOSSStorageSize;
        }

        public static final class Builder {
            private Integer xManagedCount; 
            private Long xManagedStorageSize; 
            private Integer xOSSCount; 
            private Long xOSSStorageSize; 

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

            /**
             * X-OSS-Count.
             */
            public Builder xOSSCount(Integer xOSSCount) {
                this.xOSSCount = xOSSCount;
                return this;
            }

            /**
             * X-OSS-StorageSize.
             */
            public Builder xOSSStorageSize(Long xOSSStorageSize) {
                this.xOSSStorageSize = xOSSStorageSize;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("createTime")
        private String createTime;

        @NameInMap("health")
        private String health;

        @NameInMap("ilmExplain")
        private String ilmExplain;

        @NameInMap("isManaged")
        private String isManaged;

        @NameInMap("managedStatus")
        private String managedStatus;

        @NameInMap("name")
        private String name;

        @NameInMap("phase")
        private String phase;

        @NameInMap("size")
        private Long size;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.health = builder.health;
            this.ilmExplain = builder.ilmExplain;
            this.isManaged = builder.isManaged;
            this.managedStatus = builder.managedStatus;
            this.name = builder.name;
            this.phase = builder.phase;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
         * @return ilmExplain
         */
        public String getIlmExplain() {
            return this.ilmExplain;
        }

        /**
         * @return isManaged
         */
        public String getIsManaged() {
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
         * @return phase
         */
        public String getPhase() {
            return this.phase;
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
            private String ilmExplain; 
            private String isManaged; 
            private String managedStatus; 
            private String name; 
            private String phase; 
            private Long size; 

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
             * ilmExplain.
             */
            public Builder ilmExplain(String ilmExplain) {
                this.ilmExplain = ilmExplain;
                return this;
            }

            /**
             * isManaged.
             */
            public Builder isManaged(String isManaged) {
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
             * phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
