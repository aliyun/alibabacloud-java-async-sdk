// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20200618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmsDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeSmsDetailRequest</p>
 */
public class DescribeSmsDetailRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("CurrentPage")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("ErrorCode")
    private String errorCode;

    @Body
    @NameInMap("Mobile")
    private String mobile;

    @Body
    @NameInMap("OuterOrderNo")
    private String outerOrderNo;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("SendDate")
    @Validation(required = true)
    private String sendDate;

    @Body
    @NameInMap("SendStatus")
    private String sendStatus;

    @Body
    @NameInMap("SignName")
    private String signName;

    @Body
    @NameInMap("TemplateCode")
    private String templateCode;

    private DescribeSmsDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.currentPage = builder.currentPage;
        this.errorCode = builder.errorCode;
        this.mobile = builder.mobile;
        this.outerOrderNo = builder.outerOrderNo;
        this.pageSize = builder.pageSize;
        this.sendDate = builder.sendDate;
        this.sendStatus = builder.sendStatus;
        this.signName = builder.signName;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmsDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sendDate
     */
    public String getSendDate() {
        return this.sendDate;
    }

    /**
     * @return sendStatus
     */
    public String getSendStatus() {
        return this.sendStatus;
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

    public static final class Builder extends Request.Builder<DescribeSmsDetailRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private Integer currentPage; 
        private String errorCode; 
        private String mobile; 
        private String outerOrderNo; 
        private Integer pageSize; 
        private String sendDate; 
        private String sendStatus; 
        private String signName; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSmsDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.currentPage = request.currentPage;
            this.errorCode = request.errorCode;
            this.mobile = request.mobile;
            this.outerOrderNo = request.outerOrderNo;
            this.pageSize = request.pageSize;
            this.sendDate = request.sendDate;
            this.sendStatus = request.sendStatus;
            this.signName = request.signName;
            this.templateCode = request.templateCode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.putBodyParameter("ErrorCode", errorCode);
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * OuterOrderNo.
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putBodyParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SendDate.
         */
        public Builder sendDate(String sendDate) {
            this.putBodyParameter("SendDate", sendDate);
            this.sendDate = sendDate;
            return this;
        }

        /**
         * SendStatus.
         */
        public Builder sendStatus(String sendStatus) {
            this.putBodyParameter("SendStatus", sendStatus);
            this.sendStatus = sendStatus;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putBodyParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public DescribeSmsDetailRequest build() {
            return new DescribeSmsDetailRequest(this);
        } 

    } 

}
