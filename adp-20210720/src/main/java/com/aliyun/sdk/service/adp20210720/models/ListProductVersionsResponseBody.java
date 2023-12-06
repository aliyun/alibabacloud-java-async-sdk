// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductVersionsResponseBody</p>
 */
public class ListProductVersionsResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private ListProductVersionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductVersionsResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

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
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public ListProductVersionsResponseBody build() {
            return new ListProductVersionsResponseBody(this);
        } 

    } 

    public static class Annotations extends TeaModel {
        @NameInMap("additionalProp1")
        private String additionalProp1;

        @NameInMap("additionalProp2")
        private String additionalProp2;

        @NameInMap("additionalProp3")
        private String additionalProp3;

        private Annotations(Builder builder) {
            this.additionalProp1 = builder.additionalProp1;
            this.additionalProp2 = builder.additionalProp2;
            this.additionalProp3 = builder.additionalProp3;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
            return builder().build();
        }

        /**
         * @return additionalProp1
         */
        public String getAdditionalProp1() {
            return this.additionalProp1;
        }

        /**
         * @return additionalProp2
         */
        public String getAdditionalProp2() {
            return this.additionalProp2;
        }

        /**
         * @return additionalProp3
         */
        public String getAdditionalProp3() {
            return this.additionalProp3;
        }

        public static final class Builder {
            private String additionalProp1; 
            private String additionalProp2; 
            private String additionalProp3; 

            /**
             * additionalProp1.
             */
            public Builder additionalProp1(String additionalProp1) {
                this.additionalProp1 = additionalProp1;
                return this;
            }

            /**
             * additionalProp2.
             */
            public Builder additionalProp2(String additionalProp2) {
                this.additionalProp2 = additionalProp2;
                return this;
            }

            /**
             * additionalProp3.
             */
            public Builder additionalProp3(String additionalProp3) {
                this.additionalProp3 = additionalProp3;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("annotations")
        private Annotations annotations;

        @NameInMap("description")
        private String description;

        @NameInMap("packageURL")
        private String packageURL;

        @NameInMap("productName")
        private String productName;

        @NameInMap("productUID")
        private String productUID;

        @NameInMap("provider")
        private String provider;

        @NameInMap("releasedAt")
        private String releasedAt;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("uid")
        private String uid;

        @NameInMap("version")
        private String version;

        private List(Builder builder) {
            this.annotations = builder.annotations;
            this.description = builder.description;
            this.packageURL = builder.packageURL;
            this.productName = builder.productName;
            this.productUID = builder.productUID;
            this.provider = builder.provider;
            this.releasedAt = builder.releasedAt;
            this.tags = builder.tags;
            this.uid = builder.uid;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public Annotations getAnnotations() {
            return this.annotations;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return packageURL
         */
        public String getPackageURL() {
            return this.packageURL;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productUID
         */
        public String getProductUID() {
            return this.productUID;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return releasedAt
         */
        public String getReleasedAt() {
            return this.releasedAt;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Annotations annotations; 
            private String description; 
            private String packageURL; 
            private String productName; 
            private String productUID; 
            private String provider; 
            private String releasedAt; 
            private java.util.List < Tags> tags; 
            private String uid; 
            private String version; 

            /**
             * annotations.
             */
            public Builder annotations(Annotations annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * packageURL.
             */
            public Builder packageURL(String packageURL) {
                this.packageURL = packageURL;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productUID.
             */
            public Builder productUID(String productUID) {
                this.productUID = productUID;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * releasedAt.
             */
            public Builder releasedAt(String releasedAt) {
                this.releasedAt = releasedAt;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
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
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("list")
        private java.util.List < List> list;

        @NameInMap("pageNum")
        private Integer pageNum;

        @NameInMap("pageSize")
        private Integer pageSize;

        @NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
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
            private java.util.List < List> list; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
