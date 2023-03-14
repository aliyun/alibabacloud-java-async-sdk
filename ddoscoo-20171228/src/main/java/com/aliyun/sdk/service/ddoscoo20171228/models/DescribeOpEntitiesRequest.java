// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOpEntitiesRequest} extends {@link RequestModel}
 *
 * <p>DescribeOpEntitiesRequest</p>
 */
public class DescribeOpEntitiesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("EntityObject")
    private String entityObject;

    @Query
    @NameInMap("EntityType")
    private Integer entityType;

    @Query
    @NameInMap("OpAction")
    private Integer opAction;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private DescribeOpEntitiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.entityObject = builder.entityObject;
        this.entityType = builder.entityType;
        this.opAction = builder.opAction;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpEntitiesRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return entityObject
     */
    public String getEntityObject() {
        return this.entityObject;
    }

    /**
     * @return entityType
     */
    public Integer getEntityType() {
        return this.entityType;
    }

    /**
     * @return opAction
     */
    public Integer getOpAction() {
        return this.opAction;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeOpEntitiesRequest, Builder> {
        private String regionId; 
        private Long endTime; 
        private String entityObject; 
        private Integer entityType; 
        private Integer opAction; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String sourceIp; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOpEntitiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.entityObject = request.entityObject;
            this.entityType = request.entityType;
            this.opAction = request.opAction;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EntityObject.
         */
        public Builder entityObject(String entityObject) {
            this.putQueryParameter("EntityObject", entityObject);
            this.entityObject = entityObject;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(Integer entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * OpAction.
         */
        public Builder opAction(Integer opAction) {
            this.putQueryParameter("OpAction", opAction);
            this.opAction = opAction;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
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
        public DescribeOpEntitiesRequest build() {
            return new DescribeOpEntitiesRequest(this);
        } 

    } 

}
