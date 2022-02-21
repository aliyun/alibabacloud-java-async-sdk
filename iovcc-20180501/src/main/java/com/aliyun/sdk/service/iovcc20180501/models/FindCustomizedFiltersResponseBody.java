// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindCustomizedFiltersResponseBody} extends {@link TeaModel}
 *
 * <p>FindCustomizedFiltersResponseBody</p>
 */
public class FindCustomizedFiltersResponseBody extends TeaModel {
    @NameInMap("CustomizedFilterList")
    private CustomizedFilterList customizedFilterList;

    @NameInMap("RequestId")
    private String requestId;

    private FindCustomizedFiltersResponseBody(Builder builder) {
        this.customizedFilterList = builder.customizedFilterList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindCustomizedFiltersResponseBody create() {
        return builder().build();
    }

    /**
     * @return customizedFilterList
     */
    public CustomizedFilterList getCustomizedFilterList() {
        return this.customizedFilterList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CustomizedFilterList customizedFilterList; 
        private String requestId; 

        /**
         * CustomizedFilterList.
         */
        public Builder customizedFilterList(CustomizedFilterList customizedFilterList) {
            this.customizedFilterList = customizedFilterList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindCustomizedFiltersResponseBody build() {
            return new FindCustomizedFiltersResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BlackWhiteType")
        private String blackWhiteType;

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

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueCompareType")
        private String valueCompareType;

        private Items(Builder builder) {
            this.blackWhiteType = builder.blackWhiteType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModify = builder.gmtModify;
            this.gmtModifyTimestamp = builder.gmtModifyTimestamp;
            this.id = builder.id;
            this.name = builder.name;
            this.value = builder.value;
            this.valueCompareType = builder.valueCompareType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return blackWhiteType
         */
        public String getBlackWhiteType() {
            return this.blackWhiteType;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueCompareType
         */
        public String getValueCompareType() {
            return this.valueCompareType;
        }

        public static final class Builder {
            private String blackWhiteType; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModify; 
            private Long gmtModifyTimestamp; 
            private Long id; 
            private String name; 
            private String value; 
            private String valueCompareType; 

            /**
             * BlackWhiteType.
             */
            public Builder blackWhiteType(String blackWhiteType) {
                this.blackWhiteType = blackWhiteType;
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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueCompareType.
             */
            public Builder valueCompareType(String valueCompareType) {
                this.valueCompareType = valueCompareType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class CustomizedFilterList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private CustomizedFilterList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedFilterList create() {
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

            public CustomizedFilterList build() {
                return new CustomizedFilterList(this);
            } 

        } 

    }
}
