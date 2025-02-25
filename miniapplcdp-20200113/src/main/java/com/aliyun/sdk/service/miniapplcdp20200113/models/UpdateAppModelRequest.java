// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppModelRequest</p>
 */
public class UpdateAppModelRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("EncodeType")
    private String encodeType;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SubType")
    private String subType;

    private UpdateAppModelRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.content = builder.content;
        this.encodeType = builder.encodeType;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppModelRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return encodeType
     */
    public String getEncodeType() {
        return this.encodeType;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    public static final class Builder extends Request.Builder<UpdateAppModelRequest, Builder> {
        private String appId; 
        private String content; 
        private String encodeType; 
        private String schemaVersion; 
        private String source; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppModelRequest request) {
            super(request);
            this.appId = request.appId;
            this.content = request.content;
            this.encodeType = request.encodeType;
            this.schemaVersion = request.schemaVersion;
            this.source = request.source;
            this.subType = request.subType;
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
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * EncodeType.
         */
        public Builder encodeType(String encodeType) {
            this.putQueryParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * SchemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.putQueryParameter("SchemaVersion", schemaVersion);
            this.schemaVersion = schemaVersion;
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

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        @Override
        public UpdateAppModelRequest build() {
            return new UpdateAppModelRequest(this);
        } 

    } 

}
