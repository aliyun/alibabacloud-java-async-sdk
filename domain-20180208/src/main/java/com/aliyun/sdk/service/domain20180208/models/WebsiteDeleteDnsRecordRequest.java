// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link WebsiteDeleteDnsRecordRequest} extends {@link RequestModel}
 *
 * <p>WebsiteDeleteDnsRecordRequest</p>
 */
public class WebsiteDeleteDnsRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rr")
    private String rr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebsiteNo")
    private String websiteNo;

    private WebsiteDeleteDnsRecordRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.rr = builder.rr;
        this.source = builder.source;
        this.type = builder.type;
        this.userId = builder.userId;
        this.value = builder.value;
        this.websiteNo = builder.websiteNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebsiteDeleteDnsRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return rr
     */
    public String getRr() {
        return this.rr;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return websiteNo
     */
    public String getWebsiteNo() {
        return this.websiteNo;
    }

    public static final class Builder extends Request.Builder<WebsiteDeleteDnsRecordRequest, Builder> {
        private String domainName; 
        private String rr; 
        private String source; 
        private String type; 
        private String userId; 
        private String value; 
        private String websiteNo; 

        private Builder() {
            super();
        } 

        private Builder(WebsiteDeleteDnsRecordRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.rr = request.rr;
            this.source = request.source;
            this.type = request.type;
            this.userId = request.userId;
            this.value = request.value;
            this.websiteNo = request.websiteNo;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Rr.
         */
        public Builder rr(String rr) {
            this.putQueryParameter("Rr", rr);
            this.rr = rr;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        /**
         * WebsiteNo.
         */
        public Builder websiteNo(String websiteNo) {
            this.putQueryParameter("WebsiteNo", websiteNo);
            this.websiteNo = websiteNo;
            return this;
        }

        @Override
        public WebsiteDeleteDnsRecordRequest build() {
            return new WebsiteDeleteDnsRecordRequest(this);
        } 

    } 

}
