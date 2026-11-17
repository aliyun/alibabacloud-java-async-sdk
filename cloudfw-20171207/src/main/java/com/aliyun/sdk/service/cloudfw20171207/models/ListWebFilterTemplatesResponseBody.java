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
 * {@link ListWebFilterTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWebFilterTemplatesResponseBody</p>
 */
public class ListWebFilterTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("WebFilterTemplates")
    private java.util.List<WebFilterTemplates> webFilterTemplates;

    private ListWebFilterTemplatesResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.webFilterTemplates = builder.webFilterTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebFilterTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return webFilterTemplates
     */
    public java.util.List<WebFilterTemplates> getWebFilterTemplates() {
        return this.webFilterTemplates;
    }

    public static final class Builder {
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<WebFilterTemplates> webFilterTemplates; 

        private Builder() {
        } 

        private Builder(ListWebFilterTemplatesResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.webFilterTemplates = model.webFilterTemplates;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of web filtering templates that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of web filtering templates.</p>
         */
        public Builder webFilterTemplates(java.util.List<WebFilterTemplates> webFilterTemplates) {
            this.webFilterTemplates = webFilterTemplates;
            return this;
        }

        public ListWebFilterTemplatesResponseBody build() {
            return new ListWebFilterTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWebFilterTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWebFilterTemplatesResponseBody</p>
     */
    public static class RuleActionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alert")
        private Long alert;

        @com.aliyun.core.annotation.NameInMap("Allow")
        private Long allow;

        @com.aliyun.core.annotation.NameInMap("Deny")
        private Long deny;

        private RuleActionStatistics(Builder builder) {
            this.alert = builder.alert;
            this.allow = builder.allow;
            this.deny = builder.deny;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActionStatistics create() {
            return builder().build();
        }

        /**
         * @return alert
         */
        public Long getAlert() {
            return this.alert;
        }

        /**
         * @return allow
         */
        public Long getAllow() {
            return this.allow;
        }

        /**
         * @return deny
         */
        public Long getDeny() {
            return this.deny;
        }

        public static final class Builder {
            private Long alert; 
            private Long allow; 
            private Long deny; 

            private Builder() {
            } 

            private Builder(RuleActionStatistics model) {
                this.alert = model.alert;
                this.allow = model.allow;
                this.deny = model.deny;
            } 

            /**
             * <p>The number of web filtering rules whose action is Alert in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder alert(Long alert) {
                this.alert = alert;
                return this;
            }

            /**
             * <p>The number of web filtering rules whose action is Allow in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder allow(Long allow) {
                this.allow = allow;
                return this;
            }

            /**
             * <p>The number of web filtering rules whose action is Deny in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deny(Long deny) {
                this.deny = deny;
                return this;
            }

            public RuleActionStatistics build() {
                return new RuleActionStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWebFilterTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWebFilterTemplatesResponseBody</p>
     */
    public static class WebFilterTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleActionStatistics")
        private RuleActionStatistics ruleActionStatistics;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WebFilterTemplateId")
        private String webFilterTemplateId;

        private WebFilterTemplates(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.ruleActionStatistics = builder.ruleActionStatistics;
            this.status = builder.status;
            this.webFilterTemplateId = builder.webFilterTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebFilterTemplates create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleActionStatistics
         */
        public RuleActionStatistics getRuleActionStatistics() {
            return this.ruleActionStatistics;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return webFilterTemplateId
         */
        public String getWebFilterTemplateId() {
            return this.webFilterTemplateId;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String name; 
            private RuleActionStatistics ruleActionStatistics; 
            private String status; 
            private String webFilterTemplateId; 

            private Builder() {
            } 

            private Builder(WebFilterTemplates model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.ruleActionStatistics = model.ruleActionStatistics;
                this.status = model.status;
                this.webFilterTemplateId = model.webFilterTemplateId;
            } 

            /**
             * <p>The creation time of the web filtering template. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1731465600</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the web filtering template.</p>
             * 
             * <strong>example:</strong>
             * <p>Web filtering template for URL access control</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the web filtering template.</p>
             * 
             * <strong>example:</strong>
             * <p>Web filtering template 01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The statistics on the number of web filtering rules in the template categorized by action.</p>
             */
            public Builder ruleActionStatistics(RuleActionStatistics ruleActionStatistics) {
                this.ruleActionStatistics = ruleActionStatistics;
                return this;
            }

            /**
             * <p>The status of the web filtering template. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong>: Enabled.</li>
             * <li><strong>Disable</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the web filtering template.</p>
             * 
             * <strong>example:</strong>
             * <p>wft-3f2a9c1d4b5e6f70</p>
             */
            public Builder webFilterTemplateId(String webFilterTemplateId) {
                this.webFilterTemplateId = webFilterTemplateId;
                return this;
            }

            public WebFilterTemplates build() {
                return new WebFilterTemplates(this);
            } 

        } 

    }
}
