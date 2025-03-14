// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ResetHoneypotRequest} extends {@link RequestModel}
 *
 * <p>ResetHoneypotRequest</p>
 */
public class ResetHoneypotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String honeypotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private ResetHoneypotRequest(Builder builder) {
        super(builder);
        this.honeypotId = builder.honeypotId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetHoneypotRequest create() {
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

    public static final class Builder extends Request.Builder<ResetHoneypotRequest, Builder> {
        private String honeypotId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ResetHoneypotRequest request) {
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
         * <p>945607c2ae2a1a737c04599d6608065688bfc6048d9b9d306ce8dc8191c*****</p>
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
        public ResetHoneypotRequest build() {
            return new ResetHoneypotRequest(this);
        } 

    } 

}
