// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceDataImportStatusRequest} extends {@link RequestModel}
 *
 * <p>GetServiceDataImportStatusRequest</p>
 */
public class GetServiceDataImportStatusRequest extends Request {
    @Body
    @NameInMap("DataImportIds")
    @Validation(required = true)
    private java.util.List < Long > dataImportIds;

    private GetServiceDataImportStatusRequest(Builder builder) {
        super(builder);
        this.dataImportIds = builder.dataImportIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceDataImportStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataImportIds
     */
    public java.util.List < Long > getDataImportIds() {
        return this.dataImportIds;
    }

    public static final class Builder extends Request.Builder<GetServiceDataImportStatusRequest, Builder> {
        private java.util.List < Long > dataImportIds; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceDataImportStatusRequest request) {
            super(request);
            this.dataImportIds = request.dataImportIds;
        } 

        /**
         * DataImportIds.
         */
        public Builder dataImportIds(java.util.List < Long > dataImportIds) {
            String dataImportIdsShrink = shrink(dataImportIds, "DataImportIds", "json");
            this.putBodyParameter("DataImportIds", dataImportIdsShrink);
            this.dataImportIds = dataImportIds;
            return this;
        }

        @Override
        public GetServiceDataImportStatusRequest build() {
            return new GetServiceDataImportStatusRequest(this);
        } 

    } 

}
