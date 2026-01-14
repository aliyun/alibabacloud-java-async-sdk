// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListWhitePortalMenuRequest} extends {@link RequestModel}
 *
 * <p>ListWhitePortalMenuRequest</p>
 */
public class ListWhitePortalMenuRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataportalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataportalId;

    private ListWhitePortalMenuRequest(Builder builder) {
        super(builder);
        this.dataportalId = builder.dataportalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWhitePortalMenuRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataportalId
     */
    public String getDataportalId() {
        return this.dataportalId;
    }

    public static final class Builder extends Request.Builder<ListWhitePortalMenuRequest, Builder> {
        private String dataportalId; 

        private Builder() {
            super();
        } 

        private Builder(ListWhitePortalMenuRequest request) {
            super(request);
            this.dataportalId = request.dataportalId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asdagad***213425</p>
         */
        public Builder dataportalId(String dataportalId) {
            this.putQueryParameter("DataportalId", dataportalId);
            this.dataportalId = dataportalId;
            return this;
        }

        @Override
        public ListWhitePortalMenuRequest build() {
            return new ListWhitePortalMenuRequest(this);
        } 

    } 

}
