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
 * {@link ListExperienceDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperienceDataResponseBody</p>
 */
public class ListExperienceDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private ListExperienceDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperienceDataResponseBody create() {
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

        private Builder(ListExperienceDataResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

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
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListExperienceDataResponseBody build() {
            return new ListExperienceDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExperienceDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperienceDataResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("dataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("dataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("dataValue")
        private String dataValue;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("serviceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Long updated;

        private Result(Builder builder) {
            this.contentType = builder.contentType;
            this.created = builder.created;
            this.dataSize = builder.dataSize;
            this.dataType = builder.dataType;
            this.dataValue = builder.dataValue;
            this.id = builder.id;
            this.name = builder.name;
            this.serviceType = builder.serviceType;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return dataValue
         */
        public String getDataValue() {
            return this.dataValue;
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
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return updated
         */
        public Long getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String contentType; 
            private Long created; 
            private Long dataSize; 
            private String dataType; 
            private String dataValue; 
            private Long id; 
            private String name; 
            private String serviceType; 
            private Long updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.contentType = model.contentType;
                this.created = model.created;
                this.dataSize = model.dataSize;
                this.dataType = model.dataType;
                this.dataValue = model.dataValue;
                this.id = model.id;
                this.name = model.name;
                this.serviceType = model.serviceType;
                this.updated = model.updated;
            } 

            /**
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * created.
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * dataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * dataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * dataValue.
             */
            public Builder dataValue(String dataValue) {
                this.dataValue = dataValue;
                return this;
            }

            /**
             * <p>ID</p>
             * 
             * <strong>example:</strong>
             * <p>9bd21be8</p>
             */
            public Builder id(Long id) {
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
             * serviceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
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
