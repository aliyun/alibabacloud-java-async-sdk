// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCheckSessionRequest} extends {@link RequestModel}
 *
 * <p>BatchCheckSessionRequest</p>
 */
public class BatchCheckSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Records")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Records> records;

    private BatchCheckSessionRequest(Builder builder) {
        super(builder);
        this.records = builder.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCheckSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    public static final class Builder extends Request.Builder<BatchCheckSessionRequest, Builder> {
        private java.util.List < Records> records; 

        private Builder() {
            super();
        } 

        private Builder(BatchCheckSessionRequest request) {
            super(request);
            this.records = request.records;
        } 

        /**
         * Records.
         */
        public Builder records(java.util.List < Records> records) {
            String recordsShrink = shrink(records, "Records", "json");
            this.putQueryParameter("Records", recordsShrink);
            this.records = records;
            return this;
        }

        @Override
        public BatchCheckSessionRequest build() {
            return new BatchCheckSessionRequest(this);
        } 

    } 

    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomSessionId")
        private String customSessionId;

        @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
        private String platformSessionId;

        @com.aliyun.core.annotation.NameInMap("ReferenceInfo")
        private java.util.Map < String, ? > referenceInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Records(Builder builder) {
            this.customSessionId = builder.customSessionId;
            this.platformSessionId = builder.platformSessionId;
            this.referenceInfo = builder.referenceInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return customSessionId
         */
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        /**
         * @return platformSessionId
         */
        public String getPlatformSessionId() {
            return this.platformSessionId;
        }

        /**
         * @return referenceInfo
         */
        public java.util.Map < String, ? > getReferenceInfo() {
            return this.referenceInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String customSessionId; 
            private String platformSessionId; 
            private java.util.Map < String, ? > referenceInfo; 
            private String type; 

            /**
             * CustomSessionId.
             */
            public Builder customSessionId(String customSessionId) {
                this.customSessionId = customSessionId;
                return this;
            }

            /**
             * PlatformSessionId.
             */
            public Builder platformSessionId(String platformSessionId) {
                this.platformSessionId = platformSessionId;
                return this;
            }

            /**
             * ReferenceInfo.
             */
            public Builder referenceInfo(java.util.Map < String, ? > referenceInfo) {
                this.referenceInfo = referenceInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
