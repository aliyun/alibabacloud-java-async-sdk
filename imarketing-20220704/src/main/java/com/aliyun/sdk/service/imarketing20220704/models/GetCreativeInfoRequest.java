// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreativeInfoRequest} extends {@link RequestModel}
 *
 * <p>GetCreativeInfoRequest</p>
 */
public class GetCreativeInfoRequest extends Request {
    @Query
    @NameInMap("AccountNo")
    private String accountNo;

    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("MainId")
    private Long mainId;

    private GetCreativeInfoRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.bizId = builder.bizId;
        this.id = builder.id;
        this.mainId = builder.mainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreativeInfoRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mainId
     */
    public Long getMainId() {
        return this.mainId;
    }

    public static final class Builder extends Request.Builder<GetCreativeInfoRequest, Builder> {
        private String accountNo; 
        private String bizId; 
        private Long id; 
        private Long mainId; 

        private Builder() {
            super();
        } 

        private Builder(GetCreativeInfoRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.bizId = request.bizId;
            this.id = request.id;
            this.mainId = request.mainId;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        @Override
        public GetCreativeInfoRequest build() {
            return new GetCreativeInfoRequest(this);
        } 

    } 

}
