// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String uuid; 

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public DescribeExposedInstanceDetailRequest build() {
            return new DescribeExposedInstanceDetailRequest(this);
        } 

    } 

}
