// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDriveSpacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDriveSpacesResponseBody</p>
 */
public class ListDriveSpacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("spaces")
    private java.util.List < Spaces> spaces;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private ListDriveSpacesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.spaces = builder.spaces;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDriveSpacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaces
     */
    public java.util.List < Spaces> getSpaces() {
        return this.spaces;
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
        private String nextToken; 
        private String requestId; 
        private java.util.List < Spaces> spaces; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * spaces.
         */
        public Builder spaces(java.util.List < Spaces> spaces) {
            this.spaces = spaces;
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

        public ListDriveSpacesResponseBody build() {
            return new ListDriveSpacesResponseBody(this);
        } 

    } 

    public static class Spaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("PermissionMode")
        private String permissionMode;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Long quota;

        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private String spaceId;

        @com.aliyun.core.annotation.NameInMap("SpaceName")
        private String spaceName;

        @com.aliyun.core.annotation.NameInMap("SpaceType")
        private String spaceType;

        @com.aliyun.core.annotation.NameInMap("UsedQuota")
        private Long usedQuota;

        private Spaces(Builder builder) {
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.permissionMode = builder.permissionMode;
            this.quota = builder.quota;
            this.spaceId = builder.spaceId;
            this.spaceName = builder.spaceName;
            this.spaceType = builder.spaceType;
            this.usedQuota = builder.usedQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spaces create() {
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

        public static final class Builder {
            private String createTime; 
            private String modifyTime; 
            private String permissionMode; 
            private Long quota; 
            private String spaceId; 
            private String spaceName; 
            private String spaceType; 
            private Long usedQuota; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * PermissionMode.
             */
            public Builder permissionMode(String permissionMode) {
                this.permissionMode = permissionMode;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(Long quota) {
                this.quota = quota;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * SpaceName.
             */
            public Builder spaceName(String spaceName) {
                this.spaceName = spaceName;
                return this;
            }

            /**
             * SpaceType.
             */
            public Builder spaceType(String spaceType) {
                this.spaceType = spaceType;
                return this;
            }

            /**
             * UsedQuota.
             */
            public Builder usedQuota(Long usedQuota) {
                this.usedQuota = usedQuota;
                return this;
            }

            public Spaces build() {
                return new Spaces(this);
            } 

        } 

    }
}
