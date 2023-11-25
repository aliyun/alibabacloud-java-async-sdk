// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetContainerDefenseRuleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetContainerDefenseRuleDetailResponseBody</p>
 */
public class GetContainerDefenseRuleDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

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
         * The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the rule.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetContainerDefenseRuleDetailResponseBody build() {
            return new GetContainerDefenseRuleDetailResponseBody(this);
        } 

    } 

    public static class Scope extends TeaModel {
        @NameInMap("AllNamespace")
        private Integer allNamespace;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Namespaces")
        private java.util.List < String > namespaces;

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
        public java.util.List < String > getNamespaces() {
            return this.namespaces;
        }

        public static final class Builder {
            private Integer allNamespace; 
            private String clusterId; 
            private java.util.List < String > namespaces; 

            /**
             * Indicates whether all namespaces are included. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * The ID of the container cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * An array that consists of queried namespaces.
             */
            public Builder namespaces(java.util.List < String > namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    public static class Whitelist extends TeaModel {
        @NameInMap("Hash")
        private java.util.List < String > hash;

        @NameInMap("Image")
        private java.util.List < String > image;

        @NameInMap("Path")
        private java.util.List < String > path;

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
        public java.util.List < String > getHash() {
            return this.hash;
        }

        /**
         * @return image
         */
        public java.util.List < String > getImage() {
            return this.image;
        }

        /**
         * @return path
         */
        public java.util.List < String > getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List < String > hash; 
            private java.util.List < String > image; 
            private java.util.List < String > path; 

            /**
             * The hash values of the files that are added to the whitelist.
             * <p>
             * 
             * >  This parameter is not supported.
             */
            public Builder hash(java.util.List < String > hash) {
                this.hash = hash;
                return this;
            }

            /**
             * An array consisting of images that are added to the whitelist.
             */
            public Builder image(java.util.List < String > image) {
                this.image = image;
                return this;
            }

            /**
             * The paths to the files that are added to the whitelist.
             */
            public Builder path(java.util.List < String > path) {
                this.path = path;
                return this;
            }

            public Whitelist build() {
                return new Whitelist(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("Description")
        private String description;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RuleAction")
        private Integer ruleAction;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleSwitch")
        private Integer ruleSwitch;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("Scope")
        private java.util.List < Scope> scope;

        @NameInMap("Whitelist")
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
        public java.util.List < Scope> getScope() {
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
            private java.util.List < Scope> scope; 
            private Whitelist whitelist; 

            /**
             * The user ID.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The alert name. Valid values:
             * <p>
             * 
             * *   **Non-image Program Startup**
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The alert type. Valid values:
             * <p>
             * 
             * *   **Proactive Defense for Containers**
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
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
             * The action specified in the rule. Valid values:
             * <p>
             * 
             * *   **1**: alert
             * *   **2**: block
             */
            public Builder ruleAction(Integer ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the rule. Valid values:
             * <p>
             * 
             * *   **1**: enabled
             * *   **0**: disabled
             */
            public Builder ruleSwitch(Integer ruleSwitch) {
                this.ruleSwitch = ruleSwitch;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **1**: system rule
             * *   **2**: custom rule
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The effective scope of the rule.
             */
            public Builder scope(java.util.List < Scope> scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The whitelist.
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
