// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPublishRequest} extends {@link RequestModel}
 *
 * <p>GetPublishRequest</p>
 */
public class GetPublishRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("PublishId")
    @Validation(required = true)
    private String publishId;

    @Query
    @NameInMap("Source")
    private String source;

    private GetPublishRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.publishId = builder.publishId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublishRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return publishId
     */
    public String getPublishId() {
        return this.publishId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetPublishRequest, Builder> {
        private String appId; 
        private String publishId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetPublishRequest request) {
            super(request);
            this.appId = request.appId;
            this.publishId = request.publishId;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * PublishId.
         */
        public Builder publishId(String publishId) {
            this.putQueryParameter("PublishId", publishId);
            this.publishId = publishId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetPublishRequest build() {
            return new GetPublishRequest(this);
        } 

    } 

}
