// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLakeCacheSizeRequest} extends {@link RequestModel}
 *
 * <p>DescribeLakeCacheSizeRequest</p>
 */
public class DescribeLakeCacheSizeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    private DescribeLakeCacheSizeRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakeCacheSizeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<DescribeLakeCacheSizeRequest, Builder> {
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLakeCacheSizeRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp10b6646l07akdt</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public DescribeLakeCacheSizeRequest build() {
            return new DescribeLakeCacheSizeRequest(this);
        } 

    } 

}
