// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListCheckItemsRequest} extends {@link RequestModel}
 *
 * <p>ListCheckItemsRequest</p>
 */
public class ListCheckItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckShowName")
    private String checkShowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckTypes")
    private java.util.List<String> checkTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    private ListCheckItemsRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.checkShowName = builder.checkShowName;
        this.checkTypes = builder.checkTypes;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return checkShowName
     */
    public String getCheckShowName() {
        return this.checkShowName;
    }

    /**
     * @return checkTypes
     */
    public java.util.List<String> getCheckTypes() {
        return this.checkTypes;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListCheckItemsRequest, Builder> {
        private Long checkId; 
        private String checkShowName; 
        private java.util.List<String> checkTypes; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List<String> statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckItemsRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.checkShowName = request.checkShowName;
            this.checkTypes = request.checkTypes;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.statuses = request.statuses;
        } 

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000001</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The name of the custom check item.</p>
         * 
         * <strong>example:</strong>
         * <p>testCheckItemName</p>
         */
        public Builder checkShowName(String checkShowName) {
            this.putQueryParameter("CheckShowName", checkShowName);
            this.checkShowName = checkShowName;
            return this;
        }

        /**
         * <p>The source type of the situational awareness check item.</p>
         */
        public Builder checkTypes(java.util.List<String> checkTypes) {
            this.putQueryParameter("CheckTypes", checkTypes);
            this.checkTypes = checkTypes;
            return this;
        }

        /**
         * <p>Specifies the page number to display when performing a paginated query. The starting value is <strong>1</strong>, and the default value is <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The language type for requests and responses. The default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Specifies the maximum number of data entries to display per page when performing a paginated query. The default number of data entries displayed per page is 20, and if the PageSize parameter is empty, it will default to returning 20 data entries.</p>
         * <blockquote>
         * <p>It is recommended that the PageSize value is not left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the check item.</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListCheckItemsRequest build() {
            return new ListCheckItemsRequest(this);
        } 

    } 

}
