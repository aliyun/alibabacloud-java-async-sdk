// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link AddDriveSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>AddDriveSpaceResponseBody</p>
 */
public class AddDriveSpaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("modifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("permissionMode")
    private String permissionMode;

    @com.aliyun.core.annotation.NameInMap("quota")
    private Long quota;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("spaceId")
    private String spaceId;

    @com.aliyun.core.annotation.NameInMap("spaceName")
    private String spaceName;

    @com.aliyun.core.annotation.NameInMap("spaceType")
    private String spaceType;

    @com.aliyun.core.annotation.NameInMap("usedQuota")
    private Long usedQuota;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private AddDriveSpaceResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.modifyTime = builder.modifyTime;
        this.permissionMode = builder.permissionMode;
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.spaceId = builder.spaceId;
        this.spaceName = builder.spaceName;
        this.spaceType = builder.spaceType;
        this.usedQuota = builder.usedQuota;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDriveSpaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return permissionMode
     */
    public String getPermissionMode() {
        return this.permissionMode;
    }

    /**
     * @return quota
     */
    public Long getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return spaceName
     */
    public String getSpaceName() {
        return this.spaceName;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    /**
     * @return usedQuota
     */
    public Long getUsedQuota() {
        return this.usedQuota;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String createTime; 
        private String modifyTime; 
        private String permissionMode; 
        private Long quota; 
        private String requestId; 
        private String spaceId; 
        private String spaceName; 
        private String spaceType; 
        private Long usedQuota; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * modifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * permissionMode.
         */
        public Builder permissionMode(String permissionMode) {
            this.permissionMode = permissionMode;
            return this;
        }

        /**
         * quota.
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * spaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * spaceName.
         */
        public Builder spaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }

        /**
         * spaceType.
         */
        public Builder spaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }

        /**
         * usedQuota.
         */
        public Builder usedQuota(Long usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public AddDriveSpaceResponseBody build() {
            return new AddDriveSpaceResponseBody(this);
        } 

    } 

}
