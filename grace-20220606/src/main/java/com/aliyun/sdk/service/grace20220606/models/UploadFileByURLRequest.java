// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadFileByURLRequest} extends {@link RequestModel}
 *
 * <p>UploadFileByURLRequest</p>
 */
public class UploadFileByURLRequest extends Request {
    @Query
    @NameInMap("displayName")
    private String displayName;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("url")
    @Validation(required = true)
    private String url;

    private UploadFileByURLRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.type = builder.type;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFileByURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<UploadFileByURLRequest, Builder> {
        private String displayName; 
        private String type; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(UploadFileByURLRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.type = request.type;
            this.url = request.url;
        } 

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.putQueryParameter("url", url);
            this.url = url;
            return this;
        }

        @Override
        public UploadFileByURLRequest build() {
            return new UploadFileByURLRequest(this);
        } 

    } 

}
