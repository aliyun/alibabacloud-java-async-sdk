// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBrandPageRequest} extends {@link RequestModel}
 *
 * <p>GetBrandPageRequest</p>
 */
public class GetBrandPageRequest extends Request {
    @Query
    @NameInMap("AccountNo")
    private String accountNo;

    @Query
    @NameInMap("MainId")
    @Validation(required = true, minimum = 1)
    private Long mainId;

    @Query
    @NameInMap("MainName")
    private String mainName;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true, maximum = 99999)
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    private GetBrandPageRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.mainId = builder.mainId;
        this.mainName = builder.mainName;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBrandPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public String getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return mainId
     */
    public Long getMainId() {
        return this.mainId;
    }

    /**
     * @return mainName
     */
    public String getMainName() {
        return this.mainName;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetBrandPageRequest, Builder> {
        private String accountNo; 
        private Long mainId; 
        private String mainName; 
        private Integer pageIndex; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetBrandPageRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.mainId = request.mainId;
            this.mainName = request.mainName;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
        } 

        /**
         * AccountNo.
         */
        public Builder accountNo(String accountNo) {
            this.putQueryParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * MainId.
         */
        public Builder mainId(Long mainId) {
            this.putQueryParameter("MainId", mainId);
            this.mainId = mainId;
            return this;
        }

        /**
         * MainName.
         */
        public Builder mainName(String mainName) {
            this.putQueryParameter("MainName", mainName);
            this.mainName = mainName;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
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

        @Override
        public GetBrandPageRequest build() {
            return new GetBrandPageRequest(this);
        } 

    } 

}
