// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentsResponseBody</p>
 */
public class ListEnvironmentsResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private ListEnvironmentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public ListEnvironmentsResponseBody build() {
            return new ListEnvironmentsResponseBody(this);
        } 

    } 

    public static class Platform extends TeaModel {
        @NameInMap("architecture")
        private String architecture;

        @NameInMap("os")
        private String os;

        private Platform(Builder builder) {
            this.architecture = builder.architecture;
            this.os = builder.os;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platform create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        public static final class Builder {
            private String architecture; 
            private String os; 

            /**
             * architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            public Platform build() {
                return new Platform(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("description")
        private String description;

        @NameInMap("expireAt")
        @Validation(required = true)
        private String expireAt;

        @NameInMap("instanceStatus")
        private String instanceStatus;

        @NameInMap("location")
        private String location;

        @NameInMap("name")
        private String name;

        @NameInMap("platform")
        private Platform platform;

        @NameInMap("platformList")
        private java.util.List < Platform > platformList;

        @NameInMap("platformStatus")
        private String platformStatus;

        @NameInMap("productName")
        private String productName;

        @NameInMap("productVersion")
        private String productVersion;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        @NameInMap("uid")
        private String uid;

        @NameInMap("vendorType")
        private String vendorType;

        private List(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.expireAt = builder.expireAt;
            this.instanceStatus = builder.instanceStatus;
            this.location = builder.location;
            this.name = builder.name;
            this.platform = builder.platform;
            this.platformList = builder.platformList;
            this.platformStatus = builder.platformStatus;
            this.productName = builder.productName;
            this.productVersion = builder.productVersion;
            this.productVersionUID = builder.productVersionUID;
            this.uid = builder.uid;
            this.vendorType = builder.vendorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expireAt
         */
        public String getExpireAt() {
            return this.expireAt;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return platform
         */
        public Platform getPlatform() {
            return this.platform;
        }

        /**
         * @return platformList
         */
        public java.util.List < Platform > getPlatformList() {
            return this.platformList;
        }

        /**
         * @return platformStatus
         */
        public String getPlatformStatus() {
            return this.platformStatus;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return vendorType
         */
        public String getVendorType() {
            return this.vendorType;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private String expireAt; 
            private String instanceStatus; 
            private String location; 
            private String name; 
            private Platform platform; 
            private java.util.List < Platform > platformList; 
            private String platformStatus; 
            private String productName; 
            private String productVersion; 
            private String productVersionUID; 
            private String uid; 
            private String vendorType; 

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * expireAt.
             */
            public Builder expireAt(String expireAt) {
                this.expireAt = expireAt;
                return this;
            }

            /**
             * instanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * platform.
             */
            public Builder platform(Platform platform) {
                this.platform = platform;
                return this;
            }

            /**
             * platformList.
             */
            public Builder platformList(java.util.List < Platform > platformList) {
                this.platformList = platformList;
                return this;
            }

            /**
             * platformStatus.
             */
            public Builder platformStatus(String platformStatus) {
                this.platformStatus = platformStatus;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * vendorType.
             */
            public Builder vendorType(String vendorType) {
                this.vendorType = vendorType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("list")
        private java.util.List < List> list;

        @NameInMap("pageNum")
        private Integer pageNum;

        @NameInMap("pageSize")
        private Integer pageSize;

        @NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
