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
 * {@link DescribeThreatIntelligenceSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeThreatIntelligenceSwitchResponseBody</p>
 */
public class DescribeThreatIntelligenceSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryList")
    private java.util.List<CategoryList> categoryList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeThreatIntelligenceSwitchResponseBody(Builder builder) {
        this.categoryList = builder.categoryList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeThreatIntelligenceSwitchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryList
     */
    public java.util.List<CategoryList> getCategoryList() {
        return this.categoryList;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CategoryList> categoryList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeThreatIntelligenceSwitchResponseBody model) {
            this.categoryList = model.categoryList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of threat intelligence categories.</p>
         */
        public Builder categoryList(java.util.List<CategoryList> categoryList) {
            this.categoryList = categoryList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B8E0379-2629-59A1-B811-96F3E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeThreatIntelligenceSwitchResponseBody build() {
            return new DescribeThreatIntelligenceSwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeThreatIntelligenceSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeThreatIntelligenceSwitchResponseBody</p>
     */
    public static class CategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("CategoryDescribe")
        private String categoryDescribe;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("CategoryParentId")
        private String categoryParentId;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private Long enableStatus;

        private CategoryList(Builder builder) {
            this.action = builder.action;
            this.categoryDescribe = builder.categoryDescribe;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.categoryParentId = builder.categoryParentId;
            this.enableStatus = builder.enableStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return categoryDescribe
         */
        public String getCategoryDescribe() {
            return this.categoryDescribe;
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return categoryParentId
         */
        public String getCategoryParentId() {
            return this.categoryParentId;
        }

        /**
         * @return enableStatus
         */
        public Long getEnableStatus() {
            return this.enableStatus;
        }

        public static final class Builder {
            private String action; 
            private String categoryDescribe; 
            private String categoryId; 
            private String categoryName; 
            private String categoryParentId; 
            private Long enableStatus; 

            private Builder() {
            } 

            private Builder(CategoryList model) {
                this.action = model.action;
                this.categoryDescribe = model.categoryDescribe;
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.categoryParentId = model.categoryParentId;
                this.enableStatus = model.enableStatus;
            } 

            /**
             * <p>The action of the rule. Valid values:</p>
             * <p> <strong>alert</strong>: monitor mode.</p>
             * <p> <strong>drop</strong>: Block Mode.</p>
             * 
             * <strong>example:</strong>
             * <p>alert</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The category description.</p>
             * 
             * <strong>example:</strong>
             * <p>Tor Export Malicious IP</p>
             */
            public Builder categoryDescribe(String categoryDescribe) {
                this.categoryDescribe = categoryDescribe;
                return this;
            }

            /**
             * <p>The ID of the threat intelligence category.</p>
             * 
             * <strong>example:</strong>
             * <p>3000037</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The category name.</p>
             * 
             * <strong>example:</strong>
             * <p>Tor Export Malicious IP</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The ID of the parent threat intelligence category.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder categoryParentId(String categoryParentId) {
                this.categoryParentId = categoryParentId;
                return this;
            }

            /**
             * <p>The enabling status. Valid values:</p>
             * <p> <strong>1</strong>: enabled.</p>
             * <p> <strong>0</strong>: disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enableStatus(Long enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
}
