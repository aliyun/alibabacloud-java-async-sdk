// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SetSCIMSynchronizationStatusRequest} extends {@link RequestModel}
 *
 * <p>SetSCIMSynchronizationStatusRequest</p>
 */
public class SetSCIMSynchronizationStatusRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("SCIMSynchronizationStatus")
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

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String SCIMSynchronizationStatus; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>SCIMSynchronizationStatus.</p>
         */
        public Builder SCIMSynchronizationStatus(String SCIMSynchronizationStatus) {
            this.putQueryParameter("SCIMSynchronizationStatus", SCIMSynchronizationStatus);
            this.SCIMSynchronizationStatus = SCIMSynchronizationStatus;
            return this;
        }

        public SetSCIMSynchronizationStatusRequest build() {
            return new SetSCIMSynchronizationStatusRequest(this);
        } 

    } 

}
