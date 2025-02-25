// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link DriveLogDetail} extends {@link TeaModel}
 *
 * <p>DriveLogDetail</p>
 */
public class DriveLogDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("force_delete")
    private Boolean forceDelete;

    @com.aliyun.core.annotation.NameInMap("handover_owner_name")
    private String handoverOwnerName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("owner_id")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("owner_name")
    private String ownerName;

    @com.aliyun.core.annotation.NameInMap("owner_type")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("total_size")
    private Long totalSize;

    @com.aliyun.core.annotation.NameInMap("update_to")
    private UpdateTo updateTo;

    private DriveLogDetail(Builder builder) {
        this.forceDelete = builder.forceDelete;
        this.handoverOwnerName = builder.handoverOwnerName;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.ownerName = builder.ownerName;
        this.ownerType = builder.ownerType;
        this.totalSize = builder.totalSize;
        this.updateTo = builder.updateTo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DriveLogDetail create() {
        return builder().build();
    }

    /**
     * @return forceDelete
     */
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * @return handoverOwnerName
     */
    public String getHandoverOwnerName() {
        return this.handoverOwnerName;
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
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * @return updateTo
     */
    public UpdateTo getUpdateTo() {
        return this.updateTo;
    }

    public static final class Builder {
        private Boolean forceDelete; 
        private String handoverOwnerName; 
        private String name; 
        private String ownerId; 
        private String ownerName; 
        private String ownerType; 
        private Long totalSize; 
        private UpdateTo updateTo; 

        /**
         * force_delete.
         */
        public Builder forceDelete(Boolean forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        /**
         * handover_owner_name.
         */
        public Builder handoverOwnerName(String handoverOwnerName) {
            this.handoverOwnerName = handoverOwnerName;
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
         * owner_id.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * owner_name.
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
         * owner_type.
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * total_size.
         */
        public Builder totalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        /**
         * update_to.
         */
        public Builder updateTo(UpdateTo updateTo) {
            this.updateTo = updateTo;
            return this;
        }

        public DriveLogDetail build() {
            return new DriveLogDetail(this);
        } 

    } 

    /**
     * 
     * {@link DriveLogDetail} extends {@link TeaModel}
     *
     * <p>DriveLogDetail</p>
     */
    public static class UpdateTo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("owner_id")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("owner_name")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("owner_type")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("total_size")
        private Long totalSize;

        private UpdateTo(Builder builder) {
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.ownerName = builder.ownerName;
            this.ownerType = builder.ownerType;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateTo create() {
            return builder().build();
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
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String name; 
            private String ownerId; 
            private String ownerName; 
            private String ownerType; 
            private Long totalSize; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * owner_id.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * owner_name.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * owner_type.
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * total_size.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public UpdateTo build() {
                return new UpdateTo(this);
            } 

        } 

    }
}
