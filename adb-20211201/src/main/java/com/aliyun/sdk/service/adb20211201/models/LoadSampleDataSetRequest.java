// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LoadSampleDataSetRequest} extends {@link RequestModel}
 *
 * <p>LoadSampleDataSetRequest</p>
 */
public class LoadSampleDataSetRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    private LoadSampleDataSetRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoadSampleDataSetRequest create() {
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

    public static final class Builder extends Request.Builder<LoadSampleDataSetRequest, Builder> {
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(LoadSampleDataSetRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public LoadSampleDataSetRequest build() {
            return new LoadSampleDataSetRequest(this);
        } 

    } 

}
