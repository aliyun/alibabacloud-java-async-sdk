// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link GetSmsTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmsTemplateListResponseBody</p>
 */
public class GetSmsTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSmsTemplateListResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsTemplateListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSmsTemplateListResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetSmsTemplateListResponseBody build() {
            return new GetSmsTemplateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmsTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsTemplateListResponseBody</p>
     */
    public static class TemplateTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TemplateTag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateTag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(TemplateTag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TemplateTag build() {
                return new TemplateTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmsTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsTemplateListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private Long auditStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateTag")
        private java.util.List<TemplateTag> templateTag;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Long templateType;

        @com.aliyun.core.annotation.NameInMap("UsableStateList")
        private java.util.List<String> usableStateList;

        @com.aliyun.core.annotation.NameInMap("WorkOrderId")
        private String workOrderId;

        private List(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.gmtCreate = builder.gmtCreate;
            this.signName = builder.signName;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
            this.templateTag = builder.templateTag;
            this.templateType = builder.templateType;
            this.usableStateList = builder.usableStateList;
            this.workOrderId = builder.workOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public Long getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateTag
         */
        public java.util.List<TemplateTag> getTemplateTag() {
            return this.templateTag;
        }

        /**
         * @return templateType
         */
        public Long getTemplateType() {
            return this.templateType;
        }

        /**
         * @return usableStateList
         */
        public java.util.List<String> getUsableStateList() {
            return this.usableStateList;
        }

        /**
         * @return workOrderId
         */
        public String getWorkOrderId() {
            return this.workOrderId;
        }

        public static final class Builder {
            private Long auditStatus; 
            private String gmtCreate; 
            private String signName; 
            private String templateCode; 
            private String templateName; 
            private java.util.List<TemplateTag> templateTag; 
            private Long templateType; 
            private java.util.List<String> usableStateList; 
            private String workOrderId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.auditStatus = model.auditStatus;
                this.gmtCreate = model.gmtCreate;
                this.signName = model.signName;
                this.templateCode = model.templateCode;
                this.templateName = model.templateName;
                this.templateTag = model.templateTag;
                this.templateType = model.templateType;
                this.usableStateList = model.usableStateList;
                this.workOrderId = model.workOrderId;
            } 

            /**
             * <p>模板审核状态</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder auditStatus(Long auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>签名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * <p>模板code</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>模板名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>模板标签</p>
             */
            public Builder templateTag(java.util.List<TemplateTag> templateTag) {
                this.templateTag = templateTag;
                return this;
            }

            /**
             * <p>模板类型</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder templateType(Long templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>模板可用状态</p>
             */
            public Builder usableStateList(java.util.List<String> usableStateList) {
                this.usableStateList = usableStateList;
                return this;
            }

            /**
             * <p>工单号</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder workOrderId(String workOrderId) {
                this.workOrderId = workOrderId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSmsTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsTemplateListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
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
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
