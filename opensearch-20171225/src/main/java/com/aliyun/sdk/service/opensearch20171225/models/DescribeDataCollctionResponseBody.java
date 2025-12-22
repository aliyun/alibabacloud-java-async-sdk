// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link DescribeDataCollctionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCollctionResponseBody</p>
 */
public class DescribeDataCollctionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeDataCollctionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCollctionResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeDataCollctionResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>72FAD77B-83F9-F393-BA8E-5834E2427BF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the data collection task.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeDataCollctionResponseBody build() {
            return new DescribeDataCollctionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataCollctionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataCollctionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("dataCollectionType")
        private String dataCollectionType;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("industryName")
        private String industryName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("sundialId")
        private String sundialId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.created = builder.created;
            this.dataCollectionType = builder.dataCollectionType;
            this.id = builder.id;
            this.industryName = builder.industryName;
            this.name = builder.name;
            this.status = builder.status;
            this.sundialId = builder.sundialId;
            this.type = builder.type;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return dataCollectionType
         */
        public String getDataCollectionType() {
            return this.dataCollectionType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return industryName
         */
        public String getIndustryName() {
            return this.industryName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return sundialId
         */
        public String getSundialId() {
            return this.sundialId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Integer created; 
            private String dataCollectionType; 
            private String id; 
            private String industryName; 
            private String name; 
            private Integer status; 
            private String sundialId; 
            private String type; 
            private Integer updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.created = model.created;
                this.dataCollectionType = model.dataCollectionType;
                this.id = model.id;
                this.industryName = model.industryName;
                this.name = model.name;
                this.status = model.status;
                this.sundialId = model.sundialId;
                this.type = model.type;
                this.updated = model.updated;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1581065837</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The type of data collected. Valid values:</p>
             * <ul>
             * <li>behavior: behavioral data.</li>
             * <li>item_info: project information.</li>
             * <li>industry_specific: industry-specific data.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BEHAVIOR</p>
             */
            public Builder dataCollectionType(String dataCollectionType) {
                this.dataCollectionType = dataCollectionType;
                return this;
            }

            /**
             * <p>The ID of the data collection task.</p>
             * 
             * <strong>example:</strong>
             * <p>286</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The industry name. Valid values:</p>
             * <ul>
             * <li>general</li>
             * <li>ecommerce</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GENERAL</p>
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * <p>The name of the data collection task.</p>
             * 
             * <strong>example:</strong>
             * <p>os_function_test_v1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the data collection feature. Valid values:</p>
             * <ul>
             * <li>0: The feature is disabled.</li>
             * <li>1: The feature is being enabled.</li>
             * <li>2: The feature is enabled.</li>
             * <li>3: The feature failed to be enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sundial ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1755</p>
             */
            public Builder sundialId(String sundialId) {
                this.sundialId = sundialId;
                return this;
            }

            /**
             * <p>The type of the source from which data was collected. Valid values:</p>
             * <ul>
             * <li>server</li>
             * <li>web</li>
             * <li>app Note: Only server is supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>server</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the data collection task was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1581065904</p>
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
