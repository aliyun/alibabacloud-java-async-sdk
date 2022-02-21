// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResendCreateCloudAccountEmailRequest} extends {@link RequestModel}
 *
 * <p>ResendCreateCloudAccountEmailRequest</p>
 */
public class ResendCreateCloudAccountEmailRequest extends Request {
    @Query
    @NameInMap("RecordId")
    @Validation(required = true)
    private String recordId;

    private ResendCreateCloudAccountEmailRequest(Builder builder) {
        super(builder);
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResendCreateCloudAccountEmailRequest create() {
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

    public static final class Builder extends Request.Builder<ResendCreateCloudAccountEmailRequest, Builder> {
        private String recordId; 

        private Builder() {
            super();
        } 

        private Builder(ResendCreateCloudAccountEmailRequest response) {
            super(response);
            this.recordId = response.recordId;
        } 

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public ResendCreateCloudAccountEmailRequest build() {
            return new ResendCreateCloudAccountEmailRequest(this);
        } 

    } 

}
