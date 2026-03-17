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
 * {@link DissociateSmartAGFromApplicationBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>DissociateSmartAGFromApplicationBandwidthPackageRequest</p>
 */
public class DissociateSmartAGFromApplicationBandwidthPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationBandwidthPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationBandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGIdList")
    private java.util.List<String> smartAGIdList;

    private DissociateSmartAGFromApplicationBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.applicationBandwidthPackageId = builder.applicationBandwidthPackageId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.smartAGId = builder.smartAGId;
        this.smartAGIdList = builder.smartAGIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateSmartAGFromApplicationBandwidthPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationBandwidthPackageId
     */
    public String getApplicationBandwidthPackageId() {
        return this.applicationBandwidthPackageId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return smartAGIdList
     */
    public java.util.List<String> getSmartAGIdList() {
        return this.smartAGIdList;
    }

    public static final class Builder extends Request.Builder<DissociateSmartAGFromApplicationBandwidthPackageRequest, Builder> {
        private String applicationBandwidthPackageId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String smartAGId; 
        private java.util.List<String> smartAGIdList; 

        private Builder() {
            super();
        } 

        private Builder(DissociateSmartAGFromApplicationBandwidthPackageRequest request) {
            super(request);
            this.applicationBandwidthPackageId = request.applicationBandwidthPackageId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.smartAGId = request.smartAGId;
            this.smartAGIdList = request.smartAGIdList;
        } 

        /**
         * <p>The ID of the bandwidth plan for application acceleration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abwp-7963l7iqnquyj3****</p>
         */
        public Builder applicationBandwidthPackageId(String applicationBandwidthPackageId) {
            this.putQueryParameter("ApplicationBandwidthPackageId", applicationBandwidthPackageId);
            this.applicationBandwidthPackageId = applicationBandwidthPackageId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to precheck the request. Check items include permissions and the status of the specified cloud resources. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): sends the request. After the request passes the check, the SAG instance is disassociated from the bandwidth plan for application acceleration.</li>
         * <li><strong>true</strong>: prechecks the request but does not disassociate the SAG instance from the bandwidth plan for application acceleration. If you use this value, the system checks the required parameters and the request syntax. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The region ID of the bandwidth plan for application acceleration.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * 
         * <strong>example:</strong>
         * <p>sag-w11hk4bqxpakem****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The list of the SAG instance id.</p>
         */
        public Builder smartAGIdList(java.util.List<String> smartAGIdList) {
            this.putQueryParameter("SmartAGIdList", smartAGIdList);
            this.smartAGIdList = smartAGIdList;
            return this;
        }

        @Override
        public DissociateSmartAGFromApplicationBandwidthPackageRequest build() {
            return new DissociateSmartAGFromApplicationBandwidthPackageRequest(this);
        } 

    } 

}
