// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Summary} extends {@link TeaModel}
 *
 * <p>Summary</p>
 */
public class Summary extends TeaModel {
    @NameInMap("active")
    private Boolean active;

    @NameInMap("meta")
    private Meta meta;

    @NameInMap("name")
    private String name;

    private Summary(Builder builder) {
        this.active = builder.active;
        this.meta = builder.meta;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Summary create() {
        return builder().build();
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
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

    public static final class Builder {
        private Boolean active; 
        private Meta meta; 
        private String name; 

        /**
         * active.
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * meta.
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

        public Summary build() {
            return new Summary(this);
        } 

    } 

    public static class Meta extends TeaModel {
        @NameInMap("element")
        private String element;

        @NameInMap("ellipsis")
        private String ellipsis;

        @NameInMap("field")
        private String field;

        @NameInMap("len")
        private Integer len;

        @NameInMap("snippet")
        private String snippet;

        private Meta(Builder builder) {
            this.element = builder.element;
            this.ellipsis = builder.ellipsis;
            this.field = builder.field;
            this.len = builder.len;
            this.snippet = builder.snippet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return element
         */
        public String getElement() {
            return this.element;
        }

        /**
         * @return ellipsis
         */
        public String getEllipsis() {
            return this.ellipsis;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return len
         */
        public Integer getLen() {
            return this.len;
        }

        /**
         * @return snippet
         */
        public String getSnippet() {
            return this.snippet;
        }

        public static final class Builder {
            private String element; 
            private String ellipsis; 
            private String field; 
            private Integer len; 
            private String snippet; 

            /**
             * element.
             */
            public Builder element(String element) {
                this.element = element;
                return this;
            }

            /**
             * ellipsis.
             */
            public Builder ellipsis(String ellipsis) {
                this.ellipsis = ellipsis;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * len.
             */
            public Builder len(Integer len) {
                this.len = len;
                return this;
            }

            /**
             * snippet.
             */
            public Builder snippet(String snippet) {
                this.snippet = snippet;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
