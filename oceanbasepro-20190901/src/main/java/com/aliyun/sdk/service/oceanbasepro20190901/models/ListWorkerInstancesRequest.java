// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkerInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkerInstancesRequest</p>
 */
public class ListWorkerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestType")
    private String destType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnlyBindable")
    private Boolean onlyBindable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Specs")
    private java.util.List < String > specs;

    private ListWorkerInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destType = builder.destType;
        this.instanceName = builder.instanceName;
        this.onlyBindable = builder.onlyBindable;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sourceType = builder.sourceType;
        this.specs = builder.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkerInstancesRequest create() {
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
     * @return destType
     */
    public String getDestType() {
        return this.destType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return onlyBindable
     */
    public Boolean getOnlyBindable() {
        return this.onlyBindable;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return specs
     */
    public java.util.List < String > getSpecs() {
        return this.specs;
    }

    public static final class Builder extends Request.Builder<ListWorkerInstancesRequest, Builder> {
        private String regionId; 
        private String destType; 
        private String instanceName; 
        private Boolean onlyBindable; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sourceType; 
        private java.util.List < String > specs; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkerInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destType = request.destType;
            this.instanceName = request.instanceName;
            this.onlyBindable = request.onlyBindable;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sourceType = request.sourceType;
            this.specs = request.specs;
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
         * DestType.
         */
        public Builder destType(String destType) {
            this.putBodyParameter("DestType", destType);
            this.destType = destType;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * OnlyBindable.
         */
        public Builder onlyBindable(Boolean onlyBindable) {
            this.putBodyParameter("OnlyBindable", onlyBindable);
            this.onlyBindable = onlyBindable;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Specs.
         */
        public Builder specs(java.util.List < String > specs) {
            String specsShrink = shrink(specs, "Specs", "json");
            this.putBodyParameter("Specs", specsShrink);
            this.specs = specs;
            return this;
        }

        @Override
        public ListWorkerInstancesRequest build() {
            return new ListWorkerInstancesRequest(this);
        } 

    } 

}
