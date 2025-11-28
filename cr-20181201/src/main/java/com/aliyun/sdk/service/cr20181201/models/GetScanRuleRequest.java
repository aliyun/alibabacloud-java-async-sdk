// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetScanRuleRequest} extends {@link RequestModel}
 *
 * <p>GetScanRuleRequest</p>
 */
public class GetScanRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRuleId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String scanRuleId;

    private GetScanRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.scanRuleId = builder.scanRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScanRuleRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scanRuleId
     */
    public String getScanRuleId() {
        return this.scanRuleId;
    }

    public static final class Builder extends Request.Builder<GetScanRuleRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String scanRuleId; 

        private Builder() {
            super();
        } 

        private Builder(GetScanRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.scanRuleId = request.scanRuleId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crscnr-2sdveqjhpzdcafyq</p>
         */
        public Builder scanRuleId(String scanRuleId) {
            this.putQueryParameter("ScanRuleId", scanRuleId);
            this.scanRuleId = scanRuleId;
            return this;
        }

        @Override
        public GetScanRuleRequest build() {
            return new GetScanRuleRequest(this);
        } 

    } 

}
