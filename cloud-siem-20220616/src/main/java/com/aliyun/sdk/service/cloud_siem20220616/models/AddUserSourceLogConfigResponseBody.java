// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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

        private Builder(AddUserSourceLogConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddUserSourceLogConfigResponseBody build() {
            return new AddUserSourceLogConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddUserSourceLogConfigResponseBody} extends {@link TeaModel}
     *
     * <p>AddUserSourceLogConfigResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.diplayLine = model.diplayLine;
                this.displayed = model.displayed;
                this.imported = model.imported;
                this.mainUserId = model.mainUserId;
                this.sourceLogCode = model.sourceLogCode;
                this.sourceProdCode = model.sourceProdCode;
                this.subUserId = model.subUserId;
                this.subUserName = model.subUserName;
            } 

            /**
             * <p>The display details of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai.siem-project.siem-logstore</p>
             */
            public Builder diplayLine(String diplayLine) {
                this.diplayLine = diplayLine;
                return this;
            }

            /**
             * <p>Indicates whether the details of added logs are returned. Valid values: true false</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder displayed(Boolean displayed) {
                this.displayed = displayed;
                return this;
            }

            /**
             * <p>Indicates whether the logs are added to the threat analysis feature. Valid values: true false</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder imported(Boolean imported) {
                this.imported = imported;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXXXXX</p>
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * <p>The log code.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_aegis_proc</p>
             */
            public Builder sourceLogCode(String sourceLogCode) {
                this.sourceLogCode = sourceLogCode;
                return this;
            }

            /**
             * <p>The code of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>sas</p>
             */
            public Builder sourceProdCode(String sourceProdCode) {
                this.sourceProdCode = sourceProdCode;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXXXX</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * <p>The username of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_account_xxx</p>
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
