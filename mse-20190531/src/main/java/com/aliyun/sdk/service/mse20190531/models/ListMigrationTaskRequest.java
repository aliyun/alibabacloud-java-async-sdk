// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMigrationTaskRequest} extends {@link RequestModel}
 *
 * <p>ListMigrationTaskRequest</p>
 */
public class ListMigrationTaskRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("OriginInstanceName")
    private String originInstanceName;

    @Query
    @NameInMap("PageNum")
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    private ListMigrationTaskRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.originInstanceName = builder.originInstanceName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMigrationTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return originInstanceName
     */
    public String getOriginInstanceName() {
        return this.originInstanceName;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<ListMigrationTaskRequest, Builder> {
        private String acceptLanguage; 
        private String originInstanceName; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(ListMigrationTaskRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.originInstanceName = request.originInstanceName;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.requestPars = request.requestPars;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * OriginInstanceName.
         */
        public Builder originInstanceName(String originInstanceName) {
            this.putQueryParameter("OriginInstanceName", originInstanceName);
            this.originInstanceName = originInstanceName;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public ListMigrationTaskRequest build() {
            return new ListMigrationTaskRequest(this);
        } 

    } 

}
