// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link QueryVerifyFlowPackageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVerifyFlowPackageResponseBody</p>
 */
public class QueryVerifyFlowPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private QueryVerifyFlowPackageResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVerifyFlowPackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Long httpStatusCode; 
        private java.util.List<Items> items; 
        private String requestId; 
        private Boolean success; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(QueryVerifyFlowPackageResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Return code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>List of returned data.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>969434DF-926B-4997-9881-4DE94E39F805</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the response was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryVerifyFlowPackageResponseBody build() {
            return new QueryVerifyFlowPackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVerifyFlowPackageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVerifyFlowPackageResponseBody</p>
     */
    public static class FlowDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Double capacity;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("CurrCapacity")
        private Double currCapacity;

        @com.aliyun.core.annotation.NameInMap("CurrProportion")
        private String currProportion;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TakeEffectDate")
        private String takeEffectDate;

        private FlowDetails(Builder builder) {
            this.capacity = builder.capacity;
            this.commodityName = builder.commodityName;
            this.currCapacity = builder.currCapacity;
            this.currProportion = builder.currProportion;
            this.expireDate = builder.expireDate;
            this.instanceName = builder.instanceName;
            this.status = builder.status;
            this.takeEffectDate = builder.takeEffectDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowDetails create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Double getCapacity() {
            return this.capacity;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return currCapacity
         */
        public Double getCurrCapacity() {
            return this.currCapacity;
        }

        /**
         * @return currProportion
         */
        public String getCurrProportion() {
            return this.currProportion;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return takeEffectDate
         */
        public String getTakeEffectDate() {
            return this.takeEffectDate;
        }

        public static final class Builder {
            private Double capacity; 
            private String commodityName; 
            private Double currCapacity; 
            private String currProportion; 
            private String expireDate; 
            private String instanceName; 
            private String status; 
            private String takeEffectDate; 

            private Builder() {
            } 

            private Builder(FlowDetails model) {
                this.capacity = model.capacity;
                this.commodityName = model.commodityName;
                this.currCapacity = model.currCapacity;
                this.currProportion = model.currProportion;
                this.expireDate = model.expireDate;
                this.instanceName = model.instanceName;
                this.status = model.status;
                this.takeEffectDate = model.takeEffectDate;
            } 

            /**
             * <p>Total amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder capacity(Double capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>Name of the flow package.</p>
             * 
             * <strong>example:</strong>
             * <p>实人认证流量包</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * <p>Remaining amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder currCapacity(Double currCapacity) {
                this.currCapacity = currCapacity;
                return this;
            }

            /**
             * <p>Proportion of remaining amount.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder currProportion(String currProportion) {
                this.currProportion = currProportion;
                return this;
            }

            /**
             * <p>Expiration date.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>Instance name</p>
             * 
             * <strong>example:</strong>
             * <p>tf-testacccn-hangzhouapigate84369</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Status.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Effective date.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder takeEffectDate(String takeEffectDate) {
                this.takeEffectDate = takeEffectDate;
                return this;
            }

            public FlowDetails build() {
                return new FlowDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVerifyFlowPackageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVerifyFlowPackageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("CurrCapacity")
        private Double currCapacity;

        @com.aliyun.core.annotation.NameInMap("CurrProportion")
        private String currProportion;

        @com.aliyun.core.annotation.NameInMap("FlowDetails")
        private java.util.List<FlowDetails> flowDetails;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private Double totalCapacity;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Double usedCapacity;

        private Items(Builder builder) {
            this.commodityName = builder.commodityName;
            this.currCapacity = builder.currCapacity;
            this.currProportion = builder.currProportion;
            this.flowDetails = builder.flowDetails;
            this.totalCapacity = builder.totalCapacity;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return currCapacity
         */
        public Double getCurrCapacity() {
            return this.currCapacity;
        }

        /**
         * @return currProportion
         */
        public String getCurrProportion() {
            return this.currProportion;
        }

        /**
         * @return flowDetails
         */
        public java.util.List<FlowDetails> getFlowDetails() {
            return this.flowDetails;
        }

        /**
         * @return totalCapacity
         */
        public Double getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return usedCapacity
         */
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private String commodityName; 
            private Double currCapacity; 
            private String currProportion; 
            private java.util.List<FlowDetails> flowDetails; 
            private Double totalCapacity; 
            private Double usedCapacity; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.commodityName = model.commodityName;
                this.currCapacity = model.currCapacity;
                this.currProportion = model.currProportion;
                this.flowDetails = model.flowDetails;
                this.totalCapacity = model.totalCapacity;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>Name of the resource package.</p>
             * 
             * <strong>example:</strong>
             * <p>实人认证流量包</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * <p>Current available capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder currCapacity(Double currCapacity) {
                this.currCapacity = currCapacity;
                return this;
            }

            /**
             * <p>Proportion of current remaining capacity to total capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>0%</p>
             */
            public Builder currProportion(String currProportion) {
                this.currProportion = currProportion;
                return this;
            }

            /**
             * <p>Details of the flow package.</p>
             */
            public Builder flowDetails(java.util.List<FlowDetails> flowDetails) {
                this.flowDetails = flowDetails;
                return this;
            }

            /**
             * <p>Total quota.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder totalCapacity(Double totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * <p>Used capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder usedCapacity(Double usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
