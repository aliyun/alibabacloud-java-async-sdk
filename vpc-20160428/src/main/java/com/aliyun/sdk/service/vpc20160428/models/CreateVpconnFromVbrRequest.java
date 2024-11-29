// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and instance status. If the request fails the dry run, an error message is returned. If the request passes the dry run, the system returns the ID of the request.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>The payer for the shared Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>PayByPhysicalConnectionOwner</strong>: the owner of the shared Express Connect circuit</li>
         * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: the owner of the hosted connection</li>
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
         * <p>The region ID of the hosted connection.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The ID of the associated VBR.</p>
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
