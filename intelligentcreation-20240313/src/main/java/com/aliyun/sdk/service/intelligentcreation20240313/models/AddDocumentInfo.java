// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link AddDocumentInfo} extends {@link TeaModel}
 *
 * <p>AddDocumentInfo</p>
 */
public class AddDocumentInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("documentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentType;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.NameInMap("url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private AddDocumentInfo(Builder builder) {
        this.documentType = builder.documentType;
        this.name = builder.name;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDocumentInfo create() {
        return builder().build();
    }

    /**
     * @return documentType
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String documentType; 
        private String name; 
        private String url; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        public Builder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public AddDocumentInfo build() {
            return new AddDocumentInfo(this);
        } 

    } 

}
