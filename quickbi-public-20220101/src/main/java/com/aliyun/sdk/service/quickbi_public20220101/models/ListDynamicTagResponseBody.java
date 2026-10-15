// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListDynamicTagResponseBody} extends {@link TeaModel}
 *
 * <p>ListDynamicTagResponseBody</p>
 */
public class ListDynamicTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDynamicTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicTagResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDynamicTagResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A**********DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The label list.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDynamicTagResponseBody build() {
            return new ListDynamicTagResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDynamicTagResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicTagResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("ConfigName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("DsId")
        private String dsId;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("RelatedAttribute")
        private Integer relatedAttribute;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Result(Builder builder) {
            this.columnName = builder.columnName;
            this.configId = builder.configId;
            this.configName = builder.configName;
            this.dsId = builder.dsId;
            this.organizationId = builder.organizationId;
            this.relatedAttribute = builder.relatedAttribute;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return dsId
         */
        public String getDsId() {
            return this.dsId;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return relatedAttribute
         */
        public Integer getRelatedAttribute() {
            return this.relatedAttribute;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String columnName; 
            private String configId; 
            private String configName; 
            private String dsId; 
            private String organizationId; 
            private Integer relatedAttribute; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.columnName = model.columnName;
                this.configId = model.configId;
                this.configName = model.configName;
                this.dsId = model.dsId;
                this.organizationId = model.organizationId;
                this.relatedAttribute = model.relatedAttribute;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The column name of the associated data source.</p>
             * 
             * <strong>example:</strong>
             * <p>site_id</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The ID of the individual configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>cfg****14352318681088</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The name of the label configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>eip</p>
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * <p>The ID of the associated data source.</p>
             * 
             * <strong>example:</strong>
             * <p>a201c85c-******</p>
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * <p>The organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2fe4fbd8-<strong><strong>-</strong></strong>-b3e1-e92c7af083ea</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * <p>The associated user attribute. Valid values:</p>
             * <ul>
             * <li>0: account ID</li>
             * <li>1: account name</li>
             * <li>2: nickname within the organization</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder relatedAttribute(Integer relatedAttribute) {
                this.relatedAttribute = relatedAttribute;
                return this;
            }

            /**
             * <p>The table name of the associated data source.</p>
             * 
             * <strong>example:</strong>
             * <p>testTable02\&quot;\&quot;</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
