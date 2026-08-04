// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link DeleteCustomerLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomerLabelRequest</p>
 */
public class DeleteCustomerLabelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelSeries")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelSeries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> labelTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Organization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private DeleteCustomerLabelRequest(Builder builder) {
        super(builder);
        this.labelSeries = builder.labelSeries;
        this.labelTypes = builder.labelTypes;
        this.organization = builder.organization;
        this.pk = builder.pk;
        this.token = builder.token;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomerLabelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelSeries
     */
    public String getLabelSeries() {
        return this.labelSeries;
    }

    /**
     * @return labelTypes
     */
    public java.util.List<String> getLabelTypes() {
        return this.labelTypes;
    }

    /**
     * @return organization
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * @return pk
     */
    public Long getPk() {
        return this.pk;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DeleteCustomerLabelRequest, Builder> {
        private String labelSeries; 
        private java.util.List<String> labelTypes; 
        private String organization; 
        private Long pk; 
        private String token; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomerLabelRequest request) {
            super(request);
            this.labelSeries = request.labelSeries;
            this.labelTypes = request.labelTypes;
            this.organization = request.organization;
            this.pk = request.pk;
            this.token = request.token;
            this.userName = request.userName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder labelSeries(String labelSeries) {
            this.putQueryParameter("LabelSeries", labelSeries);
            this.labelSeries = labelSeries;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder labelTypes(java.util.List<String> labelTypes) {
            this.putQueryParameter("LabelTypes", labelTypes);
            this.labelTypes = labelTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(Long pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DeleteCustomerLabelRequest build() {
            return new DeleteCustomerLabelRequest(this);
        } 

    } 

}
