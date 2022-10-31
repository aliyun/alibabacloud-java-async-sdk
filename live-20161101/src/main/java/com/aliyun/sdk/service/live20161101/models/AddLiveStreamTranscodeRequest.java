// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveStreamTranscodeRequest} extends {@link RequestModel}
 *
 * <p>AddLiveStreamTranscodeRequest</p>
 */
public class AddLiveStreamTranscodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("App")
    @Validation(required = true)
    private String app;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("EncryptParameters")
    private String encryptParameters;

    @Query
    @NameInMap("Lazy")
    private String lazy;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Template")
    @Validation(required = true)
    private String template;

    private AddLiveStreamTranscodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.app = builder.app;
        this.domain = builder.domain;
        this.encryptParameters = builder.encryptParameters;
        this.lazy = builder.lazy;
        this.ownerId = builder.ownerId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveStreamTranscodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return encryptParameters
     */
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

    /**
     * @return lazy
     */
    public String getLazy() {
        return this.lazy;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<AddLiveStreamTranscodeRequest, Builder> {
        private String regionId; 
        private String app; 
        private String domain; 
        private String encryptParameters; 
        private String lazy; 
        private Long ownerId; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveStreamTranscodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.app = request.app;
            this.domain = request.domain;
            this.encryptParameters = request.encryptParameters;
            this.lazy = request.lazy;
            this.ownerId = request.ownerId;
            this.template = request.template;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EncryptParameters.
         */
        public Builder encryptParameters(String encryptParameters) {
            this.putQueryParameter("EncryptParameters", encryptParameters);
            this.encryptParameters = encryptParameters;
            return this;
        }

        /**
         * Lazy.
         */
        public Builder lazy(String lazy) {
            this.putQueryParameter("Lazy", lazy);
            this.lazy = lazy;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public AddLiveStreamTranscodeRequest build() {
            return new AddLiveStreamTranscodeRequest(this);
        } 

    } 

}
