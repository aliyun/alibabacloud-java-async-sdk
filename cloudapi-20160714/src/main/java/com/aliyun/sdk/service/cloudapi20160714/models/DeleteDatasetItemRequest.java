// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DeleteDatasetItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatasetItemRequest</p>
 */
public class DeleteDatasetItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DeleteDatasetItemRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetItemId = builder.datasetItemId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatasetItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetItemId
     */
    public String getDatasetItemId() {
        return this.datasetItemId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteDatasetItemRequest, Builder> {
        private String datasetId; 
        private String datasetItemId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatasetItemRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetItemId = request.datasetItemId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a25a6589b2584ff490e891cc********</p>
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The ID of the data entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5045****</p>
         */
        public Builder datasetItemId(String datasetItemId) {
            this.putQueryParameter("DatasetItemId", datasetItemId);
            this.datasetItemId = datasetItemId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DeleteDatasetItemRequest build() {
            return new DeleteDatasetItemRequest(this);
        } 

    } 

}
