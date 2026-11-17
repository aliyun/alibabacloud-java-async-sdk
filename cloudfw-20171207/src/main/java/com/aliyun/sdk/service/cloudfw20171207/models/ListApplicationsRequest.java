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
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private Long applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Risk")
    private String risk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Technology")
    private String technology;

    private ListApplicationsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.categoryId = builder.categoryId;
        this.categoryName = builder.categoryName;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.lang = builder.lang;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.risk = builder.risk;
        this.technology = builder.technology;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public Long getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return risk
     */
    public String getRisk() {
        return this.risk;
    }

    /**
     * @return technology
     */
    public String getTechnology() {
        return this.technology;
    }

    public static final class Builder extends Request.Builder<ListApplicationsRequest, Builder> {
        private Long applicationId; 
        private String applicationName; 
        private Long categoryId; 
        private String categoryName; 
        private String description; 
        private String groupName; 
        private String lang; 
        private Long pageNo; 
        private Long pageSize; 
        private String risk; 
        private String technology; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationName = request.applicationName;
            this.categoryId = request.categoryId;
            this.categoryName = request.categoryName;
            this.description = request.description;
            this.groupName = request.groupName;
            this.lang = request.lang;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.risk = request.risk;
            this.technology = request.technology;
        } 

        /**
         * <p>The application ID. Exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10012150000</p>
         */
        public Builder applicationId(Long applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The application name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The application category ID. Exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The application category name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Office collaboration</p>
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * <p>The application description. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Office</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The application group name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Dingtalk</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The language of the returned information. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese. This is the default value.</li>
         * <li><strong>en</strong>: English.
         * This parameter determines whether the application name, category name, technology type, vendor, and description are returned in Chinese or English.</li>
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
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. The value must be greater than or equal to 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The risk level. Exact match is supported. Valid values:</p>
         * <ul>
         * <li><strong>Information</strong>: Informational.</li>
         * <li><strong>Low</strong>: Low.</li>
         * <li><strong>Medium</strong>: Medium.</li>
         * <li><strong>High</strong>: High.</li>
         * <li><strong>Critical</strong>: Critical.
         * If an invalid value is passed, this filter condition is ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Low</p>
         */
        public Builder risk(String risk) {
            this.putQueryParameter("Risk", risk);
            this.risk = risk;
            return this;
        }

        /**
         * <p>The technology type name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Browser-based</p>
         */
        public Builder technology(String technology) {
            this.putQueryParameter("Technology", technology);
            this.technology = technology;
            return this;
        }

        @Override
        public ListApplicationsRequest build() {
            return new ListApplicationsRequest(this);
        } 

    } 

}
