// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySwimmingLaneByIdResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySwimmingLaneByIdResponseBody</p>
 */
public class QuerySwimmingLaneByIdResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QuerySwimmingLaneByIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySwimmingLaneByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The request was successfully processed.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The status code. A value of 200 is returned if the request is successful.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RestResult
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySwimmingLaneByIdResponseBody build() {
            return new QuerySwimmingLaneByIdResponseBody(this);
        } 

    } 

    public static class RestItems extends TeaModel {
        @NameInMap("cond")
        private String cond;

        @NameInMap("datum")
        private String datum;

        @NameInMap("divisor")
        private Integer divisor;

        @NameInMap("name")
        private String name;

        @NameInMap("nameList")
        private java.util.List < String > nameList;

        @NameInMap("operator")
        private String operator;

        @NameInMap("rate")
        private Integer rate;

        @NameInMap("remainder")
        private Integer remainder;

        @NameInMap("type")
        private String type;

        @NameInMap("value")
        private String value;

        private RestItems(Builder builder) {
            this.cond = builder.cond;
            this.datum = builder.datum;
            this.divisor = builder.divisor;
            this.name = builder.name;
            this.nameList = builder.nameList;
            this.operator = builder.operator;
            this.rate = builder.rate;
            this.remainder = builder.remainder;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestItems create() {
            return builder().build();
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
        }

        /**
         * @return datum
         */
        public String getDatum() {
            return this.datum;
        }

        /**
         * @return divisor
         */
        public Integer getDivisor() {
            return this.divisor;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameList
         */
        public java.util.List < String > getNameList() {
            return this.nameList;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return remainder
         */
        public Integer getRemainder() {
            return this.remainder;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String cond; 
            private String datum; 
            private Integer divisor; 
            private String name; 
            private java.util.List < String > nameList; 
            private String operator; 
            private Integer rate; 
            private Integer remainder; 
            private String type; 
            private String value; 

            /**
             * 匹配符
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * 数值
             */
            public Builder datum(String datum) {
                this.datum = datum;
                return this;
            }

            /**
             * 除数
             */
            public Builder divisor(Integer divisor) {
                this.divisor = divisor;
                return this;
            }

            /**
             * 名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 匹配列表
             */
            public Builder nameList(java.util.List < String > nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * 操作符
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 百分比
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * 余数
             */
            public Builder remainder(Integer remainder) {
                this.remainder = remainder;
                return this;
            }

            /**
             * 匹配类型
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 值
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RestItems build() {
                return new RestItems(this);
            } 

        } 

    }
    public static class EntryRules extends TeaModel {
        @NameInMap("condition")
        private String condition;

        @NameInMap("path")
        private String path;

        @NameInMap("paths")
        private java.util.List < String > paths;

        @NameInMap("restItems")
        private java.util.List < RestItems> restItems;

        private EntryRules(Builder builder) {
            this.condition = builder.condition;
            this.path = builder.path;
            this.paths = builder.paths;
            this.restItems = builder.restItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntryRules create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return paths
         */
        public java.util.List < String > getPaths() {
            return this.paths;
        }

        /**
         * @return restItems
         */
        public java.util.List < RestItems> getRestItems() {
            return this.restItems;
        }

        public static final class Builder {
            private String condition; 
            private String path; 
            private java.util.List < String > paths; 
            private java.util.List < RestItems> restItems; 

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * paths.
             */
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * restItems.
             */
            public Builder restItems(java.util.List < RestItems> restItems) {
                this.restItems = restItems;
                return this;
            }

            public EntryRules build() {
                return new EntryRules(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("enableRules")
        private Boolean enableRules;

        @NameInMap("entryRule")
        private String entryRule;

        @NameInMap("entryRules")
        private java.util.List < EntryRules> entryRules;

        @NameInMap("gatewaySwimmingLaneRouteJson")
        private String gatewaySwimmingLaneRouteJson;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModified")
        private String gmtModified;

        @NameInMap("groupId")
        private Long groupId;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("status")
        private Integer status;

        @NameInMap("tag")
        private String tag;

        private Data(Builder builder) {
            this.enable = builder.enable;
            this.enableRules = builder.enableRules;
            this.entryRule = builder.entryRule;
            this.entryRules = builder.entryRules;
            this.gatewaySwimmingLaneRouteJson = builder.gatewaySwimmingLaneRouteJson;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
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
         * @return entryRules
         */
        public java.util.List < EntryRules> getEntryRules() {
            return this.entryRules;
        }

        /**
         * @return gatewaySwimmingLaneRouteJson
         */
        public String getGatewaySwimmingLaneRouteJson() {
            return this.gatewaySwimmingLaneRouteJson;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Boolean enable; 
            private Boolean enableRules; 
            private String entryRule; 
            private java.util.List < EntryRules> entryRules; 
            private String gatewaySwimmingLaneRouteJson; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long groupId; 
            private Long id; 
            private String name; 
            private String regionId; 
            private Integer status; 
            private String tag; 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * enableRules.
             */
            public Builder enableRules(Boolean enableRules) {
                this.enableRules = enableRules;
                return this;
            }

            /**
             * entryRule.
             */
            public Builder entryRule(String entryRule) {
                this.entryRule = entryRule;
                return this;
            }

            /**
             * entryRules.
             */
            public Builder entryRules(java.util.List < EntryRules> entryRules) {
                this.entryRules = entryRules;
                return this;
            }

            /**
             * gatewaySwimmingLaneRouteJson.
             */
            public Builder gatewaySwimmingLaneRouteJson(String gatewaySwimmingLaneRouteJson) {
                this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * groupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * tag.
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
