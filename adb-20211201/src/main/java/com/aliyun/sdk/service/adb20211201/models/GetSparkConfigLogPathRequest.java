// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkConfigLogPathRequest} extends {@link RequestModel}
 *
 * <p>GetSparkConfigLogPathRequest</p>
 */
public class GetSparkConfigLogPathRequest extends Request {
    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true, maxLength = 64)
    private String DBClusterId;

    private GetSparkConfigLogPathRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkConfigLogPathRequest create() {
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

    public static final class Builder extends Request.Builder<GetSparkConfigLogPathRequest, Builder> {
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkConfigLogPathRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The database ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public GetSparkConfigLogPathRequest build() {
            return new GetSparkConfigLogPathRequest(this);
        } 

    } 

}
