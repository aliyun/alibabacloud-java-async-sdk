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
 * {@link DescribeVerifyDeviceRiskStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyDeviceRiskStatisticsResponseBody</p>
 */
public class DescribeVerifyDeviceRiskStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeVerifyDeviceRiskStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyDeviceRiskStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeVerifyDeviceRiskStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>B3193814-AE54-50C5-9070-68B69C07287D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Authentication result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBody build() {
            return new DescribeVerifyDeviceRiskStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyDeviceRiskStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyDeviceRiskStatisticsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DailyCallCount")
        private Long dailyCallCount;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DeviceRiskRate")
        private String deviceRiskRate;

        @com.aliyun.core.annotation.NameInMap("IdentityRiskRate")
        private String identityRiskRate;

        private Items(Builder builder) {
            this.dailyCallCount = builder.dailyCallCount;
            this.date = builder.date;
            this.deviceRiskRate = builder.deviceRiskRate;
            this.identityRiskRate = builder.identityRiskRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return dailyCallCount
         */
        public Long getDailyCallCount() {
            return this.dailyCallCount;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return deviceRiskRate
         */
        public String getDeviceRiskRate() {
            return this.deviceRiskRate;
        }

        /**
         * @return identityRiskRate
         */
        public String getIdentityRiskRate() {
            return this.identityRiskRate;
        }

        public static final class Builder {
            private Long dailyCallCount; 
            private String date; 
            private String deviceRiskRate; 
            private String identityRiskRate; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.dailyCallCount = model.dailyCallCount;
                this.date = model.date;
                this.deviceRiskRate = model.deviceRiskRate;
                this.identityRiskRate = model.identityRiskRate;
            } 

            /**
             * <p>Daily call count.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder dailyCallCount(Long dailyCallCount) {
                this.dailyCallCount = dailyCallCount;
                return this;
            }

            /**
             * <p>Date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-10</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>Abnormal device risk ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deviceRiskRate(String deviceRiskRate) {
                this.deviceRiskRate = deviceRiskRate;
                return this;
            }

            /**
             * <p>Abnormal identity risk ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder identityRiskRate(String identityRiskRate) {
                this.identityRiskRate = identityRiskRate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyDeviceRiskStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyDeviceRiskStatisticsResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceAttackRate")
        private String faceAttackRate;

        @com.aliyun.core.annotation.NameInMap("IdFakeRate")
        private String idFakeRate;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("RootRate")
        private String rootRate;

        @com.aliyun.core.annotation.NameInMap("SimulatorRate")
        private String simulatorRate;

        @com.aliyun.core.annotation.NameInMap("VirtualVideoRate")
        private String virtualVideoRate;

        private ResultObject(Builder builder) {
            this.faceAttackRate = builder.faceAttackRate;
            this.idFakeRate = builder.idFakeRate;
            this.items = builder.items;
            this.riskCount = builder.riskCount;
            this.rootRate = builder.rootRate;
            this.simulatorRate = builder.simulatorRate;
            this.virtualVideoRate = builder.virtualVideoRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return faceAttackRate
         */
        public String getFaceAttackRate() {
            return this.faceAttackRate;
        }

        /**
         * @return idFakeRate
         */
        public String getIdFakeRate() {
            return this.idFakeRate;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return rootRate
         */
        public String getRootRate() {
            return this.rootRate;
        }

        /**
         * @return simulatorRate
         */
        public String getSimulatorRate() {
            return this.simulatorRate;
        }

        /**
         * @return virtualVideoRate
         */
        public String getVirtualVideoRate() {
            return this.virtualVideoRate;
        }

        public static final class Builder {
            private String faceAttackRate; 
            private String idFakeRate; 
            private java.util.List<Items> items; 
            private Long riskCount; 
            private String rootRate; 
            private String simulatorRate; 
            private String virtualVideoRate; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.faceAttackRate = model.faceAttackRate;
                this.idFakeRate = model.idFakeRate;
                this.items = model.items;
                this.riskCount = model.riskCount;
                this.rootRate = model.rootRate;
                this.simulatorRate = model.simulatorRate;
                this.virtualVideoRate = model.virtualVideoRate;
            } 

            /**
             * <p>Suspected fake face percentage: total number of suspected fake faces / total number of risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder faceAttackRate(String faceAttackRate) {
                this.faceAttackRate = faceAttackRate;
                return this;
            }

            /**
             * <p>Total number of suspected fake identities.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder idFakeRate(String idFakeRate) {
                this.idFakeRate = idFakeRate;
                return this;
            }

            /**
             * <p>Data items in the response.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>Number of risks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>Root percentage: total number of root / total number of risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rootRate(String rootRate) {
                this.rootRate = rootRate;
                return this;
            }

            /**
             * <p>Simulator percentage: total number of simulators / total number of risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder simulatorRate(String simulatorRate) {
                this.simulatorRate = simulatorRate;
                return this;
            }

            /**
             * <p>Virtual video percentage: total number of virtual videos / total number of risks.</p>
             * 
             * <strong>example:</strong>
             * <p>23.2</p>
             */
            public Builder virtualVideoRate(String virtualVideoRate) {
                this.virtualVideoRate = virtualVideoRate;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
