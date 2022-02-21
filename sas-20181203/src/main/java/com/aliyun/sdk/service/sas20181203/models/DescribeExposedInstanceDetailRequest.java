// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedInstanceDetailRequest</p>
 */
public class DescribeExposedInstanceDetailRequest extends Request {
    @Query
    @NameInMap("Uuid")
    private String uuid;

    private DescribeExposedInstanceDetailRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeExposedInstanceDetailRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedInstanceDetailRequest response) {
            super(response);
            this.uuid = response.uuid;
        } 

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeExposedInstanceDetailRequest build() {
            return new DescribeExposedInstanceDetailRequest(this);
        } 

    } 

}
