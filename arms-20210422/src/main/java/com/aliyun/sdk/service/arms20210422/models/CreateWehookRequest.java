// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWehookRequest} extends {@link RequestModel}
 *
 * <p>CreateWehookRequest</p>
 */
public class CreateWehookRequest extends Request {
    @Query
    @NameInMap("Body")
    private String body;

    @Query
    @NameInMap("ContactName")
    @Validation(required = true)
    private String contactName;

    @Query
    @NameInMap("HttpHeaders")
    private String httpHeaders;

    @Query
    @NameInMap("HttpParams")
    private String httpParams;

    @Query
    @NameInMap("Method")
    private String method;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private CreateWehookRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.contactName = builder.contactName;
        this.httpHeaders = builder.httpHeaders;
        this.httpParams = builder.httpParams;
        this.method = builder.method;
        this.regionId = builder.regionId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWehookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return httpHeaders
     */
    public String getHttpHeaders() {
        return this.httpHeaders;
    }

    /**
     * @return httpParams
     */
    public String getHttpParams() {
        return this.httpParams;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateWehookRequest, Builder> {
        private String body; 
        private String contactName; 
        private String httpHeaders; 
        private String httpParams; 
        private String method; 
        private String regionId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateWehookRequest request) {
            super(request);
            this.body = request.body;
            this.contactName = request.contactName;
            this.httpHeaders = request.httpHeaders;
            this.httpParams = request.httpParams;
            this.method = request.method;
            this.regionId = request.regionId;
            this.url = request.url;
        } 

        /**
         * Body.
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * HttpHeaders.
         */
        public Builder httpHeaders(String httpHeaders) {
            this.putQueryParameter("HttpHeaders", httpHeaders);
            this.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * HttpParams.
         */
        public Builder httpParams(String httpParams) {
            this.putQueryParameter("HttpParams", httpParams);
            this.httpParams = httpParams;
            return this;
        }

        /**
         * Method.
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateWehookRequest build() {
            return new CreateWehookRequest(this);
        } 

    } 

}
