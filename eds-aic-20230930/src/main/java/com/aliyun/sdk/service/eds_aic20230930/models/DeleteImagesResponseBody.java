// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteImagesResponseBody</p>
 */
public class DeleteImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteImagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImagesResponseBody create() {
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

        public DeleteImagesResponseBody build() {
            return new DeleteImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteImagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailDeleteImageIds")
        private java.util.List < String > failDeleteImageIds;

        @com.aliyun.core.annotation.NameInMap("SuccessDeleteImageIds")
        private java.util.List < String > successDeleteImageIds;

        private Data(Builder builder) {
            this.failDeleteImageIds = builder.failDeleteImageIds;
            this.successDeleteImageIds = builder.successDeleteImageIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failDeleteImageIds
         */
        public java.util.List < String > getFailDeleteImageIds() {
            return this.failDeleteImageIds;
        }

        /**
         * @return successDeleteImageIds
         */
        public java.util.List < String > getSuccessDeleteImageIds() {
            return this.successDeleteImageIds;
        }

        public static final class Builder {
            private java.util.List < String > failDeleteImageIds; 
            private java.util.List < String > successDeleteImageIds; 

            /**
             * FailDeleteImageIds.
             */
            public Builder failDeleteImageIds(java.util.List < String > failDeleteImageIds) {
                this.failDeleteImageIds = failDeleteImageIds;
                return this;
            }

            /**
             * SuccessDeleteImageIds.
             */
            public Builder successDeleteImageIds(java.util.List < String > successDeleteImageIds) {
                this.successDeleteImageIds = successDeleteImageIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
