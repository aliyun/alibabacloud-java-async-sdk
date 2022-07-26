// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostCenterModifyRequest} extends {@link RequestModel}
 *
 * <p>CostCenterModifyRequest</p>
 */
public class CostCenterModifyRequest extends Request {
    @Body
    @NameInMap("alipay_no")
    private String alipayNo;

    @Body
    @NameInMap("number")
    private String number;

    @Body
    @NameInMap("scope")
    @Validation(required = true)
    private Long scope;

    @Body
    @NameInMap("thirdpart_id")
    @Validation(required = true)
    private String thirdpartId;

    @Body
    @NameInMap("title")
    @Validation(required = true)
    private String title;

    @Body
    @NameInMap("user_id")
    private String userId;

    private CostCenterModifyRequest(Builder builder) {
        super(builder);
        this.alipayNo = builder.alipayNo;
        this.number = builder.number;
        this.scope = builder.scope;
        this.thirdpartId = builder.thirdpartId;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostCenterModifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alipayNo
     */
    public String getAlipayNo() {
        return this.alipayNo;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return scope
     */
    public Long getScope() {
        return this.scope;
    }

    /**
     * @return thirdpartId
     */
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CostCenterModifyRequest, Builder> {
        private String alipayNo; 
        private String number; 
        private Long scope; 
        private String thirdpartId; 
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CostCenterModifyRequest request) {
            super(request);
            this.alipayNo = request.alipayNo;
            this.number = request.number;
            this.scope = request.scope;
            this.thirdpartId = request.thirdpartId;
            this.title = request.title;
            this.userId = request.userId;
        } 

        /**
         * 绑定支付宝账号
         */
        public Builder alipayNo(String alipayNo) {
            this.putBodyParameter("alipay_no", alipayNo);
            this.alipayNo = alipayNo;
            return this;
        }

        /**
         * 成本中心编号
         */
        public Builder number(String number) {
            this.putBodyParameter("number", number);
            this.number = number;
            return this;
        }

        /**
         * 适用范围: 1全员，2部分员工
         */
        public Builder scope(Long scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * 第三方成本中心id
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putBodyParameter("thirdpart_id", thirdpartId);
            this.thirdpartId = thirdpartId;
            return this;
        }

        /**
         * 成本中心名称
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CostCenterModifyRequest build() {
            return new CostCenterModifyRequest(this);
        } 

    } 

}
