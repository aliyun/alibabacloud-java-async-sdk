// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataStreamRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataStreamRequest</p>
 */
public class DeleteDataStreamRequest extends Request {
    @Path
    @NameInMap("appName")
    @Validation(required = true)
    private String appName;

    @Path
    @NameInMap("dataStreamName")
    @Validation(required = true)
    private String dataStreamName;

    private DeleteDataStreamRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.dataStreamName = builder.dataStreamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dataStreamName
     */
    public String getDataStreamName() {
        return this.dataStreamName;
    }

    public static final class Builder extends Request.Builder<DeleteDataStreamRequest, Builder> {
        private String appName; 
        private String dataStreamName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataStreamRequest request) {
            super(request);
            this.appName = request.appName;
            this.dataStreamName = request.dataStreamName;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * dataStreamName.
         */
        public Builder dataStreamName(String dataStreamName) {
            this.putPathParameter("dataStreamName", dataStreamName);
            this.dataStreamName = dataStreamName;
            return this;
        }

        @Override
        public DeleteDataStreamRequest build() {
            return new DeleteDataStreamRequest(this);
        } 

    } 

}
