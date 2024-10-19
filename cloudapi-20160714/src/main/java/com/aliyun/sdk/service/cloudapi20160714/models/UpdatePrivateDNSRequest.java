// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePrivateDNSRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateDNSRequest</p>
 */
public class UpdatePrivateDNSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intranetDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Records")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Records> records;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UpdatePrivateDNSRequest(Builder builder) {
        super(builder);
        this.intranetDomain = builder.intranetDomain;
        this.records = builder.records;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateDNSRequest create() {
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
    public java.util.List < Records> getRecords() {
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

    public static final class Builder extends Request.Builder<UpdatePrivateDNSRequest, Builder> {
        private String intranetDomain; 
        private java.util.List < Records> records; 
        private String securityToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrivateDNSRequest request) {
            super(request);
            this.intranetDomain = request.intranetDomain;
            this.records = request.records;
            this.securityToken = request.securityToken;
            this.type = request.type;
        } 

        /**
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
         * <p>This parameter is required.</p>
         */
        public Builder records(java.util.List < Records> records) {
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
        public UpdatePrivateDNSRequest build() {
            return new UpdatePrivateDNSRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrivateDNSRequest} extends {@link TeaModel}
     *
     * <p>UpdatePrivateDNSRequest</p>
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
             * Record.
             */
            public Builder record(String record) {
                this.record = record;
                return this;
            }

            /**
             * Weight.
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
