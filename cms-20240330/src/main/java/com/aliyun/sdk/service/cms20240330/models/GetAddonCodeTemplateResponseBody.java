// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetAddonCodeTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetAddonCodeTemplateResponseBody</p>
 */
public class GetAddonCodeTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codes")
    private java.util.List<Codes> codes;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAddonCodeTemplateResponseBody(Builder builder) {
        this.codes = builder.codes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonCodeTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codes
     */
    public java.util.List<Codes> getCodes() {
        return this.codes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Codes> codes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAddonCodeTemplateResponseBody model) {
            this.codes = model.codes;
            this.requestId = model.requestId;
        } 

        /**
         * codes.
         */
        public Builder codes(java.util.List<Codes> codes) {
            this.codes = codes;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAddonCodeTemplateResponseBody build() {
            return new GetAddonCodeTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAddonCodeTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonCodeTemplateResponseBody</p>
     */
    public static class Codes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("codeTemplate")
        private String codeTemplate;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Codes(Builder builder) {
            this.codeTemplate = builder.codeTemplate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Codes create() {
            return builder().build();
        }

        /**
         * @return codeTemplate
         */
        public String getCodeTemplate() {
            return this.codeTemplate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String codeTemplate; 
            private String name; 

            private Builder() {
            } 

            private Builder(Codes model) {
                this.codeTemplate = model.codeTemplate;
                this.name = model.name;
            } 

            /**
             * codeTemplate.
             */
            public Builder codeTemplate(String codeTemplate) {
                this.codeTemplate = codeTemplate;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Codes build() {
                return new Codes(this);
            } 

        } 

    }
}
