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

    private CostCenterSaveRequest(Builder builder) {
        super(builder);
        this.alipayNo = builder.alipayNo;
        this.number = builder.number;
        this.scope = builder.scope;
        this.thirdpartId = builder.thirdpartId;
        this.title = builder.title;
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

    public static final class Builder extends Request.Builder<CostCenterSaveRequest, Builder> {
        private String alipayNo; 
        private String number; 
        private Long scope; 
        private String thirdpartId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CostCenterSaveRequest request) {
            super(request);
            this.alipayNo = request.alipayNo;
            this.number = request.number;
            this.scope = request.scope;
            this.thirdpartId = request.thirdpartId;
            this.title = request.title;
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

        @Override
        public CostCenterSaveRequest build() {
            return new CostCenterSaveRequest(this);
        } 

    } 

}
