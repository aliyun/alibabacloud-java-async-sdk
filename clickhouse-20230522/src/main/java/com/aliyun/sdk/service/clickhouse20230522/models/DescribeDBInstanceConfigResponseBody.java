// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link DescribeDBInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceConfigResponseBody</p>
 */
public class DescribeDBInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>66428721-xxxx-xxxx-xxxx-3BD1B67837E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceConfigResponseBody build() {
            return new DescribeDBInstanceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceConfigResponseBody</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("IsDynamic")
        private Integer isDynamic;

        @com.aliyun.core.annotation.NameInMap("IsUserModifiable")
        private Integer isUserModifiable;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private String optional;

        @com.aliyun.core.annotation.NameInMap("ParamRelyRule")
        private String paramRelyRule;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Params(Builder builder) {
            this.comment = builder.comment;
            this.defaultValue = builder.defaultValue;
            this.isDynamic = builder.isDynamic;
            this.isUserModifiable = builder.isUserModifiable;
            this.name = builder.name;
            this.optional = builder.optional;
            this.paramRelyRule = builder.paramRelyRule;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return isDynamic
         */
        public Integer getIsDynamic() {
            return this.isDynamic;
        }

        /**
         * @return isUserModifiable
         */
        public Integer getIsUserModifiable() {
            return this.isUserModifiable;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return optional
         */
        public String getOptional() {
            return this.optional;
        }

        /**
         * @return paramRelyRule
         */
        public String getParamRelyRule() {
            return this.paramRelyRule;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String comment; 
            private String defaultValue; 
            private Integer isDynamic; 
            private Integer isUserModifiable; 
            private String name; 
            private String optional; 
            private String paramRelyRule; 
            private String value; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.comment = model.comment;
                this.defaultValue = model.defaultValue;
                this.isDynamic = model.isDynamic;
                this.isUserModifiable = model.isUserModifiable;
                this.name = model.name;
                this.optional = model.optional;
                this.paramRelyRule = model.paramRelyRule;
                this.value = model.value;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * IsDynamic.
             */
            public Builder isDynamic(Integer isDynamic) {
                this.isDynamic = isDynamic;
                return this;
            }

            /**
             * IsUserModifiable.
             */
            public Builder isUserModifiable(Integer isUserModifiable) {
                this.isUserModifiable = isUserModifiable;
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
             * Optional.
             */
            public Builder optional(String optional) {
                this.optional = optional;
                return this;
            }

            /**
             * ParamRelyRule.
             */
            public Builder paramRelyRule(String paramRelyRule) {
                this.paramRelyRule = paramRelyRule;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.List<Params> params;

        private Data(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.params = builder.params;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return params
         */
        public java.util.List<Params> getParams() {
            return this.params;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private java.util.List<Params> params; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.DBInstanceId = model.DBInstanceId;
                this.params = model.params;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(java.util.List<Params> params) {
                this.params = params;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
