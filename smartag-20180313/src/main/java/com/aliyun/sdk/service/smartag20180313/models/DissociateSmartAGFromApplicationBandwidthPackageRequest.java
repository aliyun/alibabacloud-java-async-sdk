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
         * <p>The instance ID of the bandwidth plan for application acceleration.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
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
         * <p>Specifies whether to perform a dry run on the disassociation request. The dry run includes checks on permissions and instance status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Sends a normal request. If the request passes the check, the bandwidth plan for application acceleration is disassociated from the Smart Access Gateway instance.</li>
         * <li><strong>true</strong>: Sends a dry run request. Only the check is performed, and the bandwidth plan for application acceleration is not disassociated from the Smart Access Gateway instance. Check items include whether required parameters are specified and the request format. If the check fails, the corresponding error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</li>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
         * <p>The instance ID of the Smart Access Gateway.</p>
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
         * <p>The list of Smart Access Gateway instance IDs.</p>
         * <p>You can enter up to 100 Smart Access Gateway instance IDs at a time.</p>
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
