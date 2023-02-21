// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQccSearchCertificationRequest} extends {@link RequestModel}
 *
 * <p>GetQccSearchCertificationRequest</p>
 */
public class GetQccSearchCertificationRequest extends Request {
    @Body
    @NameInMap("CertCategory")
    private String certCategory;

    @Body
    @NameInMap("EntName")
    private String entName;

    @Body
    @NameInMap("PageNo")
    private Integer pageNo;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    private GetQccSearchCertificationRequest(Builder builder) {
        super(builder);
        this.certCategory = builder.certCategory;
        this.entName = builder.entName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQccSearchCertificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certCategory
     */
    public String getCertCategory() {
        return this.certCategory;
    }

    /**
     * @return entName
     */
    public String getEntName() {
        return this.entName;
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

    public static final class Builder extends Request.Builder<GetQccSearchCertificationRequest, Builder> {
        private String certCategory; 
        private String entName; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetQccSearchCertificationRequest request) {
            super(request);
            this.certCategory = request.certCategory;
            this.entName = request.entName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * 证书类型
         */
        public Builder certCategory(String certCategory) {
            this.putBodyParameter("CertCategory", certCategory);
            this.certCategory = certCategory;
            return this;
        }

        /**
         * 企业名称
         */
        public Builder entName(String entName) {
            this.putBodyParameter("EntName", entName);
            this.entName = entName;
            return this;
        }

        /**
         * 页码
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * 每页条数
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetQccSearchCertificationRequest build() {
            return new GetQccSearchCertificationRequest(this);
        } 

    } 

}
