// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrademarkDetailForInnerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrademarkDetailForInnerResponseBody</p>
 */
public class DescribeTrademarkDetailForInnerResponseBody extends TeaModel {
    @NameInMap("Agency")
    private String agency;

    @NameInMap("ApplyDate")
    private String applyDate;

    @NameInMap("Classification")
    private String classification;

    @NameInMap("ExclusiveDateLimit")
    private String exclusiveDateLimit;

    @NameInMap("FlowList")
    private java.util.List < FlowList> flowList;

    @NameInMap("Image")
    private String image;

    @NameInMap("ImageElement")
    private String imageElement;

    @NameInMap("IntlRegDate")
    private String intlRegDate;

    @NameInMap("LastProcedureStatus")
    private String lastProcedureStatus;

    @NameInMap("Name")
    private String name;

    @NameInMap("NoticeList")
    private java.util.List < NoticeList> noticeList;

    @NameInMap("OwnerAddress")
    private String ownerAddress;

    @NameInMap("OwnerEnAddress")
    private String ownerEnAddress;

    @NameInMap("OwnerEnName")
    private String ownerEnName;

    @NameInMap("OwnerName")
    private String ownerName;

    @NameInMap("PreAnnDate")
    private String preAnnDate;

    @NameInMap("PreAnnNum")
    private String preAnnNum;

    @NameInMap("PriorityDate")
    private String priorityDate;

    @NameInMap("Product")
    private String product;

    @NameInMap("ProductDescription")
    private String productDescription;

    @NameInMap("RegAnnDate")
    private String regAnnDate;

    @NameInMap("RegAnnNum")
    private Integer regAnnNum;

    @NameInMap("RegistrationNumber")
    private String registrationNumber;

    @NameInMap("RegistrationType")
    private String registrationType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Share")
    private String share;

    @NameInMap("SimilarGroup")
    private String similarGroup;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubsequentDesignationDate")
    private String subsequentDesignationDate;

    @NameInMap("Uid")
    private String uid;

