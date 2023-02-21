// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcKnowledgePropertyPledgeRequest} extends {@link RequestModel}
 *
 * <p>GetOcIcKnowledgePropertyPledgeRequest</p>
 */
public class GetOcIcKnowledgePropertyPledgeRequest extends Request {
    @Body
    @NameInMap("PageNo")
    private Integer pageNo;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("SearchKey")
    private String searchKey;

    private GetOcIcKnowledgePropertyPledgeRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcIcKnowledgePropertyPledgeRequest create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    public static final class Builder extends Request.Builder<GetOcIcKnowledgePropertyPledgeRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(GetOcIcKnowledgePropertyPledgeRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.searchKey = request.searchKey;
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

        /**
         * 系统参数，requestId
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        @Override
        public GetOcIcKnowledgePropertyPledgeRequest build() {
            return new GetOcIcKnowledgePropertyPledgeRequest(this);
        } 

    } 

}
