// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeAdvancedQueryTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvancedQueryTemplateResponseBody</p>
 */
public class DescribeAdvancedQueryTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplatePage")
    private TemplatePage templatePage;

    private DescribeAdvancedQueryTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templatePage = builder.templatePage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvancedQueryTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templatePage
     */
    public TemplatePage getTemplatePage() {
        return this.templatePage;
    }

    public static final class Builder {
        private String requestId; 
        private TemplatePage templatePage; 

        private Builder() {
        } 

        private Builder(DescribeAdvancedQueryTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.templatePage = model.templatePage;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplatePage.
         */
        public Builder templatePage(TemplatePage templatePage) {
            this.templatePage = templatePage;
            return this;
        }

        public DescribeAdvancedQueryTemplateResponseBody build() {
            return new DescribeAdvancedQueryTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdvancedQueryTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvancedQueryTemplateResponseBody</p>
     */
    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SimpleQuery")
        private Boolean simpleQuery;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateSql")
        private String templateSql;

        private TemplateList(Builder builder) {
            this.simpleQuery = builder.simpleQuery;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateSql = builder.templateSql;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateList create() {
            return builder().build();
        }

        /**
         * @return simpleQuery
         */
        public Boolean getSimpleQuery() {
            return this.simpleQuery;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateSql
         */
        public String getTemplateSql() {
            return this.templateSql;
        }

        public static final class Builder {
            private Boolean simpleQuery; 
            private String templateId; 
            private String templateName; 
            private String templateSql; 

            private Builder() {
            } 

            private Builder(TemplateList model) {
                this.simpleQuery = model.simpleQuery;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateSql = model.templateSql;
            } 

            /**
             * SimpleQuery.
             */
            public Builder simpleQuery(Boolean simpleQuery) {
                this.simpleQuery = simpleQuery;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateSql.
             */
            public Builder templateSql(String templateSql) {
                this.templateSql = templateSql;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAdvancedQueryTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvancedQueryTemplateResponseBody</p>
     */
    public static class TemplatePage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TemplateList")
        private java.util.List<TemplateList> templateList;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private TemplatePage(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.templateList = builder.templateList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplatePage create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return templateList
         */
        public java.util.List<TemplateList> getTemplateList() {
            return this.templateList;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String pageNumber; 
            private String pageSize; 
            private java.util.List<TemplateList> templateList; 
            private Long total; 

            private Builder() {
            } 

            private Builder(TemplatePage model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.templateList = model.templateList;
                this.total = model.total;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TemplateList.
             */
            public Builder templateList(java.util.List<TemplateList> templateList) {
                this.templateList = templateList;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public TemplatePage build() {
                return new TemplatePage(this);
            } 

        } 

    }
}
