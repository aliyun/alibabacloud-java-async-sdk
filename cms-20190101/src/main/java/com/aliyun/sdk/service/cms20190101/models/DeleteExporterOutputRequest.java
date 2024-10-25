// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteExporterOutputRequest} extends {@link RequestModel}
 *
 * <p>DeleteExporterOutputRequest</p>
 */
public class DeleteExporterOutputRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destName;

    private DeleteExporterOutputRequest(Builder builder) {
        super(builder);
        this.destName = builder.destName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExporterOutputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destName
     */
    public String getDestName() {
        return this.destName;
    }

    public static final class Builder extends Request.Builder<DeleteExporterOutputRequest, Builder> {
        private String destName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExporterOutputRequest request) {
            super(request);
            this.destName = request.destName;
        } 

        /**
         * <p>The name of the configuration set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder destName(String destName) {
            this.putQueryParameter("DestName", destName);
            this.destName = destName;
            return this;
        }

        @Override
        public DeleteExporterOutputRequest build() {
            return new DeleteExporterOutputRequest(this);
        } 

    } 

}
