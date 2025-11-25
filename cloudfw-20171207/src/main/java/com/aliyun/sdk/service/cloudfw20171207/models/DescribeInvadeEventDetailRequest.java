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
 * {@link DescribeInvadeEventDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvadeEventDetailRequest</p>
 */
public class DescribeInvadeEventDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIP")
    private String publicIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeInvadeEventDetailRequest(Builder builder) {
        super(builder);
        this.assetsInstanceId = builder.assetsInstanceId;
        this.eventUuid = builder.eventUuid;
        this.lang = builder.lang;
        this.publicIP = builder.publicIP;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvadeEventDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsInstanceId
     */
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    /**
     * @return eventUuid
     */
    public String getEventUuid() {
        return this.eventUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return publicIP
     */
    public String getPublicIP() {
        return this.publicIP;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeInvadeEventDetailRequest, Builder> {
        private String assetsInstanceId; 
        private String eventUuid; 
        private String lang; 
        private String publicIP; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvadeEventDetailRequest request) {
            super(request);
            this.assetsInstanceId = request.assetsInstanceId;
            this.eventUuid = request.eventUuid;
            this.lang = request.lang;
            this.publicIP = request.publicIP;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp135d2rmbwpt****</p>
         */
        public Builder assetsInstanceId(String assetsInstanceId) {
            this.putQueryParameter("AssetsInstanceId", assetsInstanceId);
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>92498578-7c42-4845-8c73-7e824782****</p>
         */
        public Builder eventUuid(String eventUuid) {
            this.putQueryParameter("EventUuid", eventUuid);
            this.eventUuid = eventUuid;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PublicIP.
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeInvadeEventDetailRequest build() {
            return new DescribeInvadeEventDetailRequest(this);
        } 

    } 

}
