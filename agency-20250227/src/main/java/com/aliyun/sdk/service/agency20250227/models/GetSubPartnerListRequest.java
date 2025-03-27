// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link GetSubPartnerListRequest} extends {@link RequestModel}
 *
 * <p>GetSubPartnerListRequest</p>
 */
public class GetSubPartnerListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubPartnerCompanyName")
    private String subPartnerCompanyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubPartnerPid")
    private String subPartnerPid;

    private GetSubPartnerListRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.subPartnerCompanyName = builder.subPartnerCompanyName;
        this.subPartnerPid = builder.subPartnerPid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubPartnerListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return subPartnerCompanyName
     */
    public String getSubPartnerCompanyName() {
        return this.subPartnerCompanyName;
    }

    /**
     * @return subPartnerPid
     */
    public String getSubPartnerPid() {
        return this.subPartnerPid;
    }

    public static final class Builder extends Request.Builder<GetSubPartnerListRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String subPartnerCompanyName; 
        private String subPartnerPid; 

        private Builder() {
            super();
        } 

        private Builder(GetSubPartnerListRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.subPartnerCompanyName = request.subPartnerCompanyName;
            this.subPartnerPid = request.subPartnerPid;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SubPartnerCompanyName.
         */
        public Builder subPartnerCompanyName(String subPartnerCompanyName) {
            this.putQueryParameter("SubPartnerCompanyName", subPartnerCompanyName);
            this.subPartnerCompanyName = subPartnerCompanyName;
            return this;
        }

        /**
         * SubPartnerPid.
         */
        public Builder subPartnerPid(String subPartnerPid) {
            this.putQueryParameter("SubPartnerPid", subPartnerPid);
            this.subPartnerPid = subPartnerPid;
            return this;
        }

        @Override
        public GetSubPartnerListRequest build() {
            return new GetSubPartnerListRequest(this);
        } 

    } 

}
