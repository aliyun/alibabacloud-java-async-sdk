// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostCenterSaveRequest} extends {@link RequestModel}
 *
 * <p>CostCenterSaveRequest</p>
 */
public class CostCenterSaveRequest extends Request {
    @Body
    @NameInMap("alipay_id")
    private String alipayId;

    @Body
    @NameInMap("alipay_no")
    private String alipayNo;

    @Body
    @NameInMap("corp_id")
    @Validation(required = true)
    private String corpId;

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

    private CostCenterSaveRequest(Builder builder) {
        super(builder);
        this.alipayId = builder.alipayId;
        this.alipayNo = builder.alipayNo;
        this.corpId = builder.corpId;
        this.number = builder.number;
        this.scope = builder.scope;
        this.thirdpartId = builder.thirdpartId;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostCenterSaveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alipayId
     */
    public String getAlipayId() {
        return this.alipayId;
    }

    /**
     * @return alipayNo
     */
    public String getAlipayNo() {
        return this.alipayNo;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
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

    public static final class Builder extends Request.Builder<CostCenterSaveRequest, Builder> {
        private String alipayId; 
        private String alipayNo; 
        private String corpId; 
        private String number; 
        private Long scope; 
        private String thirdpartId; 
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CostCenterSaveRequest request) {
            super(request);
            this.alipayId = request.alipayId;
            this.alipayNo = request.alipayNo;
            this.corpId = request.corpId;
            this.number = request.number;
            this.scope = request.scope;
            this.thirdpartId = request.thirdpartId;
            this.title = request.title;
            this.userId = request.userId;
        } 

        /**
         * alipay_id.
         */
        public Builder alipayId(String alipayId) {
            this.putBodyParameter("alipay_id", alipayId);
            this.alipayId = alipayId;
            return this;
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
         * corp_id.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * 第三方成本中心编号
         */
        public Builder number(String number) {
            this.putBodyParameter("number", number);
            this.number = number;
            return this;
        }

        /**
         * 适用范围:1全员，2部分人员
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
        public CostCenterSaveRequest build() {
            return new CostCenterSaveRequest(this);
        } 

    } 

}
