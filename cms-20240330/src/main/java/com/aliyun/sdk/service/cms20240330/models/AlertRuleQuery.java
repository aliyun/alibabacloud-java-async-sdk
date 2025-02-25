// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleQuery} extends {@link TeaModel}
 *
 * <p>AlertRuleQuery</p>
 */
public class AlertRuleQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("firstJoin")
    private AlertRuleSlsQueryJoin firstJoin;

    @com.aliyun.core.annotation.NameInMap("groupFieldList")
    private java.util.List < String > groupFieldList;

    @com.aliyun.core.annotation.NameInMap("groupType")
    private String groupType;

    @com.aliyun.core.annotation.NameInMap("queries")
    private java.util.List < Queries> queries;

    @com.aliyun.core.annotation.NameInMap("secondJoin")
    private AlertRuleSlsQueryJoin secondJoin;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AlertRuleQuery(Builder builder) {
        this.duration = builder.duration;
        this.expr = builder.expr;
        this.firstJoin = builder.firstJoin;
        this.groupFieldList = builder.groupFieldList;
        this.groupType = builder.groupType;
        this.queries = builder.queries;
        this.secondJoin = builder.secondJoin;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleQuery create() {
        return builder().build();
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return firstJoin
     */
    public AlertRuleSlsQueryJoin getFirstJoin() {
        return this.firstJoin;
    }

    /**
     * @return groupFieldList
     */
    public java.util.List < String > getGroupFieldList() {
        return this.groupFieldList;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return queries
     */
    public java.util.List < Queries> getQueries() {
        return this.queries;
    }

    /**
     * @return secondJoin
     */
    public AlertRuleSlsQueryJoin getSecondJoin() {
        return this.secondJoin;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long duration; 
        private String expr; 
        private AlertRuleSlsQueryJoin firstJoin; 
        private java.util.List < String > groupFieldList; 
        private String groupType; 
        private java.util.List < Queries> queries; 
        private AlertRuleSlsQueryJoin secondJoin; 
        private String type; 

        /**
         * duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * expr.
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * firstJoin.
         */
        public Builder firstJoin(AlertRuleSlsQueryJoin firstJoin) {
            this.firstJoin = firstJoin;
            return this;
        }

        /**
         * groupFieldList.
         */
        public Builder groupFieldList(java.util.List < String > groupFieldList) {
            this.groupFieldList = groupFieldList;
            return this;
        }

        /**
         * groupType.
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * queries.
         */
        public Builder queries(java.util.List < Queries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * secondJoin.
         */
        public Builder secondJoin(AlertRuleSlsQueryJoin secondJoin) {
            this.secondJoin = secondJoin;
            return this;
        }

        /**
         * <p>查询类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AlertRuleQuery build() {
            return new AlertRuleQuery(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleQuery} extends {@link TeaModel}
     *
     * <p>AlertRuleQuery</p>
     */
    public static class Queries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("end")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("expr")
        @com.aliyun.core.annotation.Validation(required = true)
        private String expr;

        @com.aliyun.core.annotation.NameInMap("start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("timeUnit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("window")
        private String window;

        private Queries(Builder builder) {
            this.duration = builder.duration;
            this.end = builder.end;
            this.expr = builder.expr;
            this.start = builder.start;
            this.timeUnit = builder.timeUnit;
            this.window = builder.window;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queries create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return window
         */
        public String getWindow() {
            return this.window;
        }

        public static final class Builder {
            private Long duration; 
            private Long end; 
            private String expr; 
            private Long start; 
            private String timeUnit; 
            private String window; 

            /**
             * duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>时间偏移结束时间(相对)，如果指定了start、end，则不指定window。</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>查询表达式</p>
             * <p>This parameter is required.</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>sls查询的时间偏移开始时间(相对)，如果指定了start、end，则不指定window。  例如：start=15， timeUnit=minute，表示15分钟前</p>
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * <p>start和end、window的时间单位： day/hour/minute/second</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>整点时间查询区间。  如果指定了window则不指定start、end</p>
             */
            public Builder window(String window) {
                this.window = window;
                return this;
            }

            public Queries build() {
                return new Queries(this);
            } 

        } 

    }
}
