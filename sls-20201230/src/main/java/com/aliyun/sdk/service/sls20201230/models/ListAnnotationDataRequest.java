// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListAnnotationDataRequest} extends {@link RequestModel}
 *
 * <p>ListAnnotationDataRequest</p>
 */
public class ListAnnotationDataRequest extends Request {
    @Path
    @NameInMap("datasetId")
    private String datasetId;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListAnnotationDataRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListAnnotationDataRequest, Builder> {
        private String datasetId; 
        private Integer offset; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListAnnotationDataRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * The unique identifier of the dataset.
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * The line from which the query starts.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListAnnotationDataRequest build() {
            return new ListAnnotationDataRequest(this);
        } 

    } 

}
