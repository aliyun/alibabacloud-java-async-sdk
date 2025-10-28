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
 * {@link InsertSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>InsertSwimmingLaneResponseBody</p>
 */
public class InsertSwimmingLaneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InsertSwimmingLaneResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertSwimmingLaneResponseBody create() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InsertSwimmingLaneResponseBody model) {
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
        public Builder data(Data data) {
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
         * <p>75972A87-5682-5277-ADA7-DA2A01BE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertSwimmingLaneResponseBody build() {
            return new InsertSwimmingLaneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsertSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>InsertSwimmingLaneResponseBody</p>
     */
    public static class SwimmingLaneAppRelationShipList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("LaneId")
        private Long laneId;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private String rules;

        private SwimmingLaneAppRelationShipList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
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
            private Long laneId; 
            private String rules; 

            private Builder() {
            } 

            private Builder(SwimmingLaneAppRelationShipList model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.laneId = model.laneId;
                this.rules = model.rules;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>bd170895-096c-4944-9007-d4582c77****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder laneId(Long laneId) {
                this.laneId = laneId;
                return this;
            }

            /**
             * <p>The association rule.</p>
             * 
             * <strong>example:</strong>
             * <p>dubbo</p>
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
     * {@link InsertSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>InsertSwimmingLaneResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInfos")
        private String appInfos;

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

        @com.aliyun.core.annotation.NameInMap("SwimmingLaneAppRelationShipList")
        private java.util.List<SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Data(Builder builder) {
            this.appInfos = builder.appInfos;
            this.entryRule = builder.entryRule;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
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
         * @return appInfos
         */
        public String getAppInfos() {
            return this.appInfos;
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
            private String appInfos; 
            private String entryRule; 
            private Long groupId; 
            private Long id; 
            private String name; 
            private String namespaceId; 
            private java.util.List<SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appInfos = model.appInfos;
                this.entryRule = model.entryRule;
                this.groupId = model.groupId;
                this.id = model.id;
                this.name = model.name;
                this.namespaceId = model.namespaceId;
                this.swimmingLaneAppRelationShipList = model.swimmingLaneAppRelationShipList;
                this.tag = model.tag;
            } 

            /**
             * <p>The applications that are associated with lanes.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;appId&quot;:&quot;9dcba109-ee9f-4e67-8916-41
             * *******&quot;}]</p>
             */
            public Builder appInfos(String appInfos) {
                this.appInfos = appInfos;
                return this;
            }

            /**
             * <p>The throttling rule for the lane.</p>
             * <p>priority: the priority of the throttling rule for the lane. Valid values: 1 to 100.</p>
             * <p>path: the path that is matched by the throttling rule for the lane.</p>
             * <p>restItems: conditions to be met.</p>
             * <p>condition: the relationship among the conditions to be met.</p>
             * <ul>
             * <li>AND: all conditions</li>
             * <li>OR: one of the conditions</li>
             * </ul>
             * <p>restItems.type: the type of the rule. Valid values:</p>
             * <ul>
             * <li>header: matches by request header.</li>
             * <li>cookie: matches by request cookie.</li>
             * <li>param: matches by request parameters.</li>
             * </ul>
             * <p>restItems.name: the key that matches the rule.</p>
             * <p>restItems.value: the value that matches the rule.</p>
             * <p>restItems.cond: the condition that matches the rule. Valid values:</p>
             * <ul>
             * <li>&quot;==&quot;: The parameter value is equal to the value that you enter in the Value field.</li>
             * <li>&quot;!=&quot;: The parameter value is not equal to the value that you enter in the Value field.</li>
             * <li>&quot;&gt;&quot;: The parameter value is greater than the value that you enter in the Value field.</li>
             * <li>&quot;&lt;&quot;: The parameter value is less than the value that you enter in the Value field.</li>
             * <li>&quot;&gt;=&quot;: The parameter value is greater than or equal to the value that you enter in the Value field.</li>
             * <li>&quot;&lt;=&quot;: The parameter value is less than or equal to the value that you enter in the Value field.</li>
             * <li>&quot;in&quot;: The parameter value is within the values that you enter in the Value field.</li>
             * </ul>
             * <p>restItems.operator: the type of the value. Valid values:</p>
             * <ul>
             * <li>rawvalue: the initial value</li>
             * <li>mod: the reminder obtained by performing modulo operation</li>
             * <li>list: the value from the list</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;condition&quot;:&quot;AND&quot;,&quot;enable&quot;:false,&quot;path&quot;:&quot;/traffic&quot;,&quot;priority&quot;:1,&quot;restItems&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;datum&quot;:&quot;testvalue&quot;,&quot;name&quot;:&quot;testheader&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;header&quot;,&quot;value&quot;:&quot;testvalue&quot;}]}]</p>
             */
            public Builder entryRule(String entryRule) {
                this.entryRule = entryRule;
                return this;
            }

            /**
             * <p>The ID of the lane group.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The association relationships between lanes and applications.</p>
             */
            public Builder swimmingLaneAppRelationShipList(java.util.List<SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList) {
                this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
                return this;
            }

            /**
             * <p>The tag of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>8202e09</p>
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
