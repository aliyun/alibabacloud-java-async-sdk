// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHoneypotRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotRequest</p>
 */
public class UpdateHoneypotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotName")
    private String honeypotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Meta")
    private String meta;

    private UpdateHoneypotRequest(Builder builder) {
        super(builder);
        this.honeypotId = builder.honeypotId;
        this.honeypotName = builder.honeypotName;
        this.lang = builder.lang;
        this.meta = builder.meta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHoneypotRequest create() {
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
     * @return honeypotName
     */
    public String getHoneypotName() {
        return this.honeypotName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return meta
     */
    public String getMeta() {
        return this.meta;
    }

    public static final class Builder extends Request.Builder<UpdateHoneypotRequest, Builder> {
        private String honeypotId; 
        private String honeypotName; 
        private String lang; 
        private String meta; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHoneypotRequest request) {
            super(request);
            this.honeypotId = request.honeypotId;
            this.honeypotName = request.honeypotName;
            this.lang = request.lang;
            this.meta = request.meta;
        } 

        /**
         * The ID of the honeypot.
         * <p>
         * 
         * >  You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        /**
         * The custom name of the honeypot.
         */
        public Builder honeypotName(String honeypotName) {
            this.putQueryParameter("HoneypotName", honeypotName);
            this.honeypotName = honeypotName;
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

        /**
         * The custom configuration of the honeypot.
         * <p>
         * 
         * > You can call the [ListAvailableHoneypot](~~ListAvailableHoneypot~~) operation to query the configurations of honeypots from the **Template** response parameter.
         */
        public Builder meta(String meta) {
            this.putQueryParameter("Meta", meta);
            this.meta = meta;
            return this;
        }

        @Override
        public UpdateHoneypotRequest build() {
            return new UpdateHoneypotRequest(this);
        } 

    } 

}
