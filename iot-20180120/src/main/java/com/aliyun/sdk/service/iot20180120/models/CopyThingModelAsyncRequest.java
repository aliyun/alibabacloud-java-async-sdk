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
 * {@link CopyThingModelAsyncRequest} extends {@link RequestModel}
 *
 * <p>CopyThingModelAsyncRequest</p>
 */
public class CopyThingModelAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceModelVersion")
    private String sourceModelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceProductKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetProductKey;

    private CopyThingModelAsyncRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.sourceModelVersion = builder.sourceModelVersion;
        this.sourceProductKey = builder.sourceProductKey;
        this.targetProductKey = builder.targetProductKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyThingModelAsyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return sourceModelVersion
     */
    public String getSourceModelVersion() {
        return this.sourceModelVersion;
    }

    /**
     * @return sourceProductKey
     */
    public String getSourceProductKey() {
        return this.sourceProductKey;
    }

    /**
     * @return targetProductKey
     */
    public String getTargetProductKey() {
        return this.targetProductKey;
    }

    public static final class Builder extends Request.Builder<CopyThingModelAsyncRequest, Builder> {
        private String iotInstanceId; 
        private String sourceModelVersion; 
        private String sourceProductKey; 
        private String targetProductKey; 

        private Builder() {
            super();
        } 

        private Builder(CopyThingModelAsyncRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.sourceModelVersion = request.sourceModelVersion;
            this.sourceProductKey = request.sourceProductKey;
            this.targetProductKey = request.targetProductKey;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * SourceModelVersion.
         */
        public Builder sourceModelVersion(String sourceModelVersion) {
            this.putQueryParameter("SourceModelVersion", sourceModelVersion);
            this.sourceModelVersion = sourceModelVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceProductKey(String sourceProductKey) {
            this.putQueryParameter("SourceProductKey", sourceProductKey);
            this.sourceProductKey = sourceProductKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder targetProductKey(String targetProductKey) {
            this.putQueryParameter("TargetProductKey", targetProductKey);
            this.targetProductKey = targetProductKey;
            return this;
        }

        @Override
        public CopyThingModelAsyncRequest build() {
            return new CopyThingModelAsyncRequest(this);
        } 

    } 

}
