// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateMmsFetchMetadataJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMmsFetchMetadataJobResponseBody</p>
 */
public class CreateMmsFetchMetadataJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateMmsFetchMetadataJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMmsFetchMetadataJobResponseBody create() {
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

        private Builder(CreateMmsFetchMetadataJobResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMmsFetchMetadataJobResponseBody build() {
            return new CreateMmsFetchMetadataJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMmsFetchMetadataJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMmsFetchMetadataJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scanId")
        private Long scanId;

        private Data(Builder builder) {
            this.scanId = builder.scanId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scanId
         */
        public Long getScanId() {
            return this.scanId;
        }

        public static final class Builder {
            private Long scanId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.scanId = model.scanId;
            } 

            /**
             * scanId.
             */
            public Builder scanId(Long scanId) {
                this.scanId = scanId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
