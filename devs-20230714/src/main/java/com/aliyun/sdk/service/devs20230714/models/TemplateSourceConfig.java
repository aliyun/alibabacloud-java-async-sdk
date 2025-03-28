// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link TemplateSourceConfig} extends {@link TeaModel}
 *
 * <p>TemplateSourceConfig</p>
 */
public class TemplateSourceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private TemplateSourceConfig(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateSourceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String name; 

        private Builder() {
        } 

        private Builder(TemplateSourceConfig model) {
            this.downloadUrl = model.downloadUrl;
            this.name = model.name;
        } 

        /**
         * downloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public TemplateSourceConfig build() {
            return new TemplateSourceConfig(this);
        } 

    } 

}
