// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeCrTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrTemplatesResponseBody</p>
 */
public class DescribeCrTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.List<Templates> templates;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Templates> getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Templates> templates; 

        private Builder() {
        } 

        private Builder(DescribeCrTemplatesResponseBody model) {
            this.requestId = model.requestId;
            this.templates = model.templates;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74E97AE2-2900-55C1-A069-C3C1EA*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The common YAML templates for the specified type of Istio resource.</p>
         */
        public Builder templates(java.util.List<Templates> templates) {
            this.templates = templates;
            return this;
        }

        public DescribeCrTemplatesResponseBody build() {
            return new DescribeCrTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChineseName")
        private String chineseName;

        @com.aliyun.core.annotation.NameInMap("EnglishName")
        private String englishName;

        @com.aliyun.core.annotation.NameInMap("Yaml")
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

            private Builder() {
            } 

            private Builder(Templates model) {
                this.chineseName = model.chineseName;
                this.englishName = model.englishName;
                this.yaml = model.yaml;
            } 

            /**
             * <p>The Chinese name of the YAML template.</p>
             */
            public Builder chineseName(String chineseName) {
                this.chineseName = chineseName;
                return this;
            }

            /**
             * <p>The English name of the YAML template.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP basic routing</p>
             */
            public Builder englishName(String englishName) {
                this.englishName = englishName;
                return this;
            }

            /**
             * <p>The content in the YAML template.</p>
             * 
             * <strong>example:</strong>
             * <p>apiVersion: networking.istio.io/v1beta1\nkind: VirtualService\nmetadata:\n  name: reviews-route # Name for this VirtualService.\nspec:\n  hosts:\n  - reviews.prod.svc.cluster.local # Service that this VirtualSerivce belongs to. \n  http:\n  - name: &quot;reviews-route&quot; # Name for the route.\n    route:\n    - destination: # Uniquely identifies the instances of a service to which all traffic should be forwarded to.\n        host: reviews.prod.svc.cluster.local # The name of a service from the service registry or ServiceEntry.\n        port:\n          number: 8080&quot;</p>
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
