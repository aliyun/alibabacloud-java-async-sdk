// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeQuaraFileDownloadInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeQuaraFileDownloadInfoRequest</p>
 */
public class DescribeQuaraFileDownloadInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuaraFileId")
    private Integer quaraFileId;

    private DescribeQuaraFileDownloadInfoRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.quaraFileId = builder.quaraFileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQuaraFileDownloadInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return quaraFileId
     */
    public Integer getQuaraFileId() {
        return this.quaraFileId;
    }

    public static final class Builder extends Request.Builder<DescribeQuaraFileDownloadInfoRequest, Builder> {
        private String from; 
        private Integer quaraFileId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQuaraFileDownloadInfoRequest request) {
            super(request);
            this.from = request.from;
            this.quaraFileId = request.quaraFileId;
        } 

        /**
         * <p>The identifier of the request source. Set the value to sas.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The ID of the quarantined file.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, calling the RollbackSuspEventQuaraFile operation does not cancel the quarantine of the file in the quarantine box, which means the call does not take effect. Call the <a href="~~DescribeSuspEventQuaraFiles~~">DescribeSuspEventQuaraFiles</a> operation to obtain the quarantined file ID (the value of the Id parameter).</p>
         * </blockquote>
         * <p>QuaraFileId depends on the following prerequisite chain: (1) The SAS Agent must be installed on the ECS instance and be online. (2) The Agent must detect a malicious file and generate a security alert. (3) The alert must be quarantined by calling the HandleSecurityEvents operation (OperationCode=quara). (4) Call the DescribeSuspEventQuaraFiles operation to obtain the QuaraFileId.</p>
         * <p>Note: This parameter is actually required. If it is not provided, the API returns error code -101 (400) with the message &quot;The ID of the file to be rolled back is not provided&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder quaraFileId(Integer quaraFileId) {
            this.putQueryParameter("QuaraFileId", quaraFileId);
            this.quaraFileId = quaraFileId;
            return this;
        }

        @Override
        public DescribeQuaraFileDownloadInfoRequest build() {
            return new DescribeQuaraFileDownloadInfoRequest(this);
        } 

    } 

}
