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
 * {@link DeleteStoryResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteStoryResponseBody</p>
 */
public class DeleteStoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    private DeleteStoryResponseBody(Builder builder) {
        this.driveId = builder.driveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    public static final class Builder {
        private String driveId; 

        private Builder() {
        } 

        private Builder(DeleteStoryResponseBody model) {
            this.driveId = model.driveId;
        } 

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        public DeleteStoryResponseBody build() {
            return new DeleteStoryResponseBody(this);
        } 

    } 

}
