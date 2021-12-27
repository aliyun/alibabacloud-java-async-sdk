// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RollbackSuspEventQuaraFileRequest} extends {@link RequestModel}
 *
 * <p>RollbackSuspEventQuaraFileRequest</p>
 */
public class RollbackSuspEventQuaraFileRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("QuaraFileId")
    private Integer quaraFileId;

    @Query
    @NameInMap("SourceIp")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String from; 
        private Integer quaraFileId; 
        private String sourceIp; 

        /**
         * <p>From.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>QuaraFileId.</p>
         */
        public Builder quaraFileId(Integer quaraFileId) {
            this.putQueryParameter("QuaraFileId", quaraFileId);
            this.quaraFileId = quaraFileId;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public RollbackSuspEventQuaraFileRequest build() {
            return new RollbackSuspEventQuaraFileRequest(this);
        } 

    } 

}
