// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppModelRequest} extends {@link RequestModel}
 *
 * <p>GetAppModelRequest</p>
 */
public class GetAppModelRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SubType")
    private String subType;

    private GetAppModelRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.schemaVersion = builder.schemaVersion;
        this.source = builder.source;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppModelRequest create() {
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

    public static final class Builder extends Request.Builder<GetAppModelRequest, Builder> {
        private String appId; 
        private String schemaVersion; 
        private String source; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(GetAppModelRequest request) {
            super(request);
            this.appId = request.appId;
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
        public GetAppModelRequest build() {
            return new GetAppModelRequest(this);
        } 

    } 

}
