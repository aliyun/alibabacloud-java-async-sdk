// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link GetRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecordsResponseBody</p>
 */
public class GetRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRecordsResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
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
        private java.util.List<Records> records; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRecordsResponseBody model) {
            this.records = model.records;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Records.
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRecordsResponseBody build() {
            return new GetRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecordsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.Map<String, String> attributes;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<String> data;

        @com.aliyun.core.annotation.NameInMap("SystemTime")
        private Long systemTime;

        private Records(Builder builder) {
            this.attributes = builder.attributes;
            this.data = builder.data;
            this.systemTime = builder.systemTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        /**
         * @return data
         */
        public java.util.List<String> getData() {
            return this.data;
        }

        /**
         * @return systemTime
         */
        public Long getSystemTime() {
            return this.systemTime;
        }

        public static final class Builder {
            private java.util.Map<String, String> attributes; 
            private java.util.List<String> data; 
            private Long systemTime; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.attributes = model.attributes;
                this.data = model.data;
                this.systemTime = model.systemTime;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.Map<String, String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List<String> data) {
                this.data = data;
                return this;
            }

            /**
             * SystemTime.
             */
            public Builder systemTime(Long systemTime) {
                this.systemTime = systemTime;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
