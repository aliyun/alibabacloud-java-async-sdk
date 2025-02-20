// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetContainerDefenseRuleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetContainerDefenseRuleDetailResponseBody</p>
 */
public class GetContainerDefenseRuleDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

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

    private GetContainerDefenseRuleDetailResponseBody(Builder builder) {
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

    public static GetContainerDefenseRuleDetailResponseBody create() {
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the rule.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * <p>77546BF4-CCE8-5F8D-B42B-5FD3306B43B4</p>
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

        public GetContainerDefenseRuleDetailResponseBody build() {
            return new GetContainerDefenseRuleDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContainerDefenseRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetContainerDefenseRuleDetailResponseBody</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllNamespace")
        private Integer allNamespace;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List<String> namespaces;

        private Scope(Builder builder) {
            this.allNamespace = builder.allNamespace;
            this.clusterId = builder.clusterId;
            this.namespaces = builder.namespaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return allNamespace
         */
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return namespaces
         */
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public static final class Builder {
            private Integer allNamespace; 
            private String clusterId; 
            private java.util.List<String> namespaces; 

            /**
             * <p>Indicates whether all namespaces are included. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * <p>The ID of the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c9bea04<em>2b25</em>*</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>An array that consists of queried namespaces.</p>
             */
            public Builder namespaces(java.util.List<String> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContainerDefenseRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetContainerDefenseRuleDetailResponseBody</p>
     */
    public static class Whitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hash")
        @Deprecated
        private java.util.List<String> hash;

        @com.aliyun.core.annotation.NameInMap("Image")
        private java.util.List<String> image;

        @com.aliyun.core.annotation.NameInMap("Path")
        private java.util.List<String> path;

        private Whitelist(Builder builder) {
            this.hash = builder.hash;
            this.image = builder.image;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whitelist create() {
            return builder().build();
        }

        /**
         * @return hash
         */
        public java.util.List<String> getHash() {
            return this.hash;
        }

        /**
         * @return image
         */
        public java.util.List<String> getImage() {
            return this.image;
        }

        /**
         * @return path
         */
        public java.util.List<String> getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List<String> hash; 
            private java.util.List<String> image; 
            private java.util.List<String> path; 

            /**
             * <p>The hash values of the files that are added to the whitelist.</p>
             * <blockquote>
             * <p> This parameter is not supported.</p>
             * </blockquote>
             */
            public Builder hash(java.util.List<String> hash) {
                this.hash = hash;
                return this;
            }

            /**
             * <p>An array consisting of images that are added to the whitelist.</p>
             */
            public Builder image(java.util.List<String> image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The paths to the files that are added to the whitelist.</p>
             */
            public Builder path(java.util.List<String> path) {
                this.path = path;
                return this;
            }

            public Whitelist build() {
                return new Whitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContainerDefenseRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetContainerDefenseRuleDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private Integer ruleAction;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleSwitch")
        private Integer ruleSwitch;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private java.util.List<Scope> scope;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private Whitelist whitelist;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.description = builder.description;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.id = builder.id;
            this.ruleAction = builder.ruleAction;
            this.ruleName = builder.ruleName;
            this.ruleSwitch = builder.ruleSwitch;
            this.ruleType = builder.ruleType;
            this.scope = builder.scope;
            this.whitelist = builder.whitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return ruleAction
         */
        public Integer getRuleAction() {
            return this.ruleAction;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleSwitch
         */
        public Integer getRuleSwitch() {
            return this.ruleSwitch;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return scope
         */
        public java.util.List<Scope> getScope() {
            return this.scope;
        }

        /**
         * @return whitelist
         */
        public Whitelist getWhitelist() {
            return this.whitelist;
        }

        public static final class Builder {
            private Long aliUid; 
            private String description; 
            private String eventName; 
            private String eventType; 
            private Long id; 
            private Integer ruleAction; 
            private String ruleName; 
            private Integer ruleSwitch; 
            private String ruleType; 
            private java.util.List<Scope> scope; 
            private Whitelist whitelist; 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1766185894104***</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom defense configuration</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The alert name. Valid values:</p>
             * <ul>
             * <li><strong>Non-image Program Startup</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EventName</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The alert type. Valid values:</p>
             * <ul>
             * <li><strong>Proactive Defense for Containers</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EventType</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1948</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The action specified in the rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: alert</li>
             * <li><strong>2</strong>: block</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleAction(Integer ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-000</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>0</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ruleSwitch(Integer ruleSwitch) {
                this.ruleSwitch = ruleSwitch;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: system rule</li>
             * <li><strong>2</strong>: custom rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The effective scope of the rule.</p>
             */
            public Builder scope(java.util.List<Scope> scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The whitelist.</p>
             */
            public Builder whitelist(Whitelist whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
