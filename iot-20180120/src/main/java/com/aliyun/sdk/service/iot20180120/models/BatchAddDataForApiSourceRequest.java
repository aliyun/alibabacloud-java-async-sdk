// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link BatchAddDataForApiSourceRequest} extends {@link RequestModel}
 *
 * <p>BatchAddDataForApiSourceRequest</p>
 */
public class BatchAddDataForApiSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public String getContentList() {
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
        private String contentList; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cxatswiniekxw***</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;value1&quot;,&quot;ts&quot;:1637658286000},{&quot;key&quot;:&quot;value2&quot;,&quot;ts&quot;:1637658287000}]</p>
         */
        public Builder contentList(String contentList) {
            this.putQueryParameter("ContentList", contentList);
            this.contentList = contentList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-0pp1n*****</p>
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
