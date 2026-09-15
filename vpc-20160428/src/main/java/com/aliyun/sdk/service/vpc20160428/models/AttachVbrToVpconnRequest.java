// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link AttachVbrToVpconnRequest} extends {@link RequestModel}
 *
 * <p>AttachVbrToVpconnRequest</p>
 */
public class AttachVbrToVpconnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vbrId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpconnId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpconnId;

    private AttachVbrToVpconnRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.token = builder.token;
        this.vbrId = builder.vbrId;
        this.vpconnId = builder.vpconnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachVbrToVpconnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vbrId
     */
    public String getVbrId() {
        return this.vbrId;
    }

    /**
     * @return vpconnId
     */
    public String getVpconnId() {
        return this.vpconnId;
    }

    public static final class Builder extends Request.Builder<AttachVbrToVpconnRequest, Builder> {
        private Boolean dryRun; 
        private String regionId; 
        private String token; 
        private String vbrId; 
        private String vpconnId; 

        private Builder() {
            super();
        } 

        private Builder(AttachVbrToVpconnRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.token = request.token;
            this.vbrId = request.vbrId;
            this.vpconnId = request.vpconnId;
        } 

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run without associating the VBR instance with shared Express Connect circuits. The system checks whether the required parameters are specified, the request format is valid, and the instance status is correct. If the check fails, the corresponding error is returned. If the check passes, the request ID is returned.</li>
         * <li><strong>false</strong> (default): sends a normal request. After the check passes, the VBR instance is directly associated with shared Express Connect circuits.</li>
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
         * <p>The region ID of the shared Express Connect circuits.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>The client token must be unique among different requests. The maximum length is 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>CBCE910E-D396-4944-8****</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The VBR instance ID.</p>
         * <blockquote>
         * <p>The ID of the VBR instance to be migrated. The VBR must currently be directly attached to an Express Connect circuit owned by the caller, and must be the same VBR specified in CreateVpconnFromVbr.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp133sn3nwjvu7twc****</p>
         */
        public Builder vbrId(String vbrId) {
            this.putQueryParameter("VbrId", vbrId);
            this.vbrId = vbrId;
            return this;
        }

        /**
         * <p>The ID of the shared Express Connect circuits (VirtualPhysicalConnection) instance.</p>
         * <blockquote>
         * <p>The shared Express Connect circuits instance ID returned by CreateVpconnFromVbr. The instance must have been confirmed and accepted by the tenant (Confirmed) and be in the Enabled state.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1mrgfbtmc9brre7****</p>
         */
        public Builder vpconnId(String vpconnId) {
            this.putQueryParameter("VpconnId", vpconnId);
            this.vpconnId = vpconnId;
            return this;
        }

        @Override
        public AttachVbrToVpconnRequest build() {
            return new AttachVbrToVpconnRequest(this);
        } 

    } 

}
