// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetZookeeperDataImportUrlRequest} extends {@link RequestModel}
 *
 * <p>GetZookeeperDataImportUrlRequest</p>
 */
public class GetZookeeperDataImportUrlRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ContentType")
    private String contentType;

    @Query
    @NameInMap("InstanceId")
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
         * The ID of the request.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * RestResult
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
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
