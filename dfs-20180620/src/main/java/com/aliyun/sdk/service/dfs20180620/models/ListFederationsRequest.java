// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListFederationsRequest} extends {@link RequestModel}
 *
 * <p>ListFederationsRequest</p>
 */
public class ListFederationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FederationId")
    private String federationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    private ListFederationsRequest(Builder builder) {
        super(builder);
        this.federationId = builder.federationId;
        this.inputRegionId = builder.inputRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFederationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return federationId
     */
    public String getFederationId() {
        return this.federationId;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public static final class Builder extends Request.Builder<ListFederationsRequest, Builder> {
        private String federationId; 
        private String inputRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListFederationsRequest request) {
            super(request);
            this.federationId = request.federationId;
            this.inputRegionId = request.inputRegionId;
        } 

        /**
         * FederationId.
         */
        public Builder federationId(String federationId) {
            this.putQueryParameter("FederationId", federationId);
            this.federationId = federationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        @Override
        public ListFederationsRequest build() {
            return new ListFederationsRequest(this);
        } 

    } 

}
