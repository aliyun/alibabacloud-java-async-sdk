// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddImageEventOperationResponseBody} extends {@link TeaModel}
 *
 * <p>AddImageEventOperationResponseBody</p>
 */
public class AddImageEventOperationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddImageEventOperationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageEventOperationResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddImageEventOperationResponseBody build() {
            return new AddImageEventOperationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddImageEventOperationResponseBody} extends {@link TeaModel}
     *
     * <p>AddImageEventOperationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private String conditions;

        @com.aliyun.core.annotation.NameInMap("EventKey")
        private String eventKey;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OperationCode")
        private String operationCode;

        @com.aliyun.core.annotation.NameInMap("Scenarios")
        private String scenarios;

        private Data(Builder builder) {
            this.conditions = builder.conditions;
            this.eventKey = builder.eventKey;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.id = builder.id;
            this.operationCode = builder.operationCode;
            this.scenarios = builder.scenarios;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public String getConditions() {
            return this.conditions;
        }

        /**
         * @return eventKey
         */
        public String getEventKey() {
            return this.eventKey;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return operationCode
         */
        public String getOperationCode() {
            return this.operationCode;
        }

        /**
         * @return scenarios
         */
        public String getScenarios() {
            return this.scenarios;
        }

        public static final class Builder {
            private String conditions; 
            private String eventKey; 
            private String eventName; 
            private String eventType; 
            private Long id; 
            private String operationCode; 
            private String scenarios; 

            /**
             * <p>The rule conditions. The value is in the JSON format. Valid values of keys:</p>
             * <ul>
             * <li><strong>condition</strong>: the matching condition.</li>
             * <li><strong>type</strong>: the matching type.</li>
             * <li><strong>value</strong>: the matching value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;condition&quot;: &quot;MD5&quot;, &quot;type&quot;: &quot;equals&quot;, &quot;value&quot;: &quot;0083a31cc0083a31ccf7c10367a6e783e&quot;}]</p>
             */
            public Builder conditions(String conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The keyword of the alert item.</p>
             * 
             * <strong>example:</strong>
             * <p>PEM</p>
             */
            public Builder eventKey(String eventKey) {
                this.eventKey = eventKey;
                return this;
            }

            /**
             * <p>The name of the alert item.</p>
             * 
             * <strong>example:</strong>
             * <p>PEM</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The alert type.</p>
             * <ul>
             * <li>Only <strong>sensitiveFile</strong> may be returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sensitiveFile</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The primary key of the alert handling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>443496</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The operation code.</p>
             * <ul>
             * <li>Only <strong>whitelist</strong> may be returned, which indicates that the alert item is added to the whitelist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>whitelist</p>
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * <p>The application scope of the rule. The value is in the JSON format. Valid values of keys:</p>
             * <ul>
             * <li><strong>type</strong></li>
             * <li><strong>value</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;: &quot;repo&quot;, &quot;value&quot;: &quot;test-aaa/shenzhen-repo-01&quot;}</p>
             */
            public Builder scenarios(String scenarios) {
                this.scenarios = scenarios;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
