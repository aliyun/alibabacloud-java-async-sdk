// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCollctionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCollctionResponseBody</p>
 */
public class DescribeDataCollctionResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
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
         * The ID of the request.
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
        @NameInMap("created")
        private Integer created;

        @NameInMap("dataCollectionType")
        private String dataCollectionType;

        @NameInMap("id")
        private String id;

        @NameInMap("industryName")
        private String industryName;

        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private Integer status;

        @NameInMap("sundialId")
        private String sundialId;

        @NameInMap("type")
        private String type;

        @NameInMap("updated")
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
             * The time when the data collection task was created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * The type of the data that is collected by the task. Valid values:
             * <p>
             * 
             * *   behavior: behavioral data
             * *   item_info: project data
             * *   industry_specific: industry-specific data
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
             * The industry to which the data collection task applies. Valid values:
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
             * The status of the data collection task. Valid values:
             * <p>
             * 
             * *   0: disabled
             * *   1: being enabled
             * *   2: enabled
             * *   3: failed to be enabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the sundial.
             */
            public Builder sundialId(String sundialId) {
                this.sundialId = sundialId;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   server
             * 
             * *   web
             * 
             * *   app
             * 
             *     Note: Only server is supported.
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
