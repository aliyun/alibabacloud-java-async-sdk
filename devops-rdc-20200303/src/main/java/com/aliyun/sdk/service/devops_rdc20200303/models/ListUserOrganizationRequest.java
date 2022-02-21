// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserOrganizationRequest} extends {@link RequestModel}
 *
 * <p>ListUserOrganizationRequest</p>
 */
public class ListUserOrganizationRequest extends Request {
    @Body
    @NameInMap("RealPk")
    private String realPk;

    private ListUserOrganizationRequest(Builder builder) {
        super(builder);
        this.realPk = builder.realPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserOrganizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return realPk
     */
    public String getRealPk() {
        return this.realPk;
    }

    public static final class Builder extends Request.Builder<ListUserOrganizationRequest, Builder> {
        private String realPk; 

        private Builder() {
            super();
        } 

        private Builder(ListUserOrganizationRequest response) {
            super(response);
            this.realPk = response.realPk;
        } 

        /**
         * RealPk.
         */
        public Builder realPk(String realPk) {
            this.putBodyParameter("RealPk", realPk);
            this.realPk = realPk;
            return this;
        }

        @Override
        public ListUserOrganizationRequest build() {
            return new ListUserOrganizationRequest(this);
        } 

    } 

}
