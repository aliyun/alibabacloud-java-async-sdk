// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateImageVulWhitelistTargetRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageVulWhitelistTargetRequest</p>
 */
public class UpdateImageVulWhitelistTargetRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("Target")
    private String target;

    private UpdateImageVulWhitelistTargetRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
        this.reason = builder.reason;
        this.source = builder.source;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageVulWhitelistTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<UpdateImageVulWhitelistTargetRequest, Builder> {
        private Long id; 
        private String lang; 
        private String reason; 
        private String source; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageVulWhitelistTargetRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
            this.reason = request.reason;
            this.source = request.source;
            this.target = request.target;
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
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public UpdateImageVulWhitelistTargetRequest build() {
            return new UpdateImageVulWhitelistTargetRequest(this);
        } 

    } 

}
