// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyConcernNecessityRequest} extends {@link RequestModel}
 *
 * <p>ModifyConcernNecessityRequest</p>
 */
public class ModifyConcernNecessityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConcernNecessity")
    private String concernNecessity;

    private ModifyConcernNecessityRequest(Builder builder) {
        super(builder);
        this.concernNecessity = builder.concernNecessity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyConcernNecessityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concernNecessity
     */
    public String getConcernNecessity() {
        return this.concernNecessity;
    }

    public static final class Builder extends Request.Builder<ModifyConcernNecessityRequest, Builder> {
        private String concernNecessity; 

        private Builder() {
            super();
        } 

        private Builder(ModifyConcernNecessityRequest request) {
            super(request);
            this.concernNecessity = request.concernNecessity;
        } 

        /**
         * <p>The list of vulnerability fix necessity levels.</p>
         * <ul>
         * <li><p>asap: High</p>
         * </li>
         * <li><p>later: Medium</p>
         * </li>
         * <li><p>nntf: Low</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap,nntf</p>
         */
        public Builder concernNecessity(String concernNecessity) {
            this.putQueryParameter("ConcernNecessity", concernNecessity);
            this.concernNecessity = concernNecessity;
            return this;
        }

        @Override
        public ModifyConcernNecessityRequest build() {
            return new ModifyConcernNecessityRequest(this);
        } 

    } 

}
