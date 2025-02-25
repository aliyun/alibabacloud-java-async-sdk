// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDetailItemResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDetailItemResponseBody</p>
 */
public class QueryDetailItemResponseBody extends TeaModel {
    @NameInMap("Module")
    private Module module;

    private QueryDetailItemResponseBody(Builder builder) {
        this.module = builder.module;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDetailItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    public static final class Builder {
        private Module module; 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        public QueryDetailItemResponseBody build() {
            return new QueryDetailItemResponseBody(this);
        } 

    } 

    public static class Attribute extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Title")
        private String title;

        @NameInMap("Value")
        private String value;

        private Attribute(Builder builder) {
            this.name = builder.name;
            this.title = builder.title;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String title; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
    public static class Attributes extends TeaModel {
        @NameInMap("attribute")
        private java.util.List < Attribute> attribute;

        private Attributes(Builder builder) {
            this.attribute = builder.attribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public java.util.List < Attribute> getAttribute() {
            return this.attribute;
        }

        public static final class Builder {
            private java.util.List < Attribute> attribute; 

            /**
             * attribute.
             */
            public Builder attribute(java.util.List < Attribute> attribute) {
                this.attribute = attribute;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    public static class DetailPicUrl extends TeaModel {
        @NameInMap("picUlr")
        private java.util.List < String > picUlr;

        private DetailPicUrl(Builder builder) {
            this.picUlr = builder.picUlr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailPicUrl create() {
            return builder().build();
        }

        /**
         * @return picUlr
         */
        public java.util.List < String > getPicUlr() {
            return this.picUlr;
        }

        public static final class Builder {
            private java.util.List < String > picUlr; 

            /**
             * picUlr.
             */
            public Builder picUlr(java.util.List < String > picUlr) {
                this.picUlr = picUlr;
                return this;
            }

            public DetailPicUrl build() {
                return new DetailPicUrl(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("Attributes")
        private Attributes attributes;

        @NameInMap("DetailDescription")
        private String detailDescription;

        @NameInMap("DetailObjectJson")
        private String detailObjectJson;

        @NameInMap("DetailPagePicUrl")
        private String detailPagePicUrl;

        @NameInMap("DetailPicUrl")
        private DetailPicUrl detailPicUrl;

        @NameInMap("Label")
        private String label;

        @NameInMap("MainPicUrl")
        private String mainPicUrl;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private String type;

        private Module(Builder builder) {
            this.attributes = builder.attributes;
            this.detailDescription = builder.detailDescription;
            this.detailObjectJson = builder.detailObjectJson;
            this.detailPagePicUrl = builder.detailPagePicUrl;
            this.detailPicUrl = builder.detailPicUrl;
            this.label = builder.label;
            this.mainPicUrl = builder.mainPicUrl;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public Attributes getAttributes() {
            return this.attributes;
        }

        /**
         * @return detailDescription
         */
        public String getDetailDescription() {
            return this.detailDescription;
        }

        /**
         * @return detailObjectJson
         */
        public String getDetailObjectJson() {
            return this.detailObjectJson;
        }

        /**
         * @return detailPagePicUrl
         */
        public String getDetailPagePicUrl() {
            return this.detailPagePicUrl;
        }

        /**
         * @return detailPicUrl
         */
        public DetailPicUrl getDetailPicUrl() {
            return this.detailPicUrl;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return mainPicUrl
         */
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Attributes attributes; 
            private String detailDescription; 
            private String detailObjectJson; 
            private String detailPagePicUrl; 
            private DetailPicUrl detailPicUrl; 
            private String label; 
            private String mainPicUrl; 
            private String title; 
            private String type; 

            /**
             * Attributes.
             */
            public Builder attributes(Attributes attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * DetailDescription.
             */
            public Builder detailDescription(String detailDescription) {
                this.detailDescription = detailDescription;
                return this;
            }

            /**
             * DetailObjectJson.
             */
            public Builder detailObjectJson(String detailObjectJson) {
                this.detailObjectJson = detailObjectJson;
                return this;
            }

            /**
             * DetailPagePicUrl.
             */
            public Builder detailPagePicUrl(String detailPagePicUrl) {
                this.detailPagePicUrl = detailPagePicUrl;
                return this;
            }

            /**
             * DetailPicUrl.
             */
            public Builder detailPicUrl(DetailPicUrl detailPicUrl) {
                this.detailPicUrl = detailPicUrl;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * MainPicUrl.
             */
            public Builder mainPicUrl(String mainPicUrl) {
                this.mainPicUrl = mainPicUrl;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
