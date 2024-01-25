// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportCurrentBackgroundRequest} extends {@link RequestModel}
 *
 * <p>ReportCurrentBackgroundRequest</p>
 */
public class ReportCurrentBackgroundRequest extends Request {
    @Query
    @NameInMap("BgConfig")
    private java.util.Map < String, ? > bgConfig;

    @Query
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Query
    @NameInMap("Open")
    @Validation(required = true)
    private Boolean open;

    @Query
    @NameInMap("ResourceUuid")
    private String resourceUuid;

    private ReportCurrentBackgroundRequest(Builder builder) {
        super(builder);
        this.bgConfig = builder.bgConfig;
        this.mode = builder.mode;
        this.open = builder.open;
        this.resourceUuid = builder.resourceUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportCurrentBackgroundRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bgConfig
     */
    public java.util.Map < String, ? > getBgConfig() {
        return this.bgConfig;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return open
     */
    public Boolean getOpen() {
        return this.open;
    }

    /**
     * @return resourceUuid
     */
    public String getResourceUuid() {
        return this.resourceUuid;
    }

    public static final class Builder extends Request.Builder<ReportCurrentBackgroundRequest, Builder> {
        private java.util.Map < String, ? > bgConfig; 
        private String mode; 
        private Boolean open; 
        private String resourceUuid; 

        private Builder() {
            super();
        } 

        private Builder(ReportCurrentBackgroundRequest request) {
            super(request);
            this.bgConfig = request.bgConfig;
            this.mode = request.mode;
            this.open = request.open;
            this.resourceUuid = request.resourceUuid;
        } 

        /**
         * BgConfig.
         */
        public Builder bgConfig(java.util.Map < String, ? > bgConfig) {
            String bgConfigShrink = shrink(bgConfig, "BgConfig", "json");
            this.putQueryParameter("BgConfig", bgConfigShrink);
            this.bgConfig = bgConfig;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Open.
         */
        public Builder open(Boolean open) {
            this.putQueryParameter("Open", open);
            this.open = open;
            return this;
        }

        /**
         * ResourceUuid.
         */
        public Builder resourceUuid(String resourceUuid) {
            this.putQueryParameter("ResourceUuid", resourceUuid);
            this.resourceUuid = resourceUuid;
            return this;
        }

        @Override
        public ReportCurrentBackgroundRequest build() {
            return new ReportCurrentBackgroundRequest(this);
        } 

    } 

}
