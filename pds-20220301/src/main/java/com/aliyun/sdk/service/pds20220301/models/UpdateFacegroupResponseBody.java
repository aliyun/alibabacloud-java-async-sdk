// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFacegroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateFacegroupResponseBody</p>
 */
public class UpdateFacegroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("group_id")
    private String groupId;

    private UpdateFacegroupResponseBody(Builder builder) {
        this.driveId = builder.driveId;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFacegroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    public static final class Builder {
        private String driveId; 
        private String groupId; 

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * The group ID.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public UpdateFacegroupResponseBody build() {
            return new UpdateFacegroupResponseBody(this);
        } 

    } 

}
