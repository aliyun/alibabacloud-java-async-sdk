// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQuaraFileDownloadInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeQuaraFileDownloadInfoRequest</p>
 */
public class DescribeQuaraFileDownloadInfoRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("QuaraFileId")
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
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * QuaraFileId.
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
