// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateView} extends {@link TeaModel}
 *
 * <p>TemplateView</p>
 */
public class TemplateView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List < Fields> fields;

    private TemplateView(Builder builder) {
        this.fields = builder.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateView create() {
        return builder().build();
    }

    /**
     * @return fields
     */
    public java.util.List < Fields> getFields() {
        return this.fields;
    }

    public static final class Builder {
        private java.util.List < Fields> fields; 

        /**
         * Fields.
         */
        public Builder fields(java.util.List < Fields> fields) {
            this.fields = fields;
            return this;
        }

        public TemplateView build() {
            return new TemplateView(this);
        } 

    } 

    public static class VisitInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AftsConf")
        private java.util.Map < String, ? > aftsConf;

        @com.aliyun.core.annotation.NameInMap("OssConf")
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
             * AftsConf.
             */
            public Builder aftsConf(java.util.Map < String, ? > aftsConf) {
                this.aftsConf = aftsConf;
                return this;
            }

            /**
             * OssConf.
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
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayOriImg")
        private Boolean displayOriImg;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VisitInfo")
        private VisitInfo visitInfo;

        private Fields(Builder builder) {
            this.displayOriImg = builder.displayOriImg;
            this.fieldName = builder.fieldName;
            this.type = builder.type;
            this.visitInfo = builder.visitInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return displayOriImg
         */
        public Boolean getDisplayOriImg() {
            return this.displayOriImg;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
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
            private Boolean displayOriImg; 
            private String fieldName; 
            private String type; 
            private VisitInfo visitInfo; 

            /**
             * DisplayOriImg.
             */
            public Builder displayOriImg(Boolean displayOriImg) {
                this.displayOriImg = displayOriImg;
                return this;
            }

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
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

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
