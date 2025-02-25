// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClusterImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterImagesResponseBody</p>
 */
public class ListClusterImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("datas")
    private Datas datas;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListClusterImagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.datas = builder.datas;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return datas
     */
    public Datas getDatas() {
        return this.datas;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Datas datas; 
        private String msg; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * datas.
         */
        public Builder datas(Datas datas) {
            this.datas = datas;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterImagesResponseBody build() {
            return new ListClusterImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterImagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("controller_name")
        private String controllerName;

        @com.aliyun.core.annotation.NameInMap("controller_type")
        private String controllerType;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("image_hash")
        private String imageHash;

        @com.aliyun.core.annotation.NameInMap("image_name")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("updated")
        private String updated;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.controllerName = builder.controllerName;
            this.controllerType = builder.controllerType;
            this.created = builder.created;
            this.imageHash = builder.imageHash;
            this.imageName = builder.imageName;
            this.namespace = builder.namespace;
            this.uid = builder.uid;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return controllerName
         */
        public String getControllerName() {
            return this.controllerName;
        }

        /**
         * @return controllerType
         */
        public String getControllerType() {
            return this.controllerType;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return imageHash
         */
        public String getImageHash() {
            return this.imageHash;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String clusterId; 
            private String controllerName; 
            private String controllerType; 
            private String created; 
            private String imageHash; 
            private String imageName; 
            private String namespace; 
            private String uid; 
            private String updated; 

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * controller_name.
             */
            public Builder controllerName(String controllerName) {
                this.controllerName = controllerName;
                return this;
            }

            /**
             * controller_type.
             */
            public Builder controllerType(String controllerType) {
                this.controllerType = controllerType;
                return this;
            }

            /**
             * created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * image_hash.
             */
            public Builder imageHash(String imageHash) {
                this.imageHash = imageHash;
                return this;
            }

            /**
             * image_name.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
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
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterImagesResponseBody</p>
     */
    public static class Datas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < Data> data;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Datas(Builder builder) {
            this.current = builder.current;
            this.data = builder.data;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private java.util.List < Data> data; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * current.
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
}
