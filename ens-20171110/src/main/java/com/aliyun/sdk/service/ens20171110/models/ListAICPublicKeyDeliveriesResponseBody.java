// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ListAICPublicKeyDeliveriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAICPublicKeyDeliveriesResponseBody</p>
 */
public class ListAICPublicKeyDeliveriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("PublicKeyDeliverInfo")
    private java.util.List<PublicKeyDeliverInfo> publicKeyDeliverInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAICPublicKeyDeliveriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicKeyDeliverInfo = builder.publicKeyDeliverInfo;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAICPublicKeyDeliveriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return publicKeyDeliverInfo
     */
    public java.util.List<PublicKeyDeliverInfo> getPublicKeyDeliverInfo() {
        return this.publicKeyDeliverInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<PublicKeyDeliverInfo> publicKeyDeliverInfo; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAICPublicKeyDeliveriesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.publicKeyDeliverInfo = model.publicKeyDeliverInfo;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PublicKeyDeliverInfo.
         */
        public Builder publicKeyDeliverInfo(java.util.List<PublicKeyDeliverInfo> publicKeyDeliverInfo) {
            this.publicKeyDeliverInfo = publicKeyDeliverInfo;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAICPublicKeyDeliveriesResponseBody build() {
            return new ListAICPublicKeyDeliveriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAICPublicKeyDeliveriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICPublicKeyDeliveriesResponseBody</p>
     */
    public static class PublicKeyDeliverInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KeyGroup")
        private String keyGroup;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        private PublicKeyDeliverInfo(Builder builder) {
            this.creationTime = builder.creationTime;
            this.instanceId = builder.instanceId;
            this.keyGroup = builder.keyGroup;
            this.keyName = builder.keyName;
            this.keyType = builder.keyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicKeyDeliverInfo create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return keyGroup
         */
        public String getKeyGroup() {
            return this.keyGroup;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        public static final class Builder {
            private String creationTime; 
            private String instanceId; 
            private String keyGroup; 
            private String keyName; 
            private String keyType; 

            private Builder() {
            } 

            private Builder(PublicKeyDeliverInfo model) {
                this.creationTime = model.creationTime;
                this.instanceId = model.instanceId;
                this.keyGroup = model.keyGroup;
                this.keyName = model.keyName;
                this.keyType = model.keyType;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * KeyGroup.
             */
            public Builder keyGroup(String keyGroup) {
                this.keyGroup = keyGroup;
                return this;
            }

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * KeyType.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            public PublicKeyDeliverInfo build() {
                return new PublicKeyDeliverInfo(this);
            } 

        } 

    }
}
