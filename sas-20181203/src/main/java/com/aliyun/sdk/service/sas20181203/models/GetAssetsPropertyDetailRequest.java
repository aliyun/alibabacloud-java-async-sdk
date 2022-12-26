// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetsPropertyDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAssetsPropertyDetailRequest</p>
 */
public class GetAssetsPropertyDetailRequest extends Request {
    @Query
    @NameInMap("Biz")
    @Validation(required = true)
    private String biz;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ItemName")
    private String itemName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SearchCriteriaList")
    private java.util.List < SearchCriteriaList> searchCriteriaList;

    @Query
    @NameInMap("Uuid")
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
         * Biz.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ItemName.
         */
        public Builder itemName(String itemName) {
            this.putQueryParameter("ItemName", itemName);
            this.itemName = itemName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * SearchCriteriaList.
         */
        public Builder searchCriteriaList(java.util.List < SearchCriteriaList> searchCriteriaList) {
            this.putQueryParameter("SearchCriteriaList", searchCriteriaList);
            this.searchCriteriaList = searchCriteriaList;
            return this;
        }

        /**
         * Uuid.
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
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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

            public SearchCriteriaList build() {
                return new SearchCriteriaList(this);
            } 

        } 

    }
}
