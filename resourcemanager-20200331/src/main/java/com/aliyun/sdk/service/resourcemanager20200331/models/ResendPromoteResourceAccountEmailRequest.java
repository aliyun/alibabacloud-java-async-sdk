// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ResendPromoteResourceAccountEmailRequest} extends {@link RequestModel}
 *
 * <p>ResendPromoteResourceAccountEmailRequest</p>
 */
public class ResendPromoteResourceAccountEmailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordId;

    private ResendPromoteResourceAccountEmailRequest(Builder builder) {
        super(builder);
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResendPromoteResourceAccountEmailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<ResendPromoteResourceAccountEmailRequest, Builder> {
        private String recordId; 

        private Builder() {
            super();
        } 

        private Builder(ResendPromoteResourceAccountEmailRequest request) {
            super(request);
            this.recordId = request.recordId;
        } 

        /**
         * <p>The account record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>06950264-3f0d-4ca9-82dd-6ee7a3d33d6b</p>
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public ResendPromoteResourceAccountEmailRequest build() {
            return new ResendPromoteResourceAccountEmailRequest(this);
        } 

    } 

}
