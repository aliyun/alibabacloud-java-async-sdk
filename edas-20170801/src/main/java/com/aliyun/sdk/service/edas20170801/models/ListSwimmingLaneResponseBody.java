// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>ListSwimmingLaneResponseBody</p>
 */
public class ListSwimmingLaneResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
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
        public Builder data(java.util.List < Data> data) {
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

        public ListSwimmingLaneResponseBody build() {
            return new ListSwimmingLaneResponseBody(this);
        } 

    } 

    public static class SwimmingLaneAppRelationShipList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Extra")
        private String extra;

        @NameInMap("LaneId")
        private Long laneId;

        @NameInMap("Rules")
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
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
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
        @NameInMap("EnableRules")
        private Boolean enableRules;

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

        @NameInMap("ScenarioSign")
        private String scenarioSign;

        @NameInMap("SwimmingLaneAppRelationShipList")
        private java.util.List < SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList;

        @NameInMap("Tag")
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
            private Boolean enableRules; 
            private String entryRule; 
            private Long groupId; 
            private Long id; 
            private String name; 
            private String namespaceId; 
            private String scenarioSign; 
            private java.util.List < SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList; 
            private String tag; 

            /**
             * Indicates whether the throttling rule is enabled.
             */
            public Builder enableRules(Boolean enableRules) {
                this.enableRules = enableRules;
                return this;
            }

            /**
             * The conditions.
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
             * The ID of the microservices namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The expected tag.
             */
            public Builder scenarioSign(String scenarioSign) {
                this.scenarioSign = scenarioSign;
                return this;
            }

            /**
             * The applications that are related to the lane.
             */
            public Builder swimmingLaneAppRelationShipList(java.util.List < SwimmingLaneAppRelationShipList> swimmingLaneAppRelationShipList) {
                this.swimmingLaneAppRelationShipList = swimmingLaneAppRelationShipList;
                return this;
            }

            /**
             * The tag.
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
