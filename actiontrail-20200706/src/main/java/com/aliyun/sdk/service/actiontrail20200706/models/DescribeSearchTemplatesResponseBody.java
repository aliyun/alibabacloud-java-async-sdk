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
 * {@link DescribeSearchTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSearchTemplatesResponseBody</p>
 */
public class DescribeSearchTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateList")
    private java.util.List<TemplateList> templateList;

    private DescribeSearchTemplatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.templateList = builder.templateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSearchTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return templateList
     */
    public java.util.List<TemplateList> getTemplateList() {
        return this.templateList;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<TemplateList> templateList; 

        private Builder() {
        } 

        private Builder(DescribeSearchTemplatesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.templateList = model.templateList;
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
         * TemplateList.
         */
        public Builder templateList(java.util.List<TemplateList> templateList) {
            this.templateList = templateList;
            return this;
        }

        public DescribeSearchTemplatesResponseBody build() {
            return new DescribeSearchTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSearchTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSearchTemplatesResponseBody</p>
     */
    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Charts")
        private String charts;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TemplateList(Builder builder) {
            this.charts = builder.charts;
            this.description = builder.description;
            this.params = builder.params;
            this.sceneId = builder.sceneId;
            this.sql = builder.sql;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.token = builder.token;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateList create() {
            return builder().build();
        }

        /**
         * @return charts
         */
        public String getCharts() {
            return this.charts;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
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
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String charts; 
            private String description; 
            private String params; 
            private String sceneId; 
            private String sql; 
            private String templateId; 
            private String templateName; 
            private String token; 
            private String type; 

            private Builder() {
            } 

            private Builder(TemplateList model) {
                this.charts = model.charts;
                this.description = model.description;
                this.params = model.params;
                this.sceneId = model.sceneId;
                this.sql = model.sql;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.token = model.token;
                this.type = model.type;
            } 

            /**
             * Charts.
             */
            public Builder charts(String charts) {
                this.charts = charts;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
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
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
}
