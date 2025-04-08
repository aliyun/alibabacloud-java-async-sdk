// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetCuHoursResponseBody} extends {@link TeaModel}
 *
 * <p>GetCuHoursResponseBody</p>
 */
public class GetCuHoursResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetCuHoursResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCuHoursResponseBody create() {
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

        private Builder(GetCuHoursResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;cuHours&quot;: &quot;{2025-01-09 00:00:00=2.033333, 2025-01-09 01:00:00=2.033333, 2025-01-09 02:00:00=2.033333, 2025-01-09 03:00:00=2.033333, 2025-01-09 04:00:00=2.033333, 2025-01-09 05:00:00=2.033333, 2025-01-09 06:00:00=2.033333, 2025-01-09 07:00:00=2.033333, 2025-01-09 08:00:00=2.033333, 2025-01-09 09:00:00=1.933333, 2025-01-09 10:00:00=2.133333, 2025-01-09 11:00:00=3.100000, 2025-01-09 12:00:00=2.900000}&quot;
         * }</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCuHoursResponseBody build() {
            return new GetCuHoursResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCuHoursResponseBody} extends {@link TeaModel}
     *
     * <p>GetCuHoursResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuHours")
        private String cuHours;

        private Data(Builder builder) {
            this.cuHours = builder.cuHours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cuHours
         */
        public String getCuHours() {
            return this.cuHours;
        }

        public static final class Builder {
            private String cuHours; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cuHours = model.cuHours;
            } 

            /**
             * <p>The number of CU-hours consumed by a queue during a specified cycle. The value is an estimated value. Refer to your Alibaba Cloud bill for the actual number of consumed CU-hours.</p>
             * 
             * <strong>example:</strong>
             * <p>{2025-01-09 00:00:00=2.033333, 2025-01-09 01:00:00=2.033333, 2025-01-09 02:00:00=2.033333, 2025-01-09 03:00:00=2.033333, 2025-01-09 04:00:00=2.033333, 2025-01-09 05:00:00=2.033333, 2025-01-09 06:00:00=2.033333, 2025-01-09 07:00:00=2.033333, 2025-01-09 08:00:00=2.033333, 2025-01-09 09:00:00=1.933333, 2025-01-09 10:00:00=2.133333, 2025-01-09 11:00:00=3.100000, 2025-01-09 12:00:00=2.900000}</p>
             */
            public Builder cuHours(String cuHours) {
                this.cuHours = cuHours;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
