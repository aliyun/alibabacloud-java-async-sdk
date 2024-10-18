// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddCustomLineRequest} extends {@link RequestModel}
 *
 * <p>AddCustomLineRequest</p>
 */
public class AddCustomLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSegment")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < IpSegment> ipSegment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lineName;

    private AddCustomLineRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ipSegment = builder.ipSegment;
        this.lang = builder.lang;
        this.lineName = builder.lineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomLineRequest create() {
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
     * @return ipSegment
     */
    public java.util.List < IpSegment> getIpSegment() {
        return this.ipSegment;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lineName
     */
    public String getLineName() {
        return this.lineName;
    }

    public static final class Builder extends Request.Builder<AddCustomLineRequest, Builder> {
        private String domainName; 
        private java.util.List < IpSegment> ipSegment; 
        private String lang; 
        private String lineName; 

        private Builder() {
            super();
        } 

        private Builder(AddCustomLineRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ipSegment = request.ipSegment;
            this.lang = request.lang;
            this.lineName = request.lineName;
        } 

        /**
         * <p>The domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The CIDR blocks.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ipSegment(java.util.List < IpSegment> ipSegment) {
            this.putQueryParameter("IpSegment", ipSegment);
            this.ipSegment = ipSegment;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the custom line.</p>
         * <p>This parameter is required.</p>
         */
        public Builder lineName(String lineName) {
            this.putQueryParameter("LineName", lineName);
            this.lineName = lineName;
            return this;
        }

        @Override
        public AddCustomLineRequest build() {
            return new AddCustomLineRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddCustomLineRequest} extends {@link TeaModel}
     *
     * <p>AddCustomLineRequest</p>
     */
    public static class IpSegment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndIp")
        private String endIp;

        @com.aliyun.core.annotation.NameInMap("StartIp")
        private String startIp;

        private IpSegment(Builder builder) {
            this.endIp = builder.endIp;
            this.startIp = builder.startIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSegment create() {
            return builder().build();
        }

        /**
         * @return endIp
         */
        public String getEndIp() {
            return this.endIp;
        }

        /**
         * @return startIp
         */
        public String getStartIp() {
            return this.startIp;
        }

        public static final class Builder {
            private String endIp; 
            private String startIp; 

            /**
             * <p>The end IP address of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.254</p>
             */
            public Builder endIp(String endIp) {
                this.endIp = endIp;
                return this;
            }

            /**
             * <p>The start IP address of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.0</p>
             */
            public Builder startIp(String startIp) {
                this.startIp = startIp;
                return this;
            }

            public IpSegment build() {
                return new IpSegment(this);
            } 

        } 

    }
}