    private DescribeTrademarkDetailForInnerResponseBody(Builder builder) {
        this.agency = builder.agency;
        this.applyDate = builder.applyDate;
        this.classification = builder.classification;
        this.exclusiveDateLimit = builder.exclusiveDateLimit;
        this.flowList = builder.flowList;
        this.image = builder.image;
        this.imageElement = builder.imageElement;
        this.intlRegDate = builder.intlRegDate;
        this.lastProcedureStatus = builder.lastProcedureStatus;
        this.name = builder.name;
        this.noticeList = builder.noticeList;
        this.ownerAddress = builder.ownerAddress;
        this.ownerEnAddress = builder.ownerEnAddress;
        this.ownerEnName = builder.ownerEnName;
        this.ownerName = builder.ownerName;
        this.preAnnDate = builder.preAnnDate;
        this.preAnnNum = builder.preAnnNum;
        this.priorityDate = builder.priorityDate;
        this.product = builder.product;
        this.productDescription = builder.productDescription;
        this.regAnnDate = builder.regAnnDate;
        this.regAnnNum = builder.regAnnNum;
        this.registrationNumber = builder.registrationNumber;
        this.registrationType = builder.registrationType;
        this.requestId = builder.requestId;
        this.share = builder.share;
        this.similarGroup = builder.similarGroup;
        this.status = builder.status;
        this.subsequentDesignationDate = builder.subsequentDesignationDate;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrademarkDetailForInnerResponseBody create() {
        return builder().build();
    }

    /**
     * @return agency
     */
    public String getAgency() {
        return this.agency;
    }

    /**
     * @return applyDate
     */
    public String getApplyDate() {
        return this.applyDate;
    }

    /**
     * @return classification
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * @return exclusiveDateLimit
     */
    public String getExclusiveDateLimit() {
        return this.exclusiveDateLimit;
    }

    /**
     * @return flowList
     */
    public java.util.List < FlowList> getFlowList() {
        return this.flowList;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return imageElement
     */
    public String getImageElement() {
        return this.imageElement;
    }

    /**
     * @return intlRegDate
     */
    public String getIntlRegDate() {
        return this.intlRegDate;
    }

    /**
     * @return lastProcedureStatus
     */
    public String getLastProcedureStatus() {
        return this.lastProcedureStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return noticeList
     */
    public java.util.List < NoticeList> getNoticeList() {
        return this.noticeList;
    }

    /**
     * @return ownerAddress
     */
    public String getOwnerAddress() {
        return this.ownerAddress;
    }

    /**
     * @return ownerEnAddress
     */
    public String getOwnerEnAddress() {
        return this.ownerEnAddress;
    }

    /**
     * @return ownerEnName
     */
    public String getOwnerEnName() {
        return this.ownerEnName;
    }

    /**
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @return preAnnDate
     */
    public String getPreAnnDate() {
        return this.preAnnDate;
    }

    /**
     * @return preAnnNum
     */
    public String getPreAnnNum() {
        return this.preAnnNum;
    }

    /**
     * @return priorityDate
     */
    public String getPriorityDate() {
        return this.priorityDate;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return productDescription
     */
    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * @return regAnnDate
     */
    public String getRegAnnDate() {
        return this.regAnnDate;
    }

    /**
     * @return regAnnNum
     */
    public Integer getRegAnnNum() {
        return this.regAnnNum;
    }

    /**
     * @return registrationNumber
     */
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /**
     * @return registrationType
     */
    public String getRegistrationType() {
        return this.registrationType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return share
     */
    public String getShare() {
        return this.share;
    }

    /**
     * @return similarGroup
     */
    public String getSimilarGroup() {
        return this.similarGroup;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subsequentDesignationDate
     */
    public String getSubsequentDesignationDate() {
        return this.subsequentDesignationDate;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String agency; 
        private String applyDate; 
        private String classification; 
        private String exclusiveDateLimit; 
        private java.util.List < FlowList> flowList; 
        private String image; 
        private String imageElement; 
        private String intlRegDate; 
        private String lastProcedureStatus; 
        private String name; 
        private java.util.List < NoticeList> noticeList; 
        private String ownerAddress; 
        private String ownerEnAddress; 
        private String ownerEnName; 
        private String ownerName; 
        private String preAnnDate; 
        private String preAnnNum; 
        private String priorityDate; 
        private String product; 
        private String productDescription; 
        private String regAnnDate; 
        private Integer regAnnNum; 
        private String registrationNumber; 
        private String registrationType; 
        private String requestId; 
        private String share; 
        private String similarGroup; 
        private String status; 
        private String subsequentDesignationDate; 
        private String uid; 

        /**
         * Agency.
         */
        public Builder agency(String agency) {
            this.agency = agency;
            return this;
        }

        /**
         * ApplyDate.
         */
        public Builder applyDate(String applyDate) {
            this.applyDate = applyDate;
            return this;
        }

        /**
         * Classification.
         */
        public Builder classification(String classification) {
            this.classification = classification;
            return this;
        }

        /**
         * ExclusiveDateLimit.
         */
        public Builder exclusiveDateLimit(String exclusiveDateLimit) {
            this.exclusiveDateLimit = exclusiveDateLimit;
            return this;
        }

        /**
         * FlowList.
         */
        public Builder flowList(java.util.List < FlowList> flowList) {
            this.flowList = flowList;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * ImageElement.
         */
        public Builder imageElement(String imageElement) {
            this.imageElement = imageElement;
            return this;
        }

        /**
         * IntlRegDate.
         */
        public Builder intlRegDate(String intlRegDate) {
            this.intlRegDate = intlRegDate;
            return this;
        }

        /**
         * LastProcedureStatus.
         */
        public Builder lastProcedureStatus(String lastProcedureStatus) {
            this.lastProcedureStatus = lastProcedureStatus;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NoticeList.
         */
        public Builder noticeList(java.util.List < NoticeList> noticeList) {
            this.noticeList = noticeList;
            return this;
        }

        /**
         * OwnerAddress.
         */
        public Builder ownerAddress(String ownerAddress) {
            this.ownerAddress = ownerAddress;
            return this;
        }

        /**
         * OwnerEnAddress.
         */
        public Builder ownerEnAddress(String ownerEnAddress) {
            this.ownerEnAddress = ownerEnAddress;
            return this;
        }

        /**
         * OwnerEnName.
         */
        public Builder ownerEnName(String ownerEnName) {
            this.ownerEnName = ownerEnName;
            return this;
        }

        /**
         * OwnerName.
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
         * PreAnnDate.
         */
        public Builder preAnnDate(String preAnnDate) {
            this.preAnnDate = preAnnDate;
            return this;
        }

        /**
         * PreAnnNum.
         */
        public Builder preAnnNum(String preAnnNum) {
            this.preAnnNum = preAnnNum;
            return this;
        }

        /**
         * PriorityDate.
         */
        public Builder priorityDate(String priorityDate) {
            this.priorityDate = priorityDate;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /**
         * ProductDescription.
         */
        public Builder productDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        /**
         * RegAnnDate.
         */
        public Builder regAnnDate(String regAnnDate) {
            this.regAnnDate = regAnnDate;
            return this;
        }

        /**
         * RegAnnNum.
         */
        public Builder regAnnNum(Integer regAnnNum) {
            this.regAnnNum = regAnnNum;
            return this;
        }

        /**
         * RegistrationNumber.
         */
        public Builder registrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        /**
         * RegistrationType.
         */
        public Builder registrationType(String registrationType) {
            this.registrationType = registrationType;
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
         * Share.
         */
        public Builder share(String share) {
            this.share = share;
            return this;
        }

        /**
         * SimilarGroup.
         */
        public Builder similarGroup(String similarGroup) {
            this.similarGroup = similarGroup;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubsequentDesignationDate.
         */
        public Builder subsequentDesignationDate(String subsequentDesignationDate) {
            this.subsequentDesignationDate = subsequentDesignationDate;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public DescribeTrademarkDetailForInnerResponseBody build() {
            return new DescribeTrademarkDetailForInnerResponseBody(this);
        } 

    } 

    public static class FlowList extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("ProcedureCode")
        private String procedureCode;

        @NameInMap("ProcedureDate")
        private String procedureDate;

        @NameInMap("ProcedureName")
        private String procedureName;

        @NameInMap("ProcedureResult")
        private String procedureResult;

        @NameInMap("ProcedureStep")
        private String procedureStep;

        @NameInMap("RegistrationNumber")
        private String registrationNumber;

        private FlowList(Builder builder) {
            this.date = builder.date;
            this.procedureCode = builder.procedureCode;
            this.procedureDate = builder.procedureDate;
            this.procedureName = builder.procedureName;
            this.procedureResult = builder.procedureResult;
            this.procedureStep = builder.procedureStep;
            this.registrationNumber = builder.registrationNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return procedureCode
         */
        public String getProcedureCode() {
            return this.procedureCode;
        }

        /**
         * @return procedureDate
         */
        public String getProcedureDate() {
            return this.procedureDate;
        }

        /**
         * @return procedureName
         */
        public String getProcedureName() {
            return this.procedureName;
        }

        /**
         * @return procedureResult
         */
        public String getProcedureResult() {
            return this.procedureResult;
        }

        /**
         * @return procedureStep
         */
        public String getProcedureStep() {
            return this.procedureStep;
        }

        /**
         * @return registrationNumber
         */
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public static final class Builder {
            private String date; 
            private String procedureCode; 
            private String procedureDate; 
            private String procedureName; 
            private String procedureResult; 
            private String procedureStep; 
            private String registrationNumber; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * ProcedureCode.
             */
            public Builder procedureCode(String procedureCode) {
                this.procedureCode = procedureCode;
                return this;
            }

            /**
             * ProcedureDate.
             */
            public Builder procedureDate(String procedureDate) {
                this.procedureDate = procedureDate;
                return this;
            }

            /**
             * ProcedureName.
             */
            public Builder procedureName(String procedureName) {
                this.procedureName = procedureName;
                return this;
            }

            /**
             * ProcedureResult.
             */
            public Builder procedureResult(String procedureResult) {
                this.procedureResult = procedureResult;
                return this;
            }

            /**
             * ProcedureStep.
             */
            public Builder procedureStep(String procedureStep) {
                this.procedureStep = procedureStep;
                return this;
            }

            /**
             * RegistrationNumber.
             */
            public Builder registrationNumber(String registrationNumber) {
                this.registrationNumber = registrationNumber;
                return this;
            }

            public FlowList build() {
                return new FlowList(this);
            } 

        } 

    }
    public static class NoticeList extends TeaModel {
        @NameInMap("AnnDate")
        private String annDate;

        @NameInMap("AnnId")
        private String annId;

        @NameInMap("AnnNum")
        private String annNum;

        @NameInMap("AnnTypeCode")
        private String annTypeCode;

        @NameInMap("AnnTypeName")
        private String annTypeName;

        @NameInMap("Applicant")
        private String applicant;

        @NameInMap("Date")
        private String date;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("OriginalImageUrl")
        private String originalImageUrl;

        @NameInMap("PageNo")
        private String pageNo;

        @NameInMap("ReactNum")
        private String reactNum;

        @NameInMap("RegistrationNumber")
        private String registrationNumber;

        @NameInMap("TrademarkName")
        private String trademarkName;

        private NoticeList(Builder builder) {
            this.annDate = builder.annDate;
            this.annId = builder.annId;
            this.annNum = builder.annNum;
            this.annTypeCode = builder.annTypeCode;
            this.annTypeName = builder.annTypeName;
            this.applicant = builder.applicant;
            this.date = builder.date;
            this.imageUrl = builder.imageUrl;
            this.originalImageUrl = builder.originalImageUrl;
            this.pageNo = builder.pageNo;
            this.reactNum = builder.reactNum;
            this.registrationNumber = builder.registrationNumber;
            this.trademarkName = builder.trademarkName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeList create() {
            return builder().build();
        }

        /**
         * @return annDate
         */
        public String getAnnDate() {
            return this.annDate;
        }

        /**
         * @return annId
         */
        public String getAnnId() {
            return this.annId;
        }

        /**
         * @return annNum
         */
        public String getAnnNum() {
            return this.annNum;
        }

        /**
         * @return annTypeCode
         */
        public String getAnnTypeCode() {
            return this.annTypeCode;
        }

        /**
         * @return annTypeName
         */
        public String getAnnTypeName() {
            return this.annTypeName;
        }

        /**
         * @return applicant
         */
        public String getApplicant() {
            return this.applicant;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return originalImageUrl
         */
        public String getOriginalImageUrl() {
            return this.originalImageUrl;
        }

        /**
         * @return pageNo
         */
        public String getPageNo() {
            return this.pageNo;
        }

        /**
         * @return reactNum
         */
        public String getReactNum() {
            return this.reactNum;
        }

        /**
         * @return registrationNumber
         */
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        /**
         * @return trademarkName
         */
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public static final class Builder {
            private String annDate; 
            private String annId; 
            private String annNum; 
            private String annTypeCode; 
            private String annTypeName; 
            private String applicant; 
            private String date; 
            private String imageUrl; 
            private String originalImageUrl; 
            private String pageNo; 
            private String reactNum; 
            private String registrationNumber; 
            private String trademarkName; 

            /**
             * AnnDate.
             */
            public Builder annDate(String annDate) {
                this.annDate = annDate;
                return this;
            }

            /**
             * AnnId.
             */
            public Builder annId(String annId) {
                this.annId = annId;
                return this;
            }

            /**
             * AnnNum.
             */
            public Builder annNum(String annNum) {
                this.annNum = annNum;
                return this;
            }

            /**
             * AnnTypeCode.
             */
            public Builder annTypeCode(String annTypeCode) {
                this.annTypeCode = annTypeCode;
                return this;
            }

            /**
             * AnnTypeName.
             */
            public Builder annTypeName(String annTypeName) {
                this.annTypeName = annTypeName;
                return this;
            }

            /**
             * Applicant.
             */
            public Builder applicant(String applicant) {
                this.applicant = applicant;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * OriginalImageUrl.
             */
            public Builder originalImageUrl(String originalImageUrl) {
                this.originalImageUrl = originalImageUrl;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(String pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * ReactNum.
             */
            public Builder reactNum(String reactNum) {
                this.reactNum = reactNum;
                return this;
            }

            /**
             * RegistrationNumber.
             */
            public Builder registrationNumber(String registrationNumber) {
                this.registrationNumber = registrationNumber;
                return this;
            }

            /**
             * TrademarkName.
             */
            public Builder trademarkName(String trademarkName) {
                this.trademarkName = trademarkName;
                return this;
            }

            public NoticeList build() {
                return new NoticeList(this);
            } 

        } 

    }
}
