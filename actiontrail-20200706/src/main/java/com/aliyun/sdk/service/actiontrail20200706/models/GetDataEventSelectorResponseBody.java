// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetDataEventSelectorResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataEventSelectorResponseBody</p>
 */
public class GetDataEventSelectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataEventSelectors")
    private String dataEventSelectors;

    @com.aliyun.core.annotation.NameInMap("IsTrailAllRegion")
    private Boolean isTrailAllRegion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsDeliveryConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SlsDeliveryConfigs> slsDeliveryConfigs;

    @com.aliyun.core.annotation.NameInMap("TrailArn")
    private String trailArn;

    private GetDataEventSelectorResponseBody(Builder builder) {
        this.dataEventSelectors = builder.dataEventSelectors;
        this.isTrailAllRegion = builder.isTrailAllRegion;
        this.requestId = builder.requestId;
        this.slsDeliveryConfigs = builder.slsDeliveryConfigs;
        this.trailArn = builder.trailArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataEventSelectorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataEventSelectors
     */
    public String getDataEventSelectors() {
        return this.dataEventSelectors;
    }

    /**
     * @return isTrailAllRegion
     */
    public Boolean getIsTrailAllRegion() {
        return this.isTrailAllRegion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsDeliveryConfigs
     */
    public java.util.List<SlsDeliveryConfigs> getSlsDeliveryConfigs() {
        return this.slsDeliveryConfigs;
    }

    /**
     * @return trailArn
     */
    public String getTrailArn() {
        return this.trailArn;
    }

    public static final class Builder {
        private String dataEventSelectors; 
        private Boolean isTrailAllRegion; 
        private String requestId; 
        private java.util.List<SlsDeliveryConfigs> slsDeliveryConfigs; 
        private String trailArn; 

        private Builder() {
        } 

        private Builder(GetDataEventSelectorResponseBody model) {
            this.dataEventSelectors = model.dataEventSelectors;
            this.isTrailAllRegion = model.isTrailAllRegion;
            this.requestId = model.requestId;
            this.slsDeliveryConfigs = model.slsDeliveryConfigs;
            this.trailArn = model.trailArn;
        } 

        /**
         * DataEventSelectors.
         */
        public Builder dataEventSelectors(String dataEventSelectors) {
            this.dataEventSelectors = dataEventSelectors;
            return this;
        }

        /**
         * IsTrailAllRegion.
         */
        public Builder isTrailAllRegion(Boolean isTrailAllRegion) {
            this.isTrailAllRegion = isTrailAllRegion;
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
         * <p>This parameter is required.</p>
         */
        public Builder slsDeliveryConfigs(java.util.List<SlsDeliveryConfigs> slsDeliveryConfigs) {
            this.slsDeliveryConfigs = slsDeliveryConfigs;
            return this;
        }

        /**
         * TrailArn.
         */
        public Builder trailArn(String trailArn) {
            this.trailArn = trailArn;
            return this;
        }

        public GetDataEventSelectorResponseBody build() {
            return new GetDataEventSelectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataEventSelectorResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataEventSelectorResponseBody</p>
     */
    public static class SlsDeliveryConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("RegionSlsProjectArn")
        private String regionSlsProjectArn;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TrailRegion")
        private String trailRegion;

        private SlsDeliveryConfigs(Builder builder) {
            this.createTime = builder.createTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.regionSlsProjectArn = builder.regionSlsProjectArn;
            this.status = builder.status;
            this.trailRegion = builder.trailRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsDeliveryConfigs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return regionSlsProjectArn
         */
        public String getRegionSlsProjectArn() {
            return this.regionSlsProjectArn;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trailRegion
         */
        public String getTrailRegion() {
            return this.trailRegion;
        }

        public static final class Builder {
            private String createTime; 
            private String errorCode; 
            private String errorMessage; 
            private String regionSlsProjectArn; 
            private String status; 
            private String trailRegion; 

            private Builder() {
            } 

            private Builder(SlsDeliveryConfigs model) {
                this.createTime = model.createTime;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.regionSlsProjectArn = model.regionSlsProjectArn;
                this.status = model.status;
                this.trailRegion = model.trailRegion;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * RegionSlsProjectArn.
             */
            public Builder regionSlsProjectArn(String regionSlsProjectArn) {
                this.regionSlsProjectArn = regionSlsProjectArn;
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
             * TrailRegion.
             */
            public Builder trailRegion(String trailRegion) {
                this.trailRegion = trailRegion;
                return this;
            }

            public SlsDeliveryConfigs build() {
                return new SlsDeliveryConfigs(this);
            } 

        } 

    }
}
