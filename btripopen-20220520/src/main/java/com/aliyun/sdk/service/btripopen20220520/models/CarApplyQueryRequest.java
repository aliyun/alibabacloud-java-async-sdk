// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>CarApplyQueryRequest</p>
 */
public class CarApplyQueryRequest extends Request {
    @Query
    @NameInMap("corp_id")
    @Validation(required = true)
    private String corpId;

    @Query
    @NameInMap("created_end_at")
    private String createdEndAt;

    @Query
    @NameInMap("created_start_at")
    private String createdStartAt;

    @Query
    @NameInMap("page_number")
    private Integer pageNumber;

    @Query
    @NameInMap("page_size")
    private Integer pageSize;

    @Query
    @NameInMap("third_part_apply_id")
    private String thirdPartApplyId;

    @Query
    @NameInMap("user_id")
    private String userId;

    private CarApplyQueryRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.createdEndAt = builder.createdEndAt;
        this.createdStartAt = builder.createdStartAt;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.thirdPartApplyId = builder.thirdPartApplyId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarApplyQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return createdEndAt
     */
    public String getCreatedEndAt() {
        return this.createdEndAt;
    }

    /**
     * @return createdStartAt
     */
    public String getCreatedStartAt() {
        return this.createdStartAt;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return thirdPartApplyId
     */
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CarApplyQueryRequest, Builder> {
        private String corpId; 
        private String createdEndAt; 
        private String createdStartAt; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String thirdPartApplyId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CarApplyQueryRequest request) {
            super(request);
            this.corpId = request.corpId;
            this.createdEndAt = request.createdEndAt;
            this.createdStartAt = request.createdStartAt;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.thirdPartApplyId = request.thirdPartApplyId;
            this.userId = request.userId;
        } 

        /**
         * corp_id.
         */
        public Builder corpId(String corpId) {
            this.putQueryParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * created_end_at.
         */
        public Builder createdEndAt(String createdEndAt) {
            this.putQueryParameter("created_end_at", createdEndAt);
            this.createdEndAt = createdEndAt;
            return this;
        }

        /**
         * created_start_at.
         */
        public Builder createdStartAt(String createdStartAt) {
            this.putQueryParameter("created_start_at", createdStartAt);
            this.createdStartAt = createdStartAt;
            return this;
        }

        /**
         * page_number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * third_part_apply_id.
         */
        public Builder thirdPartApplyId(String thirdPartApplyId) {
            this.putQueryParameter("third_part_apply_id", thirdPartApplyId);
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CarApplyQueryRequest build() {
            return new CarApplyQueryRequest(this);
        } 

    } 

}
