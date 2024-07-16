// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnoseResultForSingleCardResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiagnoseResultForSingleCardResponseBody</p>
 */
public class GetDiagnoseResultForSingleCardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.NameInMap("CardIp")
    private String cardIp;

    @com.aliyun.core.annotation.NameInMap("Destination")
    private String destination;

    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.NameInMap("DiagnoseItem")
    private java.util.List < DiagnoseItem> diagnoseItem;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("ErrorResult")
    private java.util.List < ErrorResult> errorResult;

    @com.aliyun.core.annotation.NameInMap("IccId")
    private String iccId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    private String wirelessCloudConnectorId;

    private GetDiagnoseResultForSingleCardResponseBody(Builder builder) {
        this.beginTime = builder.beginTime;
        this.cardIp = builder.cardIp;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.diagnoseItem = builder.diagnoseItem;
        this.endTime = builder.endTime;
        this.errorResult = builder.errorResult;
        this.iccId = builder.iccId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnoseResultForSingleCardResponseBody create() {
        return builder().build();
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return cardIp
     */
    public String getCardIp() {
        return this.cardIp;
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return diagnoseItem
     */
    public java.util.List < DiagnoseItem> getDiagnoseItem() {
        return this.diagnoseItem;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return errorResult
     */
    public java.util.List < ErrorResult> getErrorResult() {
        return this.errorResult;
    }

    /**
     * @return iccId
     */
    public String getIccId() {
        return this.iccId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder {
        private Long beginTime; 
        private String cardIp; 
        private String destination; 
        private String destinationType; 
        private java.util.List < DiagnoseItem> diagnoseItem; 
        private Long endTime; 
        private java.util.List < ErrorResult> errorResult; 
        private String iccId; 
        private String requestId; 
        private String status; 
        private String wirelessCloudConnectorId; 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * CardIp.
         */
        public Builder cardIp(String cardIp) {
            this.cardIp = cardIp;
            return this;
        }

        /**
         * Destination.
         */
        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * DestinationType.
         */
        public Builder destinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        /**
         * DiagnoseItem.
         */
        public Builder diagnoseItem(java.util.List < DiagnoseItem> diagnoseItem) {
            this.diagnoseItem = diagnoseItem;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ErrorResult.
         */
        public Builder errorResult(java.util.List < ErrorResult> errorResult) {
            this.errorResult = errorResult;
            return this;
        }

        /**
         * IccId.
         */
        public Builder iccId(String iccId) {
            this.iccId = iccId;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        public GetDiagnoseResultForSingleCardResponseBody build() {
            return new GetDiagnoseResultForSingleCardResponseBody(this);
        } 

    } 

    public static class SubItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubItem")
        private String subItem;

        @com.aliyun.core.annotation.NameInMap("SubItemInfo")
        private String subItemInfo;

        @com.aliyun.core.annotation.NameInMap("SubItemStatus")
        private String subItemStatus;

        private SubItems(Builder builder) {
            this.subItem = builder.subItem;
            this.subItemInfo = builder.subItemInfo;
            this.subItemStatus = builder.subItemStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubItems create() {
            return builder().build();
        }

        /**
         * @return subItem
         */
        public String getSubItem() {
            return this.subItem;
        }

        /**
         * @return subItemInfo
         */
        public String getSubItemInfo() {
            return this.subItemInfo;
        }

        /**
         * @return subItemStatus
         */
        public String getSubItemStatus() {
            return this.subItemStatus;
        }

        public static final class Builder {
            private String subItem; 
            private String subItemInfo; 
            private String subItemStatus; 

            /**
             * SubItem.
             */
            public Builder subItem(String subItem) {
                this.subItem = subItem;
                return this;
            }

            /**
             * SubItemInfo.
             */
            public Builder subItemInfo(String subItemInfo) {
                this.subItemInfo = subItemInfo;
                return this;
            }

            /**
             * SubItemStatus.
             */
            public Builder subItemStatus(String subItemStatus) {
                this.subItemStatus = subItemStatus;
                return this;
            }

            public SubItems build() {
                return new SubItems(this);
            } 

        } 

    }
    public static class DiagnoseItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Part")
        private String part;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubItems")
        private java.util.List < SubItems> subItems;

        private DiagnoseItem(Builder builder) {
            this.part = builder.part;
            this.status = builder.status;
            this.subItems = builder.subItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseItem create() {
            return builder().build();
        }

        /**
         * @return part
         */
        public String getPart() {
            return this.part;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subItems
         */
        public java.util.List < SubItems> getSubItems() {
            return this.subItems;
        }

        public static final class Builder {
            private String part; 
            private String status; 
            private java.util.List < SubItems> subItems; 

            /**
             * Part.
             */
            public Builder part(String part) {
                this.part = part;
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
             * SubItems.
             */
            public Builder subItems(java.util.List < SubItems> subItems) {
                this.subItems = subItems;
                return this;
            }

            public DiagnoseItem build() {
                return new DiagnoseItem(this);
            } 

        } 

    }
    public static class ErrorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorDesc")
        private String errorDesc;

        @com.aliyun.core.annotation.NameInMap("ErrorItem")
        private String errorItem;

        @com.aliyun.core.annotation.NameInMap("ErrorLevel")
        private String errorLevel;

        @com.aliyun.core.annotation.NameInMap("ErrorPart")
        private String errorPart;

        @com.aliyun.core.annotation.NameInMap("ErrorSuggestion")
        private String errorSuggestion;

        private ErrorResult(Builder builder) {
            this.errorDesc = builder.errorDesc;
            this.errorItem = builder.errorItem;
            this.errorLevel = builder.errorLevel;
            this.errorPart = builder.errorPart;
            this.errorSuggestion = builder.errorSuggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorResult create() {
            return builder().build();
        }

        /**
         * @return errorDesc
         */
        public String getErrorDesc() {
            return this.errorDesc;
        }

        /**
         * @return errorItem
         */
        public String getErrorItem() {
            return this.errorItem;
        }

        /**
         * @return errorLevel
         */
        public String getErrorLevel() {
            return this.errorLevel;
        }

        /**
         * @return errorPart
         */
        public String getErrorPart() {
            return this.errorPart;
        }

        /**
         * @return errorSuggestion
         */
        public String getErrorSuggestion() {
            return this.errorSuggestion;
        }

        public static final class Builder {
            private String errorDesc; 
            private String errorItem; 
            private String errorLevel; 
            private String errorPart; 
            private String errorSuggestion; 

            /**
             * ErrorDesc.
             */
            public Builder errorDesc(String errorDesc) {
                this.errorDesc = errorDesc;
                return this;
            }

            /**
             * ErrorItem.
             */
            public Builder errorItem(String errorItem) {
                this.errorItem = errorItem;
                return this;
            }

            /**
             * ErrorLevel.
             */
            public Builder errorLevel(String errorLevel) {
                this.errorLevel = errorLevel;
                return this;
            }

            /**
             * ErrorPart.
             */
            public Builder errorPart(String errorPart) {
                this.errorPart = errorPart;
                return this;
            }

            /**
             * ErrorSuggestion.
             */
            public Builder errorSuggestion(String errorSuggestion) {
                this.errorSuggestion = errorSuggestion;
                return this;
            }

            public ErrorResult build() {
                return new ErrorResult(this);
            } 

        } 

    }
}
