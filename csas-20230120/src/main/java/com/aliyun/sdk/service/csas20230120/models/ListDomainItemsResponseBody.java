// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDomainItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainItemsResponseBody</p>
 */
public class ListDomainItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainItems")
    private java.util.List<DomainItems> domainItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListDomainItemsResponseBody(Builder builder) {
        this.domainItems = builder.domainItems;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainItems
     */
    public java.util.List<DomainItems> getDomainItems() {
        return this.domainItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<DomainItems> domainItems; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListDomainItemsResponseBody model) {
            this.domainItems = model.domainItems;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * DomainItems.
         */
        public Builder domainItems(java.util.List<DomainItems> domainItems) {
            this.domainItems = domainItems;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>019F68B5-2D0D-5399-9BB2-D81C13C2C05D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListDomainItemsResponseBody build() {
            return new ListDomainItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDomainItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainItemsResponseBody</p>
     */
    public static class DomainItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemValue")
        private String itemValue;

        private DomainItems(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itemId = builder.itemId;
            this.itemValue = builder.itemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainItems create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemValue
         */
        public String getItemValue() {
            return this.itemValue;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Long itemId; 
            private String itemValue; 

            private Builder() {
            } 

            private Builder(DomainItems model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.itemId = model.itemId;
                this.itemValue = model.itemValue;
            } 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemValue.
             */
            public Builder itemValue(String itemValue) {
                this.itemValue = itemValue;
                return this;
            }

            public DomainItems build() {
                return new DomainItems(this);
            } 

        } 

    }
}
