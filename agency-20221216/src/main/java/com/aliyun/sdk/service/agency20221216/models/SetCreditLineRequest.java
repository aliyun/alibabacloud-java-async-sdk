// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCreditLineRequest} extends {@link RequestModel}
 *
 * <p>SetCreditLineRequest</p>
 */
public class SetCreditLineRequest extends Request {
    @Query
    @NameInMap("CreditLine")
    @Validation(required = true)
    private String creditLine;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private Long uid;

    private SetCreditLineRequest(Builder builder) {
        super(builder);
        this.creditLine = builder.creditLine;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCreditLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditLine
     */
    public String getCreditLine() {
        return this.creditLine;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<SetCreditLineRequest, Builder> {
        private String creditLine; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(SetCreditLineRequest request) {
            super(request);
            this.creditLine = request.creditLine;
            this.uid = request.uid;
        } 

        /**
         * CreditLine.
         */
        public Builder creditLine(String creditLine) {
            this.putQueryParameter("CreditLine", creditLine);
            this.creditLine = creditLine;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public SetCreditLineRequest build() {
            return new SetCreditLineRequest(this);
        } 

    } 

}
