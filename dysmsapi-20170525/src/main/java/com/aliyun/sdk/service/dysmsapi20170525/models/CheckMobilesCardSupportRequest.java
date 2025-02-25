// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link CheckMobilesCardSupportRequest} extends {@link RequestModel}
 *
 * <p>CheckMobilesCardSupportRequest</p>
 */
public class CheckMobilesCardSupportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobiles")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> mobiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    private CheckMobilesCardSupportRequest(Builder builder) {
        super(builder);
        this.mobiles = builder.mobiles;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMobilesCardSupportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobiles
     */
    public java.util.List<java.util.Map<String, ?>> getMobiles() {
        return this.mobiles;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<CheckMobilesCardSupportRequest, Builder> {
        private java.util.List<java.util.Map<String, ?>> mobiles; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(CheckMobilesCardSupportRequest request) {
            super(request);
            this.mobiles = request.mobiles;
            this.templateCode = request.templateCode;
        } 

        /**
         * <p>The list of mobile phone numbers that receive messages.</p>
         * <p>This parameter is required.</p>
         */
        public Builder mobiles(java.util.List<java.util.Map<String, ?>> mobiles) {
            this.putQueryParameter("Mobiles", mobiles);
            this.mobiles = mobiles;
            return this;
        }

        /**
         * <p>The code of the message template. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
         * <blockquote>
         * <p>Make sure that the message template has been approved.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CARD_SMS_****</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public CheckMobilesCardSupportRequest build() {
            return new CheckMobilesCardSupportRequest(this);
        } 

    } 

}
