// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListVodEsTemplateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListVodEsTemplateInfoResponseBody</p>
 */
public class ListVodEsTemplateInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataItems")
    private java.util.List<DataItems> dataItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListVodEsTemplateInfoResponseBody(Builder builder) {
        this.dataItems = builder.dataItems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodEsTemplateInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataItems
     */
    public java.util.List<DataItems> getDataItems() {
        return this.dataItems;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DataItems> dataItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListVodEsTemplateInfoResponseBody model) {
            this.dataItems = model.dataItems;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DataItems.
         */
        public Builder dataItems(java.util.List<DataItems> dataItems) {
            this.dataItems = dataItems;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVodEsTemplateInfoResponseBody build() {
            return new ListVodEsTemplateInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVodEsTemplateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListVodEsTemplateInfoResponseBody</p>
     */
    public static class DataItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("TmplDef")
        private String tmplDef;

        @com.aliyun.core.annotation.NameInMap("TmplDesc")
        private String tmplDesc;

        @com.aliyun.core.annotation.NameInMap("TmplName")
        private String tmplName;

        private DataItems(Builder builder) {
            this.id = builder.id;
            this.tmplDef = builder.tmplDef;
            this.tmplDesc = builder.tmplDesc;
            this.tmplName = builder.tmplName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataItems create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return tmplDef
         */
        public String getTmplDef() {
            return this.tmplDef;
        }

        /**
         * @return tmplDesc
         */
        public String getTmplDesc() {
            return this.tmplDesc;
        }

        /**
         * @return tmplName
         */
        public String getTmplName() {
            return this.tmplName;
        }

        public static final class Builder {
            private Integer id; 
            private String tmplDef; 
            private String tmplDesc; 
            private String tmplName; 

            private Builder() {
            } 

            private Builder(DataItems model) {
                this.id = model.id;
                this.tmplDef = model.tmplDef;
                this.tmplDesc = model.tmplDesc;
                this.tmplName = model.tmplName;
            } 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * TmplDef.
             */
            public Builder tmplDef(String tmplDef) {
                this.tmplDef = tmplDef;
                return this;
            }

            /**
             * TmplDesc.
             */
            public Builder tmplDesc(String tmplDesc) {
                this.tmplDesc = tmplDesc;
                return this;
            }

            /**
             * TmplName.
             */
            public Builder tmplName(String tmplName) {
                this.tmplName = tmplName;
                return this;
            }

            public DataItems build() {
                return new DataItems(this);
            } 

        } 

    }
}
