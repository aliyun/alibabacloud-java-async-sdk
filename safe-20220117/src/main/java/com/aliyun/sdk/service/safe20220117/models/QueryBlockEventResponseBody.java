// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link QueryBlockEventResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBlockEventResponseBody</p>
 */
public class QueryBlockEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryBlockEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBlockEventResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryBlockEventResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryBlockEventResponseBody build() {
            return new QueryBlockEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBlockEventResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBlockEventResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level1")
        private String level1;

        @com.aliyun.core.annotation.NameInMap("Level2")
        private String level2;

        @com.aliyun.core.annotation.NameInMap("Level3")
        private String level3;

        @com.aliyun.core.annotation.NameInMap("Level4")
        private String level4;

        @com.aliyun.core.annotation.NameInMap("Level5")
        private String level5;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Rule(Builder builder) {
            this.level1 = builder.level1;
            this.level2 = builder.level2;
            this.level3 = builder.level3;
            this.level4 = builder.level4;
            this.level5 = builder.level5;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return level1
         */
        public String getLevel1() {
            return this.level1;
        }

        /**
         * @return level2
         */
        public String getLevel2() {
            return this.level2;
        }

        /**
         * @return level3
         */
        public String getLevel3() {
            return this.level3;
        }

        /**
         * @return level4
         */
        public String getLevel4() {
            return this.level4;
        }

        /**
         * @return level5
         */
        public String getLevel5() {
            return this.level5;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level1; 
            private String level2; 
            private String level3; 
            private String level4; 
            private String level5; 
            private String type; 

            private Builder() {
            } 

            private Builder(Rule model) {
                this.level1 = model.level1;
                this.level2 = model.level2;
                this.level3 = model.level3;
                this.level4 = model.level4;
                this.level5 = model.level5;
                this.type = model.type;
            } 

            /**
             * Level1.
             */
            public Builder level1(String level1) {
                this.level1 = level1;
                return this;
            }

            /**
             * Level2.
             */
            public Builder level2(String level2) {
                this.level2 = level2;
                return this;
            }

            /**
             * Level3.
             */
            public Builder level3(String level3) {
                this.level3 = level3;
                return this;
            }

            /**
             * Level4.
             */
            public Builder level4(String level4) {
                this.level4 = level4;
                return this;
            }

            /**
             * Level5.
             */
            public Builder level5(String level5) {
                this.level5 = level5;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBlockEventResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBlockEventResponseBody</p>
     */
    public static class EventTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Express")
        private String express;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<Rule> rule;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private Long ruleId;

        private EventTimes(Builder builder) {
            this.endTime = builder.endTime;
            this.express = builder.express;
            this.rule = builder.rule;
            this.startTime = builder.startTime;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTimes create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return express
         */
        public String getExpress() {
            return this.express;
        }

        /**
         * @return rule
         */
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Long endTime; 
            private String express; 
            private java.util.List<Rule> rule; 
            private Long startTime; 
            private Long ruleId; 

            private Builder() {
            } 

            private Builder(EventTimes model) {
                this.endTime = model.endTime;
                this.express = model.express;
                this.rule = model.rule;
                this.startTime = model.startTime;
                this.ruleId = model.ruleId;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Express.
             */
            public Builder express(String express) {
                this.express = express;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(java.util.List<Rule> rule) {
                this.rule = rule;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public EventTimes build() {
                return new EventTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBlockEventResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBlockEventResponseBody</p>
     */
    public static class LevelType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("value")
        private Integer value;

        private LevelType(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelType create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(LevelType model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public LevelType build() {
                return new LevelType(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBlockEventResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBlockEventResponseBody</p>
     */
    public static class DataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmpId")
        private String empId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventTimes")
        private java.util.List<EventTimes> eventTimes;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("levelType")
        private LevelType levelType;

        @com.aliyun.core.annotation.NameInMap("versionId")
        private Long versionId;

        private DataInfo(Builder builder) {
            this.empId = builder.empId;
            this.endTime = builder.endTime;
            this.eventTimes = builder.eventTimes;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.reason = builder.reason;
            this.startTime = builder.startTime;
            this.title = builder.title;
            this.url = builder.url;
            this.levelType = builder.levelType;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInfo create() {
            return builder().build();
        }

        /**
         * @return empId
         */
        public String getEmpId() {
            return this.empId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventTimes
         */
        public java.util.List<EventTimes> getEventTimes() {
            return this.eventTimes;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return levelType
         */
        public LevelType getLevelType() {
            return this.levelType;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String empId; 
            private Long endTime; 
            private java.util.List<EventTimes> eventTimes; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String reason; 
            private Long startTime; 
            private String title; 
            private String url; 
            private LevelType levelType; 
            private Long versionId; 

            private Builder() {
            } 

            private Builder(DataInfo model) {
                this.empId = model.empId;
                this.endTime = model.endTime;
                this.eventTimes = model.eventTimes;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.reason = model.reason;
                this.startTime = model.startTime;
                this.title = model.title;
                this.url = model.url;
                this.levelType = model.levelType;
                this.versionId = model.versionId;
            } 

            /**
             * EmpId.
             */
            public Builder empId(String empId) {
                this.empId = empId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EventTimes.
             */
            public Builder eventTimes(java.util.List<EventTimes> eventTimes) {
                this.eventTimes = eventTimes;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * levelType.
             */
            public Builder levelType(LevelType levelType) {
                this.levelType = levelType;
                return this;
            }

            /**
             * versionId.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            public DataInfo build() {
                return new DataInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBlockEventResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBlockEventResponseBody</p>
     */
    public static class Pagination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        private Pagination(Builder builder) {
            this.limit = builder.limit;
            this.page = builder.page;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        public static final class Builder {
            private Integer limit; 
            private Integer page; 

            private Builder() {
            } 

            private Builder(Pagination model) {
                this.limit = model.limit;
                this.page = model.page;
            } 

            /**
             * Limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBlockEventResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBlockEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInfo")
        private java.util.List<DataInfo> dataInfo;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private java.util.Map<String, String> extraInfo;

        @com.aliyun.core.annotation.NameInMap("Pagination")
        private Pagination pagination;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.dataInfo = builder.dataInfo;
            this.extraInfo = builder.extraInfo;
            this.pagination = builder.pagination;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataInfo
         */
        public java.util.List<DataInfo> getDataInfo() {
            return this.dataInfo;
        }

        /**
         * @return extraInfo
         */
        public java.util.Map<String, String> getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DataInfo> dataInfo; 
            private java.util.Map<String, String> extraInfo; 
            private Pagination pagination; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataInfo = model.dataInfo;
                this.extraInfo = model.extraInfo;
                this.pagination = model.pagination;
                this.total = model.total;
            } 

            /**
             * DataInfo.
             */
            public Builder dataInfo(java.util.List<DataInfo> dataInfo) {
                this.dataInfo = dataInfo;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(java.util.Map<String, String> extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
