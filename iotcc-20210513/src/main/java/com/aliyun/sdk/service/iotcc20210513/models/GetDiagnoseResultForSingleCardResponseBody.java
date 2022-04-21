// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnoseResultForSingleCardResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiagnoseResultForSingleCardResponseBody</p>
 */
public class GetDiagnoseResultForSingleCardResponseBody extends TeaModel {
    @NameInMap("BeginTime")
    private Long beginTime;

    @NameInMap("CardIp")
    private String cardIp;

    @NameInMap("Destination")
    private String destination;

    @NameInMap("DiagnoseItem")
    private java.util.List < DiagnoseItem> diagnoseItem;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("ErrorResult")
    private java.util.List < ErrorResult> errorResult;

    @NameInMap("IccId")
    private String iccId;

    @NameInMap("IoTCloudConnectorId")
    private String ioTCloudConnectorId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetDiagnoseResultForSingleCardResponseBody(Builder builder) {
        this.beginTime = builder.beginTime;
        this.cardIp = builder.cardIp;
        this.destination = builder.destination;
        this.diagnoseItem = builder.diagnoseItem;
        this.endTime = builder.endTime;
        this.errorResult = builder.errorResult;
        this.iccId = builder.iccId;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.requestId = builder.requestId;
        this.status = builder.status;
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
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
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

    public static final class Builder {
        private Long beginTime; 
        private String cardIp; 
        private String destination; 
        private java.util.List < DiagnoseItem> diagnoseItem; 
        private Long endTime; 
        private java.util.List < ErrorResult> errorResult; 
        private String iccId; 
        private String ioTCloudConnectorId; 
        private String requestId; 
        private String status; 

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
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
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

        public GetDiagnoseResultForSingleCardResponseBody build() {
            return new GetDiagnoseResultForSingleCardResponseBody(this);
        } 

    } 

    public static class DiagnoseItem extends TeaModel {
        @NameInMap("Part")
        private String part;

        @NameInMap("Status")
        private String status;

        private DiagnoseItem(Builder builder) {
            this.part = builder.part;
            this.status = builder.status;
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

        public static final class Builder {
            private String part; 
            private String status; 

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

            public DiagnoseItem build() {
                return new DiagnoseItem(this);
            } 

        } 

    }
    public static class ErrorResult extends TeaModel {
        @NameInMap("ErrorDesc")
        private String errorDesc;

        @NameInMap("ErrorLevel")
        private String errorLevel;

        @NameInMap("ErrorPart")
        private String errorPart;

        @NameInMap("ErrorSuggestion")
        private String errorSuggestion;

        private ErrorResult(Builder builder) {
            this.errorDesc = builder.errorDesc;
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
