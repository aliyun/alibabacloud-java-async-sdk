// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetManagedDataKeyRequest} extends {@link RequestModel}
 *
 * <p>GetManagedDataKeyRequest</p>
 */
public class GetManagedDataKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataKeyName")
    private String dataKeyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataKeyVersionId")
    private String dataKeyVersionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseLatest")
    private Boolean useLatest;

    private GetManagedDataKeyRequest(Builder builder) {
        super(builder);
        this.dataKeyName = builder.dataKeyName;
        this.dataKeyVersionId = builder.dataKeyVersionId;
        this.useLatest = builder.useLatest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagedDataKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataKeyName
     */
    public String getDataKeyName() {
        return this.dataKeyName;
    }

    /**
     * @return dataKeyVersionId
     */
    public String getDataKeyVersionId() {
        return this.dataKeyVersionId;
    }

    /**
     * @return useLatest
     */
    public Boolean getUseLatest() {
        return this.useLatest;
    }

    public static final class Builder extends Request.Builder<GetManagedDataKeyRequest, Builder> {
        private String dataKeyName; 
        private String dataKeyVersionId; 
        private Boolean useLatest; 

        private Builder() {
            super();
        } 

        private Builder(GetManagedDataKeyRequest request) {
            super(request);
            this.dataKeyName = request.dataKeyName;
            this.dataKeyVersionId = request.dataKeyVersionId;
            this.useLatest = request.useLatest;
        } 

        /**
         * <p>The name of the managed data key (DK). This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-data-key</p>
         */
        public Builder dataKeyName(String dataKeyName) {
            this.putQueryParameter("DataKeyName", dataKeyName);
            this.dataKeyName = dataKeyName;
            return this;
        }

        /**
         * <p>The version number of the managed data key (DK). This parameter is optional. If you set this parameter to a specific version number, the plaintext of the specified version of the managed data key (DK) is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>xH6OPUmz</p>
         */
        public Builder dataKeyVersionId(String dataKeyVersionId) {
            this.putQueryParameter("DataKeyVersionId", dataKeyVersionId);
            this.dataKeyVersionId = dataKeyVersionId;
            return this;
        }

        /**
         * <p>Specifies whether to use the latest version of the managed data key (DK) when no version number is provided. Valid values:</p>
         * <ul>
         * <li>true: Returns the latest version of the managed data key (DK).</li>
         * <li>false: Returns the first version of the managed data key (DK).</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useLatest(Boolean useLatest) {
            this.putQueryParameter("UseLatest", useLatest);
            this.useLatest = useLatest;
            return this;
        }

        @Override
        public GetManagedDataKeyRequest build() {
            return new GetManagedDataKeyRequest(this);
        } 

    } 

}
