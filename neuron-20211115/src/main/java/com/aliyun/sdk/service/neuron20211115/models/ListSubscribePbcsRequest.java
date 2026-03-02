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
 * {@link ListSubscribePbcsRequest} extends {@link RequestModel}
 *
 * <p>ListSubscribePbcsRequest</p>
 */
public class ListSubscribePbcsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pbc_name")
    private String pbcName;

    private ListSubscribePbcsRequest(Builder builder) {
        super(builder);
        this.pbcName = builder.pbcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubscribePbcsRequest create() {
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

    public static final class Builder extends Request.Builder<ListSubscribePbcsRequest, Builder> {
        private String pbcName; 

        private Builder() {
            super();
        } 

        private Builder(ListSubscribePbcsRequest request) {
            super(request);
            this.pbcName = request.pbcName;
        } 

        /**
         * pbc_name.
         */
        public Builder pbcName(String pbcName) {
            this.putPathParameter("pbc_name", pbcName);
            this.pbcName = pbcName;
            return this;
        }

        @Override
        public ListSubscribePbcsRequest build() {
            return new ListSubscribePbcsRequest(this);
        } 

    } 

}
