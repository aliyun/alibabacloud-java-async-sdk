// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRuleResponseBody</p>
 */
public class ListRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The error code that is returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The rules returned if the call is successful. For more information, see the &quot;<strong>RuleInfo</strong>&quot; section of this topic.</p>
         * <blockquote>
         * <p> The returned rules are sorted in reverse-chronological order based on the time when the rules were created.</p>
         * </blockquote>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1564B626-DE97-452D-9E9B-305888AC6105</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListRuleResponseBody build() {
            return new ListRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRuleResponseBody</p>
     */
    public static class RuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private Long createUserId;

        @com.aliyun.core.annotation.NameInMap("Created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Modified")
        private String modified;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("RuleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("Select")
        private String select;

        @com.aliyun.core.annotation.NameInMap("ShortTopic")
        private String shortTopic;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("UtcCreated")
        private String utcCreated;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        @com.aliyun.core.annotation.NameInMap("Where")
        private String where;

        private RuleInfo(Builder builder) {
            this.createUserId = builder.createUserId;
            this.created = builder.created;
            this.dataType = builder.dataType;
            this.id = builder.id;
            this.modified = builder.modified;
            this.name = builder.name;
            this.productKey = builder.productKey;
            this.ruleDesc = builder.ruleDesc;
            this.select = builder.select;
            this.shortTopic = builder.shortTopic;
            this.status = builder.status;
            this.topic = builder.topic;
            this.utcCreated = builder.utcCreated;
            this.utcModified = builder.utcModified;
            this.where = builder.where;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfo create() {
            return builder().build();
        }

        /**
         * @return createUserId
         */
        public Long getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modified
         */
        public String getModified() {
            return this.modified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return select
         */
        public String getSelect() {
            return this.select;
        }

        /**
         * @return shortTopic
         */
        public String getShortTopic() {
            return this.shortTopic;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return utcCreated
         */
        public String getUtcCreated() {
            return this.utcCreated;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        /**
         * @return where
         */
        public String getWhere() {
            return this.where;
        }

        public static final class Builder {
            private Long createUserId; 
            private String created; 
            private String dataType; 
            private Long id; 
            private String modified; 
            private String name; 
            private String productKey; 
            private String ruleDesc; 
            private String select; 
            private String shortTopic; 
            private String status; 
            private String topic; 
            private String utcCreated; 
            private String utcModified; 
            private String where; 

            private Builder() {
            } 

            private Builder(RuleInfo model) {
                this.createUserId = model.createUserId;
                this.created = model.created;
                this.dataType = model.dataType;
                this.id = model.id;
                this.modified = model.modified;
                this.name = model.name;
                this.productKey = model.productKey;
                this.ruleDesc = model.ruleDesc;
                this.select = model.select;
                this.shortTopic = model.shortTopic;
                this.status = model.status;
                this.topic = model.topic;
                this.utcCreated = model.utcCreated;
                this.utcModified = model.utcModified;
                this.where = model.where;
            } 

            /**
             * <p>The ID of the user who created the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1231579085000000</p>
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * <p>The time when the rule was created. The time is displayed in UTC-6.</p>
             * 
             * <strong>example:</strong>
             * <p>Wed Feb 27 20:45:43 CST 2019</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The data type of the rule. Valid values: <strong>JSON</strong> and <strong>BINARY</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>151454</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the rule was last modified. The time is displayed in UTC-6.</p>
             * 
             * <strong>example:</strong>
             * <p>Wed Feb 27 20:45:43 CST 2019</p>
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>a1KiV******</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule1Desc</p>
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * <p>The content that follows the <strong>Select</strong> keyword in the SQL statement of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>deviceName() as deviceName</p>
             */
            public Builder select(String select) {
                this.select = select;
                return this;
            }

            /**
             * <p>The topic to which the rule applies. The topic does not include the ProductKey level. Format: <code>${deviceName}/topicShortName</code>. ${deviceName} indicates the name of the device, and topicShortName indicates the custom name of the topic.</p>
             * <blockquote>
             * <p> For information about how to use a plus sign (<code>+</code>) or a number sign (<code>#</code>) as a wildcard character in a topic, see <a href="https://help.aliyun.com/document_detail/73731.html">Topic wildcards</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>+/thing/event/property/post</p>
             */
            public Builder shortTopic(String shortTopic) {
                this.shortTopic = shortTopic;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong>: The rule is running.</li>
             * <li><strong>STOP</strong>: The rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STOP</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The topic to which the rule applies. Format: <code>${productKey}/${deviceName}/topicShortName</code>.</p>
             * <blockquote>
             * <p> For information about how to use a plus sign (<code>+</code>) or a number sign (<code>#</code>) as a wildcard character in a topic, see <a href="https://help.aliyun.com/document_detail/73731.html">Topic wildcards</a>.</p>
             * </blockquote>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The time when the device was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-27T12:40:43.000Z</p>
             */
            public Builder utcCreated(String utcCreated) {
                this.utcCreated = utcCreated;
                return this;
            }

            /**
             * <p>The time when the rule was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-27T12:45:43.000Z</p>
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            /**
             * <p>The <strong>Where</strong> query condition in the SQL statement of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Temperature&gt;35</p>
             */
            public Builder where(String where) {
                this.where = where;
                return this;
            }

            public RuleInfo build() {
                return new RuleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleInfo")
        private java.util.List<RuleInfo> ruleInfo;

        private Data(Builder builder) {
            this.ruleInfo = builder.ruleInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ruleInfo
         */
        public java.util.List<RuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

        public static final class Builder {
            private java.util.List<RuleInfo> ruleInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ruleInfo = model.ruleInfo;
            } 

            /**
             * RuleInfo.
             */
            public Builder ruleInfo(java.util.List<RuleInfo> ruleInfo) {
                this.ruleInfo = ruleInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
