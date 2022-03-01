// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspiciousUUIDConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspiciousUUIDConfigRequest</p>
 */
public class DescribeSuspiciousUUIDConfigRequest extends Request {
    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeSuspiciousUUIDConfigRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspiciousUUIDConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeSuspiciousUUIDConfigRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspiciousUUIDConfigRequest response) {
            super(response);
            this.type = response.type;
        } 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeSuspiciousUUIDConfigRequest build() {
            return new DescribeSuspiciousUUIDConfigRequest(this);
        } 

    } 

}
