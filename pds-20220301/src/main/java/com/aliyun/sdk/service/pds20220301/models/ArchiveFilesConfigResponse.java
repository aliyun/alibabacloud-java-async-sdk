// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ArchiveFilesConfigResponse} extends {@link TeaModel}
 *
 * <p>ArchiveFilesConfigResponse</p>
 */
public class ArchiveFilesConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private ArchiveFilesConfigResponse(BuilderImpl builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.version = builder.version;
    }

    public static ArchiveFilesConfigResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public interface Builder extends Response.Builder<ArchiveFilesConfigResponse, Builder> {

        Builder enabled(Boolean enabled);

        Builder version(String version);

        @Override
        ArchiveFilesConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ArchiveFilesConfigResponse, Builder>
            implements Builder {
        private Boolean enabled; 
        private String version; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ArchiveFilesConfigResponse response) {
            super(response);
            this.enabled = response.enabled;
            this.version = response.version;
        } 

        /**
         * enabled.
         */
        @Override
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * version.
         */
        @Override
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        @Override
        public ArchiveFilesConfigResponse build() {
            return new ArchiveFilesConfigResponse(this);
        } 

    } 

}
