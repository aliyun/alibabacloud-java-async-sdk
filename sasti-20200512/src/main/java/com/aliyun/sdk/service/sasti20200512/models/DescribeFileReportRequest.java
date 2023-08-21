// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeFileReportRequest</p>
 */
public class DescribeFileReportRequest extends Request {
    @Query
    @NameInMap("Field")
    private String field;

    @Query
    @NameInMap("FileHash")
    @Validation(required = true)
    private String fileHash;

    @Query
    @NameInMap("ServiceLang")
    private String serviceLang;

    private DescribeFileReportRequest(Builder builder) {
        super(builder);
        this.field = builder.field;
        this.fileHash = builder.fileHash;
        this.serviceLang = builder.serviceLang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return fileHash
     */
    public String getFileHash() {
        return this.fileHash;
    }

    /**
     * @return serviceLang
     */
    public String getServiceLang() {
        return this.serviceLang;
    }

    public static final class Builder extends Request.Builder<DescribeFileReportRequest, Builder> {
        private String field; 
        private String fileHash; 
        private String serviceLang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFileReportRequest request) {
            super(request);
            this.field = request.field;
            this.fileHash = request.fileHash;
            this.serviceLang = request.serviceLang;
        } 

        /**
         * Field.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * FileHash.
         */
        public Builder fileHash(String fileHash) {
            this.putQueryParameter("FileHash", fileHash);
            this.fileHash = fileHash;
            return this;
        }

        /**
         * ServiceLang.
         */
        public Builder serviceLang(String serviceLang) {
            this.putQueryParameter("ServiceLang", serviceLang);
            this.serviceLang = serviceLang;
            return this;
        }

        @Override
        public DescribeFileReportRequest build() {
            return new DescribeFileReportRequest(this);
        } 

    } 

}
