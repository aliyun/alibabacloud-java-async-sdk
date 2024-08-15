// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceStatisticsResponseBody</p>
 */
public class GetResourceStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
        @com.aliyun.core.annotation.NameInMap("alertCount")
        private Integer alertCount;

        @com.aliyun.core.annotation.NameInMap("incidentCount")
        private Integer incidentCount;

        @com.aliyun.core.annotation.NameInMap("integrationCount")
        private Integer integrationCount;

        @com.aliyun.core.annotation.NameInMap("problemCount")
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
             * alertCount.
             */
            public Builder alertCount(Integer alertCount) {
                this.alertCount = alertCount;
                return this;
            }

            /**
             * incidentCount.
             */
            public Builder incidentCount(Integer incidentCount) {
                this.incidentCount = incidentCount;
                return this;
            }

            /**
             * integrationCount.
             */
            public Builder integrationCount(Integer integrationCount) {
                this.integrationCount = integrationCount;
                return this;
            }

            /**
             * problemCount.
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
