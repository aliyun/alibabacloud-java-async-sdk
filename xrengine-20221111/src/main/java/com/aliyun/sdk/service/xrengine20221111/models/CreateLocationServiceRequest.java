// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link CreateLocationServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateLocationServiceRequest</p>
 */
public class CreateLocationServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Qps")
    private Long qps;

    private CreateLocationServiceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.imageId = builder.imageId;
        this.jwtToken = builder.jwtToken;
        this.name = builder.name;
        this.note = builder.note;
        this.qps = builder.qps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLocationServiceRequest create() {
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
     * @return imageId
     */
    public Long getImageId() {
        return this.imageId;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return qps
     */
    public Long getQps() {
        return this.qps;
    }

    public static final class Builder extends Request.Builder<CreateLocationServiceRequest, Builder> {
        private String appId; 
        private Long imageId; 
        private String jwtToken; 
        private String name; 
        private String note; 
        private Long qps; 

        private Builder() {
            super();
        } 

        private Builder(CreateLocationServiceRequest request) {
            super(request);
            this.appId = request.appId;
            this.imageId = request.imageId;
            this.jwtToken = request.jwtToken;
            this.name = request.name;
            this.note = request.note;
            this.qps = request.qps;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imageId(Long imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putBodyParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * Qps.
         */
        public Builder qps(Long qps) {
            this.putBodyParameter("Qps", qps);
            this.qps = qps;
            return this;
        }

        @Override
        public CreateLocationServiceRequest build() {
            return new CreateLocationServiceRequest(this);
        } 

    } 

}
