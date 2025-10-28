// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>ListSwimmingLaneResponseBody</p>
 */
public class ListSwimmingLaneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSwimmingLaneResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSwimmingLaneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSwimmingLaneResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C2CDBBF9-9C9A-5AA1-9F39-094ADEB3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSwimmingLaneResponseBody build() {
            return new ListSwimmingLaneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneResponseBody</p>
     */
    public static class SwimmingLaneAppRelationShipList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("LaneId")
        private Long laneId;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private String rules;

        private SwimmingLaneAppRelationShipList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.extra = builder.extra;
            this.laneId = builder.laneId;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwimmingLaneAppRelationShipList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return laneId
         */
        public Long getLaneId() {
            return this.laneId;
        }

        /**
         * @return rules
         */
        public String getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String extra; 
            private Long laneId; 
            private String rules; 

            private Builder() {
            } 

            private Builder(SwimmingLaneAppRelationShipList model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.extra = model.extra;
                this.laneId = model.laneId;
                this.rules = model.rules;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3b615783-01f1-4569-baa3-cb71bdb6****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-app-58846</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>Additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>edas-canary</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The ID of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>348</p>
             */
            public Builder laneId(Long laneId) {
                this.laneId = laneId;
                return this;
            }

            /**
             * <p>The association rule.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder rules(String rules) {
                this.rules = rules;
                return this;
            }

            public SwimmingLaneAppRelationShipList build() {
                return new SwimmingLaneAppRelationShipList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableRules")
        private Boolean enableRules;

        @com.aliyun.core.annotation.NameInMap("EntryRule")
        private String entryRule;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("ScenarioSign")
        private String scenarioSign;

        @com.aliyun.core.annotation.NameInMap("SwimmingLaneAppRelationShipList")
        private java.util.List<SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Data(Builder builder) {
            this.enableRules = builder.enableRules;
            this.entryRule = builder.entryRule;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.scenarioSign = builder.scenarioSign;
            this.swimmingLaneAppRelationShipList = builder.swimmingLaneAppRelationShipList;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableRules
         */
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        /**
         * @return entryRule
         */
        public String getEntryRule() {
            return this.entryRule;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return scenarioSign
         */
        public String getScenarioSign() {
            return this.scenarioSign;
        }

        /**
         * @return swimmingLaneAppRelationShipList
         */
        public java.util.List<SwimmingLaneAppRelationShipList> getSwimmingLaneAppRelationShipList() {
            return this.swimmingLaneAppRelationShipList;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Boolean enableRules; 
            private String entryRule; 
            private Long groupId; 
            private Long id; 
            private String name; 
            private String namespaceId; 
            private String scenarioSign; 
            private java.util.List<SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enableRules = model.enableRules;
                this.entryRule = model.entryRule;
                this.groupId = model.groupId;
                this.id = model.id;
                this.name = model.name;
                this.namespaceId = model.namespaceId;
                this.scenarioSign = model.scenarioSign;
                this.swimmingLaneAppRelationShipList = model.swimmingLaneAppRelationShipList;
                this.tag = model.tag;
            } 

            /**
             * <p>Indicates whether the throttling rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableRules(Boolean enableRules) {
                this.enableRules = enableRules;
                return this;
            }

            /**
             * <p>The conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;condition&quot;:&quot;AND&quot;,&quot;enable&quot;:true,&quot;path&quot;:&quot;/&quot;,&quot;priority&quot;:1,&quot;restItems&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;datum&quot;:&quot;value&quot;,&quot;name&quot;:&quot;tags&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;header&quot;,&quot;value&quot;:&quot;value&quot;}]}]</p>
             */
            public Builder entryRule(String entryRule) {
                this.entryRule = entryRule;
                return this;
            }

            /**
             * <p>The ID of the lane group.</p>
             * 
             * <strong>example:</strong>
             * <p>156</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>348</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the microservices namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou:pre2</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The expected tag.</p>
             * 
             * <strong>example:</strong>
             * <p>d0ad1052</p>
             */
            public Builder scenarioSign(String scenarioSign) {
                this.scenarioSign = scenarioSign;
                return this;
            }

            /**
             * <p>The applications that are related to the lane.</p>
             */
            public Builder swimmingLaneAppRelationShipList(java.util.List<SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList) {
                this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
                return this;
            }

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>2cb6b8a</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
