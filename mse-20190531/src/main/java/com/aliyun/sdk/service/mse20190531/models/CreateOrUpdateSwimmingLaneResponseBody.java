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
         * <p>The status code. The value 200 is returned if the request is successful.</p>
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
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE5C32A1-BC0E-4B79-817C-103E4EDF****</p>
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
             * cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * datum.
             */
            public Builder datum(String datum) {
                this.datum = datum;
                return this;
            }

            /**
             * divisor.
             */
            public Builder divisor(Integer divisor) {
                this.divisor = divisor;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nameList.
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * remainder.
             */
            public Builder remainder(Integer remainder) {
                this.remainder = remainder;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
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
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * restItems.
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
            public Builder entryRules(java.util.List<EntryRules> entryRules) {
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * pathIndependentPercentageEnable.
             */
            public Builder pathIndependentPercentageEnable(Boolean pathIndependentPercentageEnable) {
                this.pathIndependentPercentageEnable = pathIndependentPercentageEnable;
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
