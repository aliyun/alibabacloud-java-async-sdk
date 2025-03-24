// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link AddMockRuleResponseBody} extends {@link TeaModel}
 *
 * <p>AddMockRuleResponseBody</p>
 */
public class AddMockRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddMockRuleResponseBody build() {
            return new AddMockRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddMockRuleResponseBody} extends {@link TeaModel}
     *
     * <p>AddMockRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("ConsumerAppId")
        private String consumerAppId;

        @com.aliyun.core.annotation.NameInMap("ConsumerAppName")
        private String consumerAppName;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("ExtraJson")
        private String extraJson;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MockType")
        private Long mockType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("ProviderAppId")
        private String providerAppId;

        @com.aliyun.core.annotation.NameInMap("ProviderAppName")
        private String providerAppName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ScMockItemJson")
        private String scMockItemJson;

        @com.aliyun.core.annotation.NameInMap("Source")
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
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>178432728867xxxx</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the consumer application.</p>
             * 
             * <strong>example:</strong>
             * <p>hkhon1po62@a000601b265xxxx</p>
             */
            public Builder consumerAppId(String consumerAppId) {
                this.consumerAppId = consumerAppId;
                return this;
            }

            /**
             * <p>The name of the consumer application.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-xxxx</p>
             */
            public Builder consumerAppName(String consumerAppName) {
                this.consumerAppName = consumerAppName;
                return this;
            }

            /**
             * <p>Indicates whether the mock rule is enabled.</p>
             * <ul>
             * <li><code>true</code>: enabled</li>
             * <li><code>false</code>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder extraJson(String extraJson) {
                this.extraJson = extraJson;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>275</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The mock type. Valid values:</p>
             * <ul>
             * <li>- <code>[unk]0[unk]</code>: desktop client</li>
             * <li>- <code>[unk]1[unk]</code>: mobile client</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mockType(Long mockType) {
                this.mockType = mockType;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-bc1a29b0-160230875****-reg-center-0-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The ID of the service provider application.</p>
             * 
             * <strong>example:</strong>
             * <p>hkhon1po62@a000601b265xxxx</p>
             */
            public Builder providerAppId(String providerAppId) {
                this.providerAppId = providerAppId;
                return this;
            }

            /**
             * <p>The name of the service provider application.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-xxxx</p>
             */
            public Builder providerAppName(String providerAppName) {
                this.providerAppName = providerAppName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The HTTP mock rule.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;oper&quot;:&quot;return+json&quot;,&quot;Path&quot;:&quot;/mock&quot;,&quot;Value&quot;:&quot;{\n &quot;date&quot;: &quot;2021-09-10T07:45:12.357+0000&quot;,\n &quot;name&quot;: &quot;name&quot;,\n &quot;id&quot;: &quot;1&quot;\n}&quot;,&quot;Method&quot;:&quot;GET&quot;,&quot;Condition&quot;:&quot;AND&quot;,&quot;Timeout&quot;:1,&quot;ArgumentMockItems&quot;:[{&quot;type&quot;:&quot;param&quot;,&quot;name&quot;:&quot;id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;cond&quot;:&quot;==&quot;,&quot;operator&quot;:&quot;rawvalue&quot;},{&quot;type&quot;:&quot;param&quot;,&quot;name&quot;:&quot;name&quot;,&quot;value&quot;:&quot;aliyun&quot;,&quot;cond&quot;:&quot;==&quot;,&quot;operator&quot;:&quot;rawvalue&quot;}]}]</p>
             */
            public Builder scMockItemJson(String scMockItemJson) {
                this.scMockItemJson = scMockItemJson;
                return this;
            }

            /**
             * <p>The service source.</p>
             * 
             * <strong>example:</strong>
             * <p>edasmsc</p>
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
