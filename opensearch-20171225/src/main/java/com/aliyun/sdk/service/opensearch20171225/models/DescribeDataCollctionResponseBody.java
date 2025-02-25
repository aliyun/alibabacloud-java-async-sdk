// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the data collection task.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeDataCollctionResponseBody build() {
            return new DescribeDataCollctionResponseBody(this);
        } 

    } 

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

            /**
             * The time when the task was created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * The type of data collected. Valid values:
             * <p>
             * 
             * *   behavior: behavioral data.
             * *   item_info: project information.
             * *   industry_specific: industry-specific data.
             */
            public Builder dataCollectionType(String dataCollectionType) {
                this.dataCollectionType = dataCollectionType;
                return this;
            }

            /**
             * The ID of the data collection task.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The industry name. Valid values:
             * <p>
             * 
             * *   general
             * *   ecommerce
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * The name of the data collection task.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the data collection feature. Valid values:
             * <p>
             * 
             * *   0: The feature is disabled.
             * *   1: The feature is being enabled.
             * *   2: The feature is enabled.
             * *   3: The feature failed to be enabled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The sundial ID.
             */
            public Builder sundialId(String sundialId) {
                this.sundialId = sundialId;
                return this;
            }

            /**
             * The type of the source from which data was collected. Valid values:
             * <p>
             * 
             * *   server
             * *   web
             * *   app Note: Only server is supported.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the data collection task was updated.
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
