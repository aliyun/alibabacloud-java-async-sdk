// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DeleteWhitelistSettingRequest} extends {@link RequestModel}
 *
 * <p>DeleteWhitelistSettingRequest</p>
 */
public class DeleteWhitelistSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DeleteWhitelistSettingRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.lang = builder.lang;
        this.serviceCode = builder.serviceCode;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWhitelistSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteWhitelistSettingRequest, Builder> {
        private String ids; 
        private String lang; 
        private String serviceCode; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWhitelistSettingRequest request) {
            super(request);
            this.ids = request.ids;
            this.lang = request.lang;
            this.serviceCode = request.serviceCode;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>List of rule IDs to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[6222001]</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>Specify the language of the user information to be deleted. Values: -<strong>zh</strong>: Chinese. -<strong>en</strong>: English.</p>
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
         * <p>ServiceCode for the real-person cloud product, only takes the value: <strong>antcloudauth</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Set the source IP address of the visitor. Supports IP addresses in CIDR and IPv4 formats. Example: 10.0.3.0/24.</p>
         * 
         * <strong>example:</strong>
         * <p>120.25.41.25</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DeleteWhitelistSettingRequest build() {
            return new DeleteWhitelistSettingRequest(this);
        } 

    } 

}
