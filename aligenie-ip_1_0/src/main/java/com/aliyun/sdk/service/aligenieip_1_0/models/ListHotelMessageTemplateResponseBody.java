// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelMessageTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelMessageTemplateResponseBody</p>
 */
public class ListHotelMessageTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListHotelMessageTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelMessageTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListHotelMessageTemplateResponseBody build() {
            return new ListHotelMessageTemplateResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AuditMark")
        private String auditMark;

        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("TemplateDetail")
        private String templateDetail;

        @NameInMap("TemplateId")
        private Long templateId;

        @NameInMap("TemplateName")
        private String templateName;

        private Result(Builder builder) {
            this.auditMark = builder.auditMark;
            this.auditStatus = builder.auditStatus;
            this.templateDetail = builder.templateDetail;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return auditMark
         */
        public String getAuditMark() {
            return this.auditMark;
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return templateDetail
         */
        public String getTemplateDetail() {
            return this.templateDetail;
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

        public static final class Builder {
            private String auditMark; 
            private String auditStatus; 
            private String templateDetail; 
            private Long templateId; 
            private String templateName; 

            /**
             * AuditMark.
             */
            public Builder auditMark(String auditMark) {
                this.auditMark = auditMark;
                return this;
            }

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * TemplateDetail.
             */
            public Builder templateDetail(String templateDetail) {
                this.templateDetail = templateDetail;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
