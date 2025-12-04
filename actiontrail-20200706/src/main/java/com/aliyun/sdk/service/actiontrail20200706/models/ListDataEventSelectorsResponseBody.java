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
 * {@link ListDataEventSelectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataEventSelectorsResponseBody</p>
 */
public class ListDataEventSelectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataEventSelectorsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataEventSelectorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataEventSelectorsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataEventSelectorsResponseBody build() {
            return new ListDataEventSelectorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataEventSelectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataEventSelectorsResponseBody</p>
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
    /**
     * 
     * {@link ListDataEventSelectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataEventSelectorsResponseBody</p>
     */
    public static class DataEventSelectorInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSelectors")
        private String eventSelectors;

        @com.aliyun.core.annotation.NameInMap("IsTrailAllRegion")
        private Boolean isTrailAllRegion;

        @com.aliyun.core.annotation.NameInMap("SlsDeliveryConfigs")
        private java.util.List<SlsDeliveryConfigs> slsDeliveryConfigs;

        @com.aliyun.core.annotation.NameInMap("TrailArn")
        private String trailArn;

        @com.aliyun.core.annotation.NameInMap("TrailName")
        private String trailName;

        private DataEventSelectorInfos(Builder builder) {
            this.eventSelectors = builder.eventSelectors;
            this.isTrailAllRegion = builder.isTrailAllRegion;
            this.slsDeliveryConfigs = builder.slsDeliveryConfigs;
            this.trailArn = builder.trailArn;
            this.trailName = builder.trailName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEventSelectorInfos create() {
            return builder().build();
        }

        /**
         * @return eventSelectors
         */
        public String getEventSelectors() {
            return this.eventSelectors;
        }

        /**
         * @return isTrailAllRegion
         */
        public Boolean getIsTrailAllRegion() {
            return this.isTrailAllRegion;
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

        /**
         * @return trailName
         */
        public String getTrailName() {
            return this.trailName;
        }

        public static final class Builder {
            private String eventSelectors; 
            private Boolean isTrailAllRegion; 
            private java.util.List<SlsDeliveryConfigs> slsDeliveryConfigs; 
            private String trailArn; 
            private String trailName; 

            private Builder() {
            } 

            private Builder(DataEventSelectorInfos model) {
                this.eventSelectors = model.eventSelectors;
                this.isTrailAllRegion = model.isTrailAllRegion;
                this.slsDeliveryConfigs = model.slsDeliveryConfigs;
                this.trailArn = model.trailArn;
                this.trailName = model.trailName;
            } 

            /**
             * EventSelectors.
             */
            public Builder eventSelectors(String eventSelectors) {
                this.eventSelectors = eventSelectors;
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
             * SlsDeliveryConfigs.
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

            /**
             * TrailName.
             */
            public Builder trailName(String trailName) {
                this.trailName = trailName;
                return this;
            }

            public DataEventSelectorInfos build() {
                return new DataEventSelectorInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataEventSelectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataEventSelectorsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataEventSelectorInfos")
        private java.util.List<DataEventSelectorInfos> dataEventSelectorInfos;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.dataEventSelectorInfos = builder.dataEventSelectorInfos;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataEventSelectorInfos
         */
        public java.util.List<DataEventSelectorInfos> getDataEventSelectorInfos() {
            return this.dataEventSelectorInfos;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<DataEventSelectorInfos> dataEventSelectorInfos; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataEventSelectorInfos = model.dataEventSelectorInfos;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * DataEventSelectorInfos.
             */
            public Builder dataEventSelectorInfos(java.util.List<DataEventSelectorInfos> dataEventSelectorInfos) {
                this.dataEventSelectorInfos = dataEventSelectorInfos;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
