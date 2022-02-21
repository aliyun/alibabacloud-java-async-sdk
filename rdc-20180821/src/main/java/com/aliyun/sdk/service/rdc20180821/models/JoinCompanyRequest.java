// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinCompanyRequest} extends {@link RequestModel}
 *
 * <p>JoinCompanyRequest</p>
 */
public class JoinCompanyRequest extends Request {
    @Body
    @NameInMap("Code")
    private String code;

    private JoinCompanyRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinCompanyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    public static final class Builder extends Request.Builder<JoinCompanyRequest, Builder> {
        private String code; 

        private Builder() {
            super();
        } 

        private Builder(JoinCompanyRequest response) {
            super(response);
            this.code = response.code;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        @Override
        public JoinCompanyRequest build() {
            return new JoinCompanyRequest(this);
        } 

    } 

}
