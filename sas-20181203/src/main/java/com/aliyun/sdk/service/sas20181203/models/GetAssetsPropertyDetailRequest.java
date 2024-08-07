// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetsPropertyDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAssetsPropertyDetailRequest</p>
 */
public class GetAssetsPropertyDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Biz")
    @com.aliyun.core.annotation.Validation(required = true)
    private String biz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemName")
    private String itemName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchCriteriaList")
    private java.util.List < SearchCriteriaList> searchCriteriaList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetAssetsPropertyDetailRequest(Builder builder) {
        super(builder);
        this.biz = builder.biz;
        this.currentPage = builder.currentPage;
        this.itemName = builder.itemName;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.searchCriteriaList = builder.searchCriteriaList;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetsPropertyDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return searchCriteriaList
     */
    public java.util.List < SearchCriteriaList> getSearchCriteriaList() {
        return this.searchCriteriaList;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetAssetsPropertyDetailRequest, Builder> {
        private String biz; 
        private Integer currentPage; 
        private String itemName; 
        private String lang; 
        private Integer pageSize; 
        private String remark; 
        private java.util.List < SearchCriteriaList> searchCriteriaList; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetAssetsPropertyDetailRequest request) {
            super(request);
            this.biz = request.biz;
            this.currentPage = request.currentPage;
            this.itemName = request.itemName;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.searchCriteriaList = request.searchCriteriaList;
            this.uuid = request.uuid;
        } 

        /**
         * The type of the asset fingerprint that you want to query. Default value: **sca**. Valid values:
         * <p>
         * 
         * *   **lkm**: kernel module
         * *   **autorun**: startup item
         * *   **web_server**: website
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The name of the aggregation item for the asset fingerprint that you want to query.
         * <p>
         * 
         * > You can call the [GetAssetsPropertyItem](~~GetAssetsPropertyItem~~) operation to query the names of aggregation items.
         */
        public Builder itemName(String itemName) {
            this.putQueryParameter("ItemName", itemName);
            this.itemName = itemName;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name or IP address of the server.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The conditions that are used to query the details about the asset fingerprint.
         */
        public Builder searchCriteriaList(java.util.List < SearchCriteriaList> searchCriteriaList) {
            this.putQueryParameter("SearchCriteriaList", searchCriteriaList);
            this.searchCriteriaList = searchCriteriaList;
            return this;
        }

        /**
         * The UUID of the server.
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetAssetsPropertyDetailRequest build() {
            return new GetAssetsPropertyDetailRequest(this);
        } 

    } 

    public static class SearchCriteriaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SearchCriteriaList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchCriteriaList create() {
            return builder().build();
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
            private String name; 
            private String value; 

            /**
             * The name of the condition. Valid values:
             * <p>
             * 
             * *   **remarkItemName**: the aggregation item of the asset fingerprints. Fuzzy match is supported.
             * 
             * > *   If **Biz** is set to **web_server**, **remarkItemName** specifies a domain name. 
             * > *   If **Biz** is set to **lkm**, **remarkItemName** specifies a module name.
             * > *   If **Biz** is set to **autorun**, **remarkItemName** specifies the path to a startup item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the condition.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SearchCriteriaList build() {
                return new SearchCriteriaList(this);
            } 

        } 

    }
}
