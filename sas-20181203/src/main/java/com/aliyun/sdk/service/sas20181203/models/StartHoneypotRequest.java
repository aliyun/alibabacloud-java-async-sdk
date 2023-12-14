// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartHoneypotRequest} extends {@link RequestModel}
 *
 * <p>StartHoneypotRequest</p>
 */
public class StartHoneypotRequest extends Request {
    @Query
    @NameInMap("HoneypotId")
    @Validation(required = true)
    private String honeypotId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private StartHoneypotRequest(Builder builder) {
        super(builder);
        this.honeypotId = builder.honeypotId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartHoneypotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeypotId
     */
    public String getHoneypotId() {
        return this.honeypotId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<StartHoneypotRequest, Builder> {
        private String honeypotId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(StartHoneypotRequest request) {
            super(request);
            this.honeypotId = request.honeypotId;
            this.lang = request.lang;
        } 

        /**
         * The honeypot ID.
         * <p>
         * 
         * >  You can call the [ListHoneypot](~~ListHoneypot~~) operation to obtain IDs of honeypots.
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public StartHoneypotRequest build() {
            return new StartHoneypotRequest(this);
        } 

    } 

}
