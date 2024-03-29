// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExportMigrationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExportMigrationResponseBody</p>
 */
public class CreateExportMigrationResponseBody extends TeaModel {
    @NameInMap("Data")
    private Long data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateExportMigrationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExportMigrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The ID of the export task.
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to locate logs and troubleshoot errors.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The call succeeded.
         * *   false: The call failed. You can locate errors based on the request ID.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateExportMigrationResponseBody build() {
            return new CreateExportMigrationResponseBody(this);
        } 

    } 

}
