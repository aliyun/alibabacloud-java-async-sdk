// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeDBClusterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterConfigResponseBody</p>
 */
public class DescribeDBClusterConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterConfigResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String requestId; 

        /**
         * <p>The details about the access denial. This parameter is returned only if Resource Access Management (RAM) authentication failed.</p>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The information returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic code. This parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message. This parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>An error occurred while processing your request.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADF42B18-43FD-5100-83A9-BE81AB70C863</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterConfigResponseBody build() {
            return new DescribeDBClusterConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterConfigResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ParamCategory")
        private String paramCategory;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Params(Builder builder) {
            this.comment = builder.comment;
            this.defaultValue = builder.defaultValue;
            this.isDynamic = builder.isDynamic;
            this.isUserModifiable = builder.isUserModifiable;
            this.name = builder.name;
            this.optional = builder.optional;
            this.paramCategory = builder.paramCategory;
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
         * @return paramCategory
         */
        public String getParamCategory() {
            return this.paramCategory;
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
            private String paramCategory; 
            private String value; 

            /**
             * <p>The comments on the parameter.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter immediately takes effect without requiring a restart.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDynamic(Integer isDynamic) {
                this.isDynamic = isDynamic;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is modifiable.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isUserModifiable(Integer isUserModifiable) {
                this.isUserModifiable = isUserModifiable;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>doris_scanner_thread_pool_thread_num</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value range of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[0-20000]</p>
             */
            public Builder optional(String optional) {
                this.optional = optional;
                return this;
            }

            /**
             * <p>The category of the parameter.</p>
             */
            public Builder paramCategory(String paramCategory) {
                this.paramCategory = paramCategory;
                return this;
            }

            /**
             * <p>The current value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link DescribeDBClusterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbClusterId")
        private String dbClusterId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.List<Params> params;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        private Data(Builder builder) {
            this.dbClusterId = builder.dbClusterId;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbInstanceName = builder.dbInstanceName;
            this.params = builder.params;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbClusterId
         */
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return params
         */
        public java.util.List<Params> getParams() {
            return this.params;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String dbClusterId; 
            private String dbInstanceId; 
            private String dbInstanceName; 
            private java.util.List<Params> params; 
            private Integer taskId; 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-wny3li00g02-be</p>
             */
            public Builder dbClusterId(String dbClusterId) {
                this.dbClusterId = dbClusterId;
                return this;
            }

            /**
             * <p>The numeric ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6585</p>
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-wny3li00g02</p>
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * <p>The details about each parameter returned.</p>
             */
            public Builder params(java.util.List<Params> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>107841167</p>
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
