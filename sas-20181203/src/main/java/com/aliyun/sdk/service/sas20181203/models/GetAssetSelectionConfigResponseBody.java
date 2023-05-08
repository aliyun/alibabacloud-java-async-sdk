// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetSelectionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetSelectionConfigResponseBody</p>
 */
public class GetAssetSelectionConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetAssetSelectionConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetSelectionConfigResponseBody create() {
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

        public GetAssetSelectionConfigResponseBody build() {
            return new GetAssetSelectionConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("SelectionKey")
        private String selectionKey;

        @NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
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
         * @return selectionKey
         */
        public String getSelectionKey() {
            return this.selectionKey;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String selectionKey; 
            private String targetType; 

            /**
             * SelectionKey.
             */
            public Builder selectionKey(String selectionKey) {
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
