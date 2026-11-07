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
 * {@link CreateOrUpdateSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateSwimmingLaneResponseBody</p>
 */
public class CreateOrUpdateSwimmingLaneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateOrUpdateSwimmingLaneResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSwimmingLaneResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateOrUpdateSwimmingLaneResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The code used only to synchronize with the Success parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data overview.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
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
         * <p>Succ</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE5C32A1-BC0E-4B79-817C-103E4EDF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateOrUpdateSwimmingLaneResponseBody build() {
            return new CreateOrUpdateSwimmingLaneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrUpdateSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateSwimmingLaneResponseBody</p>
     */
    public static class RestItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("datum")
        private String datum;

        @com.aliyun.core.annotation.NameInMap("divisor")
        private Integer divisor;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("remainder")
        private Integer remainder;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
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
        public java.util.List<String> getNameList() {
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
            private java.util.List<String> nameList; 
            private String operator; 
            private Integer rate; 
            private Integer remainder; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(RestItems model) {
                this.cond = model.cond;
                this.datum = model.datum;
                this.divisor = model.divisor;
                this.name = model.name;
                this.nameList = model.nameList;
                this.operator = model.operator;
                this.rate = model.rate;
                this.remainder = model.remainder;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The match operator.</p>
             * 
             * <strong>example:</strong>
             * <p>==</p>
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>x</p>
             */
            public Builder datum(String datum) {
                this.datum = datum;
                return this;
            }

            /**
             * <p>The divisor.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder divisor(Integer divisor) {
                this.divisor = divisor;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of names.</p>
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>rawvalue</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The remainder.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder remainder(Integer remainder) {
                this.remainder = remainder;
                return this;
            }

            /**
             * <p>The match type.</p>
             * 
             * <strong>example:</strong>
             * <p>cookie</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
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
    /**
     * 
     * {@link CreateOrUpdateSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateSwimmingLaneResponseBody</p>
     */
    public static class EntryRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("restItems")
        private java.util.List<RestItems> restItems;

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
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return restItems
         */
        public java.util.List<RestItems> getRestItems() {
            return this.restItems;
        }

        public static final class Builder {
            private String condition; 
            private String path; 
            private java.util.List<String> paths; 
            private java.util.List<RestItems> restItems; 

            private Builder() {
            } 

            private Builder(EntryRules model) {
                this.condition = model.condition;
                this.path = model.path;
                this.paths = model.paths;
                this.restItems = model.restItems;
            } 

            /**
             * <p>The condition.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The code group path.</p>
             * 
             * <strong>example:</strong>
             * <p>/adump/wxb/prod</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The list of paths.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The list of REST matching rules.</p>
             */
            public Builder restItems(java.util.List<RestItems> restItems) {
                this.restItems = restItems;
                return this;
            }

            public EntryRules build() {
                return new EntryRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrUpdateSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateSwimmingLaneResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("enableRules")
        private Boolean enableRules;

        @com.aliyun.core.annotation.NameInMap("entryRule")
        private String entryRule;

        @com.aliyun.core.annotation.NameInMap("entryRules")
        private java.util.List<EntryRules> entryRules;

        @com.aliyun.core.annotation.NameInMap("gatewaySwimmingLaneRouteJson")
        private String gatewaySwimmingLaneRouteJson;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("groupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pathIndependentPercentageEnable")
        private Boolean pathIndependentPercentageEnable;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("tag")
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
            this.pathIndependentPercentageEnable = builder.pathIndependentPercentageEnable;
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
        public java.util.List<EntryRules> getEntryRules() {
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
         * @return pathIndependentPercentageEnable
         */
        public Boolean getPathIndependentPercentageEnable() {
            return this.pathIndependentPercentageEnable;
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
            private java.util.List<EntryRules> entryRules; 
            private String gatewaySwimmingLaneRouteJson; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long groupId; 
            private Long id; 
            private String name; 
            private Boolean pathIndependentPercentageEnable; 
            private String regionId; 
            private Integer status; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enable = model.enable;
                this.enableRules = model.enableRules;
                this.entryRule = model.entryRule;
                this.entryRules = model.entryRules;
                this.gatewaySwimmingLaneRouteJson = model.gatewaySwimmingLaneRouteJson;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupId = model.groupId;
                this.id = model.id;
                this.name = model.name;
                this.pathIndependentPercentageEnable = model.pathIndependentPercentageEnable;
                this.regionId = model.regionId;
                this.status = model.status;
                this.tag = model.tag;
            } 

            /**
             * <p>The swimlane switch.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Specifies whether the rules are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableRules(Boolean enableRules) {
                this.enableRules = enableRules;
                return this;
            }

            /**
             * <p>The entry application rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder entryRule(String entryRule) {
                this.entryRule = entryRule;
                return this;
            }

            /**
             * <p>The name.</p>
             */
            public Builder entryRules(java.util.List<EntryRules> entryRules) {
                this.entryRules = entryRules;
                return this;
            }

            /**
             * <p>The MSE gateway routing rules.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder gatewaySwimmingLaneRouteJson(String gatewaySwimmingLaneRouteJson) {
                this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
                return this;
            }

            /**
             * <p>The time when the swimlane was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1545726028000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the swimlane was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1565701886000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The swimlane group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>72586</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The swimlane ID.</p>
             * 
             * <strong>example:</strong>
             * <p>94765</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The swimlane name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Specifies whether to enable percentage-based canary releases by path when a Java gateway is used as the entry point.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder pathIndependentPercentageEnable(Boolean pathIndependentPercentageEnable) {
                this.pathIndependentPercentageEnable = pathIndependentPercentageEnable;
                return this;
            }

            /**
             * <p>The region where the application is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The swimlane status.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag corresponding to the swimlane.</p>
             * 
             * <strong>example:</strong>
             * <p>release</p>
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
