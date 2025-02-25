// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetYunQiTaskByRecordIdRequest} extends {@link RequestModel}
 *
 * <p>GetYunQiTaskByRecordIdRequest</p>
 */
public class GetYunQiTaskByRecordIdRequest extends Request {
    @Query
    @NameInMap("recordId")
    @Validation(required = true)
    private String recordId;

    private GetYunQiTaskByRecordIdRequest(Builder builder) {
        super(builder);
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYunQiTaskByRecordIdRequest create() {
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

    public static final class Builder extends Request.Builder<GetYunQiTaskByRecordIdRequest, Builder> {
        private String recordId; 

        private Builder() {
            super();
        } 

        private Builder(GetYunQiTaskByRecordIdRequest request) {
            super(request);
            this.recordId = request.recordId;
        } 

        /**
         * recordId.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("recordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public GetYunQiTaskByRecordIdRequest build() {
            return new GetYunQiTaskByRecordIdRequest(this);
        } 

    } 

}
