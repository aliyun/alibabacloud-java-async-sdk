// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link FindCustomerSnapshotRequest} extends {@link RequestModel}
 *
 * <p>FindCustomerSnapshotRequest</p>
 */
public class FindCustomerSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InfoType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String infoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionId;

    private FindCustomerSnapshotRequest(Builder builder) {
        super(builder);
        this.infoType = builder.infoType;
        this.pk = builder.pk;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindCustomerSnapshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return infoType
     */
    public String getInfoType() {
        return this.infoType;
    }

    /**
     * @return pk
     */
    public Long getPk() {
        return this.pk;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<FindCustomerSnapshotRequest, Builder> {
        private String infoType; 
        private Long pk; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(FindCustomerSnapshotRequest request) {
            super(request);
            this.infoType = request.infoType;
            this.pk = request.pk;
            this.versionId = request.versionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder infoType(String infoType) {
            this.putQueryParameter("InfoType", infoType);
            this.infoType = infoType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(Long pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public FindCustomerSnapshotRequest build() {
            return new FindCustomerSnapshotRequest(this);
        } 

    } 

}
