// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSqlFlashbakTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlFlashbakTaskRequest</p>
 */
public class DescribeSqlFlashbakTaskRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private DescribeSqlFlashbakTaskRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlFlashbakTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeSqlFlashbakTaskRequest, Builder> {
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlFlashbakTaskRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public DescribeSqlFlashbakTaskRequest build() {
            return new DescribeSqlFlashbakTaskRequest(this);
        } 

    } 

}
