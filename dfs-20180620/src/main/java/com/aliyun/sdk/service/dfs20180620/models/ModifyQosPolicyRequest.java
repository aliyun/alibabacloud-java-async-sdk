// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ModifyQosPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyQosPolicyRequest</p>
 */
public class ModifyQosPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxIOBandWidth")
    private Long maxIOBandWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxIOps")
    private Long maxIOps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxMetaQps")
    private Long maxMetaQps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosPolicyId;

    private ModifyQosPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.inputRegionId = builder.inputRegionId;
        this.maxIOBandWidth = builder.maxIOBandWidth;
        this.maxIOps = builder.maxIOps;
        this.maxMetaQps = builder.maxMetaQps;
        this.qosPolicyId = builder.qosPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyQosPolicyRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return maxIOBandWidth
     */
    public Long getMaxIOBandWidth() {
        return this.maxIOBandWidth;
    }

    /**
     * @return maxIOps
     */
    public Long getMaxIOps() {
        return this.maxIOps;
    }

    /**
     * @return maxMetaQps
     */
    public Long getMaxMetaQps() {
        return this.maxMetaQps;
    }

    /**
     * @return qosPolicyId
     */
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    public static final class Builder extends Request.Builder<ModifyQosPolicyRequest, Builder> {
        private String regionId; 
        private String description; 
        private String inputRegionId; 
        private Long maxIOBandWidth; 
        private Long maxIOps; 
        private Long maxMetaQps; 
        private String qosPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyQosPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.inputRegionId = request.inputRegionId;
            this.maxIOBandWidth = request.maxIOBandWidth;
            this.maxIOps = request.maxIOps;
            this.maxMetaQps = request.maxMetaQps;
            this.qosPolicyId = request.qosPolicyId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * MaxIOBandWidth.
         */
        public Builder maxIOBandWidth(Long maxIOBandWidth) {
            this.putQueryParameter("MaxIOBandWidth", maxIOBandWidth);
            this.maxIOBandWidth = maxIOBandWidth;
            return this;
        }

        /**
         * MaxIOps.
         */
        public Builder maxIOps(Long maxIOps) {
            this.putQueryParameter("MaxIOps", maxIOps);
            this.maxIOps = maxIOps;
            return this;
        }

        /**
         * MaxMetaQps.
         */
        public Builder maxMetaQps(Long maxMetaQps) {
            this.putQueryParameter("MaxMetaQps", maxMetaQps);
            this.maxMetaQps = maxMetaQps;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder qosPolicyId(String qosPolicyId) {
            this.putQueryParameter("QosPolicyId", qosPolicyId);
            this.qosPolicyId = qosPolicyId;
            return this;
        }

        @Override
        public ModifyQosPolicyRequest build() {
            return new ModifyQosPolicyRequest(this);
        } 

    } 

}
