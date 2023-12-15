// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAntChainUserCertificateRequest} extends {@link RequestModel}
 *
 * <p>ResetAntChainUserCertificateRequest</p>
 */
public class ResetAntChainUserCertificateRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("Bid")
    @Validation(required = true)
    private String bid;

    @Body
    @NameInMap("Operation")
    @Validation(required = true)
    private Integer operation;

    @Body
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private ResetAntChainUserCertificateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.bid = builder.bid;
        this.operation = builder.operation;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAntChainUserCertificateRequest create() {
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
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return operation
     */
    public Integer getOperation() {
        return this.operation;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ResetAntChainUserCertificateRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String bid; 
        private Integer operation; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ResetAntChainUserCertificateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.bid = request.bid;
            this.operation = request.operation;
            this.username = request.username;
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
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        /**
         * Bid.
         */
        public Builder bid(String bid) {
            this.putBodyParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(Integer operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ResetAntChainUserCertificateRequest build() {
            return new ResetAntChainUserCertificateRequest(this);
        } 

    } 

}
