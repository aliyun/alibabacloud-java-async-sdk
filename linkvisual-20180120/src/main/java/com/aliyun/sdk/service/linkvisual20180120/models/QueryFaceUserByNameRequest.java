// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceUserByNameRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceUserByNameRequest</p>
 */
public class QueryFaceUserByNameRequest extends Request {
    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true, maximum = 1000000, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Params")
    private String params;

    private QueryFaceUserByNameRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceUserByNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<QueryFaceUserByNameRequest, Builder> {
        private String isolationId; 
        private String name; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceUserByNameRequest response) {
            super(response);
            this.isolationId = response.isolationId;
            this.name = response.name;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.params = response.params;
        } 

        /**
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public QueryFaceUserByNameRequest build() {
            return new QueryFaceUserByNameRequest(this);
        } 

    } 

}
