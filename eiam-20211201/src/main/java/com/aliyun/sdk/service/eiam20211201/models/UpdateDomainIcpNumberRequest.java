// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link UpdateDomainIcpNumberRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainIcpNumberRequest</p>
 */
public class UpdateDomainIcpNumberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IcpNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String icpNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateDomainIcpNumberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainId = builder.domainId;
        this.icpNumber = builder.icpNumber;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainIcpNumberRequest create() {
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
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return icpNumber
     */
    public String getIcpNumber() {
        return this.icpNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateDomainIcpNumberRequest, Builder> {
        private String regionId; 
        private String domainId; 
        private String icpNumber; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainIcpNumberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainId = request.domainId;
            this.icpNumber = request.icpNumber;
            this.instanceId = request.instanceId;
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
         * <p>域名ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_examplexxxxx</p>
         */
        public Builder domainId(String domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>域名关联的备案号，长度最大限制64。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>浙xx-xxxxxx</p>
         */
        public Builder icpNumber(String icpNumber) {
            this.putQueryParameter("IcpNumber", icpNumber);
            this.icpNumber = icpNumber;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateDomainIcpNumberRequest build() {
            return new UpdateDomainIcpNumberRequest(this);
        } 

    } 

}
