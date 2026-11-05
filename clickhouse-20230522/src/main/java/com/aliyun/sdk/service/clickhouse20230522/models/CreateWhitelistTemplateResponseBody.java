// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link CreateWhitelistTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWhitelistTemplateResponseBody</p>
 */
public class CreateWhitelistTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateWhitelistTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWhitelistTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateWhitelistTemplateResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateWhitelistTemplateResponseBody build() {
            return new CreateWhitelistTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWhitelistTemplateResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private Templates(Builder builder) {
            this.securityIPList = builder.securityIPList;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String securityIPList; 
            private String templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.securityIPList = model.securityIPList;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The IP whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1,10.0.0.1</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The ID of the whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>g-asdfwem</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWhitelistTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Templates")
        private java.util.List<Templates> templates;

        private Data(Builder builder) {
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return templates
         */
        public java.util.List<Templates> getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private java.util.List<Templates> templates; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.templates = model.templates;
            } 

            /**
             * <p>The list of whitelist templates.</p>
             */
            public Builder templates(java.util.List<Templates> templates) {
                this.templates = templates;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
