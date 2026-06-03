// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link CreateSmsVerifyStatisticRecordsExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsVerifyStatisticRecordsExportTaskRequest</p>
 */
public class CreateSmsVerifyStatisticRecordsExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fromDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemeName")
    private String schemeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long toDate;

    private CreateSmsVerifyStatisticRecordsExportTaskRequest(Builder builder) {
        super(builder);
        this.fromDate = builder.fromDate;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemeName = builder.schemeName;
        this.toDate = builder.toDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsVerifyStatisticRecordsExportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromDate
     */
    public Long getFromDate() {
        return this.fromDate;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    /**
     * @return toDate
     */
    public Long getToDate() {
        return this.toDate;
    }

    public static final class Builder extends Request.Builder<CreateSmsVerifyStatisticRecordsExportTaskRequest, Builder> {
        private Long fromDate; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String schemeName; 
        private Long toDate; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsVerifyStatisticRecordsExportTaskRequest request) {
            super(request);
            this.fromDate = request.fromDate;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.schemeName = request.schemeName;
            this.toDate = request.toDate;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1772294400000</p>
         */
        public Builder fromDate(Long fromDate) {
            this.putQueryParameter("FromDate", fromDate);
            this.fromDate = fromDate;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SchemeName.
         */
        public Builder schemeName(String schemeName) {
            this.putQueryParameter("SchemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1772899200000</p>
         */
        public Builder toDate(Long toDate) {
            this.putQueryParameter("ToDate", toDate);
            this.toDate = toDate;
            return this;
        }

        @Override
        public CreateSmsVerifyStatisticRecordsExportTaskRequest build() {
            return new CreateSmsVerifyStatisticRecordsExportTaskRequest(this);
        } 

    } 

}
