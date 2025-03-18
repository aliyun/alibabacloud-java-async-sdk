// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeSnatAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnatAttributeRequest</p>
 */
public class DescribeSnatAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snatEntryId;

    private DescribeSnatAttributeRequest(Builder builder) {
        super(builder);
        this.snatEntryId = builder.snatEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnatAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public static final class Builder extends Request.Builder<DescribeSnatAttributeRequest, Builder> {
        private String snatEntryId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnatAttributeRequest request) {
            super(request);
            this.snatEntryId = request.snatEntryId;
        } 

        /**
         * <p>The ID of the SNAT entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-5tc08qfj5ecblfdn2rqr9****</p>
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        @Override
        public DescribeSnatAttributeRequest build() {
            return new DescribeSnatAttributeRequest(this);
        } 

    } 

}
