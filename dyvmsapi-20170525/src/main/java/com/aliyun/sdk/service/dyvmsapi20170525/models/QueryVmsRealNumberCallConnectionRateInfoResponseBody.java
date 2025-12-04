// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link QueryVmsRealNumberCallConnectionRateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVmsRealNumberCallConnectionRateInfoResponseBody</p>
 */
public class QueryVmsRealNumberCallConnectionRateInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryVmsRealNumberCallConnectionRateInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVmsRealNumberCallConnectionRateInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryVmsRealNumberCallConnectionRateInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryVmsRealNumberCallConnectionRateInfoResponseBody build() {
            return new QueryVmsRealNumberCallConnectionRateInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVmsRealNumberCallConnectionRateInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVmsRealNumberCallConnectionRateInfoResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallConnectionRate")
        private Double callConnectionRate;

        @com.aliyun.core.annotation.NameInMap("CompleteCount")
        private Long completeCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private Long requestCount;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RingingCount")
        private Long ringingCount;

        @com.aliyun.core.annotation.NameInMap("RingingRate")
        private Double ringingRate;

        private Model(Builder builder) {
            this.callConnectionRate = builder.callConnectionRate;
            this.completeCount = builder.completeCount;
            this.regionId = builder.regionId;
            this.requestCount = builder.requestCount;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.ringingCount = builder.ringingCount;
            this.ringingRate = builder.ringingRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return callConnectionRate
         */
        public Double getCallConnectionRate() {
            return this.callConnectionRate;
        }

        /**
         * @return completeCount
         */
        public Long getCompleteCount() {
            return this.completeCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return ringingCount
         */
        public Long getRingingCount() {
            return this.ringingCount;
        }

        /**
         * @return ringingRate
         */
        public Double getRingingRate() {
            return this.ringingRate;
        }

        public static final class Builder {
            private Double callConnectionRate; 
            private Long completeCount; 
            private String regionId; 
            private Long requestCount; 
            private String resourceId; 
            private String resourceType; 
            private Long ringingCount; 
            private Double ringingRate; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.callConnectionRate = model.callConnectionRate;
                this.completeCount = model.completeCount;
                this.regionId = model.regionId;
                this.requestCount = model.requestCount;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.ringingCount = model.ringingCount;
                this.ringingRate = model.ringingRate;
            } 

            /**
             * <p>接通率</p>
             * 
             * <strong>example:</strong>
             * <p>6.71672</p>
             */
            public Builder callConnectionRate(Double callConnectionRate) {
                this.callConnectionRate = callConnectionRate;
                return this;
            }

            /**
             * <p>接通数</p>
             * 
             * <strong>example:</strong>
             * <p>52</p>
             */
            public Builder completeCount(Long completeCount) {
                this.completeCount = completeCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>请求通话数</p>
             * 
             * <strong>example:</strong>
             * <p>49</p>
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>EcsInstance, EcsDisk, EcsImage, EcsSnapshot, EcsSecurityGroup, EcsEip, EcsVpc, EcsVRouter, EcsVSwitch, EcsVRouteTable, EcsAuthImage, EcsAll, SlbLoadbalancer, SlbVm, RdsInstance, RdsAllInstance, KvsInstance, OcsInstance, OdpsInstance</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>响铃数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ringingCount(Long ringingCount) {
                this.ringingCount = ringingCount;
                return this;
            }

            /**
             * <p>响铃率</p>
             * 
             * <strong>example:</strong>
             * <p>25.4222</p>
             */
            public Builder ringingRate(Double ringingRate) {
                this.ringingRate = ringingRate;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
