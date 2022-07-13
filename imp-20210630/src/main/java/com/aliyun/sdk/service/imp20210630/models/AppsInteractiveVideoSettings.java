// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppsInteractiveVideoSettings} extends {@link TeaModel}
 *
 * <p>AppsInteractiveVideoSettings</p>
 */
public class AppsInteractiveVideoSettings extends TeaModel {
    @NameInMap("Domain")
    private AppsDomain domain;

    @NameInMap("Severity")
    private AppsSecurity severity;

    @NameInMap("Transcoding")
    private AppsTranscoding transcoding;

    @NameInMap("Type")
    private String type;

    private AppsInteractiveVideoSettings(Builder builder) {
        this.domain = builder.domain;
        this.severity = builder.severity;
        this.transcoding = builder.transcoding;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppsInteractiveVideoSettings create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public AppsDomain getDomain() {
        return this.domain;
    }

    /**
     * @return severity
     */
    public AppsSecurity getSeverity() {
        return this.severity;
    }

    /**
     * @return transcoding
     */
    public AppsTranscoding getTranscoding() {
        return this.transcoding;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private AppsDomain domain; 
        private AppsSecurity severity; 
        private AppsTranscoding transcoding; 
        private String type; 

        /**
         * Domain.
         */
        public Builder domain(AppsDomain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(AppsSecurity severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Transcoding.
         */
        public Builder transcoding(AppsTranscoding transcoding) {
            this.transcoding = transcoding;
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
         * Type.
         */
        public Builder type(AppsInteractiveVideoType type) {
            this.type = type.getValue();
            return this;
        }

        public AppsInteractiveVideoSettings build() {
            return new AppsInteractiveVideoSettings(this);
        } 

    } 

}
