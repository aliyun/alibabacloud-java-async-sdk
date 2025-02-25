// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserClustersResponseBody</p>
 */
public class ListUserClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListUserClustersResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
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
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListUserClustersResponseBody build() {
            return new ListUserClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserClustersResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            /**
             * X-Total-Count.
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserClustersResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("metaType")
        private String metaType;

        private Meta(Builder builder) {
            this.description = builder.description;
            this.metaType = builder.metaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return metaType
         */
        public String getMetaType() {
            return this.metaType;
        }

        public static final class Builder {
            private String description; 
            private String metaType; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * metaType.
             */
            public Builder metaType(String metaType) {
                this.metaType = metaType;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserClustersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.meta = builder.meta;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
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
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Meta meta; 
            private String name; 
            private String status; 

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>meta</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
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
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
