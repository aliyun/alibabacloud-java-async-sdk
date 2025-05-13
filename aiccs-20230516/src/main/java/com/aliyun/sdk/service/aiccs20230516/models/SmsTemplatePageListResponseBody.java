// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link SmsTemplatePageListResponseBody} extends {@link TeaModel}
 *
 * <p>SmsTemplatePageListResponseBody</p>
 */
public class SmsTemplatePageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private SmsTemplatePageListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmsTemplatePageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(SmsTemplatePageListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public SmsTemplatePageListResponseBody build() {
            return new SmsTemplatePageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SmsTemplatePageListResponseBody} extends {@link TeaModel}
     *
     * <p>SmsTemplatePageListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("ShortUrlTaskId")
        private Long shortUrlTaskId;

        @com.aliyun.core.annotation.NameInMap("Sign")
        private String sign;

        @com.aliyun.core.annotation.NameInMap("SmsType")
        private String smsType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Long templateType;

        private List(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.properties = builder.properties;
            this.shortUrlTaskId = builder.shortUrlTaskId;
            this.sign = builder.sign;
            this.smsType = builder.smsType;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return shortUrlTaskId
         */
        public Long getShortUrlTaskId() {
            return this.shortUrlTaskId;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return smsType
         */
        public String getSmsType() {
            return this.smsType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public Long getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String properties; 
            private Long shortUrlTaskId; 
            private String sign; 
            private String smsType; 
            private Long status; 
            private Long templateId; 
            private String templateName; 
            private Long templateType; 

            private Builder() {
            } 

            private Builder(List model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.properties = model.properties;
                this.shortUrlTaskId = model.shortUrlTaskId;
                this.sign = model.sign;
                this.smsType = model.smsType;
                this.status = model.status;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateType = model.templateType;
            } 

            /**
             * <p>短信内容</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-26 11:34:59</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>模板所需参数</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>智能短链ID</p>
             * 
             * <strong>example:</strong>
             * <p>46</p>
             */
            public Builder shortUrlTaskId(Long shortUrlTaskId) {
                this.shortUrlTaskId = shortUrlTaskId;
                return this;
            }

            /**
             * <p>短信签名</p>
             * 
             * <strong>example:</strong>
             * <p>a234n</p>
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * <p>短信类型</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder smsType(String smsType) {
                this.smsType = smsType;
                return this;
            }

            /**
             * <p>模板状态</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>模板ID</p>
             * 
             * <strong>example:</strong>
             * <p>67</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>模板名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>模板类型</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder templateType(Long templateType) {
                this.templateType = templateType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link SmsTemplatePageListResponseBody} extends {@link TeaModel}
     *
     * <p>SmsTemplatePageListResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Long totalPage;

        private Model(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long totalCount; 
            private Long totalPage; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.totalPage = model.totalPage;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
