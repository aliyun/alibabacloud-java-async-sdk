// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionTestsResponseBody} extends {@link TeaModel}
 *
 * <p>FindVersionTestsResponseBody</p>
 */
public class FindVersionTestsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VersionTestList")
    private VersionTestList versionTestList;

    private FindVersionTestsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionTestList = builder.versionTestList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindVersionTestsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionTestList
     */
    public VersionTestList getVersionTestList() {
        return this.versionTestList;
    }

    public static final class Builder {
        private String requestId; 
        private VersionTestList versionTestList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VersionTestList.
         */
        public Builder versionTestList(VersionTestList versionTestList) {
            this.versionTestList = versionTestList;
            return this;
        }

        public FindVersionTestsResponseBody build() {
            return new FindVersionTestsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceGroupId")
        private String deviceGroupId;

        @NameInMap("DeviceGroupName")
        private String deviceGroupName;

        @NameInMap("FailedCount")
        private String failedCount;

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

        @NameInMap("Name")
        private String name;

        @NameInMap("SkippedCount")
        private String skippedCount;

        @NameInMap("SucceededCount")
        private String succeededCount;

        @NameInMap("VersionId")
        private String versionId;

        @NameInMap("VersionType")
        private String versionType;

        private Items(Builder builder) {
            this.description = builder.description;
            this.deviceGroupId = builder.deviceGroupId;
            this.deviceGroupName = builder.deviceGroupName;
            this.failedCount = builder.failedCount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModify = builder.gmtModify;
            this.gmtModifyTimestamp = builder.gmtModifyTimestamp;
            this.id = builder.id;
            this.name = builder.name;
            this.skippedCount = builder.skippedCount;
            this.succeededCount = builder.succeededCount;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceGroupId
         */
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        /**
         * @return deviceGroupName
         */
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        /**
         * @return failedCount
         */
        public String getFailedCount() {
            return this.failedCount;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skippedCount
         */
        public String getSkippedCount() {
            return this.skippedCount;
        }

        /**
         * @return succeededCount
         */
        public String getSucceededCount() {
            return this.succeededCount;
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
            private String description; 
            private String deviceGroupId; 
            private String deviceGroupName; 
            private String failedCount; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModify; 
            private Long gmtModifyTimestamp; 
            private Long id; 
            private String name; 
            private String skippedCount; 
            private String succeededCount; 
            private String versionId; 
            private String versionType; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceGroupId.
             */
            public Builder deviceGroupId(String deviceGroupId) {
                this.deviceGroupId = deviceGroupId;
                return this;
            }

            /**
             * DeviceGroupName.
             */
            public Builder deviceGroupName(String deviceGroupName) {
                this.deviceGroupName = deviceGroupName;
                return this;
            }

            /**
             * FailedCount.
             */
            public Builder failedCount(String failedCount) {
                this.failedCount = failedCount;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SkippedCount.
             */
            public Builder skippedCount(String skippedCount) {
                this.skippedCount = skippedCount;
                return this;
            }

            /**
             * SucceededCount.
             */
            public Builder succeededCount(String succeededCount) {
                this.succeededCount = succeededCount;
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
    public static class VersionTestList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private VersionTestList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionTestList create() {
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

            public VersionTestList build() {
                return new VersionTestList(this);
            } 

        } 

    }
}
