// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineTemplatesRequest</p>
 */
public class ListPipelineTemplatesRequest extends Request {
    @Query
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageStart")
    private Integer pageStart;

    private ListPipelineTemplatesRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.pageNum = builder.pageNum;
        this.pageStart = builder.pageStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageStart
     */
    public Integer getPageStart() {
        return this.pageStart;
    }

    public static final class Builder extends Request.Builder<ListPipelineTemplatesRequest, Builder> {
        private String orgId; 
        private Integer pageNum; 
        private Integer pageStart; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineTemplatesRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.pageNum = response.pageNum;
            this.pageStart = response.pageStart;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * 本次读取的最大数据记录数量
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * 本次读取的最大数据记录数量
         */
        public Builder pageStart(Integer pageStart) {
            this.putQueryParameter("PageStart", pageStart);
            this.pageStart = pageStart;
            return this;
        }

        @Override
        public ListPipelineTemplatesRequest build() {
            return new ListPipelineTemplatesRequest(this);
        } 

    } 

}
