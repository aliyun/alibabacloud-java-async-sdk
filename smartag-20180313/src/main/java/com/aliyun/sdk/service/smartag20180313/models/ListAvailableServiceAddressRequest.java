// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListAvailableServiceAddressRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableServiceAddressRequest</p>
 */
public class ListAvailableServiceAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    private ListAvailableServiceAddressRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.regionId = builder.regionId;
        this.sagId = builder.sagId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableServiceAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sagId
     */
    public String getSagId() {
        return this.sagId;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder extends Request.Builder<ListAvailableServiceAddressRequest, Builder> {
        private String addressType; 
        private String regionId; 
        private String sagId; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableServiceAddressRequest request) {
            super(request);
            this.addressType = request.addressType;
            this.regionId = request.regionId;
            this.sagId = request.sagId;
            this.sn = request.sn;
        } 

        /**
         * <p>The type of service address. Valid values:</p>
         * <ul>
         * <li><strong>ProbeTask</strong>: probes the source IP address.</li>
         * <li><strong>RemoteWeb</strong>: probes the IP address for remote logon.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify a value, all service IP addresses are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ProbeTask</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The ID of the region where the SAG instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-****</p>
         */
        public Builder sagId(String sagId) {
            this.putQueryParameter("SagId", sagId);
            this.sagId = sagId;
            return this;
        }

        /**
         * <p>The serial number of the SAG device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag****</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public ListAvailableServiceAddressRequest build() {
            return new ListAvailableServiceAddressRequest(this);
        } 

    } 

}
