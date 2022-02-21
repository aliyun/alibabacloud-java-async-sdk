// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindCustomizedPropertiesResponseBody} extends {@link TeaModel}
 *
 * <p>FindCustomizedPropertiesResponseBody</p>
 */
public class FindCustomizedPropertiesResponseBody extends TeaModel {
    @NameInMap("CustomizedPropertyList")
    private CustomizedPropertyList customizedPropertyList;

    @NameInMap("RequestId")
    private String requestId;

    private FindCustomizedPropertiesResponseBody(Builder builder) {
        this.customizedPropertyList = builder.customizedPropertyList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindCustomizedPropertiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return customizedPropertyList
     */
    public CustomizedPropertyList getCustomizedPropertyList() {
        return this.customizedPropertyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CustomizedPropertyList customizedPropertyList; 
        private String requestId; 

        /**
         * CustomizedPropertyList.
         */
        public Builder customizedPropertyList(CustomizedPropertyList customizedPropertyList) {
            this.customizedPropertyList = customizedPropertyList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindCustomizedPropertiesResponseBody build() {
            return new FindCustomizedPropertiesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private Items(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.id = builder.id;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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

        public static final class Builder {
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private Long id; 
            private String name; 
            private String value; 

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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class CustomizedPropertyList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private CustomizedPropertyList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedPropertyList create() {
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

            public CustomizedPropertyList build() {
                return new CustomizedPropertyList(this);
            } 

        } 

    }
}
