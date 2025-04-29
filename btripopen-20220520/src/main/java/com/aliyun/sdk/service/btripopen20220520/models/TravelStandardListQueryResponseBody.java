// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TravelStandardListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TravelStandardListQueryResponseBody</p>
 */
public class TravelStandardListQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TravelStandardListQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardListQueryResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(TravelStandardListQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041aa317070996148671005d0a0b</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TravelStandardListQueryResponseBody build() {
            return new TravelStandardListQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TravelStandardListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardListQueryResponseBody</p>
     */
    public static class MainReserveRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("open_service_type_list")
        private java.util.List<String> openServiceTypeList;

        @com.aliyun.core.annotation.NameInMap("rule_code")
        private Long ruleCode;

        @com.aliyun.core.annotation.NameInMap("rule_desc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("rule_id")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("rule_name")
        private String ruleName;

        private MainReserveRule(Builder builder) {
            this.openServiceTypeList = builder.openServiceTypeList;
            this.ruleCode = builder.ruleCode;
            this.ruleDesc = builder.ruleDesc;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainReserveRule create() {
            return builder().build();
        }

        /**
         * @return openServiceTypeList
         */
        public java.util.List<String> getOpenServiceTypeList() {
            return this.openServiceTypeList;
        }

        /**
         * @return ruleCode
         */
        public Long getRuleCode() {
            return this.ruleCode;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private java.util.List<String> openServiceTypeList; 
            private Long ruleCode; 
            private String ruleDesc; 
            private Long ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(MainReserveRule model) {
                this.openServiceTypeList = model.openServiceTypeList;
                this.ruleCode = model.ruleCode;
                this.ruleDesc = model.ruleDesc;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * open_service_type_list.
             */
            public Builder openServiceTypeList(java.util.List<String> openServiceTypeList) {
                this.openServiceTypeList = openServiceTypeList;
                return this;
            }

            /**
             * rule_code.
             */
            public Builder ruleCode(Long ruleCode) {
                this.ruleCode = ruleCode;
                return this;
            }

            /**
             * rule_desc.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * rule_id.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * rule_name.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public MainReserveRule build() {
                return new MainReserveRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TravelStandardListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardListQueryResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private DataList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TravelStandardListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardListQueryResponseBody</p>
     */
    public static class ReserveRuleDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data_list")
        private java.util.List<DataList> dataList;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ReserveRuleDesc(Builder builder) {
            this.dataList = builder.dataList;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReserveRuleDesc create() {
            return builder().build();
        }

        /**
         * @return dataList
         */
        public java.util.List<DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<DataList> dataList; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(ReserveRuleDesc model) {
                this.dataList = model.dataList;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * data_list.
             */
            public Builder dataList(java.util.List<DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ReserveRuleDesc build() {
                return new ReserveRuleDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link TravelStandardListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardListQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("main_reserve_rule")
        private MainReserveRule mainReserveRule;

        @com.aliyun.core.annotation.NameInMap("reserve_rule_desc")
        private java.util.List<ReserveRuleDesc> reserveRuleDesc;

        @com.aliyun.core.annotation.NameInMap("scope")
        private Integer scope;

        private Items(Builder builder) {
            this.mainReserveRule = builder.mainReserveRule;
            this.reserveRuleDesc = builder.reserveRuleDesc;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return mainReserveRule
         */
        public MainReserveRule getMainReserveRule() {
            return this.mainReserveRule;
        }

        /**
         * @return reserveRuleDesc
         */
        public java.util.List<ReserveRuleDesc> getReserveRuleDesc() {
            return this.reserveRuleDesc;
        }

        /**
         * @return scope
         */
        public Integer getScope() {
            return this.scope;
        }

        public static final class Builder {
            private MainReserveRule mainReserveRule; 
            private java.util.List<ReserveRuleDesc> reserveRuleDesc; 
            private Integer scope; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.mainReserveRule = model.mainReserveRule;
                this.reserveRuleDesc = model.reserveRuleDesc;
                this.scope = model.scope;
            } 

            /**
             * main_reserve_rule.
             */
            public Builder mainReserveRule(MainReserveRule mainReserveRule) {
                this.mainReserveRule = mainReserveRule;
                return this;
            }

            /**
             * reserve_rule_desc.
             */
            public Builder reserveRuleDesc(java.util.List<ReserveRuleDesc> reserveRuleDesc) {
                this.reserveRuleDesc = reserveRuleDesc;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(Integer scope) {
                this.scope = scope;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link TravelStandardListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardListQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("total_size")
        private Integer totalSize;

        private Module(Builder builder) {
            this.items = builder.items;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.items = model.items;
                this.totalSize = model.totalSize;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * total_size.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
