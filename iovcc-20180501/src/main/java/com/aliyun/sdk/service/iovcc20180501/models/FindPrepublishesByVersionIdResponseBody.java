// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindPrepublishesByVersionIdResponseBody} extends {@link TeaModel}
 *
 * <p>FindPrepublishesByVersionIdResponseBody</p>
 */
public class FindPrepublishesByVersionIdResponseBody extends TeaModel {
    @NameInMap("PrepublishList")
    private java.util.List < PrepublishList> prepublishList;

    @NameInMap("RequestId")
    private String requestId;

    private FindPrepublishesByVersionIdResponseBody(Builder builder) {
        this.prepublishList = builder.prepublishList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindPrepublishesByVersionIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return prepublishList
     */
    public java.util.List < PrepublishList> getPrepublishList() {
        return this.prepublishList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PrepublishList> prepublishList; 
        private String requestId; 

        /**
         * PrepublishList.
         */
        public Builder prepublishList(java.util.List < PrepublishList> prepublishList) {
            this.prepublishList = prepublishList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindPrepublishesByVersionIdResponseBody build() {
            return new FindPrepublishesByVersionIdResponseBody(this);
        } 

    } 

    public static class PrepublishList extends TeaModel {
        @NameInMap("BarrierCount")
        private String barrierCount;

        @NameInMap("DeviceModelId")
        private String deviceModelId;

        @NameInMap("DeviceModelName")
        private String deviceModelName;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("GmtModifyTimestamp")
        private Long gmtModifyTimestamp;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsActive")
        private String isActive;

        @NameInMap("IsTotalPrepublish")
        private String isTotalPrepublish;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("PassedCount")
        private String passedCount;

        @NameInMap("VersionId")
        private String versionId;

        @NameInMap("VersionType")
        private String versionType;

        private PrepublishList(Builder builder) {
            this.barrierCount = builder.barrierCount;
            this.deviceModelId = builder.deviceModelId;
            this.deviceModelName = builder.deviceModelName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModify = builder.gmtModify;
            this.gmtModifyTimestamp = builder.gmtModifyTimestamp;
            this.id = builder.id;
            this.isActive = builder.isActive;
            this.isTotalPrepublish = builder.isTotalPrepublish;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.passedCount = builder.passedCount;
            this.versionId = builder.versionId;
            this.versionType = builder.versionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrepublishList create() {
            return builder().build();
        }

        /**
         * @return barrierCount
         */
        public String getBarrierCount() {
            return this.barrierCount;
        }

        /**
         * @return deviceModelId
         */
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        /**
         * @return deviceModelName
         */
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return gmtModifyTimestamp
         */
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isActive
         */
        public String getIsActive() {
            return this.isActive;
        }

        /**
         * @return isTotalPrepublish
         */
        public String getIsTotalPrepublish() {
            return this.isTotalPrepublish;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return passedCount
         */
        public String getPassedCount() {
            return this.passedCount;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionType
         */
        public String getVersionType() {
            return this.versionType;
        }

        public static final class Builder {
            private String barrierCount; 
            private String deviceModelId; 
            private String deviceModelName; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModify; 
            private Long gmtModifyTimestamp; 
            private String id; 
            private String isActive; 
            private String isTotalPrepublish; 
            private String name; 
            private String parentId; 
            private String passedCount; 
            private String versionId; 
            private String versionType; 

            /**
             * BarrierCount.
             */
            public Builder barrierCount(String barrierCount) {
                this.barrierCount = barrierCount;
                return this;
            }

            /**
             * DeviceModelId.
             */
            public Builder deviceModelId(String deviceModelId) {
                this.deviceModelId = deviceModelId;
                return this;
            }

            /**
             * DeviceModelName.
             */
            public Builder deviceModelName(String deviceModelName) {
                this.deviceModelName = deviceModelName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * GmtModifyTimestamp.
             */
            public Builder gmtModifyTimestamp(Long gmtModifyTimestamp) {
                this.gmtModifyTimestamp = gmtModifyTimestamp;
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
             * IsActive.
             */
            public Builder isActive(String isActive) {
                this.isActive = isActive;
                return this;
            }

            /**
             * IsTotalPrepublish.
             */
            public Builder isTotalPrepublish(String isTotalPrepublish) {
                this.isTotalPrepublish = isTotalPrepublish;
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
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * PassedCount.
             */
            public Builder passedCount(String passedCount) {
                this.passedCount = passedCount;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * VersionType.
             */
            public Builder versionType(String versionType) {
                this.versionType = versionType;
                return this;
            }

            public PrepublishList build() {
                return new PrepublishList(this);
            } 

        } 

    }
}
