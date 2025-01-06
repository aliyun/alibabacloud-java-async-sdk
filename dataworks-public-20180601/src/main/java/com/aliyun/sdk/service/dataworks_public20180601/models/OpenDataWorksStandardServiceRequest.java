// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link OpenDataWorksStandardServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenDataWorksStandardServiceRequest</p>
 */
public class OpenDataWorksStandardServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private OpenDataWorksStandardServiceRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenDataWorksStandardServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<OpenDataWorksStandardServiceRequest, Builder> {
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(OpenDataWorksStandardServiceRequest request) {
            super(request);
            this.region = request.region;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public OpenDataWorksStandardServiceRequest build() {
            return new OpenDataWorksStandardServiceRequest(this);
        } 

    } 

}
