// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetZookeeperDataImportUrlRequest} extends {@link RequestModel}
 *
 * <p>GetZookeeperDataImportUrlRequest</p>
 */
public class GetZookeeperDataImportUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private GetZookeeperDataImportUrlRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.contentType = builder.contentType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetZookeeperDataImportUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetZookeeperDataImportUrlRequest, Builder> {
        private String acceptLanguage; 
        private String contentType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetZookeeperDataImportUrlRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.contentType = request.contentType;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>RestResult</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zip</p>
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-zvp2xzzkk06</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetZookeeperDataImportUrlRequest build() {
            return new GetZookeeperDataImportUrlRequest(this);
        } 

    } 

}
