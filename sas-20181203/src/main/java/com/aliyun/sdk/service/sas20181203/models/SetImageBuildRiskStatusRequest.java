// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetImageBuildRiskStatusRequest} extends {@link RequestModel}
 *
 * <p>SetImageBuildRiskStatusRequest</p>
 */
public class SetImageBuildRiskStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuids")
    private String imageUuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskKey")
    private String riskKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private SetImageBuildRiskStatusRequest(Builder builder) {
        super(builder);
        this.imageUuids = builder.imageUuids;
        this.riskKey = builder.riskKey;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetImageBuildRiskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUuids
     */
    public String getImageUuids() {
        return this.imageUuids;
    }

    /**
     * @return riskKey
     */
    public String getRiskKey() {
        return this.riskKey;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetImageBuildRiskStatusRequest, Builder> {
        private String imageUuids; 
        private String riskKey; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(SetImageBuildRiskStatusRequest request) {
            super(request);
            this.imageUuids = request.imageUuids;
            this.riskKey = request.riskKey;
            this.status = request.status;
        } 

        /**
         * ImageUuids.
         */
        public Builder imageUuids(String imageUuids) {
            this.putQueryParameter("ImageUuids", imageUuids);
            this.imageUuids = imageUuids;
            return this;
        }

        /**
         * RiskKey.
         */
        public Builder riskKey(String riskKey) {
            this.putQueryParameter("RiskKey", riskKey);
            this.riskKey = riskKey;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetImageBuildRiskStatusRequest build() {
            return new SetImageBuildRiskStatusRequest(this);
        } 

    } 

}
