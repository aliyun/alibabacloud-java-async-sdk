// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindPrepublishesByParentIdResponseBody} extends {@link TeaModel}
 *
 * <p>FindPrepublishesByParentIdResponseBody</p>
 */
public class FindPrepublishesByParentIdResponseBody extends TeaModel {
    @NameInMap("PrepublishList")
    private PrepublishList prepublishList;

    @NameInMap("RequestId")
    private String requestId;

    private FindPrepublishesByParentIdResponseBody(Builder builder) {
        this.prepublishList = builder.prepublishList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindPrepublishesByParentIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return prepublishList
     */
    public PrepublishList getPrepublishList() {
        return this.prepublishList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PrepublishList prepublishList; 
        private String requestId; 

        /**
         * PrepublishList.
         */
        public Builder prepublishList(PrepublishList prepublishList) {
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

        public FindPrepublishesByParentIdResponseBody build() {
            return new FindPrepublishesByParentIdResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BarrierCount")
        private String barrierCount;

        @NameInMap("DeviceModelId")
        private String deviceModelId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("GmtModifyTimestamp")
        private Long gmtModifyTimestamp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsActive")
        private String isActive;

        @NameInMap("IsTotalPrepublish")
        private String isTotalPrepublish;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("VersionId")
        private String versionId;

        @NameInMap("VersionType")
        private String versionType;

        private Items(Builder builder) {
            this.barrierCount = builder.barrierCount;
            this.deviceModelId = builder.deviceModelId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModify = builder.gmtModify;
            this.gmtModifyTimestamp = builder.gmtModifyTimestamp;
            this.id = builder.id;
            this.isActive = builder.isActive;
            this.isTotalPrepublish = builder.isTotalPrepublish;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.versionId = builder.versionId;
            this.versionType = builder.versionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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
        public Long getId() {
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
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModify; 
            private Long gmtModifyTimestamp; 
            private Long id; 
            private String isActive; 
            private String isTotalPrepublish; 
            private String name; 
            private String parentId; 
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
            public Builder id(Long id) {
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class PrepublishList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PrepublishList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrepublishList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer totalCount; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PrepublishList build() {
                return new PrepublishList(this);
            } 

        } 

    }
}
