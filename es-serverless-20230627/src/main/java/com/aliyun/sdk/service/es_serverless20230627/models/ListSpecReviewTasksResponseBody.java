// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpecReviewTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListSpecReviewTasksResponseBody</p>
 */
public class ListSpecReviewTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListSpecReviewTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSpecReviewTasksResponseBody create() {
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
         * Id of the request
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

        public ListSpecReviewTasksResponseBody build() {
            return new ListSpecReviewTasksResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("appName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("applyReason")
        private String applyReason;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.id = builder.id;
            this.appName = builder.appName;
            this.applyReason = builder.applyReason;
            this.gmtCreate = builder.gmtCreate;
            this.source = builder.source;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return applyReason
         */
        public String getApplyReason() {
            return this.applyReason;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String appName; 
            private String applyReason; 
            private String gmtCreate; 
            private String source; 
            private String status; 
            private String type; 

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * appName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * applyReason.
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
