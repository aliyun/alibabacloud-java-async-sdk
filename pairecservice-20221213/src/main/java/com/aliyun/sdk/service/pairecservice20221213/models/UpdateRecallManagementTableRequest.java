// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link UpdateRecallManagementTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecallManagementTableRequest</p>
 */
public class UpdateRecallManagementTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recallManagementTableId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableDataSizeFluctuationThreshold")
    private Boolean enableDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableRowCountFluctuationThreshold")
    private Boolean enableRowCountFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IndexVersionId")
    private String indexVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxDataSizeFluctuationThreshold")
    private Integer maxDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxRowCountFluctuationThreshold")
    private Integer maxRowCountFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinDataSizeFluctuationThreshold")
    private Integer minDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinRowCountFluctuationThreshold")
    private Integer minRowCountFluctuationThreshold;

    private UpdateRecallManagementTableRequest(Builder builder) {
        super(builder);
        this.recallManagementTableId = builder.recallManagementTableId;
        this.regionId = builder.regionId;
        this.enableDataSizeFluctuationThreshold = builder.enableDataSizeFluctuationThreshold;
        this.enableRowCountFluctuationThreshold = builder.enableRowCountFluctuationThreshold;
        this.indexVersionId = builder.indexVersionId;
        this.instanceId = builder.instanceId;
        this.maxDataSizeFluctuationThreshold = builder.maxDataSizeFluctuationThreshold;
        this.maxRowCountFluctuationThreshold = builder.maxRowCountFluctuationThreshold;
        this.minDataSizeFluctuationThreshold = builder.minDataSizeFluctuationThreshold;
        this.minRowCountFluctuationThreshold = builder.minRowCountFluctuationThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecallManagementTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementTableId
     */
    public String getRecallManagementTableId() {
        return this.recallManagementTableId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return enableDataSizeFluctuationThreshold
     */
    public Boolean getEnableDataSizeFluctuationThreshold() {
        return this.enableDataSizeFluctuationThreshold;
    }

    /**
     * @return enableRowCountFluctuationThreshold
     */
    public Boolean getEnableRowCountFluctuationThreshold() {
        return this.enableRowCountFluctuationThreshold;
    }

    /**
     * @return indexVersionId
     */
    public String getIndexVersionId() {
        return this.indexVersionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxDataSizeFluctuationThreshold
     */
    public Integer getMaxDataSizeFluctuationThreshold() {
        return this.maxDataSizeFluctuationThreshold;
    }

    /**
     * @return maxRowCountFluctuationThreshold
     */
    public Integer getMaxRowCountFluctuationThreshold() {
        return this.maxRowCountFluctuationThreshold;
    }

    /**
     * @return minDataSizeFluctuationThreshold
     */
    public Integer getMinDataSizeFluctuationThreshold() {
        return this.minDataSizeFluctuationThreshold;
    }

    /**
     * @return minRowCountFluctuationThreshold
     */
    public Integer getMinRowCountFluctuationThreshold() {
        return this.minRowCountFluctuationThreshold;
    }

    public static final class Builder extends Request.Builder<UpdateRecallManagementTableRequest, Builder> {
        private String recallManagementTableId; 
        private String regionId; 
        private Boolean enableDataSizeFluctuationThreshold; 
        private Boolean enableRowCountFluctuationThreshold; 
        private String indexVersionId; 
        private String instanceId; 
        private Integer maxDataSizeFluctuationThreshold; 
        private Integer maxRowCountFluctuationThreshold; 
        private Integer minDataSizeFluctuationThreshold; 
        private Integer minRowCountFluctuationThreshold; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecallManagementTableRequest request) {
            super(request);
            this.recallManagementTableId = request.recallManagementTableId;
            this.regionId = request.regionId;
            this.enableDataSizeFluctuationThreshold = request.enableDataSizeFluctuationThreshold;
            this.enableRowCountFluctuationThreshold = request.enableRowCountFluctuationThreshold;
            this.indexVersionId = request.indexVersionId;
            this.instanceId = request.instanceId;
            this.maxDataSizeFluctuationThreshold = request.maxDataSizeFluctuationThreshold;
            this.maxRowCountFluctuationThreshold = request.maxRowCountFluctuationThreshold;
            this.minDataSizeFluctuationThreshold = request.minDataSizeFluctuationThreshold;
            this.minRowCountFluctuationThreshold = request.minRowCountFluctuationThreshold;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder recallManagementTableId(String recallManagementTableId) {
            this.putPathParameter("RecallManagementTableId", recallManagementTableId);
            this.recallManagementTableId = recallManagementTableId;
            return this;
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
         * EnableDataSizeFluctuationThreshold.
         */
        public Builder enableDataSizeFluctuationThreshold(Boolean enableDataSizeFluctuationThreshold) {
            this.putBodyParameter("EnableDataSizeFluctuationThreshold", enableDataSizeFluctuationThreshold);
            this.enableDataSizeFluctuationThreshold = enableDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * EnableRowCountFluctuationThreshold.
         */
        public Builder enableRowCountFluctuationThreshold(Boolean enableRowCountFluctuationThreshold) {
            this.putBodyParameter("EnableRowCountFluctuationThreshold", enableRowCountFluctuationThreshold);
            this.enableRowCountFluctuationThreshold = enableRowCountFluctuationThreshold;
            return this;
        }

        /**
         * IndexVersionId.
         */
        public Builder indexVersionId(String indexVersionId) {
            this.putBodyParameter("IndexVersionId", indexVersionId);
            this.indexVersionId = indexVersionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxDataSizeFluctuationThreshold.
         */
        public Builder maxDataSizeFluctuationThreshold(Integer maxDataSizeFluctuationThreshold) {
            this.putBodyParameter("MaxDataSizeFluctuationThreshold", maxDataSizeFluctuationThreshold);
            this.maxDataSizeFluctuationThreshold = maxDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * MaxRowCountFluctuationThreshold.
         */
        public Builder maxRowCountFluctuationThreshold(Integer maxRowCountFluctuationThreshold) {
            this.putBodyParameter("MaxRowCountFluctuationThreshold", maxRowCountFluctuationThreshold);
            this.maxRowCountFluctuationThreshold = maxRowCountFluctuationThreshold;
            return this;
        }

        /**
         * MinDataSizeFluctuationThreshold.
         */
        public Builder minDataSizeFluctuationThreshold(Integer minDataSizeFluctuationThreshold) {
            this.putBodyParameter("MinDataSizeFluctuationThreshold", minDataSizeFluctuationThreshold);
            this.minDataSizeFluctuationThreshold = minDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * MinRowCountFluctuationThreshold.
         */
        public Builder minRowCountFluctuationThreshold(Integer minRowCountFluctuationThreshold) {
            this.putBodyParameter("MinRowCountFluctuationThreshold", minRowCountFluctuationThreshold);
            this.minRowCountFluctuationThreshold = minRowCountFluctuationThreshold;
            return this;
        }

        @Override
        public UpdateRecallManagementTableRequest build() {
            return new UpdateRecallManagementTableRequest(this);
        } 

    } 

}
