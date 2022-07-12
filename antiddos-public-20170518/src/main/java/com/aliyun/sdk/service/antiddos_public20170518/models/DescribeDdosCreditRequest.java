// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosCreditRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosCreditRequest</p>
 */
public class DescribeDdosCreditRequest extends Request {
    @Query
    @NameInMap("DdosRegionId")
    @Validation(required = true)
    private String ddosRegionId;

    private DescribeDdosCreditRequest(Builder builder) {
        super(builder);
        this.ddosRegionId = builder.ddosRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosCreditRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeDdosCreditRequest, Builder> {
        private String ddosRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosCreditRequest request) {
            super(request);
            this.ddosRegionId = request.ddosRegionId;
        } 

        /**
         * DdosRegionId.
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        @Override
        public DescribeDdosCreditRequest build() {
            return new DescribeDdosCreditRequest(this);
        } 

    } 

}
