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
 * {@link RollbackSuspEventQuaraFileRequest} extends {@link RequestModel}
 *
 * <p>RollbackSuspEventQuaraFileRequest</p>
 */
public class RollbackSuspEventQuaraFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuaraFileId")
    private Integer quaraFileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private RollbackSuspEventQuaraFileRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.quaraFileId = builder.quaraFileId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackSuspEventQuaraFileRequest create() {
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

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<RollbackSuspEventQuaraFileRequest, Builder> {
        private String from; 
        private Integer quaraFileId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(RollbackSuspEventQuaraFileRequest request) {
            super(request);
            this.from = request.from;
            this.quaraFileId = request.quaraFileId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The ID of the request source. Set the value to sas.</p>
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
         * <p>The ID of the quarantined file.   </p>
         * <blockquote>
         * <p>If you do not configure this parameter, you cannot call the RollbackSuspEventQuaraFile operation to restore a quarantined file. You can call the <a href="~~DescribeSuspEventQuaraFiles~~">DescribeSuspEventQuaraFiles</a> operation to query the IDs of quarantined files.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3921797</p>
         */
        public Builder quaraFileId(Integer quaraFileId) {
            this.putQueryParameter("QuaraFileId", quaraFileId);
            this.quaraFileId = quaraFileId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public RollbackSuspEventQuaraFileRequest build() {
            return new RollbackSuspEventQuaraFileRequest(this);
        } 

    } 

}
