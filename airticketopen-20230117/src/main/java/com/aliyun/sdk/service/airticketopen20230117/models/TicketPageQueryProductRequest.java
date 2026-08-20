// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link TicketPageQueryProductRequest} extends {@link RequestModel}
 *
 * <p>TicketPageQueryProductRequest</p>
 */
public class TicketPageQueryProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScenicId")
    private Long scenicId;

    private TicketPageQueryProductRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.scenicId = builder.scenicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketPageQueryProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
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
     * @return scenicId
     */
    public Long getScenicId() {
        return this.scenicId;
    }

    public static final class Builder extends Request.Builder<TicketPageQueryProductRequest, Builder> {
        private Long accountNo; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long scenicId; 

        private Builder() {
            super();
        } 

        private Builder(TicketPageQueryProductRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.scenicId = request.scenicId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ScenicId.
         */
        public Builder scenicId(Long scenicId) {
            this.putBodyParameter("ScenicId", scenicId);
            this.scenicId = scenicId;
            return this;
        }

        @Override
        public TicketPageQueryProductRequest build() {
            return new TicketPageQueryProductRequest(this);
        } 

    } 

}
