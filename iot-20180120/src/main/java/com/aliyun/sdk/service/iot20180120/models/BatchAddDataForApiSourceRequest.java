// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddDataForApiSourceRequest} extends {@link RequestModel}
 *
 * <p>BatchAddDataForApiSourceRequest</p>
 */
public class BatchAddDataForApiSourceRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("ContentList")
    @Validation(required = true)
    private java.util.Map < String, ? > contentList;

    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    private BatchAddDataForApiSourceRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.contentList = builder.contentList;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddDataForApiSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return contentList
     */
    public java.util.Map < String, ? > getContentList() {
        return this.contentList;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchAddDataForApiSourceRequest, Builder> {
        private String apiId; 
        private java.util.Map < String, ? > contentList; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddDataForApiSourceRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.contentList = request.contentList;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * ContentList.
         */
        public Builder contentList(java.util.Map < String, ? > contentList) {
            String contentListShrink = shrink(contentList, "ContentList", "json");
            this.putQueryParameter("ContentList", contentListShrink);
            this.contentList = contentList;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BatchAddDataForApiSourceRequest build() {
            return new BatchAddDataForApiSourceRequest(this);
        } 

    } 

}
