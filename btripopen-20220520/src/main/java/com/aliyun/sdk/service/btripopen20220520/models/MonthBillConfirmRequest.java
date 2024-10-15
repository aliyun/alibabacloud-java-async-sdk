// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MonthBillConfirmRequest} extends {@link RequestModel}
 *
 * <p>MonthBillConfirmRequest</p>
 */
public class MonthBillConfirmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mail_bill_date")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999, minimum = 20000101)
    private Integer mailBillDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private MonthBillConfirmRequest(Builder builder) {
        super(builder);
        this.mailBillDate = builder.mailBillDate;
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonthBillConfirmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mailBillDate
     */
    public Integer getMailBillDate() {
        return this.mailBillDate;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<MonthBillConfirmRequest, Builder> {
        private Integer mailBillDate; 
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(MonthBillConfirmRequest request) {
            super(request);
            this.mailBillDate = request.mailBillDate;
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20221001</p>
         */
        public Builder mailBillDate(Integer mailBillDate) {
            this.putBodyParameter("mail_bill_date", mailBillDate);
            this.mailBillDate = mailBillDate;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public MonthBillConfirmRequest build() {
            return new MonthBillConfirmRequest(this);
        } 

    } 

}
