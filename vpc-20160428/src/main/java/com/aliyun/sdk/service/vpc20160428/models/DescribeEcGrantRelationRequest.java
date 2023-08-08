// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEcGrantRelationRequest} extends {@link RequestModel}
 *
 * <p>DescribeEcGrantRelationRequest</p>
 */
public class DescribeEcGrantRelationRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("VbrRegionNo")
    private String vbrRegionNo;

    private DescribeEcGrantRelationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.vbrRegionNo = builder.vbrRegionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEcGrantRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return vbrRegionNo
     */
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

    public static final class Builder extends Request.Builder<DescribeEcGrantRelationRequest, Builder> {
        private String instanceId; 
        private String instanceType; 
        private Long pageNumber; 
        private Long pageSize; 
        private String vbrRegionNo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEcGrantRelationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.vbrRegionNo = request.vbrRegionNo;
        } 

        /**
         * The ID of the instance.
         * <p>
         * 
         * *   If you set **InstanceType** to **VBR**, specify a VBR ID.
         * *   If you set **InstanceType** to **VPC**, specify a VPC ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of instance. Valid values:
         * <p>
         * 
         * *   **VBR**: queries the permissions that are granted to a VBR.
         * *   **VPC**: queries the permissions that are granted from a VPC.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region where the instance is deployed.
         * <p>
         * 
         * *   If **InstanceType** is set to **VBR**, this parameter is required.
         * *   If **InstanceType** is set to **VPC**, you can ignore this parameter.
         */
        public Builder vbrRegionNo(String vbrRegionNo) {
            this.putQueryParameter("VbrRegionNo", vbrRegionNo);
            this.vbrRegionNo = vbrRegionNo;
            return this;
        }

        @Override
        public DescribeEcGrantRelationRequest build() {
            return new DescribeEcGrantRelationRequest(this);
        } 

    } 

}
