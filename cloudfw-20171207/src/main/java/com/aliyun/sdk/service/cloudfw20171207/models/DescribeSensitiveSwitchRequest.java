// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSensitiveSwitchRequest} extends {@link RequestModel}
 *
 * <p>DescribeSensitiveSwitchRequest</p>
 */
public class DescribeSensitiveSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

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
    @com.aliyun.core.annotation.NameInMap("ParentCategory")
    private String parentCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveCategory")
    private String sensitiveCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
    private String sensitiveLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchStatus")
    private String switchStatus;

    private DescribeSensitiveSwitchRequest(Builder builder) {
        super(builder);
        this.categoryName = builder.categoryName;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.parentCategory = builder.parentCategory;
        this.sensitiveCategory = builder.sensitiveCategory;
        this.sensitiveLevel = builder.sensitiveLevel;
        this.switchStatus = builder.switchStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
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
     * @return parentCategory
     */
    public String getParentCategory() {
        return this.parentCategory;
    }

    /**
     * @return sensitiveCategory
     */
    public String getSensitiveCategory() {
        return this.sensitiveCategory;
    }

    /**
     * @return sensitiveLevel
     */
    public String getSensitiveLevel() {
        return this.sensitiveLevel;
    }

    /**
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return this.switchStatus;
    }

    public static final class Builder extends Request.Builder<DescribeSensitiveSwitchRequest, Builder> {
        private String categoryName; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String parentCategory; 
        private String sensitiveCategory; 
        private String sensitiveLevel; 
        private String switchStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSensitiveSwitchRequest request) {
            super(request);
            this.categoryName = request.categoryName;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.parentCategory = request.parentCategory;
            this.sensitiveCategory = request.sensitiveCategory;
            this.sensitiveLevel = request.sensitiveLevel;
            this.switchStatus = request.switchStatus;
        } 

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>Identity card</p>
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The language of the request and response.</p>
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
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The parent class.</p>
         * 
         * <strong>example:</strong>
         * <p>universal_industry_template</p>
         */
        public Builder parentCategory(String parentCategory) {
            this.putQueryParameter("ParentCategory", parentCategory);
            this.parentCategory = parentCategory;
            return this;
        }

        /**
         * <p>The type of the sensitive credential.</p>
         * 
         * <strong>example:</strong>
         * <p>id_card</p>
         */
        public Builder sensitiveCategory(String sensitiveCategory) {
            this.putQueryParameter("SensitiveCategory", sensitiveCategory);
            this.sensitiveCategory = sensitiveCategory;
            return this;
        }

        /**
         * <p>The sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>S3</p>
         */
        public Builder sensitiveLevel(String sensitiveLevel) {
            this.putQueryParameter("SensitiveLevel", sensitiveLevel);
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }

        /**
         * <p>The status of the sensitive data detection switch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder switchStatus(String switchStatus) {
            this.putQueryParameter("SwitchStatus", switchStatus);
            this.switchStatus = switchStatus;
            return this;
        }

        @Override
        public DescribeSensitiveSwitchRequest build() {
            return new DescribeSensitiveSwitchRequest(this);
        } 

    } 

}
