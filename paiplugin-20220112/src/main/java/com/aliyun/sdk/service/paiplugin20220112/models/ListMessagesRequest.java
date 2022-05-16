// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListMessagesRequest</p>
 */
public class ListMessagesRequest extends Request {
    @Query
    @NameInMap("Datetime")
    @Validation(required = true)
    private String datetime;

    @Query
    @NameInMap("ErrorCode")
    private String errorCode;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("MessageId")
    private String messageId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("ScheduleId")
    private String scheduleId;

    @Query
    @NameInMap("Signature")
    private String signature;

    @Query
    @NameInMap("SignatureId")
    private String signatureId;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("TemplateCode")
    private String templateCode;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateType")
    private Integer templateType;

    private ListMessagesRequest(Builder builder) {
        super(builder);
        this.datetime = builder.datetime;
        this.errorCode = builder.errorCode;
        this.groupId = builder.groupId;
        this.messageId = builder.messageId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.requestId = builder.requestId;
        this.scheduleId = builder.scheduleId;
        this.signature = builder.signature;
        this.signatureId = builder.signatureId;
        this.status = builder.status;
        this.templateCode = builder.templateCode;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datetime
     */
    public String getDatetime() {
        return this.datetime;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleId
     */
    public String getScheduleId() {
        return this.scheduleId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return signatureId
     */
    public String getSignatureId() {
        return this.signatureId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public Integer getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ListMessagesRequest, Builder> {
        private String datetime; 
        private String errorCode; 
        private String groupId; 
        private String messageId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String phoneNumber; 
        private String requestId; 
        private String scheduleId; 
        private String signature; 
        private String signatureId; 
        private Integer status; 
        private String templateCode; 
        private String templateId; 
        private Integer templateType; 

        private Builder() {
            super();
        } 

        private Builder(ListMessagesRequest request) {
            super(request);
            this.datetime = request.datetime;
            this.errorCode = request.errorCode;
            this.groupId = request.groupId;
            this.messageId = request.messageId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.requestId = request.requestId;
            this.scheduleId = request.scheduleId;
            this.signature = request.signature;
            this.signatureId = request.signatureId;
            this.status = request.status;
            this.templateCode = request.templateCode;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
        } 

        /**
         * 发送日期，格式为20220101。
         */
        public Builder datetime(String datetime) {
            this.putQueryParameter("Datetime", datetime);
            this.datetime = datetime;
            return this;
        }

        /**
         * 短信错误码过滤。
         */
        public Builder errorCode(String errorCode) {
            this.putQueryParameter("ErrorCode", errorCode);
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 关联人群Id过滤。
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * 短信Id过滤，短信Id为SendMessage成功返回的Id。
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * 分页数，从1开始，默认为1。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页大小，默认为10。
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 手机号码过滤。
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * 短信批处理Id过滤，短信批处理Id为SendMessage成功返回的RequestId。
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * 关联触达计划Id过滤。
         */
        public Builder scheduleId(String scheduleId) {
            this.putQueryParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * 签名名称过滤。
         */
        public Builder signature(String signature) {
            this.putQueryParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * 签名Id过滤，同时只能指定签名名称或签名Id其中之一。
         */
        public Builder signatureId(String signatureId) {
            this.putQueryParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * 短信发送状态过滤。
         * <p>
         * - 0 : 发送中。
         * - 1 : 发送成功。
         * - 2 : 发送失败。
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * 模板号过滤。
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * 模板Id过滤，同时只能指定模板Code或模板Id其中之一。
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * 模板类型过滤。
         * <p>
         * - 0 : 验证码。
         * - 1 : 短信通知。
         * - 2 : 推广短信。
         */
        public Builder templateType(Integer templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ListMessagesRequest build() {
            return new ListMessagesRequest(this);
        } 

    } 

}
