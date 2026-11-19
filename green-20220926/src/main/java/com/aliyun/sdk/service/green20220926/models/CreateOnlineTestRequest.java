// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link CreateOnlineTestRequest} extends {@link RequestModel}
 *
 * <p>CreateOnlineTestRequest</p>
 */
public class CreateOnlineTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private CreateOnlineTestRequest(Builder builder) {
        super(builder);
        this.dataId = builder.dataId;
        this.resourceType = builder.resourceType;
        this.serviceCode = builder.serviceCode;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOnlineTestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateOnlineTestRequest, Builder> {
        private String dataId; 
        private String resourceType; 
        private String serviceCode; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateOnlineTestRequest request) {
            super(request);
            this.dataId = request.dataId;
            this.resourceType = request.resourceType;
            this.serviceCode = request.serviceCode;
            this.url = request.url;
        } 

        /**
         * <p>The data ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4f27b8cc7c4544cb90b41882a5b36326</p>
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * <p>The resource type. Valid values: voice (audio), image (image), file (document), text (text), and video (video).</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The service code. Specify a valid service code. The valid service code for online video testing is videoDetection. VideoModeration is not a valid value and returns a 406 online.test.failed error.</p>
         * 
         * <strong>example:</strong>
         * <p>videoDetection</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The detection URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxxxx.com/data/data.png">https://xxxxxxxxxx.com/data/data.png</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateOnlineTestRequest build() {
            return new CreateOnlineTestRequest(this);
        } 

    } 

}
