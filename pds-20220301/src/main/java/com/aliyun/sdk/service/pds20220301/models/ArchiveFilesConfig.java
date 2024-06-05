// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ArchiveFilesConfig} extends {@link TeaModel}
 *
 * <p>ArchiveFilesConfig</p>
 */
public class ArchiveFilesConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private ArchiveFilesConfig(Builder builder) {
        this.enable = builder.enable;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArchiveFilesConfig create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Boolean enable; 
        private String version; 

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public ArchiveFilesConfig build() {
            return new ArchiveFilesConfig(this);
        } 

    } 

}
