// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListBackupDataRequest} extends {@link RequestModel}
 *
 * <p>ListBackupDataRequest</p>
 */
public class ListBackupDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("backupType")
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    private ListBackupDataRequest(Builder builder) {
        super(builder);
        this.backupType = builder.backupType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBackupDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListBackupDataRequest, Builder> {
        private String backupType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListBackupDataRequest request) {
            super(request);
            this.backupType = request.backupType;
            this.instanceId = request.instanceId;
        } 

        /**
         * backupType.
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("backupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListBackupDataRequest build() {
            return new ListBackupDataRequest(this);
        } 

    } 

}
