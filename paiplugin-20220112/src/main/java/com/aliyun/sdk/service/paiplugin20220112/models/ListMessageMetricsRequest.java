// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListMessageMetricsRequest</p>
 */
public class ListMessageMetricsRequest extends Request {
    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

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
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    @Query
    @NameInMap("TemplateCode")
    private String templateCode;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateType")
    private Integer templateType;

    private ListMessageMetricsRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scheduleId = builder.scheduleId;
        this.signature = builder.signature;
        this.signatureId = builder.signatureId;
        this.startDate = builder.startDate;
        this.templateCode = builder.templateCode;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
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

    public static final class Builder extends Request.Builder<ListMessageMetricsRequest, Builder> {
        private String endDate; 
        private String groupId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scheduleId; 
        private String signature; 
        private String signatureId; 
        private String startDate; 
        private String templateCode; 
        private String templateId; 
        private Integer templateType; 

        private Builder() {
            super();
        } 

        private Builder(ListMessageMetricsRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.groupId = request.groupId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scheduleId = request.scheduleId;
            this.signature = request.signature;
            this.signatureId = request.signatureId;
            this.startDate = request.startDate;
            this.templateCode = request.templateCode;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
        } 

        /**
         * ?????????????????????20220102???
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ????????????Id???
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * ???????????????1??????????????????1???
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * ????????????????????????10???
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ??????????????????Id???
         */
        public Builder scheduleId(String scheduleId) {
            this.putQueryParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder signature(String signature) {
            this.putQueryParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * ??????Id??????????????????????????????????????????Id???????????????
         */
        public Builder signatureId(String signatureId) {
            this.putQueryParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * ?????????????????????20220102???
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * ????????????
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * ??????Id???????????????????????????Code?????????Id???????????????
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * ???????????????
         * <p>
         * - 0 : ????????????
         * - 1 : ???????????????
         * - 2 : ???????????????
         */
        public Builder templateType(Integer templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ListMessageMetricsRequest build() {
            return new ListMessageMetricsRequest(this);
        } 

    } 

}
