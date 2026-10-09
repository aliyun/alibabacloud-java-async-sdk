// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link SetAutoProtectNewAssetsRequest} extends {@link RequestModel}
 *
 * <p>SetAutoProtectNewAssetsRequest</p>
 */
public class SetAutoProtectNewAssetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoProtect")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoProtect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private SetAutoProtectNewAssetsRequest(Builder builder) {
        super(builder);
        this.autoProtect = builder.autoProtect;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAutoProtectNewAssetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoProtect
     */
    public Boolean getAutoProtect() {
        return this.autoProtect;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<SetAutoProtectNewAssetsRequest, Builder> {
        private Boolean autoProtect; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(SetAutoProtectNewAssetsRequest request) {
            super(request);
            this.autoProtect = request.autoProtect;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>Specifies whether to enable automatic traffic redirection. Valid values:</p>
         * <p><strong>true****false</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoProtect(Boolean autoProtect) {
            this.putQueryParameter("AutoProtect", autoProtect);
            this.autoProtect = autoProtect;
            return this;
        }

        /**
         * <p>The language. Valid values are zh (Chinese) and <strong>en</strong> (English). The default value is <strong>zh</strong>.</p>
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
         * <p>The source IP address of the visitor.</p>
         * 
         * <strong>example:</strong>
         * <p>60.182.79.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public SetAutoProtectNewAssetsRequest build() {
            return new SetAutoProtectNewAssetsRequest(this);
        } 

    } 

}
