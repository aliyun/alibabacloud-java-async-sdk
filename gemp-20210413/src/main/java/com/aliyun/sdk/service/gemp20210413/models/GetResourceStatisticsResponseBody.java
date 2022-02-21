// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceStatisticsResponseBody</p>
 */
public class GetResourceStatisticsResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetResourceStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceStatisticsResponseBody create() {
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
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceStatisticsResponseBody build() {
            return new GetResourceStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("alertCount")
        private Integer alertCount;

        @NameInMap("incidentCount")
        private Integer incidentCount;

        @NameInMap("integrationCount")
        private Integer integrationCount;

        @NameInMap("problemCount")
        private Integer problemCount;

        private Data(Builder builder) {
            this.alertCount = builder.alertCount;
            this.incidentCount = builder.incidentCount;
            this.integrationCount = builder.integrationCount;
            this.problemCount = builder.problemCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertCount
         */
        public Integer getAlertCount() {
            return this.alertCount;
        }

        /**
         * @return incidentCount
         */
        public Integer getIncidentCount() {
            return this.incidentCount;
        }

        /**
         * @return integrationCount
         */
        public Integer getIntegrationCount() {
            return this.integrationCount;
        }

        /**
         * @return problemCount
         */
        public Integer getProblemCount() {
            return this.problemCount;
        }

        public static final class Builder {
            private Integer alertCount; 
            private Integer incidentCount; 
            private Integer integrationCount; 
            private Integer problemCount; 

            /**
             * 报警总数
             */
            public Builder alertCount(Integer alertCount) {
                this.alertCount = alertCount;
                return this;
            }

            /**
             * 事件总数
             */
            public Builder incidentCount(Integer incidentCount) {
                this.incidentCount = incidentCount;
                return this;
            }

            /**
             * 集成总数
             */
            public Builder integrationCount(Integer integrationCount) {
                this.integrationCount = integrationCount;
                return this;
            }

            /**
             * 故障总数
             */
            public Builder problemCount(Integer problemCount) {
                this.problemCount = problemCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
