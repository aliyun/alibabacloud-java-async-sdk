// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProtocolMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProtocolMountTargetResponseBody</p>
 */
public class CreateProtocolMountTargetResponseBody extends TeaModel {
    @NameInMap("ExportId")
    private String exportId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateProtocolMountTargetResponseBody(Builder builder) {
        this.exportId = builder.exportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProtocolMountTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return exportId
     */
    public String getExportId() {
        return this.exportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String exportId; 
        private String requestId; 

        /**
         * The ID of the export directory for the protocol service.
         */
        public Builder exportId(String exportId) {
            this.exportId = exportId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProtocolMountTargetResponseBody build() {
            return new CreateProtocolMountTargetResponseBody(this);
        } 

    } 

}
