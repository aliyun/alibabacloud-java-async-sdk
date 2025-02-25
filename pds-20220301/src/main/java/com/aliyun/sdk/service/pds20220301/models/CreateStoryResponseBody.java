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
 * {@link CreateStoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStoryResponseBody</p>
 */
public class CreateStoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    private CreateStoryResponseBody(Builder builder) {
        this.driveId = builder.driveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    public static final class Builder {
        private String driveId; 

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        public CreateStoryResponseBody build() {
            return new CreateStoryResponseBody(this);
        } 

    } 

}
