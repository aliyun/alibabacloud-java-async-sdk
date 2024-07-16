// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTemplateByParamResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTemplateByParamResponseBody</p>
 */
public class QueryTemplateByParamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private QueryTemplateByParamResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTemplateByParamResponseBody create() {
        return builder().build();
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

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

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

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryTemplateByParamResponseBody build() {
            return new QueryTemplateByParamResponseBody(this);
        } 

    } 

    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("SmsStatus")
        private Integer smsStatus;

        @com.aliyun.core.annotation.NameInMap("SmsTemplateCode")
        private Integer smsTemplateCode;

        @com.aliyun.core.annotation.NameInMap("Smsrejectinfo")
        private Integer smsrejectinfo;

        @com.aliyun.core.annotation.NameInMap("TemplateComment")
        private String templateComment;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateStatus")
        private String templateStatus;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Integer templateType;

        @com.aliyun.core.annotation.NameInMap("UtcCreatetime")
        private Long utcCreatetime;

        private Template(Builder builder) {
            this.createTime = builder.createTime;
            this.smsStatus = builder.smsStatus;
            this.smsTemplateCode = builder.smsTemplateCode;
            this.smsrejectinfo = builder.smsrejectinfo;
            this.templateComment = builder.templateComment;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateStatus = builder.templateStatus;
            this.templateType = builder.templateType;
            this.utcCreatetime = builder.utcCreatetime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return smsStatus
         */
        public Integer getSmsStatus() {
            return this.smsStatus;
        }

        /**
         * @return smsTemplateCode
         */
        public Integer getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        /**
         * @return smsrejectinfo
         */
        public Integer getSmsrejectinfo() {
            return this.smsrejectinfo;
        }

        /**
         * @return templateComment
         */
        public String getTemplateComment() {
            return this.templateComment;
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
         * @return templateStatus
         */
        public String getTemplateStatus() {
            return this.templateStatus;
        }

        /**
         * @return templateType
         */
        public Integer getTemplateType() {
            return this.templateType;
        }

        /**
         * @return utcCreatetime
         */
        public Long getUtcCreatetime() {
            return this.utcCreatetime;
        }

        public static final class Builder {
            private String createTime; 
            private Integer smsStatus; 
            private Integer smsTemplateCode; 
            private Integer smsrejectinfo; 
            private String templateComment; 
            private String templateId; 
            private String templateName; 
            private String templateStatus; 
            private Integer templateType; 
            private Long utcCreatetime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * SmsStatus.
             */
            public Builder smsStatus(Integer smsStatus) {
                this.smsStatus = smsStatus;
                return this;
            }

            /**
             * SmsTemplateCode.
             */
            public Builder smsTemplateCode(Integer smsTemplateCode) {
                this.smsTemplateCode = smsTemplateCode;
                return this;
            }

            /**
             * Smsrejectinfo.
             */
            public Builder smsrejectinfo(Integer smsrejectinfo) {
                this.smsrejectinfo = smsrejectinfo;
                return this;
            }

            /**
             * TemplateComment.
             */
            public Builder templateComment(String templateComment) {
                this.templateComment = templateComment;
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
             * TemplateStatus.
             */
            public Builder templateStatus(String templateStatus) {
                this.templateStatus = templateStatus;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(Integer templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * UtcCreatetime.
             */
            public Builder utcCreatetime(Long utcCreatetime) {
                this.utcCreatetime = utcCreatetime;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("template")
        private java.util.List < Template> template;

        private Data(Builder builder) {
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return template
         */
        public java.util.List < Template> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.List < Template> template; 

            /**
             * template.
             */
            public Builder template(java.util.List < Template> template) {
                this.template = template;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
