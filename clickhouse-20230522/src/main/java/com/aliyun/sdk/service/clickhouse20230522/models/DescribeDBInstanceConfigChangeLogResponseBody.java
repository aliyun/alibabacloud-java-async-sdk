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
 * {@link DescribeDBInstanceConfigChangeLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceConfigChangeLogResponseBody</p>
 */
public class DescribeDBInstanceConfigChangeLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceConfigChangeLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceConfigChangeLogResponseBody create() {
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

        private Builder(DescribeDBInstanceConfigChangeLogResponseBody model) {
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
         * <p>780DE414-*********-88BE-A2E21B862B57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceConfigChangeLogResponseBody build() {
            return new DescribeDBInstanceConfigChangeLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceConfigChangeLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceConfigChangeLogResponseBody</p>
     */
    public static class ParamChangeLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applied")
        private Boolean applied;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ID")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("OldValue")
        private String oldValue;

        private ParamChangeLogs(Builder builder) {
            this.applied = builder.applied;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamChangeLogs create() {
            return builder().build();
        }

        /**
         * @return applied
         */
        public Boolean getApplied() {
            return this.applied;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        public static final class Builder {
            private Boolean applied; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private String name; 
            private String newValue; 
            private String oldValue; 

            private Builder() {
            } 

            private Builder(ParamChangeLogs model) {
                this.applied = model.applied;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.name = model.name;
                this.newValue = model.newValue;
                this.oldValue = model.oldValue;
            } 

            /**
             * Applied.
             */
            public Builder applied(Boolean applied) {
                this.applied = applied;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ID.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * OldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            public ParamChangeLogs build() {
                return new ParamChangeLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceConfigChangeLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceConfigChangeLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("ParamChangeLogs")
        private java.util.List<ParamChangeLogs> paramChangeLogs;

        private Data(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.paramChangeLogs = builder.paramChangeLogs;
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
         * @return paramChangeLogs
         */
        public java.util.List<ParamChangeLogs> getParamChangeLogs() {
            return this.paramChangeLogs;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private java.util.List<ParamChangeLogs> paramChangeLogs; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.DBInstanceId = model.DBInstanceId;
                this.paramChangeLogs = model.paramChangeLogs;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * ParamChangeLogs.
             */
            public Builder paramChangeLogs(java.util.List<ParamChangeLogs> paramChangeLogs) {
                this.paramChangeLogs = paramChangeLogs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
