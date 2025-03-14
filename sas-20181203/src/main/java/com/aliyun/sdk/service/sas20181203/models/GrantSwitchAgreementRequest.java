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
 * {@link GrantSwitchAgreementRequest} extends {@link RequestModel}
 *
 * <p>GrantSwitchAgreementRequest</p>
 */
public class GrantSwitchAgreementRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAgree")
    private Boolean isAgree;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GrantSwitchAgreementRequest(Builder builder) {
        super(builder);
        this.isAgree = builder.isAgree;
        this.lang = builder.lang;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantSwitchAgreementRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isAgree
     */
    public Boolean getIsAgree() {
        return this.isAgree;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GrantSwitchAgreementRequest, Builder> {
        private Boolean isAgree; 
        private String lang; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GrantSwitchAgreementRequest request) {
            super(request);
            this.isAgree = request.isAgree;
            this.lang = request.lang;
            this.type = request.type;
        } 

        /**
         * <p>Indicates whether to agree to migrate the client connections from overseas servers to the Singapore center.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAgree(Boolean isAgree) {
            this.putQueryParameter("IsAgree", isAgree);
            this.isAgree = isAgree;
            return this;
        }

        /**
         * <p>The language type for requests and responses. The default value is <strong>zh</strong>. Possible values:</p>
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

        /**
         * <p>Switching type. Possible values:</p>
         * <ul>
         * <li><strong>sg_switch</strong>: Migrate client connections from overseas servers to Singapore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg_switch</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GrantSwitchAgreementRequest build() {
            return new GrantSwitchAgreementRequest(this);
        } 

    } 

}
