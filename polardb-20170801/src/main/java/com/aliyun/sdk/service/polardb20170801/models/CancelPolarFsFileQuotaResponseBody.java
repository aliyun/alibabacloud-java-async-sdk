// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CancelPolarFsFileQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>CancelPolarFsFileQuotaResponseBody</p>
 */
public class CancelPolarFsFileQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilePathIds")
    private String filePathIds;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelPolarFsFileQuotaResponseBody(Builder builder) {
        this.filePathIds = builder.filePathIds;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelPolarFsFileQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePathIds
     */
    public String getFilePathIds() {
        return this.filePathIds;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String filePathIds; 
        private String polarFsInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CancelPolarFsFileQuotaResponseBody model) {
            this.filePathIds = model.filePathIds;
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The file paths for which the quotas were deleted. Multiple paths are separated by a comma (<code>,</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>/path1,/path2</p>
         */
        public Builder filePathIds(String filePathIds) {
            this.filePathIds = filePathIds;
            return this;
        }

        /**
         * <p>The ID of the Polarlakebase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelPolarFsFileQuotaResponseBody build() {
            return new CancelPolarFsFileQuotaResponseBody(this);
        } 

    } 

}
