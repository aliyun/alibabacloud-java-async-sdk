// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20260603.models;

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
 * {@link ListModelGalleryModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelGalleryModelsResponseBody</p>
 */
public class ListModelGalleryModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Models")
    private ModelGalleryModel models;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListModelGalleryModelsResponseBody(Builder builder) {
        this.models = builder.models;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelGalleryModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return models
     */
    public ModelGalleryModel getModels() {
        return this.models;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ModelGalleryModel models; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListModelGalleryModelsResponseBody model) {
            this.models = model.models;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Models.
         */
        public Builder models(ModelGalleryModel models) {
            this.models = models;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B6B54325-C98C-5937-87A3-2F96C07652EC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelGalleryModelsResponseBody build() {
            return new ListModelGalleryModelsResponseBody(this);
        } 

    } 

}
