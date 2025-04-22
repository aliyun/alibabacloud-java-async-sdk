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
 * {@link CreateQosPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateQosPolicyRequest</p>
 */
public class CreateQosPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FederationId")
    private String federationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowIds")
    private java.util.List<Integer> flowIds;

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
    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private java.util.List<String> zoneIds;

    private CreateQosPolicyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.federationId = builder.federationId;
        this.fileSystemId = builder.fileSystemId;
        this.flowIds = builder.flowIds;
        this.inputRegionId = builder.inputRegionId;
        this.maxIOBandWidth = builder.maxIOBandWidth;
        this.maxIOps = builder.maxIOps;
        this.maxMetaQps = builder.maxMetaQps;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQosPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return federationId
     */
    public String getFederationId() {
        return this.federationId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return flowIds
     */
    public java.util.List<Integer> getFlowIds() {
        return this.flowIds;
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
     * @return zoneIds
     */
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<CreateQosPolicyRequest, Builder> {
        private String description; 
        private String federationId; 
        private String fileSystemId; 
        private java.util.List<Integer> flowIds; 
        private String inputRegionId; 
        private Long maxIOBandWidth; 
        private Long maxIOps; 
        private Long maxMetaQps; 
        private java.util.List<String> zoneIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateQosPolicyRequest request) {
            super(request);
            this.description = request.description;
            this.federationId = request.federationId;
            this.fileSystemId = request.fileSystemId;
            this.flowIds = request.flowIds;
            this.inputRegionId = request.inputRegionId;
            this.maxIOBandWidth = request.maxIOBandWidth;
            this.maxIOps = request.maxIOps;
            this.maxMetaQps = request.maxMetaQps;
            this.zoneIds = request.zoneIds;
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
         * FederationId.
         */
        public Builder federationId(String federationId) {
            this.putQueryParameter("FederationId", federationId);
            this.federationId = federationId;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * FlowIds.
         */
        public Builder flowIds(java.util.List<Integer> flowIds) {
            String flowIdsShrink = shrink(flowIds, "FlowIds", "json");
            this.putQueryParameter("FlowIds", flowIdsShrink);
            this.flowIds = flowIds;
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
         * ZoneIds.
         */
        public Builder zoneIds(java.util.List<String> zoneIds) {
            String zoneIdsShrink = shrink(zoneIds, "ZoneIds", "json");
            this.putQueryParameter("ZoneIds", zoneIdsShrink);
            this.zoneIds = zoneIds;
            return this;
        }

        @Override
        public CreateQosPolicyRequest build() {
            return new CreateQosPolicyRequest(this);
        } 

    } 

}
