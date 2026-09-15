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
 * {@link CreateVpconnFromVbrRequest} extends {@link RequestModel}
 *
 * <p>CreateVpconnFromVbrRequest</p>
 */
public class CreateVpconnFromVbrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderMode")
    private String orderMode;

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

    private CreateVpconnFromVbrRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.orderMode = builder.orderMode;
        this.regionId = builder.regionId;
        this.token = builder.token;
        this.vbrId = builder.vbrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpconnFromVbrRequest create() {
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
     * @return orderMode
     */
    public String getOrderMode() {
        return this.orderMode;
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

    public static final class Builder extends Request.Builder<CreateVpconnFromVbrRequest, Builder> {
        private Boolean dryRun; 
        private String orderMode; 
        private String regionId; 
        private String token; 
        private String vbrId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpconnFromVbrRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.orderMode = request.orderMode;
            this.regionId = request.regionId;
            this.token = request.token;
            this.vbrId = request.vbrId;
        } 

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run without transforming the shared Express Connect circuits mode. The system checks the required parameters, request format, and instance status. If the check fails, the corresponding error is returned. If the check succeeds, the corresponding request ID is returned.</li>
         * <li><strong>false</strong> (default): sends a Normal request. After the request passes the check, the shared Express Connect circuits mode is transformed.</li>
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
         * <p>The payer of the shared Express Connect circuits. Valid values:</p>
         * <ul>
         * <li><strong>PayByPhysicalConnectionOwner</strong>: The owner of the Express Connect circuit associated with the shared Express Connect circuits pays the fee.</li>
         * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The owner of the shared Express Connect circuits pays the fee.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByVirtualPhysicalConnectionOwner</p>
         */
        public Builder orderMode(String orderMode) {
            this.putQueryParameter("OrderMode", orderMode);
            this.orderMode = orderMode;
            return this;
        }

        /**
         * <p>The region ID of the shared Express Connect circuits.</p>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The instance ID of the cross-account VBR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp136flp1mf8mlq6r****</p>
         */
        public Builder vbrId(String vbrId) {
            this.putQueryParameter("VbrId", vbrId);
            this.vbrId = vbrId;
            return this;
        }

        @Override
        public CreateVpconnFromVbrRequest build() {
            return new CreateVpconnFromVbrRequest(this);
        } 

    } 

}
