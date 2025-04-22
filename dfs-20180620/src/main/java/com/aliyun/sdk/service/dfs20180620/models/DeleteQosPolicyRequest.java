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
 * {@link DeleteQosPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteQosPolicyRequest</p>
 */
public class DeleteQosPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosPolicyId;

    private DeleteQosPolicyRequest(Builder builder) {
        super(builder);
        this.inputRegionId = builder.inputRegionId;
        this.qosPolicyId = builder.qosPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQosPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return qosPolicyId
     */
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    public static final class Builder extends Request.Builder<DeleteQosPolicyRequest, Builder> {
        private String inputRegionId; 
        private String qosPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQosPolicyRequest request) {
            super(request);
            this.inputRegionId = request.inputRegionId;
            this.qosPolicyId = request.qosPolicyId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder qosPolicyId(String qosPolicyId) {
            this.putQueryParameter("QosPolicyId", qosPolicyId);
            this.qosPolicyId = qosPolicyId;
            return this;
        }

        @Override
        public DeleteQosPolicyRequest build() {
            return new DeleteQosPolicyRequest(this);
        } 

    } 

}
