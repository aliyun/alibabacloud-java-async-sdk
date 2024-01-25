// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>AddAlgorithmRequest</p>
 */
public class AddAlgorithmRequest extends Request {
    @Query
    @NameInMap("AlgorithmId")
    private String algorithmId;

    @Query
    @NameInMap("AlgorithmType")
    private Integer algorithmType;

    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("ExpandInformation")
    private String expandInformation;

    @Query
    @NameInMap("IndexId")
    private String indexId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private AddAlgorithmRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.algorithmType = builder.algorithmType;
        this.businessGroupId = builder.businessGroupId;
        this.endTime = builder.endTime;
        this.expandInformation = builder.expandInformation;
        this.indexId = builder.indexId;
        this.instanceId = builder.instanceId;
        this.operaUid = builder.operaUid;
        this.productType = builder.productType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAlgorithmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return algorithmType
     */
    public Integer getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return expandInformation
     */
    public String getExpandInformation() {
        return this.expandInformation;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<AddAlgorithmRequest, Builder> {
        private String algorithmId; 
        private Integer algorithmType; 
        private String businessGroupId; 
        private Long endTime; 
        private String expandInformation; 
        private String indexId; 
        private String instanceId; 
        private String operaUid; 
        private String productType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(AddAlgorithmRequest request) {
            super(request);
            this.algorithmId = request.algorithmId;
            this.algorithmType = request.algorithmType;
            this.businessGroupId = request.businessGroupId;
            this.endTime = request.endTime;
            this.expandInformation = request.expandInformation;
            this.indexId = request.indexId;
            this.instanceId = request.instanceId;
            this.operaUid = request.operaUid;
            this.productType = request.productType;
            this.startTime = request.startTime;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.putQueryParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * AlgorithmType.
         */
        public Builder algorithmType(Integer algorithmType) {
            this.putQueryParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
        }

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExpandInformation.
         */
        public Builder expandInformation(String expandInformation) {
            this.putQueryParameter("ExpandInformation", expandInformation);
            this.expandInformation = expandInformation;
            return this;
        }

        /**
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public AddAlgorithmRequest build() {
            return new AddAlgorithmRequest(this);
        } 

    } 

}
