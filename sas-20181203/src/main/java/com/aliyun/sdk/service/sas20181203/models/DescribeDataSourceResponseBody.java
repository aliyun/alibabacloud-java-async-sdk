// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSourceResponseBody</p>
 */
public class DescribeDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetaDatas")
    private java.util.List<MetaDatas> metaDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDataSourceResponseBody(Builder builder) {
        this.metaDatas = builder.metaDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return metaDatas
     */
    public java.util.List<MetaDatas> getMetaDatas() {
        return this.metaDatas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MetaDatas> metaDatas; 
        private String requestId; 

        /**
         * <p>The metadata of the data sources.</p>
         */
        public Builder metaDatas(java.util.List<MetaDatas> metaDatas) {
            this.metaDatas = metaDatas;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataSourceResponseBody build() {
            return new DescribeDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourceResponseBody</p>
     */
    public static class OperatorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private OperatorList(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String name; 

            /**
             * <p>The description of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk_vul</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>regex</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public OperatorList build() {
                return new OperatorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourceResponseBody</p>
     */
    public static class MetaDataFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Filed")
        private String filed;

        @com.aliyun.core.annotation.NameInMap("FiledName")
        private String filedName;

        @com.aliyun.core.annotation.NameInMap("OperatorList")
        private java.util.List<OperatorList> operatorList;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private MetaDataFields(Builder builder) {
            this.filed = builder.filed;
            this.filedName = builder.filedName;
            this.operatorList = builder.operatorList;
            this.sample = builder.sample;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaDataFields create() {
            return builder().build();
        }

        /**
         * @return filed
         */
        public String getFiled() {
            return this.filed;
        }

        /**
         * @return filedName
         */
        public String getFiledName() {
            return this.filedName;
        }

        /**
         * @return operatorList
         */
        public java.util.List<OperatorList> getOperatorList() {
            return this.operatorList;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String filed; 
            private String filedName; 
            private java.util.List<OperatorList> operatorList; 
            private String sample; 
            private String valueType; 

            /**
             * <p>The key of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder filed(String filed) {
                this.filed = filed;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk_vul_type</p>
             */
            public Builder filedName(String filedName) {
                this.filedName = filedName;
                return this;
            }

            /**
             * <p>The operators.</p>
             */
            public Builder operatorList(java.util.List<OperatorList> operatorList) {
                this.operatorList = operatorList;
                return this;
            }

            /**
             * <p>The sample field.</p>
             * 
             * <strong>example:</strong>
             * <p>all:dingtalk_all;cms:dingtalk_vul_cms;oval:dingtalk_vul_cve;sys:dingtalk_vul_sys;emg:dingtalk_vul_emg</p>
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * <p>The value type of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public MetaDataFields build() {
                return new MetaDataFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourceResponseBody</p>
     */
    public static class MetaDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Integer dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MetaDataFields")
        private java.util.List<MetaDataFields> metaDataFields;

        private MetaDatas(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.description = builder.description;
            this.metaDataFields = builder.metaDataFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaDatas create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public Integer getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return metaDataFields
         */
        public java.util.List<MetaDataFields> getMetaDataFields() {
            return this.metaDataFields;
        }

        public static final class Builder {
            private Integer dataSourceId; 
            private String dataSourceName; 
            private String description; 
            private java.util.List<MetaDataFields> metaDataFields; 

            /**
             * <p>The ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>1753</p>
             */
            public Builder dataSourceId(Integer dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_analysis_pre-sas-operation-log-sas-event-suspicious</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The description of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk_suspicious</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The metadata files.</p>
             */
            public Builder metaDataFields(java.util.List<MetaDataFields> metaDataFields) {
                this.metaDataFields = metaDataFields;
                return this;
            }

            public MetaDatas build() {
                return new MetaDatas(this);
            } 

        } 

    }
}
