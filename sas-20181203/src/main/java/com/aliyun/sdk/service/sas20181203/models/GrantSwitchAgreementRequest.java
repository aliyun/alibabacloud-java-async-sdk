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
    @com.aliyun.core.annotation.NameInMap("IsConfirmed")
    private Boolean isConfirmed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsImmediate")
    private Boolean isImmediate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GrantSwitchAgreementRequest(Builder builder) {
        super(builder);
        this.isAgree = builder.isAgree;
        this.isConfirmed = builder.isConfirmed;
        this.isImmediate = builder.isImmediate;
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
     * @return isConfirmed
     */
    public Boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    /**
     * @return isImmediate
     */
    public Boolean getIsImmediate() {
        return this.isImmediate;
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
        private Boolean isConfirmed; 
        private Boolean isImmediate; 
        private String lang; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GrantSwitchAgreementRequest request) {
            super(request);
            this.isAgree = request.isAgree;
            this.isConfirmed = request.isConfirmed;
            this.isImmediate = request.isImmediate;
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
         * <p>Has the user confirmed the migration of Hong Kong region data to Singapore data center</p>
         * <ul>
         * <li><p><strong>true:</strong> The user has confirmed that Hong Kong region data has been migrated to the Singapore data center. No notification popup needs to be displayed subsequently.</p>
         * </li>
         * <li><p><strong>false</strong>:The user has not confirmed that Hong Kong region data has been migrated to the Singapore data center. Notification popup still needs to be displayed subsequently.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isConfirmed(Boolean isConfirmed) {
            this.putQueryParameter("IsConfirmed", isConfirmed);
            this.isConfirmed = isConfirmed;
            return this;
        }

        /**
         * <p>Whether to schedule the migration of data from the Hong Kong region to the Singapore data center within 24 hours. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Schedule the switch within 24 hours.</li>
         * <li><strong>false</strong>: Do not schedule. Users with cloud products in the Hong Kong region will be automatically migrated on March 5, 2026; users without cloud products in the Hong Kong region will be automatically migrated on November 17, 2025.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isImmediate(Boolean isImmediate) {
            this.putQueryParameter("IsImmediate", isImmediate);
            this.isImmediate = isImmediate;
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
