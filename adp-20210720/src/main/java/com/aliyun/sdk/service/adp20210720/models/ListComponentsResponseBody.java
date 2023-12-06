// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentsResponseBody</p>
 */
public class ListComponentsResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private ListComponentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsResponseBody create() {
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

        public ListComponentsResponseBody build() {
            return new ListComponentsResponseBody(this);
        } 

    } 

    public static class Annotations extends TeaModel {
        @NameInMap("annotations")
        private String annotations;

        private Annotations(Builder builder) {
            this.annotations = builder.annotations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public String getAnnotations() {
            return this.annotations;
        }

        public static final class Builder {
            private String annotations; 

            /**
             * annotations.
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("annotations")
        private Annotations annotations;

        @NameInMap("category")
        private String category;

        @NameInMap("description")
        private String description;

        @NameInMap("documents")
        private String documents;

        @NameInMap("name")
        private String name;

        @NameInMap("provider")
        private String provider;

        @NameInMap("public")
        private Boolean _public;

        @NameInMap("singleton")
        private Boolean singleton;

        @NameInMap("source")
        private String source;

        @NameInMap("uid")
        private String uid;

        private List(Builder builder) {
            this.annotations = builder.annotations;
            this.category = builder.category;
            this.description = builder.description;
            this.documents = builder.documents;
            this.name = builder.name;
            this.provider = builder.provider;
            this._public = builder._public;
            this.singleton = builder.singleton;
            this.source = builder.source;
            this.uid = builder.uid;
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
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documents
         */
        public String getDocuments() {
            return this.documents;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return _public
         */
        public Boolean get_public() {
            return this._public;
        }

        /**
         * @return singleton
         */
        public Boolean getSingleton() {
            return this.singleton;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Annotations annotations; 
            private String category; 
            private String description; 
            private String documents; 
            private String name; 
            private String provider; 
            private Boolean _public; 
            private Boolean singleton; 
            private String source; 
            private String uid; 

            /**
             * annotations.
             */
            public Builder annotations(Annotations annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * documents.
             */
            public Builder documents(String documents) {
                this.documents = documents;
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
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * public.
             */
            public Builder _public(Boolean _public) {
                this._public = _public;
                return this;
            }

            /**
             * singleton.
             */
            public Builder singleton(Boolean singleton) {
                this.singleton = singleton;
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
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
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
