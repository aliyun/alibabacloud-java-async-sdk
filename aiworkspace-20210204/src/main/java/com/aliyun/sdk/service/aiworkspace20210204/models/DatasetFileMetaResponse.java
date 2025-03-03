// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DatasetFileMetaResponse} extends {@link TeaModel}
 *
 * <p>DatasetFileMetaResponse</p>
 */
public class DatasetFileMetaResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetFileMetaId;

    @com.aliyun.core.annotation.NameInMap("Result")
    @com.aliyun.core.annotation.Validation(required = true)
    private String result;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private DatasetFileMetaResponse(BuilderImpl builder) {
        super(builder);
        this.datasetFileMetaId = builder.datasetFileMetaId;
        this.result = builder.result;
        this.uri = builder.uri;
    }

    public static DatasetFileMetaResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return datasetFileMetaId
     */
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public interface Builder extends Response.Builder<DatasetFileMetaResponse, Builder> {

        Builder datasetFileMetaId(String datasetFileMetaId);

        Builder result(String result);

        Builder uri(String uri);

        @Override
        DatasetFileMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DatasetFileMetaResponse, Builder>
            implements Builder {
        private String datasetFileMetaId; 
        private String result; 
        private String uri; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DatasetFileMetaResponse response) {
            super(response);
            this.datasetFileMetaId = response.datasetFileMetaId;
            this.result = response.result;
            this.uri = response.uri;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        @Override
        public Builder datasetFileMetaId(String datasetFileMetaId) {
            this.datasetFileMetaId = datasetFileMetaId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        @Override
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * Uri.
         */
        @Override
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        @Override
        public DatasetFileMetaResponse build() {
            return new DatasetFileMetaResponse(this);
        } 

    } 

}
