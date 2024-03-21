// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDuplicateClassificationResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDuplicateClassificationResponseBody</p>
 */
public class CheckDuplicateClassificationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CheckDuplicateClassificationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDuplicateClassificationResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDuplicateClassificationResponseBody build() {
            return new CheckDuplicateClassificationResponseBody(this);
        } 

    } 

    public static class DuplicateSecondaryClassification extends TeaModel {
        @NameInMap("SecondaryClassification")
        private java.util.List < String > secondaryClassification;

        private DuplicateSecondaryClassification(Builder builder) {
            this.secondaryClassification = builder.secondaryClassification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DuplicateSecondaryClassification create() {
            return builder().build();
        }

        /**
         * @return secondaryClassification
         */
        public java.util.List < String > getSecondaryClassification() {
            return this.secondaryClassification;
        }

        public static final class Builder {
            private java.util.List < String > secondaryClassification; 

            /**
             * SecondaryClassification.
             */
            public Builder secondaryClassification(java.util.List < String > secondaryClassification) {
                this.secondaryClassification = secondaryClassification;
                return this;
            }

            public DuplicateSecondaryClassification build() {
                return new DuplicateSecondaryClassification(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DuplicateSecondaryClassification")
        private DuplicateSecondaryClassification duplicateSecondaryClassification;

        @NameInMap("TrademarkName")
        private String trademarkName;

        private Data(Builder builder) {
            this.duplicateSecondaryClassification = builder.duplicateSecondaryClassification;
            this.trademarkName = builder.trademarkName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return duplicateSecondaryClassification
         */
        public DuplicateSecondaryClassification getDuplicateSecondaryClassification() {
            return this.duplicateSecondaryClassification;
        }

        /**
         * @return trademarkName
         */
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public static final class Builder {
            private DuplicateSecondaryClassification duplicateSecondaryClassification; 
            private String trademarkName; 

            /**
             * DuplicateSecondaryClassification.
             */
            public Builder duplicateSecondaryClassification(DuplicateSecondaryClassification duplicateSecondaryClassification) {
                this.duplicateSecondaryClassification = duplicateSecondaryClassification;
                return this;
            }

            /**
             * TrademarkName.
             */
            public Builder trademarkName(String trademarkName) {
                this.trademarkName = trademarkName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
