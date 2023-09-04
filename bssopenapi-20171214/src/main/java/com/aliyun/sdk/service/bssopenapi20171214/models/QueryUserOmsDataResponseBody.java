// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserOmsDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserOmsDataResponseBody</p>
 */
public class QueryUserOmsDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryUserOmsDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserOmsDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUserOmsDataResponseBody build() {
            return new QueryUserOmsDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("HostId")
        private String hostId;

        @NameInMap("Marker")
        private String marker;

        @NameInMap("OmsData")
        private java.util.List < java.util.Map<String, ?>> omsData;

        private Data(Builder builder) {
            this.hostId = builder.hostId;
            this.marker = builder.marker;
            this.omsData = builder.omsData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return omsData
         */
        public java.util.List < java.util.Map<String, ?>> getOmsData() {
            return this.omsData;
        }

        public static final class Builder {
            private String hostId; 
            private String marker; 
            private java.util.List < java.util.Map<String, ?>> omsData; 

            /**
             * The ID of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * Indicates that the returned usage data starts from the next page. If no value is returned for this parameter or this parameter is not returned, no data can be queried.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * OmsData.
             */
            public Builder omsData(java.util.List < java.util.Map<String, ?>> omsData) {
                this.omsData = omsData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
