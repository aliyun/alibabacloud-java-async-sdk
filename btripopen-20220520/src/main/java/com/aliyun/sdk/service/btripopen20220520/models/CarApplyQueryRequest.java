// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>CarApplyQueryRequest</p>
 */
public class CarApplyQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("created_end_at")
    private String createdEndAt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("created_start_at")
    private String createdStartAt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_number")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("third_part_apply_id")
    private String thirdPartApplyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private CarApplyQueryRequest(Builder builder) {
        super(builder);
        this.createdEndAt = builder.createdEndAt;
        this.createdStartAt = builder.createdStartAt;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.thirdPartApplyId = builder.thirdPartApplyId;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
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

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<CarApplyQueryRequest, Builder> {
        private String createdEndAt; 
        private String createdStartAt; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String thirdPartApplyId; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CarApplyQueryRequest request) {
            super(request);
            this.createdEndAt = request.createdEndAt;
            this.createdStartAt = request.createdStartAt;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.thirdPartApplyId = request.thirdPartApplyId;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
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
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public CarApplyQueryRequest build() {
            return new CarApplyQueryRequest(this);
        } 

    } 

}
