// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreatePrivateDNSRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivateDNSRequest</p>
 */
public class CreatePrivateDNSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intranetDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreatePrivateDNSRequest(Builder builder) {
        super(builder);
        this.intranetDomain = builder.intranetDomain;
        this.records = builder.records;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateDNSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intranetDomain
     */
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreatePrivateDNSRequest, Builder> {
        private String intranetDomain; 
        private java.util.List<Records> records; 
        private String securityToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrivateDNSRequest request) {
            super(request);
            this.intranetDomain = request.intranetDomain;
            this.records = request.records;
            this.securityToken = request.securityToken;
            this.type = request.type;
        } 

        /**
         * <p>The internal domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api.demo.com</p>
         */
        public Builder intranetDomain(String intranetDomain) {
            this.putQueryParameter("IntranetDomain", intranetDomain);
            this.intranetDomain = intranetDomain;
            return this;
        }

        /**
         * <p>The resolution records. This parameter is valid only when Type is set to A.</p>
         */
        public Builder records(java.util.List<Records> records) {
            String recordsShrink = shrink(records, "Records", "json");
            this.putBodyParameter("Records", recordsShrink);
            this.records = records;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The internal domain name resolution type. Valid values:</p>
         * <ul>
         * <li>VPC: resolution for VPC access authorizations. A resolution of this type can be bound only to traditional dedicated instances.</li>
         * <li>A: resolution that supports A records. A resolution of this type can be bound only to VPC integration dedicated instances.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreatePrivateDNSRequest build() {
            return new CreatePrivateDNSRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrivateDNSRequest} extends {@link TeaModel}
     *
     * <p>CreatePrivateDNSRequest</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private String record;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Records(Builder builder) {
            this.record = builder.record;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return record
         */
        public String getRecord() {
            return this.record;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String record; 
            private Integer weight; 

            /**
             * <p>The resolution record.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder record(String record) {
                this.record = record;
                return this;
            }

            /**
             * <p>The weight of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
