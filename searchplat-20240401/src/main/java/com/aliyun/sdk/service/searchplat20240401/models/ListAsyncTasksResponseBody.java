// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ListAsyncTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListAsyncTasksResponseBody</p>
 */
public class ListAsyncTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private ListAsyncTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsyncTasksResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListAsyncTasksResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2BA0504F-B179-586D-8210-A7C7C09A9907</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListAsyncTasksResponseBody build() {
            return new ListAsyncTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAsyncTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListAsyncTasksResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("dataId")
        private Integer dataId;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Long updated;

        private Result(Builder builder) {
            this.created = builder.created;
            this.dataId = builder.dataId;
            this.id = builder.id;
            this.name = builder.name;
            this.result = builder.result;
            this.serviceId = builder.serviceId;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
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
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return dataId
         */
        public Integer getDataId() {
            return this.dataId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updated
         */
        public Long getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Long created; 
            private Integer dataId; 
            private String id; 
            private String name; 
            private String result; 
            private String serviceId; 
            private String serviceType; 
            private String status; 
            private Long updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.created = model.created;
                this.dataId = model.dataId;
                this.id = model.id;
                this.name = model.name;
                this.result = model.result;
                this.serviceId = model.serviceId;
                this.serviceType = model.serviceType;
                this.status = model.status;
                this.updated = model.updated;
            } 

            /**
             * created.
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * dataId.
             */
            public Builder dataId(Integer dataId) {
                this.dataId = dataId;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * serviceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Long updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
