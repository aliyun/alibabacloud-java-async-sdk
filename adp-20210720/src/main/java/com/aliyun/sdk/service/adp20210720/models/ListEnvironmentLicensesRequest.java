// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentLicensesRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentLicensesRequest</p>
 */
public class ListEnvironmentLicensesRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Query
    @NameInMap("pageNum")
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("scope")
    private String scope;

    @Query
    @NameInMap("type")
    private String type;

    private ListEnvironmentLicensesRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.scope = builder.scope;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentLicensesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentLicensesRequest, Builder> {
        private String uid; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String scope; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentLicensesRequest request) {
            super(request);
            this.uid = request.uid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.scope = request.scope;
            this.type = request.type;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListEnvironmentLicensesRequest build() {
            return new ListEnvironmentLicensesRequest(this);
        } 

    } 

}
