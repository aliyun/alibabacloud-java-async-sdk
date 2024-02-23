// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReportResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReportResponseBody</p>
 */
public class CreateReportResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private CreateReportResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReportResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateReportResponseBody build() {
            return new CreateReportResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ReportId")
        private String reportId;

        private Data(Builder builder) {
            this.reportId = builder.reportId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        public static final class Builder {
            private String reportId; 

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
