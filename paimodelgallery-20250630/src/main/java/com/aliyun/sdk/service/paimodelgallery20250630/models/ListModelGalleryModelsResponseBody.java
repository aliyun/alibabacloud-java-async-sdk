// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
         * <p>The list of models.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;SupportResponseSchema\&quot;: False, \&quot;ToolCall\&quot;: False, \&quot;ModelType\&quot;: \&quot;LLM\&quot;, \&quot;SupportReasoning\&quot;: False, \&quot;Model\&quot;: \&quot;ds1\&quot;, \&quot;SupportVision\&quot;: False, \&quot;MaxModelLength\&quot;: 4096}]</p>
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
         * <p>The total number of models.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
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
