// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMobilesCardSupportRequest} extends {@link RequestModel}
 *
 * <p>QueryMobilesCardSupportRequest</p>
 */
public class QueryMobilesCardSupportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobiles")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < java.util.Map<String, ?>> mobiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    private QueryMobilesCardSupportRequest(Builder builder) {
        super(builder);
        this.mobiles = builder.mobiles;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMobilesCardSupportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobiles
     */
    public java.util.List < java.util.Map<String, ?>> getMobiles() {
        return this.mobiles;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<QueryMobilesCardSupportRequest, Builder> {
        private java.util.List < java.util.Map<String, ?>> mobiles; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryMobilesCardSupportRequest request) {
            super(request);
            this.mobiles = request.mobiles;
            this.templateCode = request.templateCode;
        } 

        /**
         * <p>The list of mobile phone numbers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder mobiles(java.util.List < java.util.Map<String, ?>> mobiles) {
            String mobilesShrink = shrink(mobiles, "Mobiles", "json");
            this.putQueryParameter("Mobiles", mobilesShrink);
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
         * <p>CARD_SMS_0000</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public QueryMobilesCardSupportRequest build() {
            return new QueryMobilesCardSupportRequest(this);
        } 

    } 

}
