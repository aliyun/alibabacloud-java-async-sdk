// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrTemplatesResponseBody</p>
 */
public class DescribeCrTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Templates")
    private java.util.List < Templates> templates;

    private DescribeCrTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Templates> templates; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        public DescribeCrTemplatesResponseBody build() {
            return new DescribeCrTemplatesResponseBody(this);
        } 

    } 

    public static class Templates extends TeaModel {
        @NameInMap("ChineseName")
        private String chineseName;

        @NameInMap("EnglishName")
        private String englishName;

        @NameInMap("Yaml")
        private String yaml;

        private Templates(Builder builder) {
            this.chineseName = builder.chineseName;
            this.englishName = builder.englishName;
            this.yaml = builder.yaml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return chineseName
         */
        public String getChineseName() {
            return this.chineseName;
        }

        /**
         * @return englishName
         */
        public String getEnglishName() {
            return this.englishName;
        }

        /**
         * @return yaml
         */
        public String getYaml() {
            return this.yaml;
        }

        public static final class Builder {
            private String chineseName; 
            private String englishName; 
            private String yaml; 

            /**
             * ChineseName.
             */
            public Builder chineseName(String chineseName) {
                this.chineseName = chineseName;
                return this;
            }

            /**
             * EnglishName.
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
                return this;
            }

            /**
             * Yaml.
             */
            public Builder yaml(String yaml) {
                this.yaml = yaml;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
