// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateProtocolMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProtocolMountTargetResponseBody</p>
 */
public class CreateProtocolMountTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportId")
    private String exportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the export directory for the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-123****</p>
         */
        public Builder exportId(String exportId) {
            this.exportId = exportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
