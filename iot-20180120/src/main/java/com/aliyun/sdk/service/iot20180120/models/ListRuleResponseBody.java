// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRuleResponseBody</p>
 */
public class ListRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Page")
    private Integer page;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListRuleResponseBody build() {
            return new ListRuleResponseBody(this);
        } 

    } 

    public static class RuleInfo extends TeaModel {
        @NameInMap("CreateUserId")
        private Long createUserId;

        @NameInMap("Created")
        private String created;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Modified")
        private String modified;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("RuleDesc")
        private String ruleDesc;

        @NameInMap("Select")
        private String select;

        @NameInMap("ShortTopic")
        private String shortTopic;

        @NameInMap("Status")
        private String status;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("UtcCreated")
        private String utcCreated;

        @NameInMap("UtcModified")
        private String utcModified;

        @NameInMap("Where")
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

            /**
             * CreateUserId.
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
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
             * Modified.
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * RuleDesc.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * Select.
             */
            public Builder select(String select) {
                this.select = select;
                return this;
            }

            /**
             * ShortTopic.
             */
            public Builder shortTopic(String shortTopic) {
                this.shortTopic = shortTopic;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * UtcCreated.
             */
            public Builder utcCreated(String utcCreated) {
                this.utcCreated = utcCreated;
                return this;
            }

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            /**
             * Where.
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
    public static class Data extends TeaModel {
        @NameInMap("RuleInfo")
        private java.util.List < RuleInfo> ruleInfo;

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
        public java.util.List < RuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

        public static final class Builder {
            private java.util.List < RuleInfo> ruleInfo; 

            /**
             * RuleInfo.
             */
            public Builder ruleInfo(java.util.List < RuleInfo> ruleInfo) {
                this.ruleInfo = ruleInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
