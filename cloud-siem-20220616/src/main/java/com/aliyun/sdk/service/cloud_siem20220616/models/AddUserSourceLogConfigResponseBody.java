// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserSourceLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>AddUserSourceLogConfigResponseBody</p>
 */
public class AddUserSourceLogConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private AddUserSourceLogConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserSourceLogConfigResponseBody create() {
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

        public AddUserSourceLogConfigResponseBody build() {
            return new AddUserSourceLogConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DiplayLine")
        private String diplayLine;

        @NameInMap("Displayed")
        private Boolean displayed;

        @NameInMap("Imported")
        private Boolean imported;

        @NameInMap("MainUserId")
        private Long mainUserId;

        @NameInMap("SourceLogCode")
        private String sourceLogCode;

        @NameInMap("SourceProdCode")
        private String sourceProdCode;

        @NameInMap("SubUserId")
        private Long subUserId;

        @NameInMap("SubUserName")
        private String subUserName;

        private Data(Builder builder) {
            this.diplayLine = builder.diplayLine;
            this.displayed = builder.displayed;
            this.imported = builder.imported;
            this.mainUserId = builder.mainUserId;
            this.sourceLogCode = builder.sourceLogCode;
            this.sourceProdCode = builder.sourceProdCode;
            this.subUserId = builder.subUserId;
            this.subUserName = builder.subUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return diplayLine
         */
        public String getDiplayLine() {
            return this.diplayLine;
        }

        /**
         * @return displayed
         */
        public Boolean getDisplayed() {
            return this.displayed;
        }

        /**
         * @return imported
         */
        public Boolean getImported() {
            return this.imported;
        }

        /**
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return sourceLogCode
         */
        public String getSourceLogCode() {
            return this.sourceLogCode;
        }

        /**
         * @return sourceProdCode
         */
        public String getSourceProdCode() {
            return this.sourceProdCode;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return subUserName
         */
        public String getSubUserName() {
            return this.subUserName;
        }

        public static final class Builder {
            private String diplayLine; 
            private Boolean displayed; 
            private Boolean imported; 
            private Long mainUserId; 
            private String sourceLogCode; 
            private String sourceProdCode; 
            private Long subUserId; 
            private String subUserName; 

            /**
             * DiplayLine.
             */
            public Builder diplayLine(String diplayLine) {
                this.diplayLine = diplayLine;
                return this;
            }

            /**
             * Displayed.
             */
            public Builder displayed(Boolean displayed) {
                this.displayed = displayed;
                return this;
            }

            /**
             * Imported.
             */
            public Builder imported(Boolean imported) {
                this.imported = imported;
                return this;
            }

            /**
             * MainUserId.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * SourceLogCode.
             */
            public Builder sourceLogCode(String sourceLogCode) {
                this.sourceLogCode = sourceLogCode;
                return this;
            }

            /**
             * SourceProdCode.
             */
            public Builder sourceProdCode(String sourceProdCode) {
                this.sourceProdCode = sourceProdCode;
                return this;
            }

            /**
             * SubUserId.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * SubUserName.
             */
            public Builder subUserName(String subUserName) {
                this.subUserName = subUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
