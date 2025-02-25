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
 * {@link GetClusterCheckItemWarningStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterCheckItemWarningStatisticsResponseBody</p>
 */
public class GetClusterCheckItemWarningStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClusterCheckItemWarningStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterCheckItemWarningStatisticsResponseBody create() {
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
         * <p>The statistics on risk items by risk level.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C2B285A3-3493-5C5F-A224-4CCE4BFC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterCheckItemWarningStatisticsResponseBody build() {
            return new GetClusterCheckItemWarningStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterCheckItemWarningStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterCheckItemWarningStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @com.aliyun.core.annotation.NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @com.aliyun.core.annotation.NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        private Data(Builder builder) {
            this.highWarningCount = builder.highWarningCount;
            this.lowWarningCount = builder.lowWarningCount;
            this.mediumWarningCount = builder.mediumWarningCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return highWarningCount
         */
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        /**
         * @return lowWarningCount
         */
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        /**
         * @return mediumWarningCount
         */
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        public static final class Builder {
            private Integer highWarningCount; 
            private Integer lowWarningCount; 
            private Integer mediumWarningCount; 

            /**
             * <p>The number of high-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * <p>The number of low-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * <p>The number of medium-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
