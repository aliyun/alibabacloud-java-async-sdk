// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link Template} extends {@link TeaModel}
 *
 * <p>Template</p>
 */
public class Template extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.NameInMap("templateVersion")
    private String templateVersion;

    private Template(Builder builder) {
        this.templateID = builder.templateID;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Template create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder {
        private String templateID; 
        private String templateVersion; 

        private Builder() {
        } 

        private Builder(Template model) {
            this.templateID = model.templateID;
            this.templateVersion = model.templateVersion;
        } 

        /**
         * templateID.
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        /**
         * templateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        public Template build() {
            return new Template(this);
        } 

    } 

}
