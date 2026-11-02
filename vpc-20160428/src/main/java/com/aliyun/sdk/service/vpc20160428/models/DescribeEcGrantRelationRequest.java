// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeEcGrantRelationRequest} extends {@link RequestModel}
 *
 * <p>DescribeEcGrantRelationRequest</p>
 */
public class DescribeEcGrantRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrRegionNo")
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
         * <p>The instance ID of the instance for which you want to query the authorization relationship.</p>
         * <ul>
         * <li><p>If <strong>InstanceType</strong> is set to <strong>VBR</strong>, set this parameter to the instance ID of the VBR instance.</p>
         * </li>
         * <li><p>If <strong>InstanceType</strong> is set to <strong>VPC</strong>, set this parameter to the instance ID of the VPC-connected instance.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp12mw1f8k3jgygk9****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the instance for which you want to query the authorization relationship. Valid values:</p>
         * <ul>
         * <li><strong>VBR</strong>: Virtual Border vRouter (VBR) instance used for routing. Queries the VPC-connected instances that have authorized the VBR instance.</li>
         * <li><strong>VPC</strong>: Virtual Private Cloud (VPC) instance. Queries the VBR instances that the VPC-connected instance has authorized.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paging in a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the VBR instance for which you want to query the authorization relationship.</p>
         * <ul>
         * <li><p>If <strong>InstanceType</strong> is set to <strong>VBR</strong>, this parameter is required.</p>
         * </li>
         * <li><p>If <strong>InstanceType</strong> is set to <strong>VPC</strong>, this parameter is not required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
