// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlarmMachineCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlarmMachineCountResponseBody</p>
 */
public class GetAlarmMachineCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAlarmMachineCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlarmMachineCountResponseBody create() {
        return builder().build();
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

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAlarmMachineCountResponseBody build() {
            return new GetAlarmMachineCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MachineCount")
        private Integer machineCount;

        private Data(Builder builder) {
            this.machineCount = builder.machineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return machineCount
         */
        public Integer getMachineCount() {
            return this.machineCount;
        }

        public static final class Builder {
            private Integer machineCount; 

            /**
             * The number of servers on which alerts are generated.
             */
            public Builder machineCount(Integer machineCount) {
                this.machineCount = machineCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
