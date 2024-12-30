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
         * <p>The drive ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group-abc</p>
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
