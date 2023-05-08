// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAssetSelectionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAssetSelectionConfigResponseBody</p>
 */
public class CreateAssetSelectionConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAssetSelectionConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAssetSelectionConfigResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAssetSelectionConfigResponseBody build() {
            return new CreateAssetSelectionConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("SelectionKey")
        private Long selectionKey;

        @NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.businessType = builder.businessType;
            this.selectionKey = builder.selectionKey;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return selectionKey
         */
        public Long getSelectionKey() {
            return this.selectionKey;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String businessType; 
            private Long selectionKey; 
            private String targetType; 

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * SelectionKey.
             */
            public Builder selectionKey(Long selectionKey) {
                this.selectionKey = selectionKey;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
