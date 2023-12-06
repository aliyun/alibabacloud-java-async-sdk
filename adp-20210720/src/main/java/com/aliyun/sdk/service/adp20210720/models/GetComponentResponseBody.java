// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetComponentResponseBody} extends {@link TeaModel}
 *
 * <p>GetComponentResponseBody</p>
 */
public class GetComponentResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetComponentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComponentResponseBody create() {
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

        public GetComponentResponseBody build() {
            return new GetComponentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("category")
        private String category;

        @NameInMap("description")
        private String description;

        @NameInMap("documents")
        private String documents;

        @NameInMap("name")
        private String name;

        @NameInMap("public")
        private Boolean _public;

        @NameInMap("singleton")
        private Boolean singleton;

        @NameInMap("source")
        private String source;

        @NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.category = builder.category;
            this.description = builder.description;
            this.documents = builder.documents;
            this.name = builder.name;
            this._public = builder._public;
            this.singleton = builder.singleton;
            this.source = builder.source;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
            private String category; 
            private String description; 
            private String documents; 
            private String name; 
            private Boolean _public; 
            private Boolean singleton; 
            private String source; 
            private String uid; 

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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
