// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAttributesInput} extends {@link TeaModel}
 *
 * <p>UpdateAttributesInput</p>
 */
public class UpdateAttributesInput extends TeaModel {
    @NameInMap("description")
    private String description;

    @NameInMap("httpTriggerConfig")
    private HTTPTriggerConfig httpTriggerConfig;

    @NameInMap("versionID")
    private String versionID;

    private UpdateAttributesInput(Builder builder) {
        this.description = builder.description;
        this.httpTriggerConfig = builder.httpTriggerConfig;
        this.versionID = builder.versionID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAttributesInput create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return httpTriggerConfig
     */
    public HTTPTriggerConfig getHttpTriggerConfig() {
        return this.httpTriggerConfig;
    }

    /**
     * @return versionID
     */
    public String getVersionID() {
        return this.versionID;
    }

    public static final class Builder {
        private String description; 
        private HTTPTriggerConfig httpTriggerConfig; 
        private String versionID; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * httpTriggerConfig.
         */
        public Builder httpTriggerConfig(HTTPTriggerConfig httpTriggerConfig) {
            this.httpTriggerConfig = httpTriggerConfig;
            return this;
        }

        /**
         * versionID.
         */
        public Builder versionID(String versionID) {
            this.versionID = versionID;
            return this;
        }

        public UpdateAttributesInput build() {
            return new UpdateAttributesInput(this);
        } 

    } 

}
