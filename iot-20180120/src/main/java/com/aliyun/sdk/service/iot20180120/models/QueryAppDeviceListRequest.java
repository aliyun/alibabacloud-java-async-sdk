// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppDeviceListRequest} extends {@link RequestModel}
 *
 * <p>QueryAppDeviceListRequest</p>
 */
public class QueryAppDeviceListRequest extends Request {
    @Query
    @NameInMap("AppKey")
    private String appKey;

    @Query
    @NameInMap("CategoryKeyList")
    private java.util.List < String > categoryKeyList;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductKeyList")
    private java.util.List < String > productKeyList;

    @Query
    @NameInMap("TagList")
    private java.util.List < TagList> tagList;

    private QueryAppDeviceListRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.categoryKeyList = builder.categoryKeyList;
        this.currentPage = builder.currentPage;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.productKeyList = builder.productKeyList;
        this.tagList = builder.tagList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppDeviceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return categoryKeyList
     */
    public java.util.List < String > getCategoryKeyList() {
        return this.categoryKeyList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKeyList
     */
    public java.util.List < String > getProductKeyList() {
        return this.productKeyList;
    }

    /**
     * @return tagList
     */
    public java.util.List < TagList> getTagList() {
        return this.tagList;
    }

    public static final class Builder extends Request.Builder<QueryAppDeviceListRequest, Builder> {
        private String appKey; 
        private java.util.List < String > categoryKeyList; 
        private Integer currentPage; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private java.util.List < String > productKeyList; 
        private java.util.List < TagList> tagList; 

        private Builder() {
            super();
        } 

        private Builder(QueryAppDeviceListRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.categoryKeyList = response.categoryKeyList;
            this.currentPage = response.currentPage;
            this.iotInstanceId = response.iotInstanceId;
            this.pageSize = response.pageSize;
            this.productKeyList = response.productKeyList;
            this.tagList = response.tagList;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * CategoryKeyList.
         */
        public Builder categoryKeyList(java.util.List < String > categoryKeyList) {
            this.putQueryParameter("CategoryKeyList", categoryKeyList);
            this.categoryKeyList = categoryKeyList;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
         * ProductKeyList.
         */
        public Builder productKeyList(java.util.List < String > productKeyList) {
            this.putQueryParameter("ProductKeyList", productKeyList);
            this.productKeyList = productKeyList;
            return this;
        }

        /**
         * TagList.
         */
        public Builder tagList(java.util.List < TagList> tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        @Override
        public QueryAppDeviceListRequest build() {
            return new QueryAppDeviceListRequest(this);
        } 

    } 

    public static class TagList extends TeaModel {
        @NameInMap("TagName")
        private String tagName;

        @NameInMap("TagValue")
        private String tagValue;

        private TagList(Builder builder) {
            this.tagName = builder.tagName;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagName; 
            private String tagValue; 

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
}
