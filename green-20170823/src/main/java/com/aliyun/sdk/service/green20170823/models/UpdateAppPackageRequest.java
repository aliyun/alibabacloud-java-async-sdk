// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppPackageRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppPackageRequest</p>
 */
public class UpdateAppPackageRequest extends Request {
    @Query
    @NameInMap("Debug")
    private Boolean debug;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PackageUrl")
    @Validation(required = true)
    private String packageUrl;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private UpdateAppPackageRequest(Builder builder) {
        super(builder);
        this.debug = builder.debug;
        this.id = builder.id;
        this.lang = builder.lang;
        this.packageUrl = builder.packageUrl;
        this.platform = builder.platform;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return debug
     */
    public Boolean getDebug() {
        return this.debug;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return packageUrl
     */
    public String getPackageUrl() {
        return this.packageUrl;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<UpdateAppPackageRequest, Builder> {
        private Boolean debug; 
        private Long id; 
        private String lang; 
        private String packageUrl; 
        private String platform; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppPackageRequest request) {
            super(request);
            this.debug = request.debug;
            this.id = request.id;
            this.lang = request.lang;
            this.packageUrl = request.packageUrl;
            this.platform = request.platform;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Debug.
         */
        public Builder debug(Boolean debug) {
            this.putQueryParameter("Debug", debug);
            this.debug = debug;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PackageUrl.
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public UpdateAppPackageRequest build() {
            return new UpdateAppPackageRequest(this);
        } 

    } 

}
