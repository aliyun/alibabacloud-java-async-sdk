// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link DeltaGetLastCursorRequest} extends {@link RequestModel}
 *
 * <p>DeltaGetLastCursorRequest</p>
 */
public class DeltaGetLastCursorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sync_root_id")
    private String syncRootId;

    private DeltaGetLastCursorRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.syncRootId = builder.syncRootId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeltaGetLastCursorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return syncRootId
     */
    public String getSyncRootId() {
        return this.syncRootId;
    }

    public static final class Builder extends Request.Builder<DeltaGetLastCursorRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String syncRootId; 

        private Builder() {
            super();
        } 

        private Builder(DeltaGetLastCursorRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.syncRootId = request.syncRootId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The ID of the root file of the synced folder.</p>
         * 
         * <strong>example:</strong>
         * <p>622fb09598ae66777c7040109a16f49381f6abe1</p>
         */
        public Builder syncRootId(String syncRootId) {
            this.putBodyParameter("sync_root_id", syncRootId);
            this.syncRootId = syncRootId;
            return this;
        }

        @Override
        public DeltaGetLastCursorRequest build() {
            return new DeltaGetLastCursorRequest(this);
        } 

    } 

}
