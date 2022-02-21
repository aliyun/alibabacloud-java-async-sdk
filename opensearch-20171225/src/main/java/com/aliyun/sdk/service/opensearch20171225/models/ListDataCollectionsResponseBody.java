// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataCollectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCollectionsResponseBody</p>
 */
public class ListDataCollectionsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListDataCollectionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCollectionsResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer totalCount; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataCollectionsResponseBody build() {
            return new ListDataCollectionsResponseBody(this);
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
             * created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * dataCollectionType.
             */
            public Builder dataCollectionType(String dataCollectionType) {
                this.dataCollectionType = dataCollectionType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * industryName.
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * sundialId.
             */
            public Builder sundialId(String sundialId) {
                this.sundialId = sundialId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * updated.
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
