// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetUnknownThreatDetectStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetUnknownThreatDetectStatisticResponseBody</p>
 */
public class GetUnknownThreatDetectStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUnknownThreatDetectStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUnknownThreatDetectStatisticResponseBody create() {
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

        private Builder(GetUnknownThreatDetectStatisticResponseBody model) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FD394AF6-591E-5168-8C8C-4C7847******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUnknownThreatDetectStatisticResponseBody build() {
            return new GetUnknownThreatDetectStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUnknownThreatDetectStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetUnknownThreatDetectStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockMachineCount")
        private Integer blockMachineCount;

        @com.aliyun.core.annotation.NameInMap("MachineCount")
        private Integer machineCount;

        @com.aliyun.core.annotation.NameInMap("MonitorMachineCount")
        private Integer monitorMachineCount;

        @com.aliyun.core.annotation.NameInMap("OpenMachineCount")
        private Integer openMachineCount;

        @com.aliyun.core.annotation.NameInMap("StudyingMachineCount")
        private Integer studyingMachineCount;

        private Data(Builder builder) {
            this.blockMachineCount = builder.blockMachineCount;
            this.machineCount = builder.machineCount;
            this.monitorMachineCount = builder.monitorMachineCount;
            this.openMachineCount = builder.openMachineCount;
            this.studyingMachineCount = builder.studyingMachineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blockMachineCount
         */
        public Integer getBlockMachineCount() {
            return this.blockMachineCount;
        }

        /**
         * @return machineCount
         */
        public Integer getMachineCount() {
            return this.machineCount;
        }

        /**
         * @return monitorMachineCount
         */
        public Integer getMonitorMachineCount() {
            return this.monitorMachineCount;
        }

        /**
         * @return openMachineCount
         */
        public Integer getOpenMachineCount() {
            return this.openMachineCount;
        }

        /**
         * @return studyingMachineCount
         */
        public Integer getStudyingMachineCount() {
            return this.studyingMachineCount;
        }

        public static final class Builder {
            private Integer blockMachineCount; 
            private Integer machineCount; 
            private Integer monitorMachineCount; 
            private Integer openMachineCount; 
            private Integer studyingMachineCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.blockMachineCount = model.blockMachineCount;
                this.machineCount = model.machineCount;
                this.monitorMachineCount = model.monitorMachineCount;
                this.openMachineCount = model.openMachineCount;
                this.studyingMachineCount = model.studyingMachineCount;
            } 

            /**
             * BlockMachineCount.
             */
            public Builder blockMachineCount(Integer blockMachineCount) {
                this.blockMachineCount = blockMachineCount;
                return this;
            }

            /**
             * MachineCount.
             */
            public Builder machineCount(Integer machineCount) {
                this.machineCount = machineCount;
                return this;
            }

            /**
             * MonitorMachineCount.
             */
            public Builder monitorMachineCount(Integer monitorMachineCount) {
                this.monitorMachineCount = monitorMachineCount;
                return this;
            }

            /**
             * OpenMachineCount.
             */
            public Builder openMachineCount(Integer openMachineCount) {
                this.openMachineCount = openMachineCount;
                return this;
            }

            /**
             * StudyingMachineCount.
             */
            public Builder studyingMachineCount(Integer studyingMachineCount) {
                this.studyingMachineCount = studyingMachineCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
