// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartHoneypotRequest} extends {@link RequestModel}
 *
 * <p>StartHoneypotRequest</p>
 */
public class StartHoneypotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
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
         * <p>The ID of the honeypot.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to query the IDs of honeypots.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dba7d44775be8e0e5888ee3b1a62554a93d2512247cabc38ddeac17a3b3f****</p>
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        /**
         * <p>The language of the content in the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
