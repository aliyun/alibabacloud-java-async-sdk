// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMockRuleResponseBody} extends {@link TeaModel}
 *
 * <p>AddMockRuleResponseBody</p>
 */
public class AddMockRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private AddMockRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMockRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddMockRuleResponseBody build() {
            return new AddMockRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("ConsumerAppId")
        private String consumerAppId;

        @NameInMap("ConsumerAppName")
        private String consumerAppName;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("ExtraJson")
        private String extraJson;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MockType")
        private Long mockType;

        @NameInMap("Name")
        private String name;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("ProviderAppId")
        private String providerAppId;

        @NameInMap("ProviderAppName")
        private String providerAppName;

        @NameInMap("Region")
        private String region;

        @NameInMap("ScMockItemJson")
        private String scMockItemJson;

        @NameInMap("Source")
        private String source;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.consumerAppId = builder.consumerAppId;
            this.consumerAppName = builder.consumerAppName;
            this.enable = builder.enable;
            this.extraJson = builder.extraJson;
            this.id = builder.id;
            this.mockType = builder.mockType;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.providerAppId = builder.providerAppId;
            this.providerAppName = builder.providerAppName;
            this.region = builder.region;
            this.scMockItemJson = builder.scMockItemJson;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return consumerAppId
         */
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        /**
         * @return consumerAppName
         */
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return extraJson
         */
        public String getExtraJson() {
            return this.extraJson;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mockType
         */
        public Long getMockType() {
            return this.mockType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return providerAppId
         */
        public String getProviderAppId() {
            return this.providerAppId;
        }

        /**
         * @return providerAppName
         */
        public String getProviderAppName() {
            return this.providerAppName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return scMockItemJson
         */
        public String getScMockItemJson() {
            return this.scMockItemJson;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String accountId; 
            private String consumerAppId; 
            private String consumerAppName; 
            private Boolean enable; 
            private String extraJson; 
            private Long id; 
            private Long mockType; 
            private String name; 
            private String namespaceId; 
            private String providerAppId; 
            private String providerAppName; 
            private String region; 
            private String scMockItemJson; 
            private String source; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the consumer application.
             */
            public Builder consumerAppId(String consumerAppId) {
                this.consumerAppId = consumerAppId;
                return this;
            }

            /**
             * The name of the consumer application.
             */
            public Builder consumerAppName(String consumerAppName) {
                this.consumerAppName = consumerAppName;
                return this;
            }

            /**
             * Indicates whether the mock rule is enabled.
             * <p>
             * 
             * *   `true`: enabled
             * *   `false`: disabled
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The description.
             */
            public Builder extraJson(String extraJson) {
                this.extraJson = extraJson;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The mock type. Valid values:
             * <p>
             * 
             * *   \- `[unk]0[unk]`: desktop client
             * *   \- `[unk]1[unk]`: mobile client
             */
            public Builder mockType(Long mockType) {
                this.mockType = mockType;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The ID of the service provider application.
             */
            public Builder providerAppId(String providerAppId) {
                this.providerAppId = providerAppId;
                return this;
            }

            /**
             * The name of the service provider application.
             */
            public Builder providerAppName(String providerAppName) {
                this.providerAppName = providerAppName;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The HTTP mock rule.
             */
            public Builder scMockItemJson(String scMockItemJson) {
                this.scMockItemJson = scMockItemJson;
                return this;
            }

            /**
             * The service source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
