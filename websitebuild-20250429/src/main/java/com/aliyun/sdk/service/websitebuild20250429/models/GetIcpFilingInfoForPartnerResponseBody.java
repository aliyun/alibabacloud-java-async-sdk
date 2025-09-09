// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetIcpFilingInfoForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetIcpFilingInfoForPartnerResponseBody</p>
 */
public class GetIcpFilingInfoForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIcpFilingInfoForPartnerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIcpFilingInfoForPartnerResponseBody create() {
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

        private Builder(GetIcpFilingInfoForPartnerResponseBody model) {
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
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIcpFilingInfoForPartnerResponseBody build() {
            return new GetIcpFilingInfoForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIcpFilingInfoForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetIcpFilingInfoForPartnerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IcpNumber")
        private String icpNumber;

        @com.aliyun.core.annotation.NameInMap("Recorded")
        private Boolean recorded;

        @com.aliyun.core.annotation.NameInMap("SiteRecordNumber")
        private String siteRecordNumber;

        private Data(Builder builder) {
            this.icpNumber = builder.icpNumber;
            this.recorded = builder.recorded;
            this.siteRecordNumber = builder.siteRecordNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return icpNumber
         */
        public String getIcpNumber() {
            return this.icpNumber;
        }

        /**
         * @return recorded
         */
        public Boolean getRecorded() {
            return this.recorded;
        }

        /**
         * @return siteRecordNumber
         */
        public String getSiteRecordNumber() {
            return this.siteRecordNumber;
        }

        public static final class Builder {
            private String icpNumber; 
            private Boolean recorded; 
            private String siteRecordNumber; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.icpNumber = model.icpNumber;
                this.recorded = model.recorded;
                this.siteRecordNumber = model.siteRecordNumber;
            } 

            /**
             * IcpNumber.
             */
            public Builder icpNumber(String icpNumber) {
                this.icpNumber = icpNumber;
                return this;
            }

            /**
             * Recorded.
             */
            public Builder recorded(Boolean recorded) {
                this.recorded = recorded;
                return this;
            }

            /**
             * SiteRecordNumber.
             */
            public Builder siteRecordNumber(String siteRecordNumber) {
                this.siteRecordNumber = siteRecordNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
