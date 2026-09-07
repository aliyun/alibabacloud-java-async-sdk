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
 * {@link ListDomainMetasResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainMetasResponseBody</p>
 */
public class ListDomainMetasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainMetas")
    private java.util.List<DomainMetas> domainMetas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListDomainMetasResponseBody(Builder builder) {
        this.domainMetas = builder.domainMetas;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainMetasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainMetas
     */
    public java.util.List<DomainMetas> getDomainMetas() {
        return this.domainMetas;
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
        private java.util.List<DomainMetas> domainMetas; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListDomainMetasResponseBody model) {
            this.domainMetas = model.domainMetas;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The list of domain name lists.</p>
         */
        public Builder domainMetas(java.util.List<DomainMetas> domainMetas) {
            this.domainMetas = domainMetas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D2788E14-8C9F-5FE8-B72F-5ABD033AA27E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of lists that match the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListDomainMetasResponseBody build() {
            return new ListDomainMetasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDomainMetasResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainMetasResponseBody</p>
     */
    public static class DomainMetas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ItemCount")
        private Long itemCount;

        @com.aliyun.core.annotation.NameInMap("ListId")
        private String listId;

        @com.aliyun.core.annotation.NameInMap("ListType")
        private String listType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private DomainMetas(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itemCount = builder.itemCount;
            this.listId = builder.listId;
            this.listType = builder.listType;
            this.name = builder.name;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainMetas create() {
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
         * @return itemCount
         */
        public Long getItemCount() {
            return this.itemCount;
        }

        /**
         * @return listId
         */
        public String getListId() {
            return this.listId;
        }

        /**
         * @return listType
         */
        public String getListType() {
            return this.listType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Long itemCount; 
            private String listId; 
            private String listType; 
            private String name; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(DomainMetas model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.itemCount = model.itemCount;
                this.listId = model.listId;
                this.listType = model.listType;
                this.name = model.name;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>The time when the list was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-01 10:20:30</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the list was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-02 15:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The number of domain name entries in the list.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder itemCount(Long itemCount) {
                this.itemCount = itemCount;
                return this;
            }

            /**
             * <p>The list ID, which is a unique business identifier used for policy references and CRUD operations.</p>
             * 
             * <strong>example:</strong>
             * <p>ladl-8acxxxa0f2a7daf9</p>
             */
            public Builder listId(String listId) {
                this.listId = listId;
                return this;
            }

            /**
             * <p>The list type.</p>
             * 
             * <strong>example:</strong>
             * <p>la_domain_white_list</p>
             */
            public Builder listType(String listType) {
                this.listType = listType;
                return this;
            }

            /**
             * <p>The list name.</p>
             * 
             * <strong>example:</strong>
             * <p>OfficeDomainWhitelist</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>RS_ladl-xxxxxxxxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public DomainMetas build() {
                return new DomainMetas(this);
            } 

        } 

    }
}
