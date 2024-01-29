// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCustomLineRequest} extends {@link RequestModel}
 *
 * <p>AddCustomLineRequest</p>
 */
public class AddCustomLineRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("IpSegment")
    @Validation(required = true)
    private java.util.List < IpSegment> ipSegment;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LineName")
    @Validation(required = true)
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
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The CIDR blocks.
         */
        public Builder ipSegment(java.util.List < IpSegment> ipSegment) {
            this.putQueryParameter("IpSegment", ipSegment);
            this.ipSegment = ipSegment;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The name of the custom line.
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

    public static class IpSegment extends TeaModel {
        @NameInMap("EndIp")
        private String endIp;

        @NameInMap("StartIp")
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
             * The end IP address of the CIDR block.
             */
            public Builder endIp(String endIp) {
                this.endIp = endIp;
                return this;
            }

            /**
             * The start IP address of the CIDR block.
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
