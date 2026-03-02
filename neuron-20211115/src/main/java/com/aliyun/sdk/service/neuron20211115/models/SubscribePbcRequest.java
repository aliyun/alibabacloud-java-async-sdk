// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link SubscribePbcRequest} extends {@link RequestModel}
 *
 * <p>SubscribePbcRequest</p>
 */
public class SubscribePbcRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pbc_name")
    private String pbcName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PbcSubscribe body;

    private SubscribePbcRequest(Builder builder) {
        super(builder);
        this.pbcName = builder.pbcName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribePbcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return body
     */
    public PbcSubscribe getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SubscribePbcRequest, Builder> {
        private String pbcName; 
        private PbcSubscribe body; 

        private Builder() {
            super();
        } 

        private Builder(SubscribePbcRequest request) {
            super(request);
            this.pbcName = request.pbcName;
            this.body = request.body;
        } 

        /**
         * pbc_name.
         */
        public Builder pbcName(String pbcName) {
            this.putPathParameter("pbc_name", pbcName);
            this.pbcName = pbcName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(PbcSubscribe body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public SubscribePbcRequest build() {
            return new SubscribePbcRequest(this);
        } 

    } 

}
