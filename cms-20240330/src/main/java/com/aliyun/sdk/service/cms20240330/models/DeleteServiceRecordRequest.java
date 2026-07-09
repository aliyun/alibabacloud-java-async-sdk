// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteServiceRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceRecordRequest</p>
 */
public class DeleteServiceRecordRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("recordType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordType;

    private DeleteServiceRecordRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.serviceId = builder.serviceId;
        this.regionId = builder.regionId;
        this.recordType = builder.recordType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    public static final class Builder extends Request.Builder<DeleteServiceRecordRequest, Builder> {
        private String workspace; 
        private String serviceId; 
        private String regionId; 
        private String recordType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceRecordRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.serviceId = request.serviceId;
            this.regionId = request.regionId;
            this.recordType = request.recordType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1654218***343050-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cwzxvuc6uo@4bc6b15ad81f166174ffb</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>logCorrelation</p>
         */
        public Builder recordType(String recordType) {
            this.putQueryParameter("recordType", recordType);
            this.recordType = recordType;
            return this;
        }

        @Override
        public DeleteServiceRecordRequest build() {
            return new DeleteServiceRecordRequest(this);
        } 

    } 

}
