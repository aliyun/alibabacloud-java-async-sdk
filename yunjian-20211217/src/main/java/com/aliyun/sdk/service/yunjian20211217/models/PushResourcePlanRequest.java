// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link PushResourcePlanRequest} extends {@link RequestModel}
 *
 * <p>PushResourcePlanRequest</p>
 */
public class PushResourcePlanRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bufferCnt")
    private Long bufferCnt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("demandCount")
    private Long demandCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("demandId")
    private String demandId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("methodList")
    private java.util.List<MethodList> methodList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requireCnt")
    private Long requireCnt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subDemandId")
    private String subDemandId;

    private PushResourcePlanRequest(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.bufferCnt = builder.bufferCnt;
        this.demandCount = builder.demandCount;
        this.demandId = builder.demandId;
        this.methodList = builder.methodList;
        this.requestId = builder.requestId;
        this.requireCnt = builder.requireCnt;
        this.subDemandId = builder.subDemandId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushResourcePlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return yunUserId
     */
    public String getYunUserId() {
        return this.yunUserId;
    }

    /**
     * @return bufferCnt
     */
    public Long getBufferCnt() {
        return this.bufferCnt;
    }

    /**
     * @return demandCount
     */
    public Long getDemandCount() {
        return this.demandCount;
    }

    /**
     * @return demandId
     */
    public String getDemandId() {
        return this.demandId;
    }

    /**
     * @return methodList
     */
    public java.util.List<MethodList> getMethodList() {
        return this.methodList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requireCnt
     */
    public Long getRequireCnt() {
        return this.requireCnt;
    }

    /**
     * @return subDemandId
     */
    public String getSubDemandId() {
        return this.subDemandId;
    }

    public static final class Builder extends Request.Builder<PushResourcePlanRequest, Builder> {
        private String yunUserId; 
        private Long bufferCnt; 
        private Long demandCount; 
        private String demandId; 
        private java.util.List<MethodList> methodList; 
        private String requestId; 
        private Long requireCnt; 
        private String subDemandId; 

        private Builder() {
            super();
        } 

        private Builder(PushResourcePlanRequest request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.bufferCnt = request.bufferCnt;
            this.demandCount = request.demandCount;
            this.demandId = request.demandId;
            this.methodList = request.methodList;
            this.requestId = request.requestId;
            this.requireCnt = request.requireCnt;
            this.subDemandId = request.subDemandId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder yunUserId(String yunUserId) {
            this.putHeaderParameter("Yun-User-Id", yunUserId);
            this.yunUserId = yunUserId;
            return this;
        }

        /**
         * bufferCnt.
         */
        public Builder bufferCnt(Long bufferCnt) {
            this.putBodyParameter("bufferCnt", bufferCnt);
            this.bufferCnt = bufferCnt;
            return this;
        }

        /**
         * demandCount.
         */
        public Builder demandCount(Long demandCount) {
            this.putBodyParameter("demandCount", demandCount);
            this.demandCount = demandCount;
            return this;
        }

        /**
         * demandId.
         */
        public Builder demandId(String demandId) {
            this.putBodyParameter("demandId", demandId);
            this.demandId = demandId;
            return this;
        }

        /**
         * methodList.
         */
        public Builder methodList(java.util.List<MethodList> methodList) {
            this.putBodyParameter("methodList", methodList);
            this.methodList = methodList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * requireCnt.
         */
        public Builder requireCnt(Long requireCnt) {
            this.putBodyParameter("requireCnt", requireCnt);
            this.requireCnt = requireCnt;
            return this;
        }

        /**
         * subDemandId.
         */
        public Builder subDemandId(String subDemandId) {
            this.putBodyParameter("subDemandId", subDemandId);
            this.subDemandId = subDemandId;
            return this;
        }

        @Override
        public PushResourcePlanRequest build() {
            return new PushResourcePlanRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushResourcePlanRequest} extends {@link TeaModel}
     *
     * <p>PushResourcePlanRequest</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("classZone")
        private String classZone;

        @com.aliyun.core.annotation.NameInMap("convertHostType")
        private String convertHostType;

        @com.aliyun.core.annotation.NameInMap("logicZone")
        private String logicZone;

        @com.aliyun.core.annotation.NameInMap("netArch")
        private String netArch;

        @com.aliyun.core.annotation.NameInMap("nic")
        private String nic;

        @com.aliyun.core.annotation.NameInMap("product3")
        private String product3;

        @com.aliyun.core.annotation.NameInMap("safeZone")
        private String safeZone;

        @com.aliyun.core.annotation.NameInMap("scenario")
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("supplyAmount")
        private Long supplyAmount;

        @com.aliyun.core.annotation.NameInMap("supplyDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String supplyDate;

        @com.aliyun.core.annotation.NameInMap("supplyType")
        private Long supplyType;

        @com.aliyun.core.annotation.NameInMap("supplyVmAmount")
        private Integer supplyVmAmount;

        private DataList(Builder builder) {
            this.classZone = builder.classZone;
            this.convertHostType = builder.convertHostType;
            this.logicZone = builder.logicZone;
            this.netArch = builder.netArch;
            this.nic = builder.nic;
            this.product3 = builder.product3;
            this.safeZone = builder.safeZone;
            this.scenario = builder.scenario;
            this.supplyAmount = builder.supplyAmount;
            this.supplyDate = builder.supplyDate;
            this.supplyType = builder.supplyType;
            this.supplyVmAmount = builder.supplyVmAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return classZone
         */
        public String getClassZone() {
            return this.classZone;
        }

        /**
         * @return convertHostType
         */
        public String getConvertHostType() {
            return this.convertHostType;
        }

        /**
         * @return logicZone
         */
        public String getLogicZone() {
            return this.logicZone;
        }

        /**
         * @return netArch
         */
        public String getNetArch() {
            return this.netArch;
        }

        /**
         * @return nic
         */
        public String getNic() {
            return this.nic;
        }

        /**
         * @return product3
         */
        public String getProduct3() {
            return this.product3;
        }

        /**
         * @return safeZone
         */
        public String getSafeZone() {
            return this.safeZone;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        /**
         * @return supplyAmount
         */
        public Long getSupplyAmount() {
            return this.supplyAmount;
        }

        /**
         * @return supplyDate
         */
        public String getSupplyDate() {
            return this.supplyDate;
        }

        /**
         * @return supplyType
         */
        public Long getSupplyType() {
            return this.supplyType;
        }

        /**
         * @return supplyVmAmount
         */
        public Integer getSupplyVmAmount() {
            return this.supplyVmAmount;
        }

        public static final class Builder {
            private String classZone; 
            private String convertHostType; 
            private String logicZone; 
            private String netArch; 
            private String nic; 
            private String product3; 
            private String safeZone; 
            private String scenario; 
            private Long supplyAmount; 
            private String supplyDate; 
            private Long supplyType; 
            private Integer supplyVmAmount; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.classZone = model.classZone;
                this.convertHostType = model.convertHostType;
                this.logicZone = model.logicZone;
                this.netArch = model.netArch;
                this.nic = model.nic;
                this.product3 = model.product3;
                this.safeZone = model.safeZone;
                this.scenario = model.scenario;
                this.supplyAmount = model.supplyAmount;
                this.supplyDate = model.supplyDate;
                this.supplyType = model.supplyType;
                this.supplyVmAmount = model.supplyVmAmount;
            } 

            /**
             * classZone.
             */
            public Builder classZone(String classZone) {
                this.classZone = classZone;
                return this;
            }

            /**
             * convertHostType.
             */
            public Builder convertHostType(String convertHostType) {
                this.convertHostType = convertHostType;
                return this;
            }

            /**
             * logicZone.
             */
            public Builder logicZone(String logicZone) {
                this.logicZone = logicZone;
                return this;
            }

            /**
             * netArch.
             */
            public Builder netArch(String netArch) {
                this.netArch = netArch;
                return this;
            }

            /**
             * nic.
             */
            public Builder nic(String nic) {
                this.nic = nic;
                return this;
            }

            /**
             * product3.
             */
            public Builder product3(String product3) {
                this.product3 = product3;
                return this;
            }

            /**
             * safeZone.
             */
            public Builder safeZone(String safeZone) {
                this.safeZone = safeZone;
                return this;
            }

            /**
             * scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * supplyAmount.
             */
            public Builder supplyAmount(Long supplyAmount) {
                this.supplyAmount = supplyAmount;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder supplyDate(String supplyDate) {
                this.supplyDate = supplyDate;
                return this;
            }

            /**
             * supplyType.
             */
            public Builder supplyType(Long supplyType) {
                this.supplyType = supplyType;
                return this;
            }

            /**
             * supplyVmAmount.
             */
            public Builder supplyVmAmount(Integer supplyVmAmount) {
                this.supplyVmAmount = supplyVmAmount;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushResourcePlanRequest} extends {@link TeaModel}
     *
     * <p>PushResourcePlanRequest</p>
     */
    public static class MethodList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("azone")
        private String azone;

        @com.aliyun.core.annotation.NameInMap("bufferCnt")
        private Long bufferCnt;

        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("convertHostCnt")
        private Long convertHostCnt;

        @com.aliyun.core.annotation.NameInMap("convertHostType")
        private String convertHostType;

        @com.aliyun.core.annotation.NameInMap("dataList")
        private java.util.List<DataList> dataList;

        @com.aliyun.core.annotation.NameInMap("denamdCount")
        private Long denamdCount;

        @com.aliyun.core.annotation.NameInMap("gapCnt")
        private Long gapCnt;

        @com.aliyun.core.annotation.NameInMap("promiseDate")
        private String promiseDate;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("resourceMethodId")
        private Long resourceMethodId;

        @com.aliyun.core.annotation.NameInMap("roomCode")
        private String roomCode;

        private MethodList(Builder builder) {
            this.azone = builder.azone;
            this.bufferCnt = builder.bufferCnt;
            this.cluster = builder.cluster;
            this.comment = builder.comment;
            this.convertHostCnt = builder.convertHostCnt;
            this.convertHostType = builder.convertHostType;
            this.dataList = builder.dataList;
            this.denamdCount = builder.denamdCount;
            this.gapCnt = builder.gapCnt;
            this.promiseDate = builder.promiseDate;
            this.region = builder.region;
            this.resourceMethodId = builder.resourceMethodId;
            this.roomCode = builder.roomCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MethodList create() {
            return builder().build();
        }

        /**
         * @return azone
         */
        public String getAzone() {
            return this.azone;
        }

        /**
         * @return bufferCnt
         */
        public Long getBufferCnt() {
            return this.bufferCnt;
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return convertHostCnt
         */
        public Long getConvertHostCnt() {
            return this.convertHostCnt;
        }

        /**
         * @return convertHostType
         */
        public String getConvertHostType() {
            return this.convertHostType;
        }

        /**
         * @return dataList
         */
        public java.util.List<DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return denamdCount
         */
        public Long getDenamdCount() {
            return this.denamdCount;
        }

        /**
         * @return gapCnt
         */
        public Long getGapCnt() {
            return this.gapCnt;
        }

        /**
         * @return promiseDate
         */
        public String getPromiseDate() {
            return this.promiseDate;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceMethodId
         */
        public Long getResourceMethodId() {
            return this.resourceMethodId;
        }

        /**
         * @return roomCode
         */
        public String getRoomCode() {
            return this.roomCode;
        }

        public static final class Builder {
            private String azone; 
            private Long bufferCnt; 
            private String cluster; 
            private String comment; 
            private Long convertHostCnt; 
            private String convertHostType; 
            private java.util.List<DataList> dataList; 
            private Long denamdCount; 
            private Long gapCnt; 
            private String promiseDate; 
            private String region; 
            private Long resourceMethodId; 
            private String roomCode; 

            private Builder() {
            } 

            private Builder(MethodList model) {
                this.azone = model.azone;
                this.bufferCnt = model.bufferCnt;
                this.cluster = model.cluster;
                this.comment = model.comment;
                this.convertHostCnt = model.convertHostCnt;
                this.convertHostType = model.convertHostType;
                this.dataList = model.dataList;
                this.denamdCount = model.denamdCount;
                this.gapCnt = model.gapCnt;
                this.promiseDate = model.promiseDate;
                this.region = model.region;
                this.resourceMethodId = model.resourceMethodId;
                this.roomCode = model.roomCode;
            } 

            /**
             * azone.
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * bufferCnt.
             */
            public Builder bufferCnt(Long bufferCnt) {
                this.bufferCnt = bufferCnt;
                return this;
            }

            /**
             * cluster.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * convertHostCnt.
             */
            public Builder convertHostCnt(Long convertHostCnt) {
                this.convertHostCnt = convertHostCnt;
                return this;
            }

            /**
             * convertHostType.
             */
            public Builder convertHostType(String convertHostType) {
                this.convertHostType = convertHostType;
                return this;
            }

            /**
             * dataList.
             */
            public Builder dataList(java.util.List<DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * denamdCount.
             */
            public Builder denamdCount(Long denamdCount) {
                this.denamdCount = denamdCount;
                return this;
            }

            /**
             * gapCnt.
             */
            public Builder gapCnt(Long gapCnt) {
                this.gapCnt = gapCnt;
                return this;
            }

            /**
             * promiseDate.
             */
            public Builder promiseDate(String promiseDate) {
                this.promiseDate = promiseDate;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * resourceMethodId.
             */
            public Builder resourceMethodId(Long resourceMethodId) {
                this.resourceMethodId = resourceMethodId;
                return this;
            }

            /**
             * roomCode.
             */
            public Builder roomCode(String roomCode) {
                this.roomCode = roomCode;
                return this;
            }

            public MethodList build() {
                return new MethodList(this);
            } 

        } 

    }
}
