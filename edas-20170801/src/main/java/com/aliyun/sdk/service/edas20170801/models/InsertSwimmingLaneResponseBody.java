// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>InsertSwimmingLaneResponseBody</p>
 */
public class InsertSwimmingLaneResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The additional information that is returned.
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

        public InsertSwimmingLaneResponseBody build() {
            return new InsertSwimmingLaneResponseBody(this);
        } 

    } 

    public static class SwimmingLaneAppRelationShipList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("LaneId")
        private Long laneId;

        @NameInMap("Rules")
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

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of the lane.
             */
            public Builder laneId(Long laneId) {
                this.laneId = laneId;
                return this;
            }

            /**
             * The association rule.
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
    public static class Data extends TeaModel {
        @NameInMap("AppInfos")
        private String appInfos;

        @NameInMap("EntryRule")
        private String entryRule;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("SwimmingLaneAppRelationShipList")
        private java.util.List < SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        @NameInMap("Tag")
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
        public java.util.List < SwimmingLaneAppRelationShipList> getSwimmingLaneAppRelationShipList() {
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
            private java.util.List < SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList; 
            private String tag; 

            /**
             * The applications that are associated with lanes.
             */
            public Builder appInfos(String appInfos) {
                this.appInfos = appInfos;
                return this;
            }

            /**
             * The throttling rule for the lane.
             * <p>
             * 
             * priority: the priority of the throttling rule for the lane. Valid values: 1 to 100.
             * 
             * path: the path that is matched by the throttling rule for the lane.
             * 
             * restItems: conditions to be met.
             * 
             * condition: the relationship among the conditions to be met.
             * 
             * *   AND: all conditions
             * *   OR: one of the conditions
             * 
             * restItems.type: the type of the rule. Valid values:
             * 
             * *   header: matches by request header.
             * *   cookie: matches by request cookie.
             * *   param: matches by request parameters.
             * 
             * restItems.name: the key that matches the rule.
             * 
             * restItems.value: the value that matches the rule.
             * 
             * restItems.cond: the condition that matches the rule. Valid values:
             * 
             * *   "==": The parameter value is equal to the value that you enter in the Value field.
             * *   "!=": The parameter value is not equal to the value that you enter in the Value field.
             * *   ">": The parameter value is greater than the value that you enter in the Value field.
             * *   "<": The parameter value is less than the value that you enter in the Value field.
             * *   ">=": The parameter value is greater than or equal to the value that you enter in the Value field.
             * *   "<=": The parameter value is less than or equal to the value that you enter in the Value field.
             * *   "in": The parameter value is within the values that you enter in the Value field.
             * 
             * restItems.operator: the type of the value. Valid values:
             * 
             * *   rawvalue: the initial value
             * *   mod: the reminder obtained by performing modulo operation
             * *   list: the value from the list
             */
            public Builder entryRule(String entryRule) {
                this.entryRule = entryRule;
                return this;
            }

            /**
             * The ID of the lane group.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the lane.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the lane.
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
             * The association relationships between lanes and applications.
             */
            public Builder swimmingLaneAppRelationShipList(java.util.List < SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList) {
                this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
                return this;
            }

            /**
             * The tag of the lane.
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
