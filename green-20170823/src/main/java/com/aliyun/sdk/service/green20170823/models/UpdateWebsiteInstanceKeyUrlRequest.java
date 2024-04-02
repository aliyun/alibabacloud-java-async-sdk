// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWebsiteInstanceKeyUrlRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebsiteInstanceKeyUrlRequest</p>
 */
public class UpdateWebsiteInstanceKeyUrlRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Urls")
    @Validation(required = true)
    private String urls;

    private UpdateWebsiteInstanceKeyUrlRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.urls = builder.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebsiteInstanceKeyUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return urls
     */
    public String getUrls() {
        return this.urls;
    }

    public static final class Builder extends Request.Builder<UpdateWebsiteInstanceKeyUrlRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String sourceIp; 
        private String urls; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebsiteInstanceKeyUrlRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.urls = request.urls;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Urls.
         */
        public Builder urls(String urls) {
            this.putQueryParameter("Urls", urls);
            this.urls = urls;
            return this;
        }

        @Override
        public UpdateWebsiteInstanceKeyUrlRequest build() {
            return new UpdateWebsiteInstanceKeyUrlRequest(this);
        } 

    } 

}
