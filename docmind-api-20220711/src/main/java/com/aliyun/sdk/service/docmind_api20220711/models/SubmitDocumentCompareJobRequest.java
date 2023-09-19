// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDocumentCompareJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitDocumentCompareJobRequest</p>
 */
public class SubmitDocumentCompareJobRequest extends Request {
    @Query
    @NameInMap("CompareFileName")
    private String compareFileName;

    @Query
    @NameInMap("CompareFileUrl")
    private String compareFileUrl;

    @Query
    @NameInMap("OriginFileName")
    private String originFileName;

    @Query
    @NameInMap("OriginFileUrl")
    private String originFileUrl;

    private SubmitDocumentCompareJobRequest(Builder builder) {
        super(builder);
        this.compareFileName = builder.compareFileName;
        this.compareFileUrl = builder.compareFileUrl;
        this.originFileName = builder.originFileName;
        this.originFileUrl = builder.originFileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDocumentCompareJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compareFileName
     */
    public String getCompareFileName() {
        return this.compareFileName;
    }

    /**
     * @return compareFileUrl
     */
    public String getCompareFileUrl() {
        return this.compareFileUrl;
    }

    /**
     * @return originFileName
     */
    public String getOriginFileName() {
        return this.originFileName;
    }

    /**
     * @return originFileUrl
     */
    public String getOriginFileUrl() {
        return this.originFileUrl;
    }

    public static final class Builder extends Request.Builder<SubmitDocumentCompareJobRequest, Builder> {
        private String compareFileName; 
        private String compareFileUrl; 
        private String originFileName; 
        private String originFileUrl; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDocumentCompareJobRequest request) {
            super(request);
            this.compareFileName = request.compareFileName;
            this.compareFileUrl = request.compareFileUrl;
            this.originFileName = request.originFileName;
            this.originFileUrl = request.originFileUrl;
        } 

        /**
         * CompareFileName.
         */
        public Builder compareFileName(String compareFileName) {
            this.putQueryParameter("CompareFileName", compareFileName);
            this.compareFileName = compareFileName;
            return this;
        }

        /**
         * CompareFileUrl.
         */
        public Builder compareFileUrl(String compareFileUrl) {
            this.putQueryParameter("CompareFileUrl", compareFileUrl);
            this.compareFileUrl = compareFileUrl;
            return this;
        }

        /**
         * OriginFileName.
         */
        public Builder originFileName(String originFileName) {
            this.putQueryParameter("OriginFileName", originFileName);
            this.originFileName = originFileName;
            return this;
        }

        /**
         * OriginFileUrl.
         */
        public Builder originFileUrl(String originFileUrl) {
            this.putQueryParameter("OriginFileUrl", originFileUrl);
            this.originFileUrl = originFileUrl;
            return this;
        }

        @Override
        public SubmitDocumentCompareJobRequest build() {
            return new SubmitDocumentCompareJobRequest(this);
        } 

    } 

}
