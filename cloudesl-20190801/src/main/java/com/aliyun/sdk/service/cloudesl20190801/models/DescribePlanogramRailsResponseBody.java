// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlanogramRailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlanogramRailsResponseBody</p>
 */
public class DescribePlanogramRailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PlanogramRailInfos")
    private java.util.List < PlanogramRailInfos> planogramRailInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StoreId")
    private String storeId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePlanogramRailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.planogramRailInfos = builder.planogramRailInfos;
        this.requestId = builder.requestId;
        this.storeId = builder.storeId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlanogramRailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return planogramRailInfos
     */
    public java.util.List < PlanogramRailInfos> getPlanogramRailInfos() {
        return this.planogramRailInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < PlanogramRailInfos> planogramRailInfos; 
        private String requestId; 
        private String storeId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * PlanogramRailInfos.
         */
        public Builder planogramRailInfos(java.util.List < PlanogramRailInfos> planogramRailInfos) {
            this.planogramRailInfos = planogramRailInfos;
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
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.storeId = storeId;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePlanogramRailsResponseBody build() {
            return new DescribePlanogramRailsResponseBody(this);
        } 

    } 

    public static class PlanogramRailInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GapUnit")
        private Integer gapUnit;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private String layer;

        @com.aliyun.core.annotation.NameInMap("RailCode")
        private String railCode;

        @com.aliyun.core.annotation.NameInMap("Shelf")
        private String shelf;

        private PlanogramRailInfos(Builder builder) {
            this.gapUnit = builder.gapUnit;
            this.layer = builder.layer;
            this.railCode = builder.railCode;
            this.shelf = builder.shelf;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanogramRailInfos create() {
            return builder().build();
        }

        /**
         * @return gapUnit
         */
        public Integer getGapUnit() {
            return this.gapUnit;
        }

        /**
         * @return layer
         */
        public String getLayer() {
            return this.layer;
        }

        /**
         * @return railCode
         */
        public String getRailCode() {
            return this.railCode;
        }

        /**
         * @return shelf
         */
        public String getShelf() {
            return this.shelf;
        }

        public static final class Builder {
            private Integer gapUnit; 
            private String layer; 
            private String railCode; 
            private String shelf; 

            /**
             * GapUnit.
             */
            public Builder gapUnit(Integer gapUnit) {
                this.gapUnit = gapUnit;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(String layer) {
                this.layer = layer;
                return this;
            }

            /**
             * RailCode.
             */
            public Builder railCode(String railCode) {
                this.railCode = railCode;
                return this;
            }

            /**
             * Shelf.
             */
            public Builder shelf(String shelf) {
                this.shelf = shelf;
                return this;
            }

            public PlanogramRailInfos build() {
                return new PlanogramRailInfos(this);
            } 

        } 

    }
}
