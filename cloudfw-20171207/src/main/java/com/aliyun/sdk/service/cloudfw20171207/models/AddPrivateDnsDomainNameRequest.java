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
 * {@link AddPrivateDnsDomainNameRequest} extends {@link RequestModel}
 *
 * <p>AddPrivateDnsDomainNameRequest</p>
 */
public class AddPrivateDnsDomainNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domainNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    private AddPrivateDnsDomainNameRequest(Builder builder) {
        super(builder);
        this.accessInstanceId = builder.accessInstanceId;
        this.domainNameList = builder.domainNameList;
        this.regionNo = builder.regionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrivateDnsDomainNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceId
     */
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    /**
     * @return domainNameList
     */
    public java.util.List<String> getDomainNameList() {
        return this.domainNameList;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<AddPrivateDnsDomainNameRequest, Builder> {
        private String accessInstanceId; 
        private java.util.List<String> domainNameList; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(AddPrivateDnsDomainNameRequest request) {
            super(request);
            this.accessInstanceId = request.accessInstanceId;
            this.domainNameList = request.domainNameList;
            this.regionNo = request.regionNo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw-xxx</p>
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.putQueryParameter("AccessInstanceId", accessInstanceId);
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainNameList(java.util.List<String> domainNameList) {
            this.putQueryParameter("DomainNameList", domainNameList);
            this.domainNameList = domainNameList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public AddPrivateDnsDomainNameRequest build() {
            return new AddPrivateDnsDomainNameRequest(this);
        } 

    } 

}
