// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopHoneypotRequest} extends {@link RequestModel}
 *
 * <p>StopHoneypotRequest</p>
 */
public class StopHoneypotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private StopHoneypotRequest(Builder builder) {
        super(builder);
        this.honeypotId = builder.honeypotId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopHoneypotRequest create() {
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

    public static final class Builder extends Request.Builder<StopHoneypotRequest, Builder> {
        private String honeypotId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(StopHoneypotRequest request) {
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
        public StopHoneypotRequest build() {
            return new StopHoneypotRequest(this);
        } 

    } 

}
