// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link DescribeAppDomainDnsRecordRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppDomainDnsRecordRequest</p>
 */
public class DescribeAppDomainDnsRecordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Purpose")
    private String purpose;

    private DescribeAppDomainDnsRecordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.domainName = builder.domainName;
        this.purpose = builder.purpose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppDomainDnsRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    public static final class Builder extends Request.Builder<DescribeAppDomainDnsRecordRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String domainName; 
        private String purpose; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppDomainDnsRecordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.domainName = request.domainName;
            this.purpose = request.purpose;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250821114240000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>Domain name</p>
         * 
         * <strong>example:</strong>
         * <p>rayihealth.cn</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Purpose for querying DNS configuration</p>
         * 
         * <strong>example:</strong>
         * <p>restore</p>
         */
        public Builder purpose(String purpose) {
            this.putQueryParameter("Purpose", purpose);
            this.purpose = purpose;
            return this;
        }

        @Override
        public DescribeAppDomainDnsRecordRequest build() {
            return new DescribeAppDomainDnsRecordRequest(this);
        } 

    } 

}
