// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVulListByIdRequest} extends {@link RequestModel}
 *
 * <p>GetVulListByIdRequest</p>
 */
public class GetVulListByIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Necessity")
    private String necessity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private GetVulListByIdRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.id = builder.id;
        this.necessity = builder.necessity;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulListByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<GetVulListByIdRequest, Builder> {
        private Integer currentPage; 
        private String dealed; 
        private Long id; 
        private String necessity; 
        private Integer pageSize; 
        private String remark; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(GetVulListByIdRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.id = request.id;
            this.necessity = request.necessity;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.uuids = request.uuids;
        } 

        /**
         * <p>Current page</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Whether it has been processed; y: processed; n: not processed</p>
         * 
         * <strong>example:</strong>
         * <p>n</p>
         */
        public Builder dealed(String dealed) {
            this.putBodyParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>Primary key ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4209205</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Risk level</p>
         * 
         * <strong>example:</strong>
         * <p>asap,later,nntf</p>
         */
        public Builder necessity(String necessity) {
            this.putBodyParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Asset information of the vulnerability to be queried, which can be set as asset name, public IP, or private IP.</p>
         * 
         * <strong>example:</strong>
         * <p>production_nat_cn-hangzhou_zone_105</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>UUID of the server with the vulnerability to be queried. Multiple UUIDs should be separated by a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>3615b908-995a-4edb-bc85-1981b4e94ba0,9c52cf9a-d8ba-4e31-ae06-500b879ee4e6,4b7de3cf-c4ac-42fc-8804-35070493dc29,f3c01525-0777-4c97-88d9-bec11afd4a6a,a80bd516-c4f3-4c27-a169-c8abfaf9e89e</p>
         */
        public Builder uuids(String uuids) {
            this.putBodyParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public GetVulListByIdRequest build() {
            return new GetVulListByIdRequest(this);
        } 

    } 

}
