// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserSourceLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>AddUserSourceLogConfigResponseBody</p>
 */
public class AddUserSourceLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
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
        @com.aliyun.core.annotation.NameInMap("DiplayLine")
        private String diplayLine;

        @com.aliyun.core.annotation.NameInMap("Displayed")
        private Boolean displayed;

        @com.aliyun.core.annotation.NameInMap("Imported")
        private Boolean imported;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private Long mainUserId;

        @com.aliyun.core.annotation.NameInMap("SourceLogCode")
        private String sourceLogCode;

        @com.aliyun.core.annotation.NameInMap("SourceProdCode")
        private String sourceProdCode;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        @com.aliyun.core.annotation.NameInMap("SubUserName")
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
             * The display details of the Logstore.
             */
            public Builder diplayLine(String diplayLine) {
                this.diplayLine = diplayLine;
                return this;
            }

            /**
             * Indicates whether the details of added logs are returned. Valid values: true false
             */
            public Builder displayed(Boolean displayed) {
                this.displayed = displayed;
                return this;
            }

            /**
             * Indicates whether the logs are added to the threat analysis feature. Valid values: true false
             */
            public Builder imported(Boolean imported) {
                this.imported = imported;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * The log code.
             */
            public Builder sourceLogCode(String sourceLogCode) {
                this.sourceLogCode = sourceLogCode;
                return this;
            }

            /**
             * The code of the cloud service.
             */
            public Builder sourceProdCode(String sourceProdCode) {
                this.sourceProdCode = sourceProdCode;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * The username of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.
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
