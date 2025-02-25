// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ViewPlugin} extends {@link TeaModel}
 *
 * <p>ViewPlugin</p>
 */
public class ViewPlugin extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BindField")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindField;

    @com.aliyun.core.annotation.NameInMap("Convertor")
    private String convertor;

    @com.aliyun.core.annotation.NameInMap("CorsProxy")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean corsProxy;

    @com.aliyun.core.annotation.NameInMap("DisplayOriImg")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean displayOriImg;

    @com.aliyun.core.annotation.NameInMap("Exif")
    private java.util.Map < String, ? > exif;

    @com.aliyun.core.annotation.NameInMap("Hide")
    private Boolean hide;

    @com.aliyun.core.annotation.NameInMap("Plugins")
    private java.util.Map < String, ? > plugins;

    @com.aliyun.core.annotation.NameInMap("RelationQuestionIds")
    private java.util.List < String > relationQuestionIds;

    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("VisitInfo")
    private VisitInfo visitInfo;

    private ViewPlugin(Builder builder) {
        this.bindField = builder.bindField;
        this.convertor = builder.convertor;
        this.corsProxy = builder.corsProxy;
        this.displayOriImg = builder.displayOriImg;
        this.exif = builder.exif;
        this.hide = builder.hide;
        this.plugins = builder.plugins;
        this.relationQuestionIds = builder.relationQuestionIds;
        this.type = builder.type;
        this.visitInfo = builder.visitInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewPlugin create() {
        return builder().build();
    }

    /**
     * @return bindField
     */
    public String getBindField() {
        return this.bindField;
    }

    /**
     * @return convertor
     */
    public String getConvertor() {
        return this.convertor;
    }

    /**
     * @return corsProxy
     */
    public Boolean getCorsProxy() {
        return this.corsProxy;
    }

    /**
     * @return displayOriImg
     */
    public Boolean getDisplayOriImg() {
        return this.displayOriImg;
    }

    /**
     * @return exif
     */
    public java.util.Map < String, ? > getExif() {
        return this.exif;
    }

    /**
     * @return hide
     */
    public Boolean getHide() {
        return this.hide;
    }

    /**
     * @return plugins
     */
    public java.util.Map < String, ? > getPlugins() {
        return this.plugins;
    }

    /**
     * @return relationQuestionIds
     */
    public java.util.List < String > getRelationQuestionIds() {
        return this.relationQuestionIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return visitInfo
     */
    public VisitInfo getVisitInfo() {
        return this.visitInfo;
    }

    public static final class Builder {
        private String bindField; 
        private String convertor; 
        private Boolean corsProxy; 
        private Boolean displayOriImg; 
        private java.util.Map < String, ? > exif; 
        private Boolean hide; 
        private java.util.Map < String, ? > plugins; 
        private java.util.List < String > relationQuestionIds; 
        private String type; 
        private VisitInfo visitInfo; 

        /**
         * BindField.
         */
        public Builder bindField(String bindField) {
            this.bindField = bindField;
            return this;
        }

        /**
         * Convertor.
         */
        public Builder convertor(String convertor) {
            this.convertor = convertor;
            return this;
        }

        /**
         * CorsProxy.
         */
        public Builder corsProxy(Boolean corsProxy) {
            this.corsProxy = corsProxy;
            return this;
        }

        /**
         * DisplayOriImg.
         */
        public Builder displayOriImg(Boolean displayOriImg) {
            this.displayOriImg = displayOriImg;
            return this;
        }

        /**
         * Exif.
         */
        public Builder exif(java.util.Map < String, ? > exif) {
            this.exif = exif;
            return this;
        }

        /**
         * Hide.
         */
        public Builder hide(Boolean hide) {
            this.hide = hide;
            return this;
        }

        /**
         * Plugins.
         */
        public Builder plugins(java.util.Map < String, ? > plugins) {
            this.plugins = plugins;
            return this;
        }

        /**
         * RelationQuestionIds.
         */
        public Builder relationQuestionIds(java.util.List < String > relationQuestionIds) {
            this.relationQuestionIds = relationQuestionIds;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * VisitInfo.
         */
        public Builder visitInfo(VisitInfo visitInfo) {
            this.visitInfo = visitInfo;
            return this;
        }

        public ViewPlugin build() {
            return new ViewPlugin(this);
        } 

    } 

    public static class VisitInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aftsConf")
        private java.util.Map < String, ? > aftsConf;

        @com.aliyun.core.annotation.NameInMap("ossConf")
        private java.util.Map < String, ? > ossConf;

        private VisitInfo(Builder builder) {
            this.aftsConf = builder.aftsConf;
            this.ossConf = builder.ossConf;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisitInfo create() {
            return builder().build();
        }

        /**
         * @return aftsConf
         */
        public java.util.Map < String, ? > getAftsConf() {
            return this.aftsConf;
        }

        /**
         * @return ossConf
         */
        public java.util.Map < String, ? > getOssConf() {
            return this.ossConf;
        }

        public static final class Builder {
            private java.util.Map < String, ? > aftsConf; 
            private java.util.Map < String, ? > ossConf; 

            /**
             * aftsConf.
             */
            public Builder aftsConf(java.util.Map < String, ? > aftsConf) {
                this.aftsConf = aftsConf;
                return this;
            }

            /**
             * ossConf.
             */
            public Builder ossConf(java.util.Map < String, ? > ossConf) {
                this.ossConf = ossConf;
                return this;
            }

            public VisitInfo build() {
                return new VisitInfo(this);
            } 

        } 

    }
}
