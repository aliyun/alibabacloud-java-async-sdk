// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetSCIMSynchronizationStatusRequest} extends {@link RequestModel}
 *
 * <p>SetSCIMSynchronizationStatusRequest</p>
 */
public class SetSCIMSynchronizationStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SCIMSynchronizationStatus")
    private String SCIMSynchronizationStatus;

    private SetSCIMSynchronizationStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.SCIMSynchronizationStatus = builder.SCIMSynchronizationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSCIMSynchronizationStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return SCIMSynchronizationStatus
     */
    public String getSCIMSynchronizationStatus() {
        return this.SCIMSynchronizationStatus;
    }

    public static final class Builder extends Request.Builder<SetSCIMSynchronizationStatusRequest, Builder> {
        private String directoryId; 
        private String SCIMSynchronizationStatus; 

        private Builder() {
            super();
        } 

        private Builder(SetSCIMSynchronizationStatusRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.SCIMSynchronizationStatus = request.SCIMSynchronizationStatus;
        } 

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The status of SCIM synchronization. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder SCIMSynchronizationStatus(String SCIMSynchronizationStatus) {
            this.putQueryParameter("SCIMSynchronizationStatus", SCIMSynchronizationStatus);
            this.SCIMSynchronizationStatus = SCIMSynchronizationStatus;
            return this;
        }

        @Override
        public SetSCIMSynchronizationStatusRequest build() {
            return new SetSCIMSynchronizationStatusRequest(this);
        } 

    } 

}
