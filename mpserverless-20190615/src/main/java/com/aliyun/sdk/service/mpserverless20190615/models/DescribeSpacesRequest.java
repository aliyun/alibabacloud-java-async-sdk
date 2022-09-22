// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpacesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpacesRequest</p>
 */
public class DescribeSpacesRequest extends Request {
    @Body
    @NameInMap("EmasWorkspaceId")
    private Long emasWorkspaceId;

    @Body
    @NameInMap("PageNum")
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("SpaceIds")
    private java.util.List < String > spaceIds;

    @Body
    @NameInMap("SpecCode")
    private String specCode;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private DescribeSpacesRequest(Builder builder) {
        super(builder);
        this.emasWorkspaceId = builder.emasWorkspaceId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.spaceIds = builder.spaceIds;
        this.specCode = builder.specCode;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return emasWorkspaceId
     */
    public Long getEmasWorkspaceId() {
        return this.emasWorkspaceId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return spaceIds
     */
    public java.util.List < String > getSpaceIds() {
        return this.spaceIds;
    }

    /**
     * @return specCode
     */
    public String getSpecCode() {
        return this.specCode;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DescribeSpacesRequest, Builder> {
        private Long emasWorkspaceId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List < String > spaceIds; 
        private String specCode; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpacesRequest request) {
            super(request);
            this.emasWorkspaceId = request.emasWorkspaceId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.spaceIds = request.spaceIds;
            this.specCode = request.specCode;
            this.tenantId = request.tenantId;
        } 

        /**
         * EmasWorkspaceId.
         */
        public Builder emasWorkspaceId(Long emasWorkspaceId) {
            this.putBodyParameter("EmasWorkspaceId", emasWorkspaceId);
            this.emasWorkspaceId = emasWorkspaceId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * SpaceIds.
         */
        public Builder spaceIds(java.util.List < String > spaceIds) {
            String spaceIdsShrink = shrink(spaceIds, "SpaceIds", "simple");
            this.putBodyParameter("SpaceIds", spaceIdsShrink);
            this.spaceIds = spaceIds;
            return this;
        }

        /**
         * SpecCode.
         */
        public Builder specCode(String specCode) {
            this.putBodyParameter("SpecCode", specCode);
            this.specCode = specCode;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeSpacesRequest build() {
            return new DescribeSpacesRequest(this);
        } 

    } 

}
