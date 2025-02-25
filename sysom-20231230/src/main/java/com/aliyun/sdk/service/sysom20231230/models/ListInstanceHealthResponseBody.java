// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListInstanceHealthResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceHealthResponseBody</p>
 */
public class ListInstanceHealthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListInstanceHealthResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceHealthResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Integer total; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListInstanceHealthResponseBody build() {
            return new ListInstanceHealthResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceHealthResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceHealthResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<String> images;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("region_id")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.images = builder.images;
            this.instance = builder.instance;
            this.namespace = builder.namespace;
            this.pod = builder.pod;
            this.regionId = builder.regionId;
            this.score = builder.score;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return images
         */
        public java.util.List<String> getImages() {
            return this.images;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> images; 
            private String instance; 
            private String namespace; 
            private String pod; 
            private String regionId; 
            private Float score; 
            private String status; 

            /**
             * images.
             */
            public Builder images(java.util.List<String> images) {
                this.images = images;
                return this;
            }

            /**
             * instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * pod.
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * region_id.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
