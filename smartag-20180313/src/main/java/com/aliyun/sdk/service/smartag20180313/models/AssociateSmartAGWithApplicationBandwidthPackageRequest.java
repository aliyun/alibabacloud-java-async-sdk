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
 * {@link AssociateSmartAGWithApplicationBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>AssociateSmartAGWithApplicationBandwidthPackageRequest</p>
 */
public class AssociateSmartAGWithApplicationBandwidthPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationBandwidthPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationBandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociateConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AssociateConfigs> associateConfigs;

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

    private AssociateSmartAGWithApplicationBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.applicationBandwidthPackageId = builder.applicationBandwidthPackageId;
        this.associateConfigs = builder.associateConfigs;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateSmartAGWithApplicationBandwidthPackageRequest create() {
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
     * @return associateConfigs
     */
    public java.util.List<AssociateConfigs> getAssociateConfigs() {
        return this.associateConfigs;
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

    public static final class Builder extends Request.Builder<AssociateSmartAGWithApplicationBandwidthPackageRequest, Builder> {
        private String applicationBandwidthPackageId; 
        private java.util.List<AssociateConfigs> associateConfigs; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateSmartAGWithApplicationBandwidthPackageRequest request) {
            super(request);
            this.applicationBandwidthPackageId = request.applicationBandwidthPackageId;
            this.associateConfigs = request.associateConfigs;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
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
         * <p>The configuration of application acceleration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder associateConfigs(java.util.List<AssociateConfigs> associateConfigs) {
            this.putQueryParameter("AssociateConfigs", associateConfigs);
            this.associateConfigs = associateConfigs;
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
         * <li><strong>false</strong> (default): sends the request. After the request passes the check, the bandwidth plan for application acceleration is associated with the SAG instance.</li>
         * <li><strong>true</strong>: prechecks the request but does not associate the bandwidth plan for application acceleration with the SAG instance. If you use this value, the system checks the required parameters and the request syntax. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
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

        @Override
        public AssociateSmartAGWithApplicationBandwidthPackageRequest build() {
            return new AssociateSmartAGWithApplicationBandwidthPackageRequest(this);
        } 

    } 

    /**
     * 
     * {@link AssociateSmartAGWithApplicationBandwidthPackageRequest} extends {@link TeaModel}
     *
     * <p>AssociateSmartAGWithApplicationBandwidthPackageRequest</p>
     */
    public static class AssociateConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String smartAGId;

        private AssociateConfigs(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.smartAGId = builder.smartAGId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociateConfigs create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String smartAGId; 

            private Builder() {
            } 

            private Builder(AssociateConfigs model) {
                this.bandwidth = model.bandwidth;
                this.smartAGId = model.smartAGId;
            } 

            /**
             * <p>The maximum bandwidth value for application acceleration. Unit: Mbit/s.</p>
             * <blockquote>
             * <p> The maximum bandwidth value of each SAG instance cannot exceed that of the associated bandwidth plan for application acceleration.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-gf5serujbhrn2j****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            public AssociateConfigs build() {
                return new AssociateConfigs(this);
            } 

        } 

    }
}
