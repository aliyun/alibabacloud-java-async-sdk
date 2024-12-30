// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetWorksEmbedListRequest} extends {@link RequestModel}
 *
 * <p>GetWorksEmbedListRequest</p>
 */
public class GetWorksEmbedListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksType")
    private String worksType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WsId")
    private String wsId;

    private GetWorksEmbedListRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.worksType = builder.worksType;
        this.wsId = builder.wsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorksEmbedListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return worksType
     */
    public String getWorksType() {
        return this.worksType;
    }

    /**
     * @return wsId
     */
    public String getWsId() {
        return this.wsId;
    }

    public static final class Builder extends Request.Builder<GetWorksEmbedListRequest, Builder> {
        private String keyword; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String worksType; 
        private String wsId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorksEmbedListRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.worksType = request.worksType;
            this.wsId = request.wsId;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
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
         * WorksType.
         */
        public Builder worksType(String worksType) {
            this.putQueryParameter("WorksType", worksType);
            this.worksType = worksType;
            return this;
        }

        /**
         * WsId.
         */
        public Builder wsId(String wsId) {
            this.putQueryParameter("WsId", wsId);
            this.wsId = wsId;
            return this;
        }

        @Override
        public GetWorksEmbedListRequest build() {
            return new GetWorksEmbedListRequest(this);
        } 

    } 

}
